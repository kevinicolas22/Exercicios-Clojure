(ns resp03
  (:require [resp01 :refer [quadrados]]))

(defn quadrados-pares [lista]
  (filter even? (quadrados lista)))

(def numeros [1 2 3 4 5])
(println (quadrados-pares numeros)) ; Saída: (4 16)
