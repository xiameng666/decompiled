import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

final class eqey extends cjtm {
    public final eqff a;
    public final eqiw b;
    private final Handler c;

    public eqey(eqiw eqiw0, eqff eqff0, Handler handler0, azug azug0) {
        super(76, "GetPinOperation", azug0);
        this.a = eqff0;
        this.b = eqiw0;
        this.c = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqex eqex0 = new eqex(this);
        this.c.post(eqex0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.g(status0, null);
    }
}

