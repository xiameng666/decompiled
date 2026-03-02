import android.app.Application;
import android.os.Bundle;

class epdi extends bagc implements eixj, ejbp {
    private ejaj h;
    private volatile eizl i;
    private final Object j;

    public epdi() {
        this.j = new Object();
        this.gz(new epdh(this));
    }

    public final eizl E() {
        if(this.i == null) {
            Object object0 = this.j;
            synchronized(object0) {
                if(this.i == null) {
                    this.i = new eizl(this);
                }
            }
            return this.i;
        }
        return this.i;
    }

    protected void F() {
        throw null;
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.E();
    }

    @Override  // xnz
    public final lsk getDefaultViewModelProviderFactory() {
        return eiyk.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override  // ejbo
    public final Object h() {
        return this.E().h();
    }

    @Override  // eixj
    public Application iP() {
        throw null;
    }

    @Override  // bagc
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ejaj ejaj0 = this.E().b();
        this.h = ejaj0;
        if(ejaj0.c()) {
            this.h.b(ltv.a);
        }
    }

    @Override  // xnz
    protected final void onDestroy() {
        super.onDestroy();
        ejaj ejaj0 = this.h;
        if(ejaj0 != null) {
            ejaj0.a();
        }
    }
}

