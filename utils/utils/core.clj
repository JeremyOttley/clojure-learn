(require '[clojure.edn :as edn])
(require '[cheshire.core :refer :all])

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
