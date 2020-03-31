(def toki-pona 
[  {:name "sitelen"
   :class :NOUN
   :definition "image, picture, representation, symbol, mark, writing"}
  {:name "wawa"
   :class :ADJECTIVE
   :definition "strong, powerful; confident, sure; energetic, intense"}
  {:name "sewi"
   :class :NOUN
   :definition "area above, highest part, something elevated"}
  {:name "mu"
   :class :PARTICLE
   :definition "(animal noise or communication)"}])

(filter #(= :NOUN (:class %)) toki-pona)
;; same as:
(filter (comp #{:NOUN} :class) toki-pona)
