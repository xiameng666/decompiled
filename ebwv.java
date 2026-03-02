import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class ebwv implements evqc {
    public final ebxe a;
    public final AccountInfo b;
    public final dymw c;
    public final frli d;

    public ebwv(ebxe ebxe0, frli frli0, AccountInfo accountInfo0, dymw dymw0) {
        this.a = ebxe0;
        this.d = frli0;
        this.b = accountInfo0;
        this.c = dymw0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.e(ebxe.a.j(), "%s: downloadMfiCards operation failed", "PendingSeProvisioningTaskOperation", exception0);
        this.a.i("Your transit card could not be added", "Try again");
        ibuq.c(this.d);
        this.a.q(this.d);
        ebst ebst0 = this.a.d();
        ibuq.e(this.b.b, "getAccountName(...)");
        this.a.v();
        ebst.e(ebst0, this.b.b, 0x319FD, System.currentTimeMillis() - this.c.d, 1, 16);
    }
}

