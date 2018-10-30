package io.ciera.template.util;

import io.ciera.summit.exceptions.XtumlException;
import io.ciera.summit.types.IXtumlType;

public interface TEMP {
    
    public void append( String s ) throws XtumlException;

    default public void append( boolean b ) throws XtumlException {
        append( new String( Boolean.toString( b ) ) );
    }

    default public void append( int i ) throws XtumlException {
        append( new String( Integer.toString( i ) ) );
    }

    default public void append( double d ) throws XtumlException {
        append( new String( Double.toString( d ) ) );
    }

    default public <T extends IXtumlType<T>>void append( T o ) throws XtumlException {
        append( new String( o.toString() ) );
    }

    public String body() throws XtumlException;
    public void clear() throws XtumlException;
    public void emit( String file ) throws XtumlException;
    public void include( String file, SymbolTable symbolTable ) throws XtumlException;
    public String sub( String format, boolean b ) throws XtumlException;
    public String sub( String format, int i ) throws XtumlException;
    public String sub( String format, double d ) throws XtumlException;
    public String sub( String format, String s ) throws XtumlException;
    public String sub( String format, IXtumlType<?> o ) throws XtumlException;
    
    public void pushBuffer();
    public void popBuffer();

}