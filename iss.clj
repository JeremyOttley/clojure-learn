(ns iss.core
  (:gen-class))
(require '[clj-http.client :as http])
(require '[cheshire.core :refer :all])

(defn parse-json [s]
  (cheshire.core/parse-string s true))

(defn api-response-vector [url]
  (let [response (http/get url {:accept :json})]
     (-> response
         :body
         parse-json
         :people)))

(defn print-names []
  (doseq [name (map :name (api-response-vector "http://api.open-notify.org/astros.json"))]
    (println name)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (print-names))
