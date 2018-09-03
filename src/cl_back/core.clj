(ns cl-back.core
  (:use ring.middleware.params
    ring.adapter.jetty
    korma.db
    korma.core)) 

(use '[clj-gson.json :only (to-json from-json)])
(require '[ring.middleware.json :refer [wrap-json-response]]
    '[ring.util.response :refer [response]])

(defdb db (postgres {
  :host "localhost"
  :db "clbackdb"
  :user "postgres"
  :password "foobar"
  :port "5432"
  :delimiters ""
}))

(defentity clojurecommand
  (entity-fields :command_id :name :command :description :example))


(defn find-command [command]
  (select clojurecommand
    (where {:command command})))

(defn handler [{{q "q"} :params}]
  (-> (response (find-command q))))

(run-jetty (wrap-json-response (wrap-params handler)) {:port 3000})
