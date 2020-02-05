;; Reducer

(defn transform [coll]
  (->> coll            
    (filter even?)     
    (take 5)           
    (map inc)))

(transform [1 2 3 4 5 6 7 8 9 10]) ;=> (3 5 7 9 11)

;; Transducer

(defn transform [coll]
  (comp           
    (filter even?)     
    (take 5)           
    (map inc))))

(into [] (transform) [1 2 3 4 5 6 7 8 9 10]) ;=> [3 5 7 9 11]
