import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;

public final class dmbc implements Factory {
    private final Provider a;
    private final Provider b;

    public dmbc(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    public final Set a() {
        edqy edqy0 = (edqy)this.a.get();
        edqv edqv0 = (edqv)this.b.get();
        ggfn ggfn0 = new ggfn();
        ggfn0.j(new hjwd[]{hjwd.Q, hjwd.W, hjwd.v, hjwd.d, hjwd.n, hjwd.r, hjwd.p, hjwd.M, hjwd.t, hjwd.g, hjwd.m, hjwd.z, hjwd.ac, hjwd.T, hjwd.C, hjwd.U, hjwd.V, hjwd.S, hjwd.o, hjwd.q, hjwd.c, hjwd.k, hjwd.u, hjwd.y, hjwd.A, hjwd.x, hjwd.w, hjwd.e, hjwd.H, hjwd.l, hjwd.E, hjwd.ah, hjwd.N, hjwd.B, hjwd.i, hjwd.j, hjwd.F, hjwd.L, hjwd.G, hjwd.D, hjwd.f, hjwd.s, hjwd.aw});
        if(hwfq.a.b().g()) {
            ggfn0.i(hjwd.O);
        }
        if(hwpv.c()) {
            ggfn0.i(hjwd.P);
            ggfn0.i(hjwd.R);
            ggfn0.i(hjwd.aa);
            ggfn0.i(hjwd.am);
        }
        if(hwpp.c()) {
            ggfn0.i(hjwd.J);
            ggfn0.i(hjwd.ai);
        }
        if(hwps.a.b().a()) {
            ggfn0.i(hjwd.J);
            ggfn0.i(hjwd.aj);
        }
        ggfn0.i(hjwd.X);
        if(hwwy.s()) {
            ggfn0.i(hjwd.Y);
        }
        if(edqy0.c) {
            ggfn0.i(hjwd.Z);
            ggfn0.i(hjwd.ab);
        }
        if(edqv0.a) {
            ggfn0.i(hjwd.ad);
        }
        ggfn0.i(hjwd.ae);
        if(hyoz.f()) {
            ggfn0.i(hjwd.ag);
        }
        if(hyoz.e()) {
            ggfn0.i(hjwd.ar);
        }
        hwrc.d();
        if(hwrc.c()) {
            ggfn0.i(hjwd.ak);
        }
        if(hwhc.e()) {
            ggfn0.i(hjwd.an);
        }
        if(hwmp.r()) {
            ggfn0.i(hjwd.as);
        }
        hwrt.d();
        if(hwrt.c()) {
            ggfn0.i(hjwd.al);
        }
        if(hwwy.v()) {
            ggfn0.i(hjwd.ao);
        }
        if(hwwy.u()) {
            ggfn0.i(hjwd.av);
        }
        ggfn0.i(hjwd.ap);
        if(hwfn.c()) {
            ggfn0.i(hjwd.aq);
        }
        if(hwqk.a.b().a()) {
            ggfn0.i(hjwd.at);
        }
        if(hwoz.a.b().m()) {
            ggfn0.i(hjwd.au);
        }
        Set set0 = ggfn0.h();
        Preconditions.f(set0);
        return set0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

