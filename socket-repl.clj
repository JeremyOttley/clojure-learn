(require 'clojure.core.server)

(clojure.core.server/start-server
  {:name "socket-repl"
   :port 5555
   :accept 'clojure.main/repl
   :address "localhost"})
