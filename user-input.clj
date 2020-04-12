(defn can-vote []
     (println "Enter age: ")
     (let [age (read-line)
           new-age (read-string age)]
       (if (< new-age 18)
         (println "Not old enough")
         (println "Yay! You can vote"))))
