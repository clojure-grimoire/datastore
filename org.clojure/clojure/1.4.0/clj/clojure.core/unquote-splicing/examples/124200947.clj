(let [x `(2 3)] 
  `(1 ~x))
;; => (1 (2 3))

(let [x `(2 3)] 
  `(1 ~@x))
;; => (1 2 3)
