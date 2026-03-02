import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import j..util.Objects;

final class erjt implements eqcr {
    final erkf a;
    private boolean b;

    public erjt(erkf erkf0) {
        Objects.requireNonNull(erkf0);
        this.a = erkf0;
        super();
        this.b = false;
    }

    @Override  // eqcr
    public final void a(D2DDevice d2DDevice0) {
        erkf.a.j(String.format("Found targetDevice: %s, %s", d2DDevice0.d, d2DDevice0.c), new Object[0]);
        if(!TextUtils.isEmpty(d2DDevice0.d)) {
            erkf erkf0 = this.a;
            if(gfqz.e(d2DDevice0.d, erkf0.d.d) && !this.b) {
                erkf0.c.l();
                erkf0.y();
                this.b = true;
            }
        }
    }

    @Override  // eqcr
    public final void b(D2DDevice d2DDevice0) {
    }

    @Override  // eqcr
    public final void c(int v) {
        String s = "Error: " + epzh.a(v);
        erkf.a.f(s, new Object[0]);
        this.a.b.l(5);
    }

    @Override  // eqcr
    public final void d() {
        if(!this.b) {
            erkf.a.m(String.format("Scan timed out while searching for targetDevice: %s, %s", this.a.d.d, this.a.d.c), new Object[0]);
            this.a.b.l(6);
        }
    }
}

