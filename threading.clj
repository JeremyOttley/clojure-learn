; When you are in a situation where you want more freedom as where to
; put the result of previous data transformations in an 
; expression, you can use the as-> macro. With it, you can assign a
; specific name to transformations' output and use it as a
; placeholder in your chained expressions:

(def coll (list 1 2 3))

(reduce + (remove nil? coll))

;; same but using threading macro

(->> coll
         (remove nil?)
         (reduce +))
