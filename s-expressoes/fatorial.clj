(defn fatorial [n]
  (if (<= n 1)
    1
    (* n (fatorial (- n 1)))))

((defn -main []
  (let [numero(read)]
    (println (fatorial numero)))))