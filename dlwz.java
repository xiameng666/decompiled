import java.util.Iterator;

public final class dlwz implements dmba {
    private static final bboh a;
    private final edle b;

    static {
        dlwz.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlwz(edle edle0) {
        this.b = edle0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 22, "Cannot evaluate this filter, because it is not a Bluetooth Status filter.");
        hjrl hjrl0 = hjwe0.b == 22 ? ((hjrl)hjwe0.c) : hjrl.b;
        boolean z = this.b.b();
        Iterator iterator0 = new hfuh(hjrl0.c, hjrl.a).iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            return z ? ((hjrk)object0).equals(hjrk.b) : ((hjrk)object0).equals(hjrk.c);
        }
        ((ggtj)dlwz.a.i()).x("ClientBluetoothStatusFilter: should not reach here.");
        return false;
    }
}

