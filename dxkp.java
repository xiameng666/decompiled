import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.pay.DataChangeListenerResponse;
import com.google.android.gms.pay.GetValuablesRequest;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class dxkp extends lqd implements dmqb {
    public final Context a;
    public final bboh h;
    private final edxm i;
    private final eefg j;
    private final Account k;
    private final gmcg l;
    private edlu m;
    private final azts n;

    public dxkp(Context context0, edxm edxm0, eefg eefg0, Account account0, azts azts0, gmcg gmcg0) {
        this.a = context0;
        this.i = edxm0;
        this.j = eefg0;
        this.k = account0;
        this.n = azts0;
        this.l = gmcg0;
        this.h = bboh.b("Pay", bbcu.cZ);
    }

    public final List b(gmcd gmcd0) {
        if(gmcd0.isDone() && !gmcd0.isCancelled()) {
            try {
                Object object0 = gmcd0.get();
                ibuq.c(object0);
                return (List)object0;
            }
            catch(ExecutionException executionException0) {
                a.ae(this.h.j(), "Future failed to return a list of things.", executionException0);
                return ibps.a;
            }
            catch(InterruptedException interruptedException0) {
                a.ae(this.h.j(), "Future failed to return a list of things.", interruptedException0);
                return ibps.a;
            }
        }
        ((ggtj)this.h.j()).x("Future was not done or was cancelled.");
        return ibps.a;
    }

    @Override  // lqd
    protected final void c() {
        if(this.m == null) {
            this.m = new edlu(this);
        }
        azts azts0 = this.n;
        Account account0 = this.k;
        edlu edlu0 = this.m;
        edlu edlu1 = null;
        if(edlu0 == null) {
            ibuq.j("weakRefDataChangedListener");
            edlu0 = null;
        }
        azts0.bC(account0, 4, edlu0);
        edlu edlu2 = this.m;
        if(edlu2 == null) {
            ibuq.j("weakRefDataChangedListener");
            edlu2 = null;
        }
        azts0.bC(account0, 1, edlu2);
        edlu edlu3 = this.m;
        if(edlu3 == null) {
            ibuq.j("weakRefDataChangedListener");
        }
        else {
            edlu1 = edlu3;
        }
        azts0.bC(account0, 10, edlu1);
        this.o();
    }

    @Override  // lqd
    protected final void d() {
        edlu edlu0 = this.m;
        edlu edlu1 = null;
        if(edlu0 == null) {
            ibuq.j("weakRefDataChangedListener");
            edlu0 = null;
        }
        azts azts0 = this.n;
        azts0.bE(1, edlu0);
        edlu edlu2 = this.m;
        if(edlu2 == null) {
            ibuq.j("weakRefDataChangedListener");
            edlu2 = null;
        }
        azts0.bE(4, edlu2);
        edlu edlu3 = this.m;
        if(edlu3 == null) {
            ibuq.j("weakRefDataChangedListener");
        }
        else {
            edlu1 = edlu3;
        }
        azts0.bE(10, edlu1);
    }

    @Override  // dmqb
    public final void jP(DataChangeListenerResponse dataChangeListenerResponse0) {
        ibuq.f(dataChangeListenerResponse0, "response");
        if(dataChangeListenerResponse0.a.a != 1 && dataChangeListenerResponse0.a.a != 4 && dataChangeListenerResponse0.a.a != 10) {
            return;
        }
        this.o();
    }

    private final void o() {
        evql evql0 = this.i.f.aw(this.i.a);
        edxk edxk0 = new edxk();
        evql evql1 = evql0.d(this.i.c, edxk0);
        dxkk dxkk0 = new dxkk();
        evql evql2 = evql1.d(this.l, dxkk0);
        GetValuablesRequest getValuablesRequest0 = new GetValuablesRequest();
        getValuablesRequest0.a = this.j.a;
        getValuablesRequest0.b = this.j.c;
        evql evql3 = this.j.g.aR(getValuablesRequest0);
        eefe eefe0 = new eefe();
        evql evql4 = evql3.d(this.j.b, eefe0);
        dxkl dxkl0 = new dxkl(this);
        evql evql5 = evql4.d(this.l, dxkl0);
        gmcd gmcd0 = edph.b(evql2);
        gmcd gmcd1 = edph.b(evql5);
        gmcd gmcd2 = glzd.f(edph.b(this.n.ay(this.k)), new dxkj(new dxki(this)), this.l);
        gmbu.t(gmbu.a(ibpo.g(new gmcd[]{gmcd0, gmcd2, gmcd1})).a(new dxkm(this, gmcd0, gmcd1, gmcd2), this.l), new dxko(this), this.l);
    }
}

