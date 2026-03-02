import android.os.Bundle;
import com.google.android.gms.mdm.settings.ActionButtonsPreference;
import j..util.Optional;

public final class cqno implements evqf {
    public final cqnv a;
    public final Bundle b;

    public cqno(cqnv cqnv0, Bundle bundle0) {
        this.a = cqnv0;
        this.b = bundle0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        boolean z = ((Optional)object0).isPresent();
        cqnv cqnv0 = this.a;
        cqnv0.ai = z;
        ActionButtonsPreference actionButtonsPreference0 = cqnv0.ah;
        if(actionButtonsPreference0.a != z) {
            actionButtonsPreference0.a = z;
            actionButtonsPreference0.d();
        }
        if(this.b == null) {
            ((Optional)object0).ifPresent(new cqnl(cqnv0));
        }
    }
}

