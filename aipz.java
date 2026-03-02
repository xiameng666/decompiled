public final class aipz implements Runnable {
    public final aiqa a;
    public final wvr b;
    public final int c;

    public aipz(aiqa aiqa0, wvr wvr0, int v) {
        this.a = aiqa0;
        this.b = wvr0;
        this.c = v;
    }

    @Override
    public final void run() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wuc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.b.getClass();
        ((wuc)hftv0).d = this.b;
        ((wuc)hftv0).c = 3;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        wuc wuc0 = (wuc)hftp0.b_message;
        wuc0.b |= 2;
        wuc0.e = this.c;
        wuc wuc1 = (wuc)hftp0.N_build();
        cczb cczb0 = this.a.a.c(((ProtoLiteMessage)wuc1));
        cczb0.c = (int)3;
        cczb0.a();
    }
}

