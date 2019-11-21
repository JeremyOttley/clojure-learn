;;;; we’re defining a function that’ll help us clean the text input from these files. We’re taking in that ;;;; string that we slurped, and piping it through the following transformations:
;; 1. Lowercasing the string
;; 2. Replacing line breaks with spaces
;; 3. Removing special characters (because some people write lyrics like “Yeah!!!!!!!!!”)

(defn clean-string [s]
  (-> s
      (clojure.string/lower-case)
      (clojure.string/replace "n" " ")
      (clojure.string/replace #"[^A-Za-z0-9 ]" "")))

; The "Thread-first" macro (->) inserts into each form the result of
; the previous, as the first argument (second item)
