(ns macros.core)

(defmacro unless [pred a b]
  `(if (not ~pred) ~a ~b))
