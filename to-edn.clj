(ns edn-example.core
    (require [clojure.edn :as edn]))
 
(def sample-map {:foo "bar" :bar "foo"})
 
(defn convert-sample-map-to-edn
    "Converting a Map to EDN"
    []
    ;; yep, converting a map to EDN is that simple"
    (prn-str sample-map))
 
(println "Let's convert a map to EDN: " (convert-sample-map-to-edn))
;=> Let's convert a map to EDN:  {:foo "bar", :bar "foo"} 
 
(println "Now let's covert the map back: " (edn/read-string (convert-sample-map-to-edn)))
;=> Now let's covert the map back:  {:foo bar, :bar foo}
