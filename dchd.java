import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.util.concurrent.Callable;

public final class dchd implements Callable {
    public final dchp a;
    public final dfsu b;
    public final String c;

    public dchd(dchp dchp0, dfsu dfsu0, String s) {
        this.a = dchp0;
        this.b = dfsu0;
        this.c = s;
    }

    @Override
    public final Object call() {
        dijl dijl0 = new dijl(this.c, this.a.a);
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        dfsu dfsu0 = this.b;
        nearbySharingChimeraService0.c.l(dfsu0, dijl0);
        dcvz.a.d().j("Successfully registered provider for %s with %s, %s", dfsu0, dijl0.a, dijl0.b);
        dfsu0.t(((dfsk)nearbySharingChimeraService0.d.get()).i());
        boolean z = true;
        if(nearbySharingChimeraService0.aP()) {
            dccq dccq0 = new dccq(nearbySharingChimeraService0);
            dfsp dfsp0 = new dfsp();
            dchq dchq0 = nearbySharingChimeraService0.u;
            batl.s(dchq0);
            dfsp0.h = dchq0.b == dftl.c;
            dfsp0.a = nearbySharingChimeraService0.j();
            dchq dchq1 = nearbySharingChimeraService0.u;
            batl.s(dchq1);
            dfsp0.f = dchq1.b;
            dfsu0.z(dccq0, dfsp0.a());
        }
        if(nearbySharingChimeraService0.aJ()) {
            dftl dftl0 = nearbySharingChimeraService0.w;
            batl.s(dftl0);
            int v = nearbySharingChimeraService0.d(dftl0);
            dbzs dbzs0 = new dbzs(nearbySharingChimeraService0);
            String s = nearbySharingChimeraService0.F();
            dfsn dfsn0 = new dfsn();
            dftl dftl1 = nearbySharingChimeraService0.w;
            batl.s(dftl1);
            dfsn0.a = dftl1;
            dfsn0.g = nearbySharingChimeraService0.j();
            dfsn0.b = djbm.d(nearbySharingChimeraService0.N);
            dfsn0.c = nearbySharingChimeraService0.C;
            dfsn0.f = nearbySharingChimeraService0.w == dftl.c;
            if(v != 3) {
                z = false;
            }
            dfsn0.d = z;
            dfsn0.k = z;
            dfsu0.x(s, dbzs0, dfsn0.a());
        }
        return (int)0;
    }
}

