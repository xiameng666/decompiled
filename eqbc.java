import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

final class eqbc extends cjtm {
    public final eqik a;
    public final eqbv b;
    private final Handler c;

    public eqbc(eqik eqik0, eqbv eqbv0, Handler handler0, azug azug0) {
        super(75, "ContinueWithPinOperation", azug0);
        this.a = eqik0;
        this.b = eqbv0;
        this.c = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqbb eqbb0 = new eqbb(this);
        this.c.post(eqbb0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.e(status0);
    }
}

