(filter #(re-matches REGEX %) SEQUENCE)

;; for example:

(defn filter-by-regex 
  [regex sequence] 
    (filter #(re-matches regex %) sequence))

(filter-by-regex #"\w{3}" ["Vim" "Emacs" "VSCode" "Intellij"]) ;; ("Vim")

;; or

(defn filter-by-regex 
  [regex sequence] 
    (filter #(re-find regex %) sequence))


(filter-by-regex #"i" ["Vim" "Emacs" "VSCode" "Intellij"]) ;; ("Vim" "Intellij")
