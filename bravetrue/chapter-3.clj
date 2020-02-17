(defn add100 [n]
  "Write a function that takes a number and adds 100 to it."
  (+ 100 n))

(defn dec-maker
 "Create a custom decrementor"
 [dec-by]
 #(- % dec-by)) ;(def dec3 (dec-maker 3)) -> (dec3 6) = 3
