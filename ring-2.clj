;; When executed, this file will run a basic web server
;; on http://localhost:8080 that will display the text
;; 'Hello World'.

(ns ring.example.hello-world-2
  (:use ring.util.response
        ring.adapter.jetty))

(defn handler [request]
  (-> (response "Hello World")
      (content-type "text/plain")))

(run-jetty handler {:port 8080})
