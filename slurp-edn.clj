(require '[clojure.java.io :as io]
         '[clojure.edn :as edn])

(->> "people.edn"
     io/resource
     slurp
     edn/read-string
     (map :language))
;; -> ("Lisp" "Python" "Clojure")
