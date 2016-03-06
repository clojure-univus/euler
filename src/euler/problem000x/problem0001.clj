(ns euler.problem000x.problem0001
  (:gen-class))

(defn multiples-of-3-and-5
  "Multiples of 3 and 5"
  []
  (let [r (range 1 1000)]
    (filter 
      #(or
        (= (rem % 3) 0)
        (= (rem % 5) 0) )r)))

(defn ingress 
  "Problem 1: Multiples of 3 and 5"
  []
  (println "--------------------------------")
  (print "Answer: ")
  (println (reduce + (multiples-of-3-and-5))))
