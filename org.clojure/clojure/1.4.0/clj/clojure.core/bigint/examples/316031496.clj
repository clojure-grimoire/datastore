(= (bigint 42) (clojure.lang.BigInt/fromBigInteger (BigInteger. "42")))
;; => true

(= 42N (bigint 42))
;; => true

(= 42 (bigint 42))
;; => true

(= 42 (clojure.lang.BigInt/fromBigInteger (BigInteger. "42"))
;; => true
