import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

final class tzw implements uox, upn {
    public final uac a;
    public volatile uae b;
    public final List c;
    private volatile uot d;
    private volatile Object e;
    private final ichm f;

    public tzw(ichm ichm0, uac uac0) {
        ibuq.f(ichm0, "scope");
        super();
        this.f = ichm0;
        this.a = uac0;
        this.c = new ArrayList();
        if((uac0 instanceof uaa)) {
            this.b = ((uaa)uac0).a;
            return;
        }
        if(!(uac0 instanceof tzu)) {
            throw new ibnq();
        }
        icbb.b(ichm0, null, null, new tzv(this, null), 3);
    }

    @Override  // upn
    public final void a(Drawable drawable0) {
        uab uab0 = new uab(uaf.d, drawable0);
        this.f.b(uab0);
    }

    @Override  // uox
    public final boolean b(Object object0, Object object1, upn upn0, uag uag0) {
        return false;
    }

    @Override  // upn
    public final void c(Object object0, ups ups0) {
        this.e = object0;
        uad uad0 = new uad((this.d == null || !this.d.l() ? uaf.b : uaf.c), object0);
        this.f.b(uad0);
    }

    @Override  // upn
    public final uot d() {
        return this.d;
    }

    @Override  // upn
    public final void e(upm upm0) {
        uae uae0 = this.b;
        if(uae0 != null) {
            upm0.e(uae0.a, uae0.b);
            return;
        }
        synchronized(this) {
            uae uae1 = this.b;
            if(uae1 == null) {
                this.c.add(upm0);
            }
            else {
                upm0.e(uae1.a, uae1.b);
            }
        }
    }

    @Override  // upn
    public final void f(Drawable drawable0) {
        this.e = null;
        uab uab0 = new uab(uaf.a, drawable0);
        this.f.b(uab0);
    }

    @Override  // uox
    public final boolean fv(udv udv0, Object object0, upn upn0) {
        Object object1 = this.e;
        uot uot0 = this.d;
        if(object1 != null && uot0 != null && !uot0.l() && !uot0.n()) {
            uad uad0 = new uad(uaf.d, object1);
            this.f.b(uad0);
        }
        return false;
    }

    @Override  // upn
    public final void g(Drawable drawable0) {
        this.e = null;
        uab uab0 = new uab(uaf.b, drawable0);
        this.f.b(uab0);
    }

    @Override  // upn
    public final void h(upm upm0) {
        synchronized(this) {
            this.c.remove(upm0);
        }
    }

    @Override  // upn
    public final void i(uot uot0) {
        this.d = uot0;
    }

    @Override  // unl
    public final void l() {
    }

    @Override  // unl
    public final void m() {
    }

    @Override  // unl
    public final void n() {
    }
}

