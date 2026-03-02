public final class aipx implements Runnable {
    public final aiqa a;
    public final wub b;

    public aipx(aiqa aiqa0, wub wub0) {
        this.a = aiqa0;
        this.b = wub0;
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
        wuc0.c = 9;
        wuc wuc1 = (wuc)hftp0.N_build();
        cczb cczb0 = this.a.a.c(((ProtoLiteMessage)wuc1));
        cczb0.c = (int)8;
        cczb0.a();
    }
}

