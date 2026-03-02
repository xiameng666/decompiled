import android.view.View;
import java.util.List;

public final class irn implements lpp {
    final icck a;
    final grq b;
    final gsu c;
    final ibvd d;
    final View e;

    public irn(icck icck0, grq grq0, gsu gsu0, ibvd ibvd0, View view0) {
        this.a = icck0;
        this.b = grq0;
        this.c = gsu0;
        this.d = ibvd0;
        this.e = view0;
        super();
    }

    @Override  // lpp
    public final void a(lps lps0, lpe lpe0) {
        icbi icbi0 = null;
        switch(lpe0.ordinal()) {
            case 0: {
                irm irm0 = new irm(this.d, this.c, lps0, this, this.e, null);
                icbb.b(this.a, null, iccm.d, irm0, 1);
                return;
            }
            case 1: {
                grq grq0 = this.b;
                if(grq0 != null) {
                    gqo gqo0 = grq0.a;
                    synchronized(gqo0.a) {
                        if(!gqo0.a()) {
                            List list0 = gqo0.b;
                            gqo0.b = gqo0.c;
                            gqo0.c = list0;
                            gqo0.d = true;
                            int v1 = list0.size();
                            for(int v2 = 0; v2 < v1; ++v2) {
                                ((ibrl)list0.get(v2)).w(ibom.a);
                            }
                            list0.clear();
                        }
                    }
                }
                gsu gsu0 = this.c;
                synchronized(gsu0.d) {
                    if(gsu0.l) {
                        gsu0.l = false;
                        icbi0 = gsu0.u();
                    }
                }
                if(icbi0 != null) {
                    icbi0.w(ibom.a);
                }
                return;
            }
            case 4: {
                this.c.w();
                return;
            }
            case 5: {
                this.c.v();
                return;
            }
            case 2: 
            case 3: 
            case 6: {
                return;
            }
            default: {
                throw new ibnq();
            }
        }
    }
}

