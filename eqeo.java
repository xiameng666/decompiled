import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

final class eqeo extends cjtm {
    public final eqff a;
    public final eqiw b;
    private final Handler c;

    public eqeo(eqiw eqiw0, eqff eqff0, Handler handler0, azug azug0) {
        super(76, "DisableTargetModeOperation", azug0);
        this.a = eqff0;
        this.b = eqiw0;
        this.c = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqen eqen0 = new eqen(this);
        this.c.post(eqen0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.b(status0);
    }
}

