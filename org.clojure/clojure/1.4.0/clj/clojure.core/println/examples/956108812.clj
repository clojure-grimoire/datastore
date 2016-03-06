(println "Hello world.")
;; > Hello world.
;; => nil

(def items ["hello" :a 1 (list :b 2) \c {:d 4} #{5 6 7}])
;; => #'user/items

;; println is for human-readable output, like a report. Note the lack of quotes around the string "hello" and the unescaped letter "c". 
(println items)
;; > [hello :a 1 (:b 2) c {:d 4} #{5 6 7}]
;; => nil

;; prn outputs items in a machine-readable format, such as in a source
                                        ; file. Note the double-quotes around the string "hello" and the escaped letter "c".
(prn items)
;; > ["hello" :a 1 (:b 2) \c {:d 4} #{5 6 7}]
;; => nil

;; pr-str produces a string with escaped punctuation, so that println yields the same result as the original prn call.
(println (pr-str items))
;; > ["hello" :a 1 (:b 2) \c {:d 4} #{5 6 7}]
;; => nil

;; Calling println w/o args outputs a newline and nothing else.
(println)
;; > 
;; => nil

;; The newline function does the same.
(newline)
;; > 
;; => nil
