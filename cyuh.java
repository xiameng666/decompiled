import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.nearby.fastpair.internal.TriggerSassForUsageParams;
import java.util.Locale;

public final class cyuh extends cjtm {
    static final gged_interceptors a;
    private final TriggerSassForUsageParams b;
    private final String c;
    private final int d;
    private final int e;
    private final byte[] f;

    static {
        gged_interceptors.m("android.permission.ACCESS_FINE_LOCATION", "android.permission.BLUETOOTH");
        cyuh.a = gged_interceptors.m("android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT");
    }

    public cyuh(TriggerSassForUsageParams triggerSassForUsageParams0, String s, int v, int v1, byte[] arr_b) {
        super(0x109, "TriggerSassForUsage");
        this.b = triggerSassForUsageParams0;
        this.c = s;
        this.d = v;
        this.e = v1;
        this.f = arr_b;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(!hvpp.al() || !cyfn.k()) {
            throw new cjuh(40504, "Api is disabled");
        }
        gged_interceptors gged0 = cyuh.a;
        if(!cygn.a(context0, this.d, this.e, gged0)) {
            throw new cjuh(40503, String.format(Locale.US, "Required permissions %s missing", gged0));
        }
        context0.startService(DiscoveryChimeraService.a(context0).setAction("com.google.android.gms.nearby.fastpair.service.API_REQUEST").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_TYPE", "com.google.android.gms.nearby.fastpair.service.TYPE_TRIGGER_SASS_FOR_USAGE").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_PACKAGE", this.c).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_SIGNATURE_HASH", this.f).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_AUDIO_USAGE", this.b.a).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_RESULT_CALLBACK", new BinderWrapper(this.b.a())));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.b.a(status0, false);
    }
}

