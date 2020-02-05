(ns my.ns
  (:require [clojure.spec.alpha :as s]))

; define a collection of ints
(s/def ::ints (s/coll-of int?))

(s/valid? ::ints [2 "2"])         ; false
(s/valid? ::ints ["4" "4"])       ; false
(s/valid? ::ints [3 5])           ; true
(s/valid? ::ints [2])             ; true
(s/valid? ::ints [2 2 2])         ; true
