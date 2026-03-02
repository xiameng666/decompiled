import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class hflo {
    public final hflr a;
    public final hfmc b;
    public static final int c;
    private static final ggfp d;
    private static final ggfp e;
    private static final ggfp f;
    private static final ggfp g;
    private final hfoa h;

    static {
        hflo.d = ggfp.O(hfka.w, hfka.y, hfka.A, hfka.i, hfka.o, hfka.q, new hfka[]{hfka.d, hfka.B, hfka.z, hfka.C, hfka.j});
        hflo.e = ggfp.M(hfka.r, hfka.F, hfka.D, hfka.E);
        hflo.f = ggfp.M(hfjn.j, hfjn.h, hfjn.F, hfjn.y);
        hflo.g = ggfp.L(hfjn.J, hfjn.K, hfjn.L);
    }

    public hflo(hflr hflr0, hfmc hfmc0, hfoa hfoa0) {
        this.a = hflr0;
        this.b = hfmc0;
        this.h = hfoa0;
    }

    public final gmcd a(hhew hhew0, hfnl hfnl0) {
        return glzd.f(this.e(hflg.a(hhew0, hfnl0)), new hflj(), gmap.a);
    }

    public final gmcd b(hfnl hfnl0) {
        return glzd.f(this.e((hfnl0.c == null ? hfno.a : hfnl0.c).d), new hflj(), gmap.a);
    }

    public final gmcd c(hfnh hfnh0, hfnp hfnp0, hfnl hfnl0) {
        int v;
        try {
            hfky hfky0 = hfkt.a(hfnh0);
            gftb.d(hfky0.b.size() == 1, "Unexpected number of scalar ptokens: %s", hfky0.b.size());
            hfkx hfkx0 = (hfkx)hfky0.b.get(0);
            hfkw hfkw0 = hfkx0.b == 1 ? ((hfkw)hfkx0.c) : hfkw.a;
            hhex hhex0 = hfkw0.c == null ? hhex.a : hfkw0.c;
            hhew hhew0 = hhex0.c == null ? hhew.a : hhex0.c;
            if(hhew0.n) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((hfns)hftv0).c = 1;
                ((hfns)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hfns hfns0 = (hfns)hftp0.b_message;
                hfns0.b |= 2;
                hfns0.d = 18;
                return gmbu.i(((hfns)hftp0.N_build()));
            }
            hfno hfno0 = hfnl0.c == null ? hfno.a : hfnl0.c;
            hfjv hfjv0 = hfno0.c == null ? hfjv.a : hfno0.c;
            for(Object object0: (hfjv0.b == 4 ? ((hfjs)hfjv0.c) : hfjs.a).b) {
                hfka hfka0 = hfka.b(((hfkb)object0).d);
                if(hfka0 == null) {
                    hfka0 = hfka.I;
                }
                switch(((hfkb)object0).c) {
                    case 0: {
                        v = 2;
                        break;
                    }
                    case 1: {
                        v = 3;
                        break;
                    }
                    case 2: {
                        v = 4;
                        break;
                    }
                    default: {
                        v = 0;
                    }
                }
                if(v != 3 && !hflo.d.contains(hfka0)) {
                    hfoa hfoa0 = this.h;
                    if((((ProtoLiteMessage)hfoa0).equals(hfmf.b) || ((ProtoLiteMessage)hfoa0).equals(hfmf.c)) && hflo.e.contains(hfka0)) {
                        goto label_43;
                    }
                    Iterator iterator1 = new hfuh(((hfkb)object0).e, hfkb.a).iterator();
                label_39:
                    if(!iterator1.hasNext()) {
                        continue;
                    }
                    Object object1 = iterator1.next();
                    hfjn hfjn0 = (hfjn)object1;
                    if(!hflo.f.contains(hfjn0) && (!((ProtoLiteMessage)hfoa0).equals(hfmf.c) || !hflo.g.contains(hfjn0))) {
                        goto label_39;
                    }
                }
            label_43:
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((hfns)hftv1).c = 1;
                ((hfns)hftv1).b |= 1;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hfns hfns1 = (hfns)hftp1.b_message;
                hfns1.b |= 2;
                hfns1.d = 2;
                return gmbu.i(((hfns)hftp1.N_build()));
            }
            if(hhew0.m) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp2.b_message;
                ((hfns)hftv2).c = 1;
                ((hfns)hftv2).b |= 1;
                if(!hftv2.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hfns hfns2 = (hfns)hftp2.b_message;
                hfns2.b |= 2;
                hfns2.d = 20;
                return gmbu.i(((hfns)hftp2.N_build()));
            }
            gmcd gmcd0 = this.b(hfnl0);
            gmcd gmcd1 = this.a(hhew0, hfnl0);
            return gmbu.d(new gmcd[]{gmcd0, gmcd1}).b(new hflk(this, gmcd0, gmcd1, hhew0, hfnp0, hfnl0), gmap.a);
        }
        catch(RuntimeException unused_ex) {
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((hfns)hftp3.b_message).c = 2;
            ((hfns)hftp3.b_message).b |= 1;
            return gmbu.i(((hfns)hftp3.N_build()));
        }
    }

    static hfns d(gmcd gmcd0) {
        try {
            boolean z = ((Boolean)gmbu.r(gmcd0)).booleanValue();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hfns)hftv0).c = (z ? 2 : 3) - 1;
            ((hfns)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfns hfns0 = (hfns)hftp0.b_message;
            hfns0.b |= 2;
            hfns0.d = (z ? 26 : 29) - 2;
            return (hfns)hftp0.N_build();
        }
        catch(ExecutionException | CancellationException unused_ex) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hfns)hftp1.b_message).c = 2;
            ((hfns)hftp1.b_message).b |= 1;
            return (hfns)hftp1.N_build();
        }
    }

    private final gmcd e(List list0) {
        int v;
        ArrayList arrayList0 = new ArrayList();
        switch(this.h.c) {
            case "dma52_data_sharing_v5": {
                v = 3;
                break;
            }
            case "dma52_data_sharing_v6": {
                v = 4;
                break;
            }
            default: {
                v = 2;
            }
        }
        ggek ggek0 = new ggek();
        for(Object object0: list0) {
            Integer integer0 = (Integer)object0;
            if(integer0 != null) {
                hfjr hfjr0 = hfnd.a(integer0.intValue());
                if(v == 3) {
                    hfjr0 = (hfjr)hfnd.a.getOrDefault(integer0, hfjr0);
                }
                else if(v == 4) {
                    hfjr0 = (hfjr)hfnd.b.getOrDefault(integer0, hfjr0);
                }
                if(hfjr0 != null) {
                    ggek0.i(integer0, Integer.valueOf(hfjr0.a()));
                }
            }
        }
        return glzd.f(gmbu.i(ggek0.g()), new hfln(list0, arrayList0), gmap.a);
    }
}

