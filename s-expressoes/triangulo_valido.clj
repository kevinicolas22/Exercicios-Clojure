(defn triangulo_valido [lado1 lado2 lado3]
  (and (> (+ lado1 lado2) lado3)
       (> (+ lado1 lado3) lado2)
       (> (+ lado2 lado3) lado1)))

((defn -main []
  (let [lado1 3
        lado2 4
        lado3 5]
    (if (triangulo_valido lado1 lado2 lado3)
       (println "válido")
       (println "não é válido")))))
