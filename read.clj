(ns read.demo
  (:gen-class))

(def file (slurp "test.txt"))
(println file)

