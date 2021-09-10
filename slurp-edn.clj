(require '[clojure.java.io :as io]
         '[clojure.edn :as edn])

(defn slurp-edn [file]
  (->> file
     slurp
     edn/read-string))

(slurp-edn "data.edn")
