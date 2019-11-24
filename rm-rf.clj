(require '[clojure.java.io :as io])

;; rm_rf directory

(defn- rm-rf
 [dir]
  (->> (io/file dir)
       (file-seq)
       (reverse)
       (map io/delete-file)
       (println "Directory deleted")))
       
;; (rm-rf "temp") 
