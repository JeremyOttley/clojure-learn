(def coll (list 1 2 3))

(reduce + (remove nil? coll))

;; same but using threading macro

(->> coll
         (remove nil?)
         (reduce +))
