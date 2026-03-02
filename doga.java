import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.pay.DataChangeListenerResponse;
import com.google.android.gms.pay.GetValuablesRequest;
import com.google.android.gms.pay.PassFilter;
import com.google.android.gms.pay.ProtoSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public final class doga extends lqd implements dmqb {
    public static final bboh a;
    public final Context h;
    public final Account i;
    public final edlq j;
    public final gftc k;
    public final gftc l;
    public final dogk m;
    public final int n;
    public final int o;
    public long p;
    public final azts q;
    private final gmcg r;
    private edlu s;
    private final edon t;
    private final edyv u;
    private final boolean v;

    static {
        doga.a = bboh.b("Pay", bbcu.cZ);
    }

    public doga(Context context0, Account account0, azts azts0, edlq edlq0, int v, gftc gftc0, gftc gftc1, gmcg gmcg0, dogk dogk0, PassFilter passFilter0, edon edon0, edyv edyv0, boolean z) {
        this.h = context0;
        this.i = account0;
        this.j = edlq0;
        this.n = v;
        this.k = gftc0;
        this.l = gftc1;
        this.q = azts0;
        this.r = gmcg0;
        this.m = dogk0;
        this.t = edon0;
        this.o = passFilter0.h;
        this.u = edyv0;
        this.v = z;
    }

    public static dmjp b(byte[] arr_b) {
        if(arr_b == null) {
            return dmjp.a;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dmjp.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (dmjp)hftv0;
        }
        catch(hfur hfur0) {
            a.ae(doga.a.i(), "Could not parse serialized DigitalCarKeys.", hfur0);
            return dmjp.a;
        }
    }

    @Override  // lqd
    protected final void c() {
        if(this.s == null) {
            this.s = new edlu(this);
        }
        if(this.p == 0L) {
            ggdy ggdy0 = new ggdy();
            for(int v = 0; v < 50; ++v) {
                ggdy0.i(new dohe(((long)v) * 50L));
            }
            this.ii(new dofl(ggdy0.h(), false, null, false, true));
            this.p = System.currentTimeMillis();
        }
        azts azts0 = this.q;
        Account account0 = this.i;
        azts0.bC(account0, 4, this.s);
        azts0.bC(account0, 1, this.s);
        if(dmjt.b(this.h)) {
            azts0.bC(account0, 10, this.s);
        }
        azts0.bC(account0, 12, this.s);
        this.q();
        azts0.aS(account0);
        azts0.ax(account0);
    }

    @Override  // lqd
    protected final void d() {
        azts azts0 = this.q;
        azts0.bE(1, this.s);
        azts0.bE(4, this.s);
        if(dmjt.b(this.h)) {
            azts0.bE(10, this.s);
        }
        azts0.bE(12, this.s);
    }

    @Override  // dmqb
    public final void jP(DataChangeListenerResponse dataChangeListenerResponse0) {
        switch(dataChangeListenerResponse0.a.a) {
            case 1: 
            case 4: 
            case 10: {
                break;
            }
            case 12: {
                ((ggtj)doga.a.h()).x("onDataChanged MDOC");
                break;
            }
            default: {
                return;
            }
        }
        this.q();
    }

    public final dofl o(gmcd gmcd0) {
        if(gmcd0.isDone() && !gmcd0.isCancelled()) {
            try {
                return (dofl)gmcd0.get();
            }
            catch(ExecutionException | InterruptedException exception0) {
                a.ae(doga.a.j(), "future failed to return a list of things.", exception0);
                if((exception0.getCause() instanceof aztb)) {
                    aztb aztb0 = (aztb)exception0.getCause();
                    return aztb0 == null || aztb0.b() != 0x927F || this.t.a() ? new dofl(ggna.a, false, null, false, false) : new dofl(ggna.a, false, null, true, false);
                }
                return new dofl(ggna.a, false, null, false, false);
            }
        }
        ((ggtj)doga.a.j()).x("Future was not done or was cancelled.");
        return new dofl(ggna.a, false, null, false, false);
    }

    public static fsym p(ProtoSafeParcelable protoSafeParcelable0) {
        fsym fsym0 = dqjj.j(protoSafeParcelable0.a);
        return fsym0 == null ? fsym.a : fsym0;
    }

    private final void q() {
        GetValuablesRequest getValuablesRequest0 = new GetValuablesRequest();
        getValuablesRequest0.a = this.i;
        PassFilter passFilter0 = new PassFilter();
        passFilter0.h = this.o;
        getValuablesRequest0.b = passFilter0;
        gmcd gmcd0 = edph.b(this.q.aR(getValuablesRequest0));
        dofo dofo0 = new dofo(this);
        gmcg gmcg0 = this.r;
        gmcd gmcd1 = glzd.f(gmcd0, dofo0, gmcg0);
        gmcd gmcd2 = glzd.f(edph.b(this.q.aw(this.i)), new dofp(this), gmcg0);
        gmcd gmcd3 = dmjt.b(this.h) ? glzd.f(edph.b(this.q.ay(this.i)), new doft(this), gmcg0) : edph.b(evrg.b());
        gmcd gmcd4 = edph.b(this.q.aP(this.i, this.n));
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(Arrays.asList(new gmcd[]{gmcd2, gmcd3}));
        if(this.o != 3 && !this.v) {
            ((ggtj)doga.a.h()).x("getMdocsListenableFuture invoked");
            arrayList0.add(edph.b(this.u.b().d(gmcg0, new dofv())));
        }
        gmbu.t(gmbu.a(ggch.f(arrayList0, gged_interceptors.m(gmcd1, gmcd4))).a(new dofq(this, gmcd1, arrayList0, gmcd4), gmcg0), new dofz(this), gmap.a);
    }
}

