public final class aiqq implements Runnable {
    public final aiqw a;
    public final wvp b;

    public aiqq(aiqw aiqw0, wvp wvp0) {
        this.a = aiqw0;
        this.b = wvp0;
    }

    @Override
    public final void run() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wuc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wuc wuc0 = (wuc)hftp0.b_message;
        this.b.getClass();
        wuc0.d = this.b;
        wuc0.c = 2;
        wuc wuc1 = (wuc)hftp0.N_build();
        ayuc ayuc0 = this.a.b.j(((MessageLite)wuc1), this.a.c);
        ayuc0.k(2);
        ayuc0.d();
    }
}

