public final class atgt implements atgr {
    public static final aqql a;
    public final aqwe b;
    public final atgw c;
    public final aqys d;

    static {
        atgt.a = new aqql(new String[]{"CryptoBackupServerImpl"});
    }

    public atgt(aqwe aqwe0, atgw atgw0, aqys aqys0) {
        this.b = aqwe0;
        this.c = atgw0;
        this.d = aqys0;
    }

    public static boolean a(int v) {
        return v == 401 || v == 503;
    }

    public static final void b(ProtoLiteBuilder hftp0, aqlk aqlk0, arax arax0) {
        batl.c(((aqfe)hftp0.b_message).l.size() == 1, "BackupRequest must contain 1 app.");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqfe aqfe0 = (aqfe)hftp0.b_message;
        aqfe0.b |= 0x200;
        aqfe0.i = aqlk0.a;
        aqet aqet0 = hftp0.cN();
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)aqet0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)aqet0));
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)aqei.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hkzm.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((hkzm)hftp3.b_message).c = 2;
        ((hkzm)hftp3.b_message).b |= 1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        aqei aqei0 = (aqei)hftp2.b_message;
        hkzm hkzm0 = (hkzm)hftp3.N_build();
        hkzm0.getClass();
        aqei0.d = hkzm0;
        aqei0.b |= 2;
        ByteString hfsf0 = arax0.getDefaultInstanceForType();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        aqei aqei1 = (aqei)hftp2.b_message;
        aqei1.b |= 1;
        aqei1.c = hfsf0;
        aqei aqei2 = (aqei)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        aqet aqet1 = (aqet)hftp1.b_message;
        aqei2.getClass();
        aqet1.h = aqei2;
        aqet1.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((aqfe)hftp0.b_message).l = hfvv.a;
        hftp0.dj(hftp1);
    }
}

