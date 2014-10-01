(ns aot-repro.macros
  (:require [clojure.tools.logging :refer (infof)]))

(defmacro with-log [& body]
  `(do
     (infof "foo")
     ~@body))
