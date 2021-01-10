(defn greet 
  ([fname] (str "Hello " fname)) 
  ([fname lname] (str "Hello " fname " " lname)))
  
  ;; (greet "Jeremy") ;;=> "Hello Jeremy"
  
  ;; (greet "Jeremy" "Ottley") ;;=> "Hello Jeremy Ottley"
