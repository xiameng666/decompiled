import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvr extends fbny {
    final fbvw b;
    final ProtoLiteBuilder c;

    public fbvr(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, ProtoLiteBuilder hftp0) {
        this.c = hftp0;
        Objects.requireNonNull(fbvw0);
        this.b = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/buyflowservice/initializetemplate";
        ProtoLiteMessage hftv0 = this.c.N_build();
        return this.b.V(s, gamm0, hftv0, 38);
    }
}

