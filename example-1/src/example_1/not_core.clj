(ns example-1.not-core)

(defn calc-the-thing [x y]
  (* (+ x y) (- x y)))

(defn paragraphifiy [s]
  "Example list comprehension from the pages of Programming Clojure by Stuart Halloway and Aaron Bedra"
  (for [word s]
    (format "<p>%s</p>" word)))