import j..util.Objects;

final class fckj implements fcfd {
    public final evqp a;
    final fckl b;

    public fckj(fckl fckl0) {
        Objects.requireNonNull(fckl0);
        this.b = fckl0;
        super();
        this.a = new evqp();
    }

    @Override  // fcfd
    public final evql k(String s, String s1, byte[] arr_b) {
        ffap ffap0;
        if(!s1.equals("/restore/key_recovery_result")) {
            fckl.a.m("WearBackupService received a non key recovery result request", new Object[0]);
            return null;
        }
        if(!s.equals(this.b.d)) {
            return null;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffap.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ffap0 = (ffap)hftv0;
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException("Invalid key_recovery_result data", hfur0);
        }
        this.a.b(ffap0);
        return evrg.d(new byte[0]);
    }
}

