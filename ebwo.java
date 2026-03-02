import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class ebwo implements ibts {
    public final ebxe a;
    public final AccountInfo b;
    public final dymw c;

    public ebwo(ebxe ebxe0, AccountInfo accountInfo0, dymw dymw0) {
        this.a = ebxe0;
        this.b = accountInfo0;
        this.c = dymw0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ProtoSafeParcelable protoSafeParcelable0 = (ProtoSafeParcelable)object0;
        this.a.k();
        ebst ebst0 = this.a.d();
        ibuq.e(this.b.b, "getAccountName(...)");
        this.a.v();
        ebst.e(ebst0, this.b.b, 0x319F7, System.currentTimeMillis() - this.c.d, 0, 24);
        return ibom.a;
    }
}

