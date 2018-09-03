(defproject cl-back "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
    [ring/ring-core "1.6.3"]
    [ring/ring-jetty-adapter "1.6.3"]
    [ring/ring-json "0.4.0"]
    [korma "0.4.3"]
    [org.postgresql/postgresql "9.2-1002-jdbc4"]
    [com.spoon16/clj-gson "0.0.1"]
    [environ "1.1.0"]]
  :main ^:skip-aot cl-back.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
