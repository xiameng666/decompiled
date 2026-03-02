import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;

final class eqbo extends cjtm {
    public final eqik a;
    public final eqiq b;
    public final eqbv c;
    private final Handler d;

    public eqbo(eqik eqik0, eqiq eqiq0, eqbv eqbv0, Handler handler0, azug azug0) {
        super(75, "StartScanOperation", azug0);
        this.b = eqiq0;
        this.a = eqik0;
        this.c = eqbv0;
        this.d = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqbn eqbn0 = new eqbn(this);
        this.d.post(eqbn0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.j(status0);
    }
}

