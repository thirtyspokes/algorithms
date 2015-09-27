(ns algorithms.sorting.insertion
  (:gen-class))

(defn insert-sorted
  [values n]
  (let [partitioned (split-with (partial > n) values)]
    (into (vec (first partitioned)) (cons n (second partitioned)))))

(defn insertion-sort
  [values]
  (seq (reduce insert-sorted [] values)))
