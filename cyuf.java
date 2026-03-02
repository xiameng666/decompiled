import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.nearby.fastpair.internal.TriggerFastPairByAccountKeyParams;

public final class cyuf extends cjtm {
    private final TriggerFastPairByAccountKeyParams a;
    private final String b;
    private final byte[] c;

    public cyuf(TriggerFastPairByAccountKeyParams triggerFastPairByAccountKeyParams0, String s, byte[] arr_b) {
        super(0x109, "TriggerFastPairByAccountKey");
        this.a = triggerFastPairByAccountKeyParams0;
        this.b = s;
        this.c = arr_b;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        azql azql0 = azql.c(context0);
        String s = this.b;
        if(!azql0.g(s)) {
            throw new cjuh(40500, "Only allow google signed package");
        }
        if(!hvpg.a.aY().fK().b.contains(s)) {
            throw new cjuh(40500, String.format("%s is not allowlisted", s));
        }
        context0.startService(DiscoveryChimeraService.a(context0).setAction("com.google.android.gms.nearby.fastpair.service.API_REQUEST").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_TYPE", "com.google.android.gms.nearby.fastpair.service.TYPE_TRIGGER_FAST_PAIR_BY_ACCOUNT_KEY").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_PACKAGE", s).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_SIGNATURE_HASH", this.c).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_ACCOUNT_KEY", this.a.a).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_RESULT_CALLBACK", new BinderWrapper(this.a.a())));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.b.a(status0, 2);
    }
}

