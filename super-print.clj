(defn super-print
  ([s] (super-print s ";"))
  ([s c]
   (let [margin 4
         length (+ (* 2 margin) (count s))]
     (println (string/join "" (repeat length c)))
     (println (str c c "  " s "  " c c))
     (println (string/join "" (repeat length c)))
     (println ""))))
