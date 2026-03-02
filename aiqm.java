public final class aiqm implements Runnable {
    public final aiqw a;
    public final wum b;
    public final int c;

    public aiqm(aiqw aiqw0, wum wum0, int v) {
        this.a = aiqw0;
        this.b = wum0;
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
        ((wuc)hftv0).c = 11;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        wuc wuc0 = (wuc)hftp0.b_message;
        wuc0.b |= 2;
        wuc0.e = this.c;
        wuc wuc1 = (wuc)hftp0.N_build();
        ayuc ayuc0 = this.a.b.j(((MessageLite)wuc1), this.a.c);
        ayuc0.k(10);
        ayuc0.d();
    }
}

