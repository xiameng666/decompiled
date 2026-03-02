package com.google.android.gms.common.stats.radio;

import java.util.List;

public interface RadiosTracingLoggerProvider.Logger {
    int deleteEntries(String arg1, long arg2, long arg3);

    List getEvents(long arg1, long arg2, int arg3, int arg4);

    List getEvents(long arg1, long arg2, int arg3, int arg4, int arg5, int arg6);

    boolean isNopLogger();
}

