import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import java.util.concurrent.TimeUnit;

public final class erjm implements evpz {
    public final erkf a;
    public final ConnectionRequest b;

    public erjm(erkf erkf0, ConnectionRequest connectionRequest0) {
        this.a = erkf0;
        this.b = connectionRequest0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        erkf erkf0 = this.a;
        ConnectionRequest connectionRequest0 = this.b;
        if(evql0.n()) {
            erkf.a.d("Disconnect from previous connection succeeded, waiting for Bluetooth cleanup", new Object[0]);
            new bbll(1, 9).g(new erjn(erkf0, connectionRequest0), hygl.a.d().d(), TimeUnit.MILLISECONDS).hB(new erjo(), gmap.a);
            return;
        }
        erkf.a.j("Disconnect failed, likely no connection in progress", new Object[0]);
        erkf0.c.f(connectionRequest0, erkf0.aj).A(new erjp(erkf0));
    }
}

