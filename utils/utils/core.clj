(ns utils.core)

(require '[clojure.java.io :as io])
(require '[clojure.edn :as edn])
(require '[cheshire.core :refer :all])

;; IO ;;

(defn- rm-rf
 [dir]
  (->> (io/file dir)
       (file-seq)
       (reverse)
       (map io/delete-file)
       (println "Directory deleted")))

(defn write-to-file [file text]
  (with-open [f (io/writer file)]
    (.write f text)))

;; EDN ;;

(defn map-to-edn
    "Converting a Map to EDN"
    [m]
    (prn-str m))

(defn edn-to-map
    "Converting EDN to a Map"
    [e]
    (edn/read-string e))

;; JSON ;;

(defn parse [s]
  (cheshire.core/parse-string s true))

(defn gen [o]
  (cheshire.core/generate-string o {:pretty true}))
