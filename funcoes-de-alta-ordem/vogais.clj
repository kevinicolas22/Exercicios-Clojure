(require '[clojure.string :as str])

(defn ini-vogais [palavras]
  (filter #(str/starts-with? (str/lower-case %) #{"a" "e" "i" "o" "u"}) palavras))


(defn -main []
  (run-tests 'main-test))

(defn test-ini-vogais []
  (let [palavras ["apple" "banana" "orange" "Egg" "umbrella" "Igloo" "Owl" "unicorn"]
        vogais-iniciais (ini-vogais palavras)]
    (assert (= ["apple" "orange" "Egg" "umbrella" "Igloo" "Owl" "unicorn"] vogais-iniciais))))

(test-ini-vogais)