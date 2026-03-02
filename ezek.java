import android.os.Bundle;
import j..util.Objects;

final class ezek implements luo {
    final ezel a;

    public ezek(ezel ezel0) {
        Objects.requireNonNull(ezel0);
        this.a = ezel0;
        super();
    }

    @Override  // luo
    public final lvb a(int v, Bundle bundle0) {
        return new ezax(this.a.getContext(), bundle0);
    }

    @Override  // luo
    public final void b(lvb lvb0, Object object0) {
        Bundle bundle0 = ((ezaw)object0).b;
        if(((ezaw)object0).a.i == 0) {
            boolean z = bundle0.getBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key");
            this.a.K(z);
        }
    }

    @Override  // luo
    public final void c(lvb lvb0) {
    }
}

