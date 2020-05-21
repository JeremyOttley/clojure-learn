;; in cljs you must use :require-macros
;;;; (ns foo.core (:require-macros [macros.core :refer [log]))

(defmacro log [msg]
  `(.log js/console ~msg))
