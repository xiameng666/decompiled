import java.util.HashMap;

public final class bgiv {
    public static final gftc a;
    private static final gfsi b;
    private static final gfsi c;
    private static final gfsi d;
    private static final gfsi e;
    private static final gftc f;
    private static final gftc g;
    private final bghe h;

    static {
        bgiv.b = new bgir();
        bgiv.c = new bgis();
        bgiv.d = new bgit();
        bgiv.e = new bgiu();
        bgiv.a = new bgih();
        bgiv.f = new bgii();
        bgiv.g = new bgij();
    }

    public bgiv(bghe bghe0) {
        this.h = bghe0;
    }

    public final evql a(ggeo ggeo0, boolean z) {
        gged_interceptors gged0 = ggeo0.containsKey(graz.b) ? ((gged_interceptors)ggeo0.get(graz.b)) : ggna.a;
        gged_interceptors gged1 = ggeo0.containsKey(graz.c) ? ((gged_interceptors)ggeo0.get(graz.c)) : ggna.a;
        gged_interceptors gged2 = ggeo0.containsKey(graz.d) ? ((gged_interceptors)ggeo0.get(graz.d)) : ggna.a;
        gged_interceptors gged3 = bgiv.b(ggch.j(gged0).i(new bgik()).n(), bgiv.a);
        gged_interceptors gged4 = bgiv.b(gged1, bgiv.g);
        gged_interceptors gged5 = bgiv.b(gged2, bgiv.f);
        HashMap hashMap0 = new HashMap();
        bgiv.d(hashMap0, gged3, (z ? bgiv.c : bgiv.b));
        bgiv.d(hashMap0, gged4, bgiv.e);
        bgiv.d(hashMap0, gged5, bgiv.d);
        gged_interceptors gged6 = gged_interceptors.i(hashMap0.values());
        if(!gged6.isEmpty()) {
            bghe bghe0 = this.h;
            ggdy ggdy0 = new ggdy();
            int v = gged6.size();
            for(int v1 = 0; v1 < v; ++v1) {
                heqb heqb0 = (heqb)gged6.get(v1);
                ggdy0.i(bghe0.a.e(((MessageLite)heqb0)));
            }
            return evrg.e(ggdy0.h()).e(new bgha()).g(new bgiq(gged0, gged1, gged2));
        }
        return evrg.d(null).g(new bgiq(gged0, gged1, gged2));
    }

    public static final gged_interceptors b(gged_interceptors gged0, gftc gftc0) {
        return ggch.j(gged0).m(new bgim()).m(new bgin()).l(new bgio()).i(new bgip(gftc0)).n();
    }

    public static ProtoLiteBuilder c() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)heps.a).v_newBuilder();
        long v = bgnf.b(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        heps heps0 = (heps)hftp0.b_message;
        heps0.b |= 1;
        heps0.c = v;
        return hftp0;
    }

    private static final void d(HashMap hashMap0, gged_interceptors gged0, gfsi gfsi0) {
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            heqb heqb0 = (heqb)gged0.get(v1);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)heqb0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)heqb0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((heqb)hftp0.b_message).s = null;
            ((heqb)hftp0.b_message).b &= 0xFFFBFFFF;
            heqb heqb1 = (heqb)hftp0.N_build();
            if(hashMap0.get(heqb1) != null) {
                heqb0 = (heqb)hashMap0.get(heqb1);
            }
            bgil bgil0 = new bgil(gfsi0);
            gftb.check(heqb0);
            hashMap0.put(heqb1, bgil0.apply(heqb0));
        }
    }
}

