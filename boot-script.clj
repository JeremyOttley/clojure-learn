;;Here’s an example of a standalone boot script that you can call with e.g. ./foobar -t:

#!/usr/bin/env boot

(set-env! :dependencies '[[clj-time "0.14.2"]])
(require '[clj-time.core :as time])

(deftask my-task [t time bool "Show time"]
  (when (:time *opts*)
    (println (time/now))))

(defn -main [& args]
  (apply boot "my-task" args))
