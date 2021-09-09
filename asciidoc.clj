(require '[clojure.java.io :as io])
(import 'org.asciidoctor.Asciidoctor)
(import 'org.asciidoctor.Asciidoctor$Factory)
(import 'java.util.HashMap)

(defn genHtmlString [file]
  (let [inst (Asciidoctor$Factory/create)
      src  (slurp (io/file file))]
  (.convert inst src (HashMap.)))) ;; (genHtmlString "example.adoc")
