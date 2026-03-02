import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.nearby.fastpair.internal.DeleteAccountKeyParams;

public final class cytt extends cjtm {
    private final DeleteAccountKeyParams a;
    private final String b;
    private final byte[] c;

    public cytt(DeleteAccountKeyParams deleteAccountKeyParams0, String s, byte[] arr_b) {
        super(0x109, "DeleteAccountKey");
        this.a = deleteAccountKeyParams0;
        this.b = s;
        this.c = arr_b;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(!hvpp.D()) {
            throw new cjuh(40504, "Api is disabled");
        }
        azql azql0 = azql.c(context0);
        String s = this.b;
        if(!azql0.g(s)) {
            throw new cjuh(40500, "Only allow google signed package");
        }
        if(!cygn.b(context0, s)) {
            throw new cjuh(40500, "Only allow google gmscore");
        }
        context0.startService(DiscoveryChimeraService.a(context0).setAction("com.google.android.gms.nearby.fastpair.service.API_REQUEST").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_TYPE", "com.google.android.gms.nearby.fastpair.service.TYPE_DELETE_ACCOUNT_KEY").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_PACKAGE", s).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_SIGNATURE_HASH", this.c).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_ACCOUNT_KEY", this.a.a).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_RESULT_CALLBACK", new BinderWrapper(this.a.a())));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.b.a(status0);
    }
}

