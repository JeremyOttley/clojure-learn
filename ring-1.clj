;; When executed, this file will run a basic web server
;; on http://localhost:8080 that will display the text
;; 'Hello World'.

(ns ring.example.hello-world
  (:use ring.adapter.jetty))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello World"})

(run-jetty handler {:port 8080})
