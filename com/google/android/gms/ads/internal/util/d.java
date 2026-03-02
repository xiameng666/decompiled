package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import clht;
import com.google.android.gms.ads.internal.c;

public final class d extends clht {
    public d(Looper looper0) {
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        try {
            super.handleMessage(message0);
        }
        catch(Exception exception0) {
            c.d().c(exception0, "AdMobHandler.handleMessage");
        }
    }

    @Override  // clht
    protected final void mC(Message message0) {
        try {
            super.mC(message0);
        }
        catch(Throwable throwable0) {
            m.l(c.d().d, throwable0);
            throw throwable0;
        }
    }
}

