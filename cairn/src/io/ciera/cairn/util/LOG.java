package io.ciera.cairn.util;

import io.ciera.summit.types.TimeStamp;

public interface LOG {

    public void LogFailure( String message );
    public void LogInfo( String message );
    public void LogSuccess( String message );
    public void LogInteger( int message );
    public void LogReal( String message, double r );
    public void LogTime( String message, TimeStamp t );

}
