import android.accounts.Account;
import com.google.android.gms.pay.DataChangeListenerResponse;

public final class ebxb implements dmqb {
    final ebxe a;
    final Account b;
    final dymw c;
    final frli d;

    public ebxb(frli frli0, ebxe ebxe0, Account account0, dymw dymw0) {
        this.d = frli0;
        this.a = ebxe0;
        this.b = account0;
        this.c = dymw0;
        super();
    }

    @Override  // dmqb
    public final void jP(DataChangeListenerResponse dataChangeListenerResponse0) {
        ibuq.f(dataChangeListenerResponse0, "response");
        if(dataChangeListenerResponse0.a.a != 13) {
            return;
        }
        fhqu.a(this.d.a()).y(this.a.f(), new ebxa(new ebwz(this.a, this.b, this.c, this.d)));
    }
}

