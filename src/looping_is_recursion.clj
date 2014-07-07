(ns looping-is-recursion)

(defn power-help [base exp acc]
  (if (= exp 0)
    acc
    (recur base (- exp 1) (* acc base))))

(defn power [base exp]
  (power-help base exp 1))

(defn last-element-help [a-seq]
  (let [tail (rest a-seq)]
    (if (empty? tail)
      (first a-seq)
      (recur tail))))

(defn last-element [a-seq]
  (if (empty? a-seq)
    nil
    (last-element-help a-seq)))

(defn seq= [seq1 seq2]
  (cond
    (empty? seq1) (empty? seq2)
    (empty? seq2) false
    (not (= (first seq1) (first seq2))) false
    :else (recur (rest seq1) (rest seq2))))

(defn find-first-index [pred a-seq]
  (loop [the-seq a-seq
         cur-index 0]
    (cond
      (empty? the-seq) nil
      (pred (first the-seq)) cur-index
      :else (recur (rest the-seq) (+ cur-index 1)))))

(defn avg [a-seq]
  (loop [the-seq a-seq
         sum 0]
    (if (empty? the-seq)
      (/ sum (count a-seq))
      (recur (rest the-seq) (+ sum (first the-seq))))))

(defn toggle [a-set elem]
  (if (contains? a-set elem)
    (disj a-set elem)
    (conj a-set elem)))

(defn parity [a-seq]
  (loop [the-seq a-seq
         acc #{}]
    (if (empty? the-seq)
      acc
      (recur (rest the-seq) (toggle acc (first the-seq))))))

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

