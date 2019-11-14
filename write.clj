(ns clojure_learn.write)

(with-open [f (clojure.java.io/writer "/tmp/new")]
  (.write f "some text"))
