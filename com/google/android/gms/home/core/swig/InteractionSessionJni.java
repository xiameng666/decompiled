package com.google.android.gms.home.core.swig;

import com.google.protos.home.internal.interaction_api.Request;

public class InteractionSessionJni extends SwigApiRefcounted {
    private long b;

    public InteractionSessionJni() {
        this(InteractionApiJniJNI.new_InteractionSessionJni(), true);
        InteractionApiJniJNI.InteractionSessionJni_director_connect(this, this.b, this.a, true);
    }

    protected InteractionSessionJni(long v, boolean z) {
        super(InteractionApiJniJNI.InteractionSessionJni_SWIGUpcast(v), true);
        this.b = v;
    }

    public void HandleRequest(Request request0, InteractionSessionCallbackJniSwigPtr interactionSessionCallbackJniSwigPtr0, InteractionSessionCallbackJniSwigPtr interactionSessionCallbackJniSwigPtr1) {
        InteractionApiJniJNI.InteractionSessionJni_HandleRequest(this.b, this, (request0 == null ? null : request0.toBytesArray()), interactionSessionCallbackJniSwigPtr0.a, interactionSessionCallbackJniSwigPtr0, interactionSessionCallbackJniSwigPtr1.a, interactionSessionCallbackJniSwigPtr1);
    }

    @Override  // com.google.android.gms.home.core.swig.SwigApiRefcounted
    public void delete() {
        synchronized(this) {
            long v1 = this.b;
            if(v1 != 0L) {
                if(this.a) {
                    this.a = false;
                    InteractionApiJniJNI.delete_InteractionSessionJni(v1);
                }
                this.b = 0L;
            }
            super.delete();
        }
    }

    @Override  // com.google.android.gms.home.core.swig.SwigApiRefcounted
    protected void finalize() {
        this.delete();
    }

    protected void swigDirectorDisconnect() {
        this.a = false;
        this.delete();
    }
}

