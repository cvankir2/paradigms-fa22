;; Implement "lucky numbers" program
;; for c in range(1, 41): 
;;     for b in range(1, c): 
;;         for a in range(1, b): 
;;             if a * a + b * b == c * c: 
;;                 print('{}, {}, {}'.format(a,b,c)) 

(doseq [c (range 1 41) b (range 1 c) a (range 1 b)] ())
(range 1 41)