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
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

