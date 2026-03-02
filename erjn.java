import com.google.android.gms.smartdevice.d2d.ConnectionRequest;

public final class erjn implements Runnable {
    public final erkf a;
    public final ConnectionRequest b;

    public erjn(erkf erkf0, ConnectionRequest connectionRequest0) {
        this.a = erkf0;
        this.b = connectionRequest0;
    }

    @Override
    public final void run() {
        erkf.a.j("Finished waiting, connecting", new Object[0]);
        this.a.c.f(this.b, this.a.aj).A(new erjq(this.a));
    }
}

