(defn ls 
 "returns a seq of strings containing the members of a given dir"
 [dir]
  (map #(subs % 14) 
    (map str (fs/list-dir dir))))
