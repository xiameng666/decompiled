import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

final class eqew extends cjtm {
    public final eqiw a;
    private final eqln b;
    private final Handler c;

    public eqew(eqiw eqiw0, eqln eqln0, Handler handler0, azug azug0) {
        super(76, "GetManagedAccountSetupInfoOperation", azug0);
        this.b = eqln0;
        this.c = handler0;
        this.a = eqiw0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        this.b.c().s(new bbre(this.c), new eqev(this));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.f(status0, null);
    }
}

