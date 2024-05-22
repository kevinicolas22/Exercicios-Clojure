(ns resp06
  (:gen-class))

(defn soma-quadrados [lista]
  (reduce + (map #(* % %) lista)))

(def numeros [1 2 3 4 5])
(println (soma-quadrados numeros)) ; Saída: 55