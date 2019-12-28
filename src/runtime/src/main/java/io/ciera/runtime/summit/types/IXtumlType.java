package io.ciera.runtime.summit.types;

import io.ciera.runtime.summit.exceptions.BadArgumentException;
import io.ciera.runtime.summit.exceptions.NotImplementedException;
import io.ciera.runtime.summit.exceptions.XtumlException;

public interface IXtumlType<T extends IXtumlType<T>> {

    default public boolean equality(T value) throws XtumlException {
        return equals(value);
    }

    default public boolean inequality(T value) throws XtumlException {
        return !equality(value);
    }

    public T value();

    default public T oneWhere(IWhere<T> condition) throws XtumlException {
        if (null == condition)
            throw new BadArgumentException("Null condition passed to selection.");
        if (condition.evaluate(value()))
            return value();
        else
            return null;
    }
    
    default public String serialize() throws XtumlException {
    	throw new NotImplementedException("Type cannot be directly serialized");
    }

}