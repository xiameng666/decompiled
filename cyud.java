import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import com.google.android.gms.nearby.fastpair.internal.RenameDeviceParams;

public final class cyud extends cjtm {
    private final RenameDeviceParams a;
    private final String b;
    private final byte[] c;

    public cyud(RenameDeviceParams renameDeviceParams0, String s, byte[] arr_b) {
        super(0x109, "RenameDevice");
        this.a = renameDeviceParams0;
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
        if(!hvpg.a.aY().fy().b.contains(s)) {
            throw new cjuh(40500, String.format("%s is not allowlisted", s));
        }
        context0.startService(DiscoveryChimeraService.a(context0).setAction("com.google.android.gms.nearby.fastpair.service.API_REQUEST").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_TYPE", "com.google.android.gms.nearby.fastpair.service.TYPE_RENAME_DEVICE").putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_PACKAGE", s).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_SIGNATURE_HASH", this.c).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_ACCOUNT_KEY", this.a.a).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_NEW_NAME", this.a.b).putExtra("com.google.android.gms.nearby.fastpair.service.EXTRA_RESULT_CALLBACK", new BinderWrapper(this.a.a())));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.c.a(status0);
    }
}

