(defproject zk-web "1.0"
            :description "A web UI for zookeeper"
            :dependencies [[org.clojure/clojure "1.8.0"]
                           [noir "1.3.0-beta3"]
                           [org.apache.curator/curator-framework "2.12.0"]
                           [org.clojure/tools.logging "0.4.1"]
                           [org.slf4j/slf4j-log4j12 "1.7.9"]
                           [log4j/log4j "1.2.17"]
                           [com.cemerick/url "0.1.1"]]
            :plugins [[lein-cljfmt "0.5.7"]]
            :main zk-web.server)
