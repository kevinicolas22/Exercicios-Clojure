(ns main
  (:gen-class))

((defn -main
  [& args]
  (let [n (read)]
    (doseq [i (range (inc n))]
      (println i)))))