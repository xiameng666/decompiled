import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;

public final class bner {
    public bndy a;
    public ViewOptions b;
    private static final bboh c;
    private final bnae d;
    private final bnfi e;
    private final bmzv f;
    private final Boolean g;

    static {
        bner.c = bnaa.d("ViewController");
    }

    public bner(bnae bnae0, bnfi bnfi0, bmzv bmzv0, Boolean boolean0) {
        gftb.check(bnae0);
        this.d = bnae0;
        this.e = bnfi0;
        gftb.check(bmzv0);
        this.f = bmzv0;
        this.g = boolean0;
    }

    public final void a() {
        this.e.a();
    }

    public final void b(bndy bndy0, ViewOptions viewOptions0) {
        synchronized(this) {
            bndy bndy1 = this.a;
            if(bndy1 != null) {
                int v1 = bndy0.d;
                if(v1 <= bndy1.d) {
                    if(bndy0.equals(bndy.c)) {
                        ((ggtj)((ggtj)bner.c.h()).ar(4433)).B("Accepting proposed view %s: comes from explicit user action", viewOptions0);
                        this.c(bndy0, viewOptions0);
                        return;
                    }
                    if(this.b != null && this.b.equals(viewOptions0)) {
                        ((ggtj)((ggtj)bner.c.h()).ar(0x1150)).B("Ignoring proposed view %s: is the same as current view", viewOptions0);
                        return;
                    }
                    Transport transport0 = viewOptions0.c();
                    if(transport0 != null && (this.b != null && transport0.equals(this.b.c()))) {
                        ((ggtj)((ggtj)bner.c.h()).ar(0x114F)).B("Accepting proposed view %s: matches current transport", viewOptions0);
                        this.c(bndy0, viewOptions0);
                        return;
                    }
                    ((ggtj)((ggtj)bner.c.h()).ar(4430)).P("Ignoring proposed view %s: less than or equal rank %d, different transport", viewOptions0, v1);
                    return;
                }
            }
            ((ggtj)((ggtj)bner.c.h()).ar(4429)).X("Accepting proposed view %s: outranks current (%d > %d)", viewOptions0, Integer.valueOf(bndy0.d), Integer.valueOf((this.a == null ? -1 : this.a.d)));
            this.c(bndy0, viewOptions0);
        }
    }

    final void c(bndy bndy0, ViewOptions viewOptions0) {
        this.a = bndy0;
        viewOptions0.c = this.g;
        this.b = viewOptions0;
        this.f.c(this.d, viewOptions0);
        this.e.b(viewOptions0);
    }
}

