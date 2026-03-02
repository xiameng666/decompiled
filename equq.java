import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;

public final class equq extends cjtm {
    private final equm a;
    private final eqvw b;
    private final String c;
    private final String d;
    private final Bundle e;

    public equq(eqvw eqvw0, equm equm0, String s, String s1, Bundle bundle0, azug azug0) {
        super(190, "StartServiceOnSourceOperation", azug0);
        this.b = eqvw0;
        this.a = equm0;
        this.c = s;
        this.d = s1;
        this.e = bundle0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        azql.c(context0).e(Binder.getCallingUid());
        Intent intent0 = new Intent();
        intent0.setClassName(this.a.e, "com.google.android.gms.smartdevice.quickstart.TargetQuickStartService");
        equk equk0 = new equk(this.a, this.b, this.c, this.d, this.e);
        bbic.a().d(this.a.e, intent0, equk0, 1);
        kau kau0 = new kau(this.c, this.d);
        this.a.g.put(kau0, equk0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        StartServiceResponse startServiceResponse0 = new StartServiceResponse(0);
        this.b.a(status0, startServiceResponse0);
    }
}

