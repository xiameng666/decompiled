import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.nearby.fastpair.internal.UpdateActiveTrackingMethodParams;

public final class cyum extends cjtm {
    private final UpdateActiveTrackingMethodParams a;
    private final String b;
    private final byte[] c;

    public cyum(UpdateActiveTrackingMethodParams updateActiveTrackingMethodParams0, String s, byte[] arr_b) {
        super(0x109, "UpdateActiveTrackingMethod");
        this.a = updateActiveTrackingMethodParams0;
        this.b = s;
        this.c = arr_b;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        int v = Binder.getCallingUid();
        String s = this.b;
        if(!cjbc.a(context0, v, s)) {
            throw new cjuh(40500, "Only allow 0p access");
        }
        context0.startService(DiscoveryChimeraService.a(context0).setAction("com.google.android.gms.nearby.fastpair.service.API_REQUEST").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_TYPE", "com.google.android.gms.nearby.fastpair.service.TYPE_UPDATE_ACTIVE_TRACKING_METHOD_TO_SPOT").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_PACKAGE", s).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_SIGNATURE_HASH", this.c).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_ACCOUNT_KEY", this.a.a).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_RESULT_CALLBACK", new BinderWrapper(this.a.a())));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.b.a(status0);
    }
}

