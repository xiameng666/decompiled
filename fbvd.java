import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.TimelineViewSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;

final class fbvd extends fbny {
    final hchr b;
    final TimelineViewSubmitRequest c;
    final fbvw e;

    public fbvd(fbvw fbvw0, BuyFlowConfig buyFlowConfig0, Account account0, hchr hchr0, TimelineViewSubmitRequest timelineViewSubmitRequest0) {
        this.b = hchr0;
        this.c = timelineViewSubmitRequest0;
        Objects.requireNonNull(fbvw0);
        this.e = fbvw0;
        super(buyFlowConfig0, account0);
    }

    @Override  // fbnz
    public final ServerResponse a(gamm gamm0) {
        String s = fbvw.R(this.a) + "/payments/apis-secure/timelineview/submit?s7e_mode=proto";
        return this.e.W(s, gamm0, this.b, this.c.c, 0x3F);
    }
}

