import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

final class eqba extends cjtm {
    public final eqik a;
    public final eqbv b;
    public final D2DDevice c;
    public final String d;
    public final eqih e;
    private final Handler f;

    public eqba(eqik eqik0, D2DDevice d2DDevice0, String s, eqih eqih0, eqbv eqbv0, Handler handler0, azug azug0) {
        super(75, "ConnectOperation", azug0);
        this.a = eqik0;
        this.b = eqbv0;
        this.c = d2DDevice0;
        this.d = s;
        this.e = eqih0;
        this.f = handler0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        eqaz eqaz0 = new eqaz(this);
        this.f.post(eqaz0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.d(status0);
    }
}

