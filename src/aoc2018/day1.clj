(ns aoc2018.day1
  (:require [clojure.java.io :as io]
            [clojure.edn :as edn]
            [clojure.string :as string]))

(defn input []
  (map edn/read-string
       (string/split-lines (slurp (io/resource "day-1-input")))))

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

  (= 505 (part-1 (input)))

  (= 1 (part-2 [1 -2 2 3 56]))

  (= 72330 (part-2 (input)))

  )
