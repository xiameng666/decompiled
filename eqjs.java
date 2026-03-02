import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;

public final class eqjs implements azys {
    public final ConnectionRequest a;
    public final epzo b;
    public final epzz c;

    public eqjs(epzz epzz0, ConnectionRequest connectionRequest0, epzo epzo0) {
        this.c = epzz0;
        this.a = connectionRequest0;
        this.b = epzo0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        eqjr eqjr0 = (eqjr)object0;
        eqko eqko0 = new eqko(((evqp)object1));
        eqih eqih0 = this.c.e(this.b);
        ConnectParams connectParams0 = new ConnectParams(new eqjj(eqko0), this.a, eqih0);
        ((eqin)eqjr0.H()).g(connectParams0, cclr.a(eqjr0.r));
    }
}

