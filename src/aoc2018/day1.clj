(ns aoc2018.day1
  (:require [aoc2018.util :as util]))

(defn part-1 [input]
  (reduce + input))

(defn part-2 [input]
  (reduce (fn [acc val]
            (if (acc val)
              (reduced val)
              (conj acc val)))
          #{}
          (reductions + (apply concat (repeat input)))))

(comment

  (= 505 (part-1 (util/input "day-1")))

  (= 1 (part-2 [1 -2 2 3 56]))

  (= 72330 (part-2 (util/input "day-1")))

  )
