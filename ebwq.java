import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class ebwq implements evqc {
    public final ebxe a;
    public final AccountInfo b;
    public final dymw c;

    public ebwq(ebxe ebxe0, AccountInfo accountInfo0, dymw dymw0) {
        this.a = ebxe0;
        this.b = accountInfo0;
        this.c = dymw0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.e(ebxe.a.i(), "%s: ProvisionSePrepaidCard operation failed", "PendingSeProvisioningTaskOperation", exception0);
        ebxe.s(this.a, "Your transit card could not be added");
        ebst ebst0 = this.a.d();
        ibuq.e(this.b.b, "getAccountName(...)");
        this.a.v();
        ebst.e(ebst0, this.b.b, 203260, System.currentTimeMillis() - this.c.d, 0, 24);
    }
}

