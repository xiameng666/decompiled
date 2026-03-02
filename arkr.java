public final class arkr implements Runnable {
    public final arkt a;
    public final byte[] b;

    public arkr(arkt arkt0, byte[] arr_b) {
        this.a = arkt0;
        this.b = arr_b;
    }

    @Override
    public final void run() {
        arim arim0 = this.a.b;
        if(arim0.a) {
            arin.a.d("Listener.SendData called after abortRequest", new Object[0]);
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ascm.a).v_newBuilder();
        ascl ascl0 = ascl.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ascm)hftp0.b_message).c = ascl0.g;
        ((ascm)hftp0.b_message).b |= 1;
        ByteString hfsf0 = ByteString.copyFrom(this.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ascm ascm0 = (ascm)hftp0.b_message;
        ascm0.b |= 2;
        ascm0.d = hfsf0;
        ascm ascm1 = (ascm)hftp0.N_build();
        arim0.b.h(ascm1, null);
    }
}

