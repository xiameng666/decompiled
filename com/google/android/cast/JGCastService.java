package com.google.android.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Surface;
import java.lang.ref.WeakReference;
import wvz;
import wwa;

public class JGCastService {
    public static final boolean DEBUG = false;
    public static final int FLAG_PRIVATE_DISPLAY = 0x40000000;
    public static final int FLAG_SHOW_RECEIVER_STATS = 2;
    public static final int FLAG_SHOW_SENDER_STATS = 1;
    public static final int FLAG_USE_EXTENDED_LOGGING_Q1_2025 = 8;
    public static final int FLAG_USE_STATISTICS_ANALYZER = 4;
    public static final int FLAG_USE_TDLS = 0x80000000;
    private static final String TAG = "JGCastService";
    public boolean mDidLoadLibrary;
    private Handler mEventHandler;
    public wwa mListener;
    private long mNativeContext;

    static {
    }

    public JGCastService(Context context0, wwa wwa0, Intent intent0) {
        this.mListener = wwa0;
        Looper looper0 = Looper.myLooper();
        if(looper0 == null) {
            looper0 = Looper.getMainLooper();
        }
        if(looper0 != null) {
            this.mEventHandler = new wvz(this, looper0);
        }
        boolean z = this.a(context0);
        this.mDidLoadLibrary = z;
        if(!z) {
            Log.e("JGCastService", "Unable to load JGCastService library");
            return;
        }
        JGCastService.native_init();
        this.native_setup(new WeakReference(this), context0, intent0);
    }

    public boolean a(Context context0) {
        try {
            System.loadLibrary("jgcast_service_jni");
            return true;
        }
        catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
            Log.e("JGCastService", "Unable to locate jgcast_service_jni in " + context0.getClassLoader().toString(), unsatisfiedLinkError0);
            return false;
        }
    }

    @Override
    protected final void finalize() {
        if(this.mDidLoadLibrary) {
            this.native_finalize();
        }
        super.finalize();
    }

    public final native void native_createSourceOrSink(boolean arg1, String arg2, String arg3, String arg4, Surface arg5, int arg6) {
    }

    public final native void native_disconnect() {
    }

    private final native void native_finalize() {
    }

    private static final native void native_init() {
    }

    private final native void native_release() {
    }

    public final native void native_setLogger(JGCastLogger arg1) {
    }

    public final native void native_setParameters(boolean arg1, String arg2) {
    }

    private final native void native_setup(Object arg1, Context arg2, Intent arg3) {
    }

    private static void postEventFromNative(Object object0, int v, int v1, int v2, Object object1) {
        JGCastService jGCastService0 = (JGCastService)((WeakReference)object0).get();
        if(jGCastService0 == null) {
            return;
        }
        Message message0 = jGCastService0.mEventHandler.obtainMessage(v, v1, v2, object1);
        jGCastService0.mEventHandler.sendMessage(message0);
    }
}

