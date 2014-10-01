(ns aot-repro.main
  (:require
   [clojure.tools.logging :refer (infof)]
   [aot-repro.macros :refer (with-log)]))

(defn -main [& args]
  (with-log (+ 1 1)))
