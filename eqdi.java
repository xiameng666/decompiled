import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;

final class eqdi implements eqdm {
    private final eqcx a;
    private final AccountTransferPayload b;

    public eqdi(eqcx eqcx0, AccountTransferPayload accountTransferPayload0) {
        this.a = eqcx0;
        this.b = accountTransferPayload0;
    }

    @Override  // eqdm
    public final void a() {
        AccountTransferMsg accountTransferMsg0 = this.b.p();
        if(accountTransferMsg0 == null) {
            eqdn.f.f("Could not import accounts because AccountTransferMsg is null", new Object[0]);
            return;
        }
        this.a.c(accountTransferMsg0);
    }
}

