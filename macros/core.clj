(defmacro unless
  [condition & forms]
  `(if (not ~condition)
     ~@forms))
