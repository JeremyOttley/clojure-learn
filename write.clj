(ns write.demo)

(with-open [f (clojure.java.io/writer "/tmp/new")]
  (.write f "some text"))
