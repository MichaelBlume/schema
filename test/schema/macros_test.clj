(ns schema.macros-test
  (:use clojure.test)
  (:require
   [schema.core :as s]
   [schema.macros :as macros]))

(deftest fn-test
  (is 5 ((macros/fn [a b] (+ a b)) 2 3))
  (is 'jump (get (meta ^{:frogs 'jump} (macros/fn [])) :frogs)))
