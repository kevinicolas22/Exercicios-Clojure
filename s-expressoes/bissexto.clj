(defn bissexto? [ano]
  (and(zero?(mod ano 4))
    (or(not (zero? (mod ano 100)))
      (zero? (mod ano 400)))))

((defn -main[]
  (let [ano 2023]
    (if (bissexto? ano)
      (println (str ano " é bissexto"))
      (println (str ano " não é bissexto"))
    )
  )
))