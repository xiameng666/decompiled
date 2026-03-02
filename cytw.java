import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.nearby.fastpair.internal.GetUnpairedFastPairItemsParams;

public final class cytw extends cjtm {
    private final GetUnpairedFastPairItemsParams a;
    private final String b;
    private final byte[] c;

    public cytw(GetUnpairedFastPairItemsParams getUnpairedFastPairItemsParams0, String s, byte[] arr_b) {
        super(0x109, "GetUnpairedFastPairItems");
        this.a = getUnpairedFastPairItemsParams0;
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
        if(!hvpg.a.aY().fj().b.contains(s)) {
            throw new cjuh(40500, String.format("%s is not allowlisted", s));
        }
        context0.startService(DiscoveryChimeraService.a(context0).setAction("com.google.android.gms.nearby.fastpair.service.API_REQUEST").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_TYPE", "com.google.android.gms.nearby.fastpair.service.TYPE_GET_UNPAIRED_FAST_PAIR_ITEMS").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_PACKAGE", s).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_SIGNATURE_HASH", this.c).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_RESULT_CALLBACK", new BinderWrapper(this.a.a())));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a.a(status0, null);
    }
}

