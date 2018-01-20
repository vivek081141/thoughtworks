package com.thoughtworks.recruitme.immutableCollection;

import com.thoughtworks.recruitme.services.MethodNotImplementedException;

import java.util.Collection;

public class ImmutableCollectionImpl<E> implements ImmutableCollection<E> {
    private final Collection<E> immutableCollection;

    public ImmutableCollectionImpl(Collection<E> collection) {
        this.immutableCollection = collection;
    }
   /* public ImmutableCollection<E> add(E e) throws Exception {
        immutableCollection.add(e);
        new ImmutableCollectionImpl<E>();
    }*/

    @Override
    public ImmutableCollection<E> add(E e) throws Exception {
        immutableCollection.add(e);
        return null;
    }

    public ImmutableCollection<E> remove(E e) throws Exception {
        throw new MethodNotImplementedException("remove");
    }

    public int size() {
        return immutableCollection.size();
    }
}
