import android.content.Context;
import com.google.android.gms.multidevice.sync.devicelink.debug.ui.DeviceLinkDebugChimeraActivity;
import j..util.Objects;

final class ctqx implements acl {
    final ctqy a;

    public ctqx(ctqy ctqy0) {
        Objects.requireNonNull(ctqy0);
        this.a = ctqy0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        ctqy ctqy0 = this.a;
        if(!ctqy0.n) {
            ctqy0.n = true;
            ((ctqw)ctqy0.h()).e(((DeviceLinkDebugChimeraActivity)ctqy0));
        }
    }
}

