(ns aoc2018.util
  (:require [clojure.java.io :as io]
            [clojure.edn :as edn]
            [clojure.string :as string]))

(defn input-lines [filename]
  (string/split-lines (slurp (io/resource filename))))

(defn input [filename]
  (map edn/read-string (input-lines filename)))
