import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class tzh extends hpw implements gsw {
    public final txx a;
    public final uac b;
    public final lps c;
    public final gra d;
    public final gra e;
    private final gra f;
    private final gra g;
    private final gra h;
    private final icck i;
    private iced j;

    public tzh(txx txx0, uac uac0, icck icck0, lps lps0) {
        ibuq.f(txx0, "requestBuilder");
        ibuq.f(icck0, "scope");
        ibuq.f(lps0, "lifecycleOwner");
        super();
        this.a = txx0;
        this.b = uac0;
        this.c = lps0;
        this.d = new ParcelableSnapshotMutableState(uaf.a, gul.a);
        this.e = new ParcelableSnapshotMutableState(null, gul.a);
        this.f = new ParcelableSnapshotMutableState(((float)1.0f), gul.a);
        this.g = new ParcelableSnapshotMutableState(null, gul.a);
        this.h = new ParcelableSnapshotMutableState(null, gul.a);
        this.i = iccl.d(iccl.d(icck0, new icfg(icei.c(icck0.c()))), icrd.a.i());
        icbb.b(icck0, null, null, new tze(this, null), 3);
    }

    @Override  // hpw
    public final long a() {
        hpw hpw0 = this.j();
        return hpw0 == null ? 0x7FC000007FC00000L : hpw0.a();
    }

    @Override  // hpw
    protected final void b(hpd hpd0) {
        hpw hpw0 = this.j();
        if(hpw0 != null) {
            hpw0.e(hpd0, hpd0.o(), ((Number)this.f.a()).floatValue(), ((hlm)this.g.a()));
        }
    }

    @Override  // hpw
    protected final boolean c(float f) {
        this.f.b(Float.valueOf(f));
        return true;
    }

    @Override  // hpw
    protected final boolean d(hlm hlm0) {
        this.g.b(hlm0);
        return true;
    }

    @Override  // gsw
    public final void f() {
        hpw hpw0 = this.j();
        gsw gsw0 = (hpw0 instanceof gsw) ? ((gsw)hpw0) : null;
        if(gsw0 != null) {
            gsw0.f();
        }
    }

    @Override  // gsw
    public final void g() {
        hpw hpw0 = this.j();
        gsw gsw0 = (hpw0 instanceof gsw) ? ((gsw)hpw0) : null;
        if(gsw0 != null) {
            gsw0.g();
        }
        iced iced0 = this.j;
        if(iced0 != null) {
            iceb.a(iced0);
        }
        this.j = null;
        this.e.b(null);
        this.l(null);
    }

    @Override  // gsw
    public final void h() {
        hpw hpw0 = this.j();
        gsw gsw0 = (hpw0 instanceof gsw) ? ((gsw)hpw0) : null;
        if(gsw0 != null) {
            gsw0.h();
        }
        if(this.j == null) {
            tzg tzg0 = new tzg(this, null);
            this.j = icbb.b(this.i, null, null, tzg0, 3);
        }
        if(!this.c.getLifecycle().a().a(lpf.d)) {
            Drawable drawable0 = (Drawable)this.e.a();
            if(drawable0 != null && (drawable0 instanceof Animatable)) {
                ((Animatable)drawable0).stop();
            }
        }
    }

    public final hpw j() {
        return (hpw)this.h.a();
    }

    public final uaf k() {
        return (uaf)this.d.a();
    }

    public final void l(hpw hpw0) {
        this.h.b(hpw0);
    }
}

