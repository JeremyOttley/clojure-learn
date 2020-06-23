(defn layout [content]
  (html5
    [:html
     [:head
      [:meta {:charset "utf-8"}]
      [:meta {:http-equiv "x-ua-compatible" :content "ie=edge"}]
      [:meta {:name "viewport"
              :content "width=device-width, initial-scale=1, shrink-to-fit=no"}]
      [:meta {:name "description", :content "A description of the page"}]
      [:meta {:name "robots", :content "index,follow"}]
      [:meta {:name "googlebot", :content "index,follow"}]
      [:meta {:name "google", :content "nositelinkssearchbox"}]
      [:link {:rel "stylesheet" :href "https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css"}]
      ;;(include-css "/css/custom.css")
      [:title "Tech blog"]]
     [:body content]]))
