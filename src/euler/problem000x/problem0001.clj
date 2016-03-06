(ns euler.problem000x.problem0001
  (:gen-class))

(defn multiples-of-3-and-5
  "Multiples of 3 and 5"
  [& args]
  (let [r (range 1 1000)]
    (filter 
      #(or
        (= (rem % 3) 0)
        (= (rem % 5) 0) )r)))

(defn ingress 
  "Problem 1"
  [& args]
  (println "--------------------------------")
  (print "Problem 1: ")
  (println (reduce + (multiples-of-3-and-5))))
