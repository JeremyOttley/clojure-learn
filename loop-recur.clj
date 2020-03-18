(loop [v 1]
  (if-not (> v 5)
  (recur (inc v)) v)) ;; => 6
