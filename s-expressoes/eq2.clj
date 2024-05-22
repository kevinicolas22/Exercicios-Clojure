(ns eq2
  (require [clojure.core :refer :all]))

(defn calcular-delta [a b c]
  (- (* b b) (* 4 a c)))

(defn calcular-raizes [a b c]
  (let [delta (calcular-delta a b c)]
    (cond
      (zero? delta) [(double (/ (- b) (* 2 a)))]
      (pos? delta) [(double (/ (- (- b) (Math/sqrt delta)) (* 2 a)))
                    (double (/ (- (- b) (Math/sqrt delta)) (* 2 a)))]
      :else [])))

(defn ler-coeficientes []
  (let [a (Integer/parseInt (read-line))
        b (Integer/parseInt (read-line))
        c (Integer/parseInt (read-line))]
    [a b c]))

(defn -main []
  (println "Digite os coeficientes da equação de segundo grau (a, b, c):")
  (let [[a b c] (ler-coeficientes)
        raizes (calcular-raizes a b c)]
    (if (empty? raizes)
      (println "Sem raízes")
      (do
        (println "Raízes da equação:")
        (doseq [raiz raizes]
            (println raiz))))))

(-main)
