(defn eh_triangulo [lado1 lado2 lado3]
  (cond
    (and (= lado1 lado2) (= lado2 lado3)) "Equilátero"
    (or (= lado1 lado2) (= lado2 lado3) (= lado1 lado3)) "Isósceles"
    :else (if (or (> (+ lado1 lado2) lado3)
                  (> (+ lado1 lado3) lado2)
                  (> (+ lado2 lado3) lado1))
            "Escaleno"
            nil)))

((defn -main []
  (let [lado1 (read)
        lado2 (read)
        lado3 (read)
        tipo (eh_triangulo lado1 lado2 lado3)]
    (if tipo
      (println tipo)
      (println "invalido" nil)))))