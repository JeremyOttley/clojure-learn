(def chief-editor 
 {:name "Mark Volkmann"
  :address {:street "644 Glen Summit"
            :city "St. Charles"
            :state "Missouri"
            :zip 63304}
  :employer {:name "Object Computing, Inc."
             :address {:street "12140 Woodcrest Dr."
                       :city "Creve Coeur"
                       :state "Missouri"
                       :zip 63141}}})
;; retrieve
(-> chief-editor
  :employer
  :address
  :city) ;;=> Creve Couer
