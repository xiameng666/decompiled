public final class aipv implements Runnable {
    public final aiqa a;
    public final wve b;

    public aipv(aiqa aiqa0, wve wve0) {
        this.a = aiqa0;
        this.b = wve0;
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
        wuc0.c = 15;
        wuc wuc1 = (wuc)hftp0.N_build();
        cczb cczb0 = this.a.a.c(((ProtoLiteMessage)wuc1));
        cczb0.c = (int)13;
        cczb0.a();
    }
}

