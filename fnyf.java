import android.content.Context;

public final class fnyf {
    static final String a = "fnyf";
    private final Context b;
    private final fm c;
    private final fnxw d;
    private final xob e;

    static {
    }

    private fnyf(Context context0, fm fm0, fnxw fnxw0, xob xob0) {
        this.b = context0.getApplicationContext();
        this.c = fm0;
        this.d = fnxw0;
        this.e = xob0;
        fnye fnye0 = fnyf.d(fm0);
        if(fnye0 != null) {
            this.c(fnye0);
        }
    }

    public static fnyf a(du du0, fnxw fnxw0) {
        return new fnyf(du0.requireContext(), du0.getChildFragmentManager(), fnxw0, fnwo.a(du0));
    }

    public final void b() {
        fm fm0 = this.c;
        fnye fnye0 = fnyf.d(fm0);
        if(fnye0 == null) {
            fnye0 = new fnye();
            this.c(fnye0);
        }
        if((this.e == null || !this.e.isFinishing()) && !fnye0.isAdded() && !fm0.au()) {
            fnye0.show(fm0, fnyf.a);
        }
    }

    private final void c(fnye fnye0) {
        fnxw fnxw0 = this.d;
        fnja fnja0 = (fnja)fnxw0.c.g();
        fnye0.ai = fnxw0.a;
        foaf foaf0 = fnxw0.b;
        foan foan0 = foaf0.a;
        gfsx gfsx0 = foan0.e;
        if(gfsx0.i()) {
            fnye0.an = ((foaq)gfsx0.d()).b;
        }
        else {
            fnye0.an = new fnxx();
            foad foad0 = new foad(foaf0);
            foal foal0 = new foal(foan0);
            Runnable runnable0 = fnye0.an;
            gged_interceptors gged0 = gged_interceptors.l("Cancel");
            if(gged0 == null) {
                throw new NullPointerException("Null possibleCancelStringList");
            }
            if(runnable0 == null) {
                throw new NullPointerException("Null onCancel");
            }
            foal0.b = gfsx.m(new foaq(gged0, runnable0));
            foad0.a = foal0.a();
            foaf0 = foad0.a();
        }
        fnye0.aj = foaf0;
        fnye0.ak = fnja0;
        fnye0.am = fnxw0.d;
        fnye0.ag.b();
    }

    private static final fnye d(fm fm0) {
        return (fnye)fm0.h(fnyf.a);
    }
}

