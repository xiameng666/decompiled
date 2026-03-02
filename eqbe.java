import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

final class eqbe extends cjtm {
    public final eqik a;
    public final eqbv b;
    private final Handler c;

    public eqbe(eqik eqik0, eqbv eqbv0, Handler handler0, azug azug0) {
        super(75, "DisconnectOperation", azug0);
        this.a = eqik0;
        this.b = eqbv0;
        this.c = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqbd eqbd0 = new eqbd(this);
        this.c.post(eqbd0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.f(status0);
    }
}

