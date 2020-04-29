(defn keywordize []
  (comp keyword #(.toLowerCase %) name))
;;(map (keywordize) '(a B C))
