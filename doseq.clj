(ns clojure_learn.doseq)

(def name "Jeremy")

(doseq [c name] (println c))

;J
;e
;r
;e
;m
;y

;(defn print-all [coll]
;  "prints every element of the collection on a new line"
;  (doseq [i coll] (println i)))
