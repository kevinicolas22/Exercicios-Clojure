(ns resp01
  (:gen-class))

(defn quadrados [lista]
  (map #(* % %) lista))

(def numeros [1 2 3 4 5])
(println (quadrados numeros)) ; Saída: (1 4 9 16 25)