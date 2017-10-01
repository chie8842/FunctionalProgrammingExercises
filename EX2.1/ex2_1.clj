#!/usr/bin/env inlein

'{:dependencies [[org.clojure/clojure "1.8.0"]]}

(ns ex2_1)

(def fibonatch
  (fn [n]
    (loop [cnt n x 0 y 1]
       (if (zero? cnt)
            x
          (recur (dec cnt) y (+ x y))
))))

(when-not (first *command-line-args*)
  (println "Usage:" (System/getProperty "$0") "zero or bigger integer")
  (System/exit 1))

(println "Fibonatch Number of"(first *command-line-args*) "is" (fibonatch(Integer/parseInt (first *command-line-args*))))
(System/exit 0)
