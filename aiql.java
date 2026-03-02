public final class aiql implements Runnable {
    public final aiqw a;
    public final wus b;

    public aiql(aiqw aiqw0, wus wus0) {
        this.a = aiqw0;
        this.b = wus0;
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
        wuc0.c = 16;
        wuc wuc1 = (wuc)hftp0.N_build();
        ayuc ayuc0 = this.a.b.j(((MessageLite)wuc1), this.a.c);
        ayuc0.k(14);
        ayuc0.d();
    }
}

