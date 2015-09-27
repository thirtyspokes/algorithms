(ns algorithms.core
  (:gen-class))

(use 'algorithms.sorting.selection)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (selection-sort [5 3 9 8 71 6 3 8 3949 132 8 232 9 3 123 8 9])))
