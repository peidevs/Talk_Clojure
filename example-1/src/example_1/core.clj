(ns example-1.core
  (:gen-class)
  (:require [example-1.not-core :as not-core]))

(defn -main ; defn is a special form that combines def (assigns Var to a symbol) and fn (creates a function)
  "This is a doc string used to document a method"
  [& args] ;a vector which represents arguaments to a function. The "&" means shove the rest into "args"
  (println "Hello, World!"))

(defn calculate-some-stupid-number [x y]
  (+ x y (* x y)))

(def example-map { :key1 "value 1", :key2 "value 2" :key3 3})

(def example-list '(1 2 3 4 5 6 7 8 9))

(def example-vector [1 2 3 4 5 6 7 8 9])

(def example-set #{1 2 3 4 5 6 7 8 9})

(comment (dfgdfg d garbage blah blah gdfgdfgdf g))

(defn print-stuff []
  (let [x 23, y 27]
    (println "Value of " x)
    (println "Value of " y)))

(defn wtf [s] (not-core/paragraphifiy s))

(comment sdgst  htrthhyyrtyh example-1.not-corer
         th rtehrt
         )