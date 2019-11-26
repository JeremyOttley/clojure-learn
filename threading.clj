(def coll (list 1 2 3))

(reduce + (remove nil? coll))

;; same but using threading macro to insert the first item as the last item in the next line

(->> coll
         (remove nil?)
         (reduce +))
