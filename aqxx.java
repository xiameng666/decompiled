public class aqxx extends aqxy {
    public aqxx(int v) {
        super(v);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkzp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hkzp)hftp0.b_message).c = 2;
        ((hkzp)hftp0.b_message).b |= 1;
        hkzp hkzp0 = (hkzp)hftp0.N_build();
    }

    public aqxx(int v, byte[] arr_b) {
        super(v);
    }
}

