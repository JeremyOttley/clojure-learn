;; produces a list of numbers 1 through 20
(for [i (range 20)] (inc i))

;; for is doseq that produces a seq

;; prepare a seq of all keys from entries whose values are 0
(for [[x y] '([:a 1] [:b 2] [:c 0]) :when (= y 0)] x)
;;=> (:c)
