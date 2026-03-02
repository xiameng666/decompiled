public final class aiqt implements Runnable {
    public final aiqw a;
    public final wuu b;

    public aiqt(aiqw aiqw0, wuu wuu0) {
        this.a = aiqw0;
        this.b = wuu0;
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
        wuc0.c = 12;
        wuc wuc1 = (wuc)hftp0.N_build();
        ayuc ayuc0 = this.a.b.j(((MessageLite)wuc1), this.a.c);
        ayuc0.k(11);
        ayuc0.d();
    }
}

