(defn conta []
  (loop [n 0]
    (println n)
    (recur (inc n))))

(conta)

; O motivo pelo qual não há mais erro em tempo de execução é que a recursão de cauda otimiza a pilha de chamadas,
; evitando o estouro de pilha que ocorre em recursões regulares. Em uma recursão de cauda, o sistema pode otimizar
; a chamada recursiva para que não ocupe espaço adicional na pilha, permitindo que a função seja chamada repetidamente
; sem problemas de memória. Isso ocorre porque a chamada recursiva é a última operação a ser executada dentro do loop,
; não havendo nenhuma operação adicional após a chamada recursiva.