public final class atga {
    public final atgb a;
    public final atgx b;
    public final boolean c;
    public final atfw d;

    static {
        aqql.a("BackupFileBuilder");
    }

    public atga(atgb atgb0, atfw atfw0, atgx atgx0, boolean z) {
        this.a = atgb0;
        this.d = atfw0;
        this.b = atgx0;
        this.c = z;
    }

    public static arak a(aram aram0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arak.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((arak)hftp0.b_message).c = aram0.d;
        ((arak)hftp0.b_message).b |= 1;
        return (arak)hftp0.N_build();
    }
}

