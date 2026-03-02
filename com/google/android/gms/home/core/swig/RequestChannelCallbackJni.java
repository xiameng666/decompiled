package com.google.android.gms.home.core.swig;

import com.google.protos.home.internal.generic_channel.Payload;

public class RequestChannelCallbackJni extends SwigApiRefcounted {
    private long b;

    public RequestChannelCallbackJni() {
        this(InteractionApiJniJNI.new_RequestChannelCallbackJni(), true);
        InteractionApiJniJNI.RequestChannelCallbackJni_director_connect(this, this.b, this.a, true);
    }

    protected RequestChannelCallbackJni(long v, boolean z) {
        super(InteractionApiJniJNI.RequestChannelCallbackJni_SWIGUpcast(v), true);
        this.b = v;
    }

    public void Call(Payload payload0) {
        InteractionApiJniJNI.RequestChannelCallbackJni_Call(this.b, this, (payload0 == null ? null : payload0.toBytesArray()));
    }

    @Override  // com.google.android.gms.home.core.swig.SwigApiRefcounted
    public void delete() {
        synchronized(this) {
            long v1 = this.b;
            if(v1 != 0L) {
                if(this.a) {
                    this.a = false;
                    InteractionApiJniJNI.delete_RequestChannelCallbackJni(v1);
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

