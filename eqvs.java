import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

public final class eqvs extends cjtm {
    private final equm a;
    private final eqvw b;

    public eqvs(eqvw eqvw0, equm equm0, azug azug0) {
        super(76, "StartRestoreOperation", azug0);
        this.b = eqvw0;
        this.a = equm0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        Intent intent0 = new Intent();
        intent0.setClassName(this.a.e, "com.google.android.gms.smartdevice.quickstart.TargetQuickStartService");
        this.a.f = new equj(this.a, this.b);
        bbic.a().d(this.a.e, intent0, this.a.f, 1);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.g(status0);
    }
}

