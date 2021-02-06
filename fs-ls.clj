(require '[me.raynes.fs :as fs])

(defn ls [] 
  (clojure.string/split 
    (:out (me.raynes.fs/exec "ls")) #"\n"))
