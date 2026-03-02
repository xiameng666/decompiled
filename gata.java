import android.view.View;
import com.google.android.wallet.bender3.impl.ui.common.glif.gliflayout.Bender3GlifLayout;
import java.util.ArrayList;

public final class gata {
    gata a;
    final ArrayList b;
    int c;
    int d;
    final gasz e;
    final gbxd f;

    public gata(gasz gasz0) {
        this.b = new ArrayList();
        this.c = 0;
        this.d = 0;
        this.e = gasz0;
        this.f = null;
    }

    public gata(gasz gasz0, gbxd gbxd0) {
        this.b = new ArrayList();
        this.c = 0;
        this.d = 0;
        this.e = gasz0;
        this.f = gbxd0;
    }

    public final void a(gass gass0, gafh gafh0) {
        Bender3GlifLayout bender3GlifLayout0 = null;
        if(this.l()) {
            ibuq.f(gafh0, "footerButton");
            Bender3GlifLayout bender3GlifLayout1 = this.f.u;
            if(bender3GlifLayout1 == null) {
                ibuq.j("glifLayoutView");
            }
            else {
                bender3GlifLayout0 = bender3GlifLayout1;
            }
            gaff gaff0 = (gaff)bender3GlifLayout0.t(gaff.class);
            switch(gafh0.a) {
                case 4: {
                    gaff0.c(gafh0);
                    return;
                }
                case 7: {
                    gaff0.d(gafh0);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        gata gata0 = this.a;
        if(gata0 != null) {
            gata0.a(gass0, gafh0);
            return;
        }
        gavs.d("BE_PNH_05", null, "Parents must have a glif layout presenter for adding footer button");
    }

    final void b(int v, gata gata0) {
        int v1 = 0;
        gavs.c(gata0.c == 0, "BE_PNH_02", null, "Trying to add a PresenterNodeHelper which already has views attached elsewhere.");
        ArrayList arrayList0 = this.b;
        arrayList0.add(v, gata0);
        int v2 = arrayList0.indexOf(gata0);
        if(v2 > 0) {
            gata gata1 = (gata)arrayList0.get(v2 - 1);
            v1 = gata1.c + gata1.d;
        }
        gata0.j(this, v1);
    }

    public final void c(int v, gass gass0, View view0) {
        if(this.i()) {
            this.e.g(gass0, view0);
            this.e.nv(gass0, view0, v);
            return;
        }
        gata gata0 = this.a;
        if(gata0 != null) {
            gata0.c(v + this.d, gass0, view0);
            return;
        }
        gavs.d("BE_PNH_04", null, "The root of the NodePresenterHelper tree must be a subRoot");
    }

    public final void d() {
        if(this.l()) {
            gbxd gbxd0 = this.f;
            if(!gbxd0.w) {
                gbxd0.w = true;
                gbxd0.a.c.c.f.add(gbxd0);
            }
        }
        else {
            gata gata0 = this.a;
            if(gata0 != null) {
                gata0.d();
            }
        }
    }

    public final void e(gafh gafh0) {
        gafh gafh1 = null;
        if(this.l()) {
            gbxd gbxd0 = this.f;
            ibuq.f(gafh0, "footerButton");
            Bender3GlifLayout bender3GlifLayout0 = gbxd0.u;
            if(bender3GlifLayout0 == null) {
                ibuq.j("glifLayoutView");
                bender3GlifLayout0 = null;
            }
            gaff gaff0 = (gaff)bender3GlifLayout0.t(gaff.class);
            switch(gafh0.a) {
                case 4: {
                    if(ibuq.m(gaff0.k, gafh0)) {
                        gafh gafh2 = gbxd0.v;
                        if(gafh2 == null) {
                            ibuq.j("goneFooterButton");
                        }
                        else {
                            gafh1 = gafh2;
                        }
                        gaff0.c(gafh1);
                        return;
                    }
                    break;
                }
                case 7: {
                    if(ibuq.m(gaff0.l, gafh0)) {
                        gafh gafh3 = gbxd0.v;
                        if(gafh3 == null) {
                            ibuq.j("goneFooterButton");
                        }
                        else {
                            gafh1 = gafh3;
                        }
                        gaff0.d(gafh1);
                        return;
                    }
                    break;
                }
                default: {
                    return;
                }
            }
            return;
        }
        gata gata0 = this.a;
        if(gata0 != null) {
            gata0.e(gafh0);
            return;
        }
        gavs.d("BE_PNH_06", null, "Parents must have a glif layout presenter for removing footer button");
    }

    final void f(gata gata0) {
        gavs.c(gata0.c == 0, "BE_PNH_01", null, "Trying to remove a PresenterNodeHelper without first detaching all views.");
        this.b.remove(gata0);
        gata0.j(null, 0);
    }

    public final void g(View view0) {
        if(this.i()) {
            this.e.nP(view0);
            return;
        }
        gata gata0 = this.a;
        if(gata0 != null) {
            gata0.g(view0);
            return;
        }
        gavs.d("BE_PNH_08", null, "The root of the NodePresenterHelper tree must be a subRoot");
    }

    public final void h(int v) {
        this.k(null, v);
    }

    public final boolean i() {
        return this.e != null;
    }

    private final void j(gata gata0, int v) {
        if(this.a != gata0) {
            this.a = gata0;
            this.d = v;
        }
    }

    private final void k(gata gata0, int v) {
        if(gata0 == null || !this.i()) {
            this.c += v;
        }
        if(gata0 != null) {
            ArrayList arrayList0 = this.b;
            int v1 = arrayList0.indexOf(gata0) + 1;
            int v2 = arrayList0.size();
            while(v1 < v2) {
                gata gata1 = (gata)arrayList0.get(v1);
                gata1.d += v;
                ++v1;
            }
        }
        if(gata0 == null || !this.i()) {
            gata gata2 = this.a;
            if(gata2 != null) {
                gata2.k(this, v);
            }
        }
    }

    private final boolean l() {
        return this.f != null;
    }
}

