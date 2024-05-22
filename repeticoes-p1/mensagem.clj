(defn msg-rec [mensagem]
  (println mensagem)
  (recur mensagem))

((defn -main []
  (let [mensagem (read-line)]
    (msg-rec mensagem))))

; Quando você executa o programa ocorrere um erro de execução devido a um estouro de pilha.
; Isso ocorre porque a função msg-rec é chamada recursivamente sem uma condição de parada,
; levando a uma recursão infinita e, eventualmente, ao estouro de pilha.