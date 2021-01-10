(require '[clojure.spec.alpha :as spec])

(spec/def ::big-even (spec/and int? even? #(> % 1000)))

(defn ncheck 
 [x] 
  (if (spec/valid? ::big-even x) "Looks like a BigEven to me!" 
    (first (:clojure.spec.alpha/problems (spec/explain-data ::big-even "Definitely not a BigEven ...")))))
