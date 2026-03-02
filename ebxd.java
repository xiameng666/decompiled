import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class ebxd {
    final dymw a;
    final ebxe b;
    final AccountInfo c;
    final dycl d;

    public ebxd(dymw dymw0, ebxe ebxe0, AccountInfo accountInfo0, dycl dycl0) {
        this.a = dymw0;
        this.b = ebxe0;
        this.c = accountInfo0;
        this.d = dycl0;
        super();
    }

    public final void a() {
        ((glyq)this.d.c(dymv.c)).u();
        this.b.e().c("You need to complete a step before you can add your transit card", "Tap to view details");
        ebxe.r(this.b, 1, null, 6);
    }
}

