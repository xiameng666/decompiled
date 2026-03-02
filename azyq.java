import com.google.android.gms.common.Feature;

public final class azyq {
    public azys a;
    public azys b;
    public azyf c;
    public Feature[] d;
    public int e;
    private final Runnable f;

    public azyq() {
        this.f = new azyn();
    }

    public final azyr a() {
        boolean z = true;
        batl.c(this.a != null, "Must set register function");
        batl.c(this.b != null, "Must set unregister function");
        if(this.c == null) {
            z = false;
        }
        batl.c(z, "Must set holder");
        azyd_linstner azyd0 = this.c.listener_;
        batl.t(azyd0, "Key must not be null");
        return new azyr(new azyo(this, this.c, this.d, this.e), new azyp(this, azyd0), this.f);
    }
}

