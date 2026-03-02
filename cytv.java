import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.nearby.fastpair.internal.GetSassDeviceInfoParams;
import java.util.Locale;

public final class cytv extends cjtm {
    static final gged_interceptors a;
    static final gged_interceptors b;
    private final GetSassDeviceInfoParams c;
    private final String d;
    private final int e;
    private final int f;
    private final byte[] g;

    static {
        cytv.a = gged_interceptors.m("android.permission.BLUETOOTH_SCAN", "android.permission.MEDIA_ROUTING_CONTROL");
        cytv.b = gged_interceptors.l("android.permission.BLUETOOTH_SCAN");
    }

    public cytv(GetSassDeviceInfoParams getSassDeviceInfoParams0, String s, int v, int v1, byte[] arr_b) {
        super(0x109, "GetSassDeviceInfo");
        this.c = getSassDeviceInfoParams0;
        this.d = s;
        this.e = v;
        this.f = v1;
        this.g = arr_b;
    }

    static final gged_interceptors b(boolean z) {
        return z ? cytv.b : cytv.a;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        if(Build.VERSION.SDK_INT < 35 || !hvpp.U() || !cyfn.k()) {
            throw new cjuh(40504, "Api is disabled");
        }
        hfuo hfuo0 = hvpg.a.aY().fi().b;
        String s = this.d;
        boolean z = hfuo0.contains(s);
        if(!cygn.a(context0, this.e, this.f, cytv.b(z))) {
            throw new cjuh(40503, String.format(Locale.US, "Required permissions %s missing", cytv.b(z)));
        }
        context0.startService(DiscoveryChimeraService.a(context0).setAction("com.google.android.gms.nearby.fastpair.service.API_REQUEST").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_TYPE", "com.google.android.gms.nearby.fastpair.service.TYPE_GET_SASS_DEVICE_INFO").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_PACKAGE", s).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_SIGNATURE_HASH", this.g).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_AUDIO_USAGE", this.c.a).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_RESULT_CALLBACK", new BinderWrapper(this.c.a())));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.b.a(status0, null);
    }
}

