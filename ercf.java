import android.content.Context;
import com.google.android.gms.smartdevice.quickstart.ui.TargetQuickStartChimeraActivity;
import j..util.Objects;

final class ercf implements acl {
    final ercg a;

    public ercf(ercg ercg0) {
        Objects.requireNonNull(ercg0);
        this.a = ercg0;
        super();
    }

    @Override  // acl
    public final void a(Context context0) {
        ercg ercg0 = this.a;
        if(!ercg0.h) {
            ercg0.h = true;
            ((erdh)ercg0.h()).d(((TargetQuickStartChimeraActivity)ercg0));
        }
    }
}

