package com.google.android.gms.home.core.swig;

public class InteractionSessionCallbackJniSwigPtr {
    public long a;
    protected boolean b;

    public InteractionSessionCallbackJniSwigPtr() {
        this(InteractionApiJniJNI.new_InteractionSessionCallbackJniSwigPtr__SWIG_0(), true);
    }

    protected InteractionSessionCallbackJniSwigPtr(long v, boolean z) {
        this.b = z;
        this.a = v;
    }

    public InteractionSessionCallbackJniSwigPtr(InteractionSessionCallbackJniSwigPtr interactionSessionCallbackJniSwigPtr0) {
        this(InteractionApiJniJNI.new_InteractionSessionCallbackJniSwigPtr__SWIG_2(interactionSessionCallbackJniSwigPtr0.a, interactionSessionCallbackJniSwigPtr0), true);
    }

    public final void a() {
        synchronized(this) {
            long v1 = this.a;
            if(v1 != 0L) {
                if(this.b) {
                    this.b = false;
                    InteractionApiJniJNI.delete_InteractionSessionCallbackJniSwigPtr(v1);
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

