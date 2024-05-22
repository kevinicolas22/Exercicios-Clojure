(ns main
  (:gen-class))

((defn -main
  [& args]
  (doseq [n (range)]
    (println n))))