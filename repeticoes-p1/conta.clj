(defn conta
  ([] (conta 0))
  ([n]
   (println n)
   (recur (inc n))))

(conta)