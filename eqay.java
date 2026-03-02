import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;

final class eqay extends cjtm {
    public final ConnectParams a;
    public final eqbv b;
    private final Handler c;

    public eqay(ConnectParams connectParams0, eqbv eqbv0, Handler handler0, azug azug0) {
        super(75, "Connect2Operation", azug0);
        this.a = connectParams0;
        this.b = eqbv0;
        this.c = handler0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        eqax eqax0 = new eqax(this);
        this.c.post(eqax0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        eqik eqik0 = this.a.a;
        if(eqik0 != null) {
            eqik0.d(status0);
        }
    }
}

