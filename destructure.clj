(def employees
 [{:country "Germany",
   :place "Nuremberg",
   :occupation "Engineer",
   :name "Neil Chetty"}
  {:country "Germany",
   :place "Ulm",
   :occupation "Engineer",
   :name "Vera Ellison"}])

;;;;GOAL:
;; iterate over <employees> to produce two separate maps

(doall
  (let [[neil vera] employees]
  (def employee-1 neil ) 
  (def employee-2 vera ) 
  (str "I employ " (get employee-1 :name) " and " (get employee-2 :name))))
