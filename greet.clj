(ns greet)

(defn greeting [name]
  (if (= name "Jeremy")
    (str "Hello, Master of the Universe!")
    (str "Hello, " name)))

(defn greet [name]
  (println (greeting name)))

(greet (read-line))
