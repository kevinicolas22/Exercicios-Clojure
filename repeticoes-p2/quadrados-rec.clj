(ns resp02
  (:gen-class))

(defn quadrados-rec [lista]
  (if (empty? lista)
    '()
    (cons (* (first lista) (first lista)) (quadrados-rec (rest lista)))))

(def numeros [1 2 3 4 5])
(println (quadrados-rec numeros)) ; Saída: (1 4 9 16 25)
