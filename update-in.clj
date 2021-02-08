(def my-brain {:thinking-area []})

(let [myself (update-in my-brain 
  [:thinking-area] conj "a lot of IQ")] 
    myself) ;;=> {:thinking-area ["a lot of IQ"]}
