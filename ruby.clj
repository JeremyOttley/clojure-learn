For each Ruby module/class, we have Ruby methods on the left and the equivalent
Clojure functions and/or relevant notes are on the right.

For clojure functions, symbols indicate existing method definitions, in the 
clojure namespace if none is explicitly given.  clojure.contrib.*/* functions can
be obtained from http://github.com/kevinoneill/clojure-contrib/tree/master,
ruby-to-clojure.*/* functions can be obtained from the source files in this
gist.

If no method symbol is given, we use the following notation:

[name] Ruby method is an alias for Ruby method [name], see that method
[Enum] Ruby method is also defined in Enumerable, see the equivalent there
des!   Ruby method is destructive, an alternative may be suggested
ni     Ruby method doesn't have a direct equivalent, an alternative may be given
uf     Ruby method is IMO an "unfeature", so no equivalent is given
lib    Ruby method is not fundamental to data structure, belongs in other lib

Right now we only have Enumerable and Array, though we hope to have Set, Hash,
and String/Regexp eventually.

Note that Clojure data structures and the associated sequence functions are
fundamentally different from the Ruby data structures and methods because the 
Clojure data structures are always persistent and most of the sequence functions
are lazy. You can get started on the Ruby => Clojure road with a guide like 
this, but to fully leverage Clojure you will need to understand persistence and
laziness.

== Enumerable
each             doseq  (use for side effects only)
all?             every?
any?             some
collect          [map]
count            count
cycle            cycle
detect           some
drop             drop
drop_while       drop-while
each_cons        partition
each_slice       partition
each_with_index  ruby-to-clojure.seq-utils/map-with-index
entries          [to_a]
find             [detect]
find_all         [select]
find_index       ruby-to-clojure.seq-utils/some-index
first            first, take
grep             ruby-to-clojure.seq-utils/grep
group_by         clojure.contrib.seq-utils/group-by
include?         clojure.contrib.seq-utils/includes?
index_by         clojure.set/index or ruby-to-clojure.seq-utils/index-by
inject           [reduce]
map              map
max              last  (if ordered)
max_by           ni    (use sorted data structure with last)
member?          [include?]
min              first (if ordered)
min_by           ni    (use sorted data structure with first)
minmax           first and last
minmax_by        ni    (see max_by and min_by above)
none?            not-any?
one?             ruby-to-clojure.seq-utils/exactly? /one?
partition        clojure.contrib.seq-utils/separate
reduce           reduce
reject           ruby-to-clojure.seq-utils/remove
reverse_each     rseq, reverse
select           filter
sort             sort, sort-by 
sort_by          sort-by
take             take
take_while       take-while
to_a             seq, list, vector
to_set           set
zip              ruby-to-clojure.seq-utils/zip


== ARRAY
&                ni   (use clojure.set/intersection on sets)
*                ruby-clojure.seq-utils/cycle
+                concat
-                ni   (use clojure.set/difference on sets)
<<               des! (use clojure/conj)
<=>              compare
==               =
[]               get
[]=              des! (use clojure/assoc)
abbrev           lib
assoc            uf 
at               [[]]
choice           ruby-to-clojure.seq-utils/choice
clear            des!  (use empty)
collect          [map]
collect!         [map!]
combination      lib
compact          ruby-to-clojure.seq-utils/compact
compact!         !des
concat           !des  (use concat)
count            count
cycle            [*]
dclone           des!
delete           des!
delete_at        des!
delete_if        des!  (use ruby-to-clojure.seq-utils/remove)
drop             [Enum]
drop_while       [Enum]
each             [Enum]
each_index       (range (count arr))
empty?           empty?
eql?             =
fetch            get
fill             des!
find_index       [Enum]
first            [Enum]
flatten          clojure.contrib.seq-utils/flatten
flatten!         des!
frozen?          uf
hash             hash
include?         [Enum]
index            [find_index]
initialize_copy  uf
insert           des!
inspect          print-str
join             clojure.contrib.str-utils/str-join
last             last, (take (rseq coll))
length           [count]
map              map
map!             des!
new              vecotr
pack             lib  
permutation      clojure.contrib.lazy-seqs/permutations
pop              des! (use pop)
pretty_print     lib
product          lib
push             [<<]
rassoc           uf
reject           [Enum]
reject!          des!
replace          des!
reverse          rseq, reverse
reverse!         des!
reverse_each     [reverse]
rindex           uf
select           [Enum]
shelljoin        lib
shift            des!  (use first, rest)
shuffle          ruby-to-clojure.seq-utils/shuffle
shuffle!         des!
size             [count]
slice            subvec
slice!           des!
sort             [Enum]
sort!            des!
take             [Enum]
take_while       [Enum]
to_a             seq
to_ary           seq
to_csv           lib
to_s             [inspect]
to_yaml          lib
transpose        lib
try_convert      uf
uniq             distinct
uniq!            des!
unshift          des!
values_at        get, subvec
yaml_initialize  lib
zip              [Enum]
|                ni  (use clojure.set/union on sets)
