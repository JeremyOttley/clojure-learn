(defmacro unless
  [condition & forms]
  `(if (not ~condition)
     ~@forms))

;; (require '[macros.core :refer-macros [unless]])
