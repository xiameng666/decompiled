package com.google.android.gms.home.core.swig;

public class RequestChannelCallbackJniSwigPtr {
    public long a;
    protected boolean b;

    public RequestChannelCallbackJniSwigPtr() {
        this(InteractionApiJniJNI.new_RequestChannelCallbackJniSwigPtr__SWIG_0(), true);
    }

    protected RequestChannelCallbackJniSwigPtr(long v, boolean z) {
        this.b = z;
        this.a = v;
    }

    public RequestChannelCallbackJniSwigPtr(RequestChannelCallbackJniSwigPtr requestChannelCallbackJniSwigPtr0) {
        this(InteractionApiJniJNI.new_RequestChannelCallbackJniSwigPtr__SWIG_2(requestChannelCallbackJniSwigPtr0.a, requestChannelCallbackJniSwigPtr0), true);
    }

    public final void a() {
        synchronized(this) {
            long v1 = this.a;
            if(v1 != 0L) {
                if(this.b) {
                    this.b = false;
                    InteractionApiJniJNI.delete_RequestChannelCallbackJniSwigPtr(v1);
                }
                this.a = 0L;
            }
        }
    }

    @Override
    protected final void finalize() {
        this.a();
    }
}

