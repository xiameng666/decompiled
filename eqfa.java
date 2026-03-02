import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

final class eqfa extends cjtm {
    public final eqit a;
    public final eqff b;
    public final eqiw c;
    private final Handler d;

    public eqfa(eqiw eqiw0, eqff eqff0, eqit eqit0, Handler handler0, azug azug0) {
        super(76, "ResumeBootstrapOperation", azug0);
        this.a = eqit0;
        this.b = eqff0;
        this.c = eqiw0;
        this.d = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqez eqez0 = new eqez(this);
        this.d.post(eqez0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.h(status0);
    }
}

