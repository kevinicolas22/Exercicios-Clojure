(defn somador [operador]
  (let [soma (fn [funcao]
               (fn [seq]
                 (if (empty? seq)
                   0
                   (+ (funcao (first seq)) ((soma funcao) (rest seq))))))]
    (soma operador)))

(defn -main []
  (run-tests 'main-test))

(defn test-somador []
  (let [soma-de-pares (somador even?)
        soma-de-impares (somador odd?)]
    (assert (= 6 (soma-de-pares [1 2 3])))
    (assert (= 4 (soma-de-impares [1 2 3])))))

(test-somador)
~                  