(defn extension [s] (re-find #"[^.]*$" s))

(extension "muse.xml") ;;=> "xml"
