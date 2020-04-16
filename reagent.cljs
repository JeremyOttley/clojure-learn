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

;; When using reagent, I like to always use local state for my components, by having them return a fn, and wrapping it in a let binding, the state can be encapsulated with the component.

;; I also like to have my components take a state map, whose values are either a ratom or an initial value. This way, if you don't need the state of the component outside, you just create the state map with initial values. If you do need the state outside, say to share it, like in my example, then you can pass in ratoms for the state values you want shared/exposed outside.

;; This allows me to use the components in many ways, like how I have two counter that are synchronized, sharing count, yet with independent headings, and one counter that's fully independent.
