(defn fahr-celsius [temperaturas]
  (map #(-> % (- 32) (* (/ 5) 9) (/ 5)) temperaturas))

(defn -main []
  (run-tests 'main-test))

(defn test-fahr-celsius []
  (let [temperaturas-fahrenheit [32 50 68 86 104]
        temperaturas-celsius (fahr-celsius temperaturas-fahrenheit)]
    (assert (= [0 10 20 30 40] temperaturas-celsius))))

(test-fahr-celsius)