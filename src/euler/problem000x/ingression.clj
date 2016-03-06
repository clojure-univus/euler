(ns euler.problem000x.ingression
  (:require [euler.problem000x.problem0001 :as p1])
  (:require [euler.problem000x.problem0002 :as p2])
  (:gen-class))

(defn ingress
  "Problem 000x's ingression"
  [& args]
  (println "================================")
  (println "Problem 000x Ingression")
  (p1/ingress)
  (p2/ingress))