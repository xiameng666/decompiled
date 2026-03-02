import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvo extends fbny {
    final geqj b;
    final String c;
    final fbvw e;

    public fbvo(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, geqj geqj0, String s) {
        this.b = geqj0;
        this.c = s;
        Objects.requireNonNull(fbvw0);
        this.e = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        geqj geqj0 = this.b;
        gers gers0 = geqj0.e == null ? gers.b : geqj0.e;
        if(((gers0.j == null ? gesc.a : gers0.j).b & 16) != 0) {
            String s = fbvw.S(this.a, this.c) + "/payments/apis-secure/buyflowservice/initialize?s7e_mode=proto";
            return this.e.W(s, gamm0, geqj0, fbvw.a, 33);
        }
        String s1 = fbvw.S(this.a, this.c) + "/payments/apis-secure/buyflowservice/initialize";
        return this.e.V(s1, gamm0, geqj0, 33);
    }
}

