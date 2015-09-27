(ns algorithms.sorting.selection
  (:gen-class))

(defn smallest-member
  [nums]
  (apply min-key second (map-indexed vector nums)))

(defn remove-nth
  [nums n]
  (into (vec (take n nums)) (drop (inc n) nums)))

(defn selection-sort
  [values]
  (if (empty? values) values
      (cons (second (smallest-member values))
            (selection-sort (remove-nth values (first (smallest-member values)))))))
