(ns euler.core
  (:require [euler.problem000x.problem0001])
  (:require [euler.problem000x.ingression :as ingression000x])
  (:gen-class))

(defn -main
  "Clojure for euler!"
  [& args]
  (ingression000x/ingress))
