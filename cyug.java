import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.nearby.fastpair.internal.TriggerFirmwareUpdateCheckParams;

public final class cyug extends cjtm {
    private final TriggerFirmwareUpdateCheckParams a;
    private final String b;
    private final byte[] c;

    public cyug(TriggerFirmwareUpdateCheckParams triggerFirmwareUpdateCheckParams0, String s, byte[] arr_b) {
        super(0x109, "TriggerFirmwareUpdateCheck");
        this.a = triggerFirmwareUpdateCheckParams0;
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
        context0.startService(DiscoveryChimeraService.a(context0).setAction("com.google.android.gms.nearby.fastpair.service.API_REQUEST").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_TYPE", "com.google.android.gms.nearby.fastpair.service.TYPE_TRIGGER_FIRMWARE_UPDATE_CHECK").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_PACKAGE", s).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_SIGNATURE_HASH", this.c).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_ACCOUNT_KEY", this.a.a).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_ADDRESS", this.a.b).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_MODEL_ID", this.a.d).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_RESULT_CALLBACK", new BinderWrapper(this.a.a())));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.c.a(status0);
    }
}

