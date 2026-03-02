import com.google.android.gms.pay.SyncTransactionsResponse;

public final class dmsd implements evqf {
    public final dmsn a;
    public final hkid b;
    public final hkhr c;

    public dmsd(dmsn dmsn0, hkid hkid0, hkhr hkhr0) {
        this.a = dmsn0;
        this.b = hkid0;
        this.c = hkhr0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        SyncTransactionsResponse syncTransactionsResponse0 = (SyncTransactionsResponse)object0;
        String s = this.b == hkid.l ? this.a.c.getString(0x7F151E24, new Object[]{this.c.h}) : this.a.c.getString(0x7F151E34);  // string:pay_fops_payment_method_deleted_message "%1$s was removed"
        edpc.b(this.a.c.getView(), s);
    }
}

