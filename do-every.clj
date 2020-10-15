(use '[clojure.java.shell :only [sh]])

(defn instruction! []
  (sh "spd-say" "switch legs"))

(defn sleep [ms]
  (Thread/sleep ms)
  (instruction!))

(while true (sleep 30000))

;;(defn -main []
;;  (while true
;;    (sleep 30000))
