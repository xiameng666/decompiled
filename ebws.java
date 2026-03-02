import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class ebws implements evqc {
    public final long a;
    public final ebxe b;
    public final AccountInfo c;
    public final dymw d;
    public final dycl e;
    public final ebxd f;

    public ebws(long v, ebxe ebxe0, AccountInfo accountInfo0, dymw dymw0, dycl dycl0, ebxd ebxd0) {
        this.a = v;
        this.b = ebxe0;
        this.c = accountInfo0;
        this.d = dymw0;
        this.e = dycl0;
        this.f = ebxd0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(ebxe.a.j(), "performEmoneyCardOperation for chip init failed", exception0);
        long v = this.a;
        int v1 = Long.compare(v, 1L);
        ebxe ebxe0 = this.b;
        AccountInfo accountInfo0 = this.c;
        if(v1 < 0 || v == hwsd.p()) {
            ebst ebst0 = ebxe0.d();
            ibuq.e(accountInfo0.b, "getAccountName(...)");
            ebst.e(ebst0, accountInfo0.b, 0x379A3, v, (v1 >= 0 ? 14 : 13), 16);
        }
        dycl dycl0 = this.e;
        dymw dymw0 = this.d;
        if(v < hwsd.p()) {
            ebxe0.p(accountInfo0, dymw0, dycl0, v + 1L, this.f);
            return;
        }
        ebxe0.l(accountInfo0, dymw0, dycl0);
    }
}

