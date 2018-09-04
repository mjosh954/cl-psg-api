(ns cl-back.core
  (:use ring.middleware.params
    ring.adapter.jetty))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "hello"))


; (run-jetty (wrap-json-response (wrap-params handler)) {:port 3000})
