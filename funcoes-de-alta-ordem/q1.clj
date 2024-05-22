(ns main-test
  (:require [clojure.test :refer [run-tests]]))

(defn length [seq]
  (if (empty? seq)
    0
    (inc (length (rest seq)))))

(defn value_at [i seq]
  (if (zero? i)
    (first seq)
    (value_at (dec i) (rest seq))))

(defn -main []
  (run-tests 'main-test))

(defn test-length []
  (assert (= 0 (length [])))
  (assert (= 3 (length [1 2 3]))))

(defn test-value_at []
  (assert (= 1 (value_at 0 [1 2 3])))
  (assert (= 3 (value_at 2 [1 2 3]))))

(test-length)
(test-value_at)