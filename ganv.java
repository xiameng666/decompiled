import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;

public final class ganv extends gaxs {
    public final ganu a;
    public final gani b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public boolean g;
    public static final int h = 0;
    private static final String i = "ganv";
    private static final clht j;
    private final ibnf k;
    private boolean l;

    static {
        ganv.j = new clht(Looper.getMainLooper());
    }

    private ganv(gani gani0, ganu ganu0, Bundle bundle0, ibnf ibnf0) {
        this.a = ganu0;
        this.b = gani0;
        this.k = ibnf0;
        if(bundle0 == null) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.c = new ArrayList();
        }
        else {
            Bundle bundle1 = bundle0.getBundle(ganv.i);
            if(bundle1 == null) {
                throw new IllegalStateException("State for ActionUiHelper was not properly saved, did you forget to call onSaveInstanceState?");
            }
            this.d = bundle1.getIntegerArrayList("requestCodes");
            this.e = bundle1.getParcelableArrayList("requests");
            this.c = bundle1.getIntegerArrayList("executionIds");
        }
        this.f = new ArrayList();
        for(int v = this.d.size(); v > 0; --v) {
            this.f.add(null);
        }
    }

    public final ganp a(gano gano0) {
        if(!gawn.a()) {
            return this.b.ao.a(gano0);
        }
        throw new IllegalStateException("performBlocking Must not be called on the main application thread");
    }

    public static ganv b(xob xob0, ganu ganu0, Bundle bundle0, ibnf ibnf0) {
        return new ganv(gani.F(xob0), ganu0, bundle0, ibnf0);
    }

    public final void f(int v, gano gano0) {
        if(this.g && !this.v) {
            Object object0 = this.k.get();
            gaxl.a();
            if(!hzmb.a.b().l()) {
                gavs.d("BE_AUH_01", ((gaym)object0), "Can\'t start an action due to potential state loss!");
            }
            else if(this.l) {
                ganq ganq0 = new ganq();
                gavv.a("BW_AUH_01", ((gaym)object0), gavs.a, ganq0);
            }
            else {
                ganr ganr0 = new ganr();
                gavv.a("BW_AUH_02", ((gaym)object0), gavs.a, ganr0);
            }
        }
        this.d.add(Integer.valueOf(v));
        this.e.add(gano0.a);
        this.c.add(Integer.valueOf(0));
        this.f.add(null);
        this.g();
    }

    // Detected as a lambda impl.
    public final void g() {
        gans gans0 = new gans(this);
        gani gani0 = this.b;
        if(gani0.ak) {
            gans0.run();
            return;
        }
        gani0.d.add(gans0);
    }

    @Override  // gaxs
    protected final void lv() {
        this.g = true;
        int v = this.d.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ArrayList arrayList0 = this.f;
            gang gang0 = (gang)arrayList0.get(v1);
            if(gang0 != null) {
                gang0.f = null;
            }
            arrayList0.set(v1, null);
        }
    }

    @Override  // gaxs
    protected final void lw() {
        this.g = false;
        this.l = false;
        gant gant0 = () -> {
            gans gans0 = new gans(this);
            gani gani0 = this.b;
            if(gani0.ak) {
                gans0.run();
                return;
            }
            gani0.d.add(gans0);
        };
        ganv.j.post(gant0);
    }

    @Override  // gaxs
    public final void lx(Bundle bundle0) {
        this.l = true;
        Bundle bundle1 = new Bundle();
        bundle1.putIntegerArrayList("executionIds", this.c);
        bundle1.putIntegerArrayList("requestCodes", this.d);
        bundle1.putParcelableArrayList("requests", this.e);
        bundle0.putBundle(ganv.i, bundle1);
    }
}

