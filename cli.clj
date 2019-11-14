(ns demo.cli)

(doseq [arg *command-line-args*]
  (println (str "Welcome back " (if (string? arg) arg))))
