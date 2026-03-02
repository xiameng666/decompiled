import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.D2DDevice;

public final class erkf extends du {
    public static final baun a;
    public int ag;
    public String ah;
    public BootstrapOptions ai;
    public final epzo aj;
    public final epzm ak;
    public final eqcr al;
    public final erke b;
    public epzz c;
    public D2DDevice d;

    static {
        erkf.a = new erqc(new String[]{"Setup", "UI", "D2DConnectionFragment"});
    }

    public erkf() {
        this.b = new erke();
        this.aj = new erjr(this);
        this.ak = new erjs(this);
        this.al = new erjt(this);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setRetainInstance(true);
    }

    @Override  // du
    public final void onDestroy() {
        erkf.a.j("onDestroy", new Object[0]);
        super.onDestroy();
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        this.b.a(null);
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        try {
            erju erju0 = (erju)this.getContext();
            this.b.a(erju0);
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException("Containing activity must implement D2DConnectionFragment.Listener", classCastException0);
        }
    }

    public final void y() {
        erkf.a.j(String.format("Connecting to target: %s", this.d.c), new Object[0]);
        if(hyig.e()) {
            ConnectionRequest connectionRequest0 = new ConnectionRequest(this.d, this.ah, null, null, null, this.ag, false, false, false, 0, 0);
            this.c.f(connectionRequest0, this.aj).A(new erjk(this));
            return;
        }
        epzz epzz0 = this.c;
        D2DDevice d2DDevice0 = this.d;
        String s = this.ah;
        azzc azzc0 = new azzc();
        azzc0.a = new eqkc(epzz0, d2DDevice0, s, this.aj);
        azzc0.d = 0x50E8;
        evql evql0 = epzz0.jn(azzc0.a());
        evql0.b(new eqkd(epzz0));
        evql0.A(new erjl(this));
    }

    public final void z(Bundle bundle0) {
        epzz epzz0 = this.c;
        azzc azzc0 = new azzc();
        azzc0.a = new eqkh(bundle0);
        azzc0.d = 0x50EA;
        epzz0.jn(azzc0.a());
    }
}

