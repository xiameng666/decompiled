final class ebxg {
    static final halv a(long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)halv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((halv)hftv0).b = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((halv)hftp0.b_message).c = 3;
        return (halv)hftp0.N_build();
    }

    static final halv b(long v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)halv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((halv)hftv0).b = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((halv)hftp0.b_message).c = 5;
        return (halv)hftp0.N_build();
    }

    static final halv c(int v, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)halv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((halv)hftv0).b = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((halv)hftv1).c = 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((halv)hftp0.b_message).d = v - 2;
        return (halv)hftp0.N_build();
    }
}

