(ns aot-repro.main
  (:require
   [clojure.tools.logging :refer (infof)]))

(defn -main [& args]
  (infof "starting")
  (+ 1 1))
