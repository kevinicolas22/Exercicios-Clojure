(ns main-test
  (:require [clojure.test :refer [run-tests]]))

(defn soma-quadrados-de-pares [seq]
  (->> seq
       (filter even?)
       (map #(* % %))
       (apply +)))

(defn -main []
  (run-tests 'main-test))

(defn test-soma-quadrados-de-pares []
  (let [seq [1 2 3 4 5 6]]
    (assert (= 56 (soma-quadrados-de-pares seq)))))

(test-soma-quadrados-de-pares)
                             