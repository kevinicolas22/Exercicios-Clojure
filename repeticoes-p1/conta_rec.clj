(defn conta-rec [n]
  (println n)
  (conta-rec (inc n)))

(defn conta []
  (conta-rec 0))

(conta)

; A razão para termos duas funções, conta e conta-rec, é separar a responsabilidade entre
; a função de entrada que inicia o processo e a função recursiva que faz a contagem em si.
; Isso torna o código mais modular e mais fácil de entender, pois cada função tem uma
; responsabilidade clara e específica.