(ns utils.core)

(require '[clojure.java.io :as io])
(require '[clojure.pprint :as pp])
(require '[clojure.edn :as edn])
(require '[cheshire.core :refer :all])

;; IO ;;

(defn- rm-rf [dir]
  (->> (io/file dir)
       (file-seq)
       (reverse)
       (map io/delete-file)
       (println "Directory deleted")))

(defn write-to-file [file text]
  (with-open [f (io/writer file)]
    (.write f text)))

;; PRINTING ;;

(defn pretty-print [text]
  (pp/pprint text))

;; EDN ;;

(defn map-to-edn [m]
    (prn-str m))

(defn edn-to-map [e]
    (edn/read-string e))

;; JSON ;;

(defn parse-json [s]
  (cheshire.core/parse-string s true))

(defn gen-json [o]
  (cheshire.core/generate-string o {:pretty true}))
