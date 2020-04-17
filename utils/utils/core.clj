(ns utils.core)

(require '[clojure.java.io :as io])
(require '[clojure.pprint :as pp])
(require '[clojure.edn :as edn])
(require '[cheshire.core :refer :all])

(defn is-blank? [str-in]
  (or (nil? str-in) (re-find #"^\s*$" str-in)))

(defn nil-if-blank [str]
  (if (is-blank? str) nil str))

(defn mod-map [m kfn vfn]
  (or (apply merge 
	     (map (fn [[k v]]
		    { (kfn k) (vfn v) }) m)) 
      {}))

(defn mod-map-key [m kfn]
  (partial mod-map kfn))

(defn map-vals
  "Maps a function over the values of an associative collection."
  [f m]
  (into {} (map (juxt key (comp f val))) m))

(defn keywordize-keys
  [m]
  (into {} (map (juxt (comp keyword key) val)) m))

(defn time-now []
  (quot (.getTime (new java.util.Date)) 1000))

(defn convert-nl-to-br [str-in]
  (apply str 
	 (map #(if (= \newline %) 
		 "<br/>" %) 
	      str-in))) ; (convert-nl-to-br "\n|)

(defn convert-br-to-nl [str-in]
  (s/replace str-in #"<\s*(:?br|BR)\s*\/{0,1}\s*>(:?\n\s*){0,1}" "\n"))

;; IO ;;

(defn- rm-rf [dir]
  (->> (io/file dir)
       (file-seq)
       (reverse)
       (map io/delete-file)
       (println "Directory deleted")))


(defn write-to-file [file string]
  (with-open [w (clojure.java.io/writer file :append true)]
    (.write w string)))

;; PRINTING ;;

(defn pretty-print [text]
  (pp/pprint text))

;; EDN ;;

(defn map-to-edn [m]
    (prn-str m))

(defn edn-to-map [e]
    (edn/read-string e))

(defn json-response-to-edn [uri]
	(let [response (http/get uri {:accept :json})]
	(-> response
	 :body
		prn-str)))

;; JSON ;;

(defn parse-json [s]
  (cheshire.core/parse-string s true))

(defn gen-json [o]
  (cheshire.core/generate-string o {:pretty true}))
