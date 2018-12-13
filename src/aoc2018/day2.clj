(ns aoc2018.day2
  (:require [aoc2018.util :as util]))

;;; Part 1
;; Take the collection of strings, and provide a checksum that is the
;; number of strings that have exactly two of any character multiplied
;; by the number of strings with exactly three of any character in it

(defn- two-and-three-matching-chars [acc string]
  (let [freqs (frequencies (seq string))]
    (merge acc
           (when (seq
                  (filter (fn [[_ v]]
                            (= 2 v))
                          freqs))
             {:twos (inc (:twos acc))})
           (when (seq
                  (filter (fn [[_ v]]
                            (= 3 v))
                          freqs))
             {:threes (inc (:threes acc))}))))

(defn part-1 [input]
  (let [counts (reduce two-and-three-matching-chars
                       {:twos 0
                        :threes 0}
                       input)]
    (* (:twos counts) (:threes counts))))


;;; Part 2
;; The box ids will differ by one character at the same position. Find
;; the common characters (so without the position that differs by one
;; char)

(defn part-2 [input])

(comment

  (= 5904 (part-1 (util/input-lines "day-2")))

  )
