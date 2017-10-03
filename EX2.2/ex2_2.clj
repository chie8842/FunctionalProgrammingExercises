#!/usr/bin/env inlein

; 本当はInt型とかでもcompare使えるけど実験なのであえて>を使うようにしてみる。

'{:dependencies [[org.clojure/clojure "1.8.0"]]}

(ns ex2_2)

(defmulti compAB
  (fn [x y] [(class x) (class y)]))

(defmethod compAB [String String] [x y] 
  (if (< (compare x y) 0) false true))
(defmethod compAB [Number Number] [x y]
  (< x y))

(def isSorted
  (fn [n]
    (loop [cnt 0]
      (cond
        (= cnt ( - (count n) 1)) true
        (compAB (aget n cnt) (aget n (+ cnt 1))) false
        :else (recur (inc cnt))))))

(defn isSortedString [x]
  (if (= x true) "is sorted" "is not sorted"))
(def testString1 (into-array ["abc", "def", "dek", "pru"]))
(def testString2 (into-array ["abc", "def", "acd", "klm"]))
(def testInt1 (into-array [1, 3, 4, 5]))
(def testInt2 (into-array [1, 4, 2, 5]))


(println (seq testString1) (isSortedString (isSorted testString1)))
(println (seq testString2) (isSortedString (isSorted testString2)))
(println (seq testInt1) (isSortedString (isSorted testInt1)))
(println (seq testInt2) (isSortedString (isSorted testInt2)))
(System/exit 0)
