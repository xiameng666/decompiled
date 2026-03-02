public final class aipm implements Runnable {
    public final aiqa a;
    public final wue b;

    public aipm(aiqa aiqa0, wue wue0) {
        this.a = aiqa0;
        this.b = wue0;
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
        wuc0.c = 19;
        wuc wuc1 = (wuc)hftp0.N_build();
        cczb cczb0 = this.a.a.c(((ProtoLiteMessage)wuc1));
        cczb0.c = (int)17;
        cczb0.a();
    }
}

