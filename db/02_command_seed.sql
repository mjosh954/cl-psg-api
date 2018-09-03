INSERT INTO public.ClojureCommand(name, command, description)
VALUES ('doc', 'doc', 'Prints documentation for a var or special form given its name, or for a spec if given a keyword');

INSERT INTO public.ClojureCommand(name, command, description)
VALUES('do', 'do', 'Evaluates the expressions in order and returns the value of the last. If no expressions are supplied, returns nil. See http://clojure.org/special_forms for more information.');

INSERT INTO public.ClojureCommand(name, command, description)
VALUES('empty', 'empty', 'Returns an empty collection of the same category as coll, or nil');

INSERT INTO public.ClojureCommand(name, command, description)
VALUES('cons', 'cons', 'Returns a new seq where x is the first element and seq is the rest.');

INSERT INTO public.ClojureCommand(name, command, description)
VALUES('conjoin', 'conj', 'conj[oin]. Returns a new collection with the xs ''added''. (conj nil item) returns (item). The ''addition'' may happen at different ''places'' depending on the concrete type.');

INSERT INTO public.ClojureCommand(name, command, description)
VALUES('into', 'into', 'Returns a new coll consisting of to-coll with all of the items of from-coll conjoined. A transducer may be supplied.Returns a new coll c');

INSERT INTO public.ClojureCommand(name, command, description)
VALUES('peek', 'peek', 'For a list or queue, same as first, for a vector, same as, but much more efficient than, last. If the collection is empty, returns nil.');

INSERT INTO public.ClojureCommand(name, command, description)
VALUES('pop', 'pop', 'For a list or queue, returns a new list/queue without the first item, for a vector, returns a new vector without the last item. If the collection is empty, throws an exception.  Note - not the same as next/butlast.');

INSERT INTO public.ClojureCommand(name, command, description)
VALUES('rest', 'rest', 'Returns a possibly empty seq of the items after the first. Calls seq on its argument.');
