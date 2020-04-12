(defn try-and-guess [number]
  (println "Enter your guess:")
  (let [guess (Integer/parseInt (read-line))]
    (cond
      (< guess number) 
        (do (println "Guess is too small...")
            (try-and-guess number))
      (> guess number)
        (do (println "Guess is too big...")
            (try-and-guess number))
      :else
      (println "Yeah!"))))

(defn -main []
  (let [number (rand-int 100)]
    (try-and-guess number)))
