(ns cl-back.core
  (:use ring.middleware.params
    ring.adapter.jetty)) 

(use '[clj-gson.json :only (to-json from-json)])
(require '[ring.middleware.json :refer [wrap-json-response]]
    '[ring.util.response :refer [response]])

    


(defn handler [request]
  (response {:foo request}))

               
(run-jetty (wrap-json-response handler) {:port 3000})
