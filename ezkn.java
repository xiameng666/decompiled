import android.os.Bundle;
import com.google.android.gms.trustlet.onbody.discovery.PromoteScreenLockAndOnbodyChimeraActivity;
import j..util.Objects;

public final class ezkn implements luo {
    final PromoteScreenLockAndOnbodyChimeraActivity a;

    public ezkn(PromoteScreenLockAndOnbodyChimeraActivity promoteScreenLockAndOnbodyChimeraActivity0) {
        Objects.requireNonNull(promoteScreenLockAndOnbodyChimeraActivity0);
        this.a = promoteScreenLockAndOnbodyChimeraActivity0;
        super();
    }

    @Override  // luo
    public final lvb a(int v, Bundle bundle0) {
        return new ezax(this.a, bundle0);
    }

    @Override  // luo
    public final void b(lvb lvb0, Object object0) {
        PromoteScreenLockAndOnbodyChimeraActivity promoteScreenLockAndOnbodyChimeraActivity0 = this.a;
        lup.a(promoteScreenLockAndOnbodyChimeraActivity0).e(0);
        Bundle bundle0 = ((ezaw)object0).b;
        if(((ezaw)object0).a.i == 0) {
            boolean z = bundle0.getBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key");
            promoteScreenLockAndOnbodyChimeraActivity0.k.k(z);
        }
    }

    @Override  // luo
    public final void c(lvb lvb0) {
    }
}

