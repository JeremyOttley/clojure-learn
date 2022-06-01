;; reduce vs apply

(apply + 1 2 3 [3 4]) ;; works perfectly fine

(reduce + 1 2 3 [3 4]) ;; errors out
