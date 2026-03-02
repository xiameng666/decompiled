import com.google.android.gms.pay.Transaction;

public final class dmbs implements dmba {
    private static final bboh a;
    private final edgp b;

    static {
        dmbs.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmbs(edgp edgp0) {
        this.b = edgp0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        Transaction transaction0;
        ibuq.f(hjrn0, "bullet");
        ibuq.f(hjwe0, "filter");
        if(hjwe0.b != 55) {
            throw new IllegalStateException("Cannot evaluate filter that is not pix pending transaction filter");
        }
        hjuw hjuw0 = (hjuw)hjwe0.c;
        ibuq.e(hjuw0, "getPixPendingTransactionFilter(...)");
        try {
            transaction0 = this.b.a((hjuw0.b == null ? hjqu.a : hjuw0.b).b, (hjuw0.b == null ? hjqu.a : hjuw0.b).c);
        }
        catch(dmhl dmhl0) {
            a.ae(dmbs.a.j(), "Could not get transaction.", dmhl0);
            transaction0 = null;
        }
        if(transaction0 != null) {
            byte[] arr_b = transaction0.a;
            if(arr_b != null) {
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hknp.b), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    hknp hknp0 = (hknp)hftv0;
                    return hknp0 == null || hknp0.f != 30 ? false : (hknl.b(hknp0.q) == null ? hknl.i : hknl.b(hknp0.q)) == hknl.e;
                }
                catch(hfur hfur0) {
                    a.ae(dmbs.a.j(), "Could not parse transaction.", hfur0);
                    return false;
                }
            }
        }
        return false;
    }
}

