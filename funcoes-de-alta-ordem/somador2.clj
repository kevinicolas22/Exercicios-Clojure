(defn somador [operador]
  (let [soma (fn [funcao acumulador seq]
               (if (empty? seq)
                 acumulador
                 (recur funcao (+ acumulador (funcao (first seq))) (rest seq))))]
    (fn [seq]
      (soma operador 0 seq))))


(defn -main []
  (run-tests 'main-test))

(defn test-somador []
  (let [soma-de-pares (somador even?)
        soma-de-impares (somador odd?)]
    (assert (= 6 (soma-de-pares [1 2 3])))
    (assert (= 4 (soma-de-impares [1 2 3])))))

(test-somador)