(ns counter.core
  (:require [reagent.core :as r]))


;;;; Utils

(defn ratom? [a]
  (= reagent.ratom/RAtom (type a)))

(defn make-state [state]
  (if (ratom? state)
    state
    (r/atom state)))


;;;; Components

(defn counter [state-map]
  (let [heading (make-state (:heading state-map))
        count (make-state (:count state-map))]
    (fn []
      [:div
       [:h1 @heading]
       [:div (str "Count: " @count)]
       [:div
        [:button {:on-click #(swap! count inc)} "+"]
        [:button {:on-click #(swap! count dec)} "-"]]
       [:div
        [:button {:on-click #(swap! count + 10)} "+10"]
        [:button {:on-click #(swap! count - 10)} "-10"]]])))


;;;; Init

(let [shared-count (r/atom 0)]
  (r/render [:div [counter {:heading "I'm A, and I copy B"
                            :count shared-count}]
                  [counter {:heading "I'm B, and I copy A"
                            :count shared-count}]
                  [counter {:heading "I'm C, and I'm independent"
                            :count 0}]] js/klipse-container))
