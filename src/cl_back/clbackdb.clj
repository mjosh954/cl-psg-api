(ns cl-back.clbackdb
    :use korma.db
    korma.core)

(def dbconf {
    :host "localhost"
    :db "clbackdb"
    :user "postgres"
    :password "foobar"
    :port "5432"
    :delimiters ""})


(defdb db (postgres dbconf))