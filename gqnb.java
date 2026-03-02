import j..util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Map;

public final class gqnb {
    public static final gged_interceptors a(Collection collection0, Collection collection1) {
        ggez ggez0 = null;
        ggdy ggdy0 = null;
        ggqj ggqj0 = ggfp.G(collection0).om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            gqms gqms0 = (gqms)object0;
            gfsx gfsx0 = gqlo.b(gqms0.d());
            if(gfsx0.i()) {
                Object object1 = gfsx0.d();
                if(ggez0 == null) {
                    ggez0 = new ggez();
                }
                ggez0.j(object1, gqms0);
            }
            else {
                if(ggdy0 == null) {
                    ggdy0 = new ggdy();
                }
                ggdy0.i(gqms0);
            }
        }
        ggfd ggfd0 = ggez0 == null ? ggby.a : ggez0.e();
        gqnc gqnc0 = new gqnc(ggfd0, (ggdy0 == null ? ggna.a : ggdy0.h()));
        ggfd ggfd1 = gqnc0.a;
        ggfp ggfp0 = ggfd1.r();
        gqnj gqnj0 = new gqnj(new gqnf());
        gqnj0.b(collection1);
        ggfp ggfp1 = gqnj0.a();
        gqnj gqnj1 = new gqnj(new gqne());
        gqnj1.b(ggfp1);
        gged_interceptors gged0 = gqnj1.a().v();
        ggfp ggfp2 = ggch.j(gged0).m(new gqmi()).l(new gqmj()).p();
        ggch ggch0 = ggch.f(gged0, ggch.j(ggch.j(ggfp0).i(new gqmk(ggfp2)).p()).l(new gqml()).n());
        ggdy ggdy1 = new ggdy();
        for(Object object2: ggch0) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hhyh)object2))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((hhyh)object2))));
            hhyg hhyg0 = (hhyg)hftp0;
            ggch ggch1 = ggch.j(DesugarCollections.unmodifiableList(((hhyh)hhyg0.b_message).c)).l(new gqmm());
            if(!hhyg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hhyg0).ensureMutable();
            }
            ((hhyh)hhyg0.b_message).c = hfvv.a;
            hhyg0.a(ggch1);
            hhyh hhyh0 = (hhyh)hhyg0.b_message;
            if((hhyh0.b & 1) == 0) {
                gqlo gqlo0 = (gqlo)Collections.min(ggch.j(DesugarCollections.unmodifiableList(hhyh0.c)).l(new gqly()).n(), gqlz.a);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhyo.a).v_newBuilder();
                String s = gqlo0.e() ? glwd.b(gqlo0.a).b : gqlz.d(gqlo0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hhyo hhyo0 = (hhyo)hftp1.b_message;
                s.getClass();
                hhyo0.b |= 1;
                hhyo0.c = s;
                hhyc hhyc0 = gqlz.a(gqlo0);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hhyo)hftp1.b_message).d = hhyc0.d;
                ((hhyo)hftp1.b_message).b |= 2;
                if(gqlo0.e() || gqlo0.f()) {
                    String s1 = gqlz.c(gqlo0.a);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    s1.getClass();
                    ((hhyo)hftv0).b |= 4;
                    ((hhyo)hftv0).e = s1;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hhyo.b(((hhyo)hftp1.b_message));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hhyo.c(((hhyo)hftp1.b_message));
                }
                hhyo hhyo1 = (hhyo)hftp1.N_build();
                if(!hhyg0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hhyg0).ensureMutable();
                }
                hhyh hhyh1 = (hhyh)hhyg0.b_message;
                hhyo1.getClass();
                hhyh1.d = hhyo1;
                hhyh1.b |= 1;
            }
            ggdy1.i(((hhyh)((ProtoLiteBuilder)hhyg0).N_build()));
        }
        gged_interceptors gged1 = ggdy1.h();
        ggek ggek0 = new ggek();
        ggek ggek1 = new ggek();
        ggek ggek2 = new ggek();
        int v = ((ggna)gged1).c;
        for(int v1 = 0; v1 < v; ++v1) {
            hhyh hhyh2 = (hhyh)gged1.get(v1);
            gqmh gqmh0 = new gqmh(gqmp.a(hhyh2.c));
            ggek2.i(gqmh0, hhyh2);
            for(Object object3: hhyh2.c) {
                gqlo gqlo1 = gqlo.c(((hhyf)object3));
                ggek0.i(gqlo1, gqmh0);
                ggek1.i(gqlo1, ((hhyf)object3));
            }
        }
        gqnd gqnd0 = new gqnd(gged1, ggek1.b(), ggek0.b(), ggek2.b());
        ggee ggee0 = new ggee();
        ggqj ggqj1 = ggfd1.n().om();
        while(ggqj1.hasNext()) {
            Object object4 = ggqj1.next();
            gqms gqms1 = (gqms)((Map.Entry)object4).getValue();
            gqlo gqlo2 = (gqlo)((Map.Entry)object4).getKey();
            gqmz gqmz0 = new gqmz(((gqmh)gqnd0.b.get(gqlo2)), gqms1.e(), gqms1.b(), gqms1.a(), gqms1.c());
            gqms gqms2 = (gqms)((Map.Entry)object4).getValue();
            gqlo gqlo3 = (gqlo)((Map.Entry)object4).getKey();
            ggee0.b(gqmz0, new gfsz(gqms2, ((hhyf)gqnd0.a.get(gqlo3))));
        }
        Map map0 = ggkm.n(ggee0.a().map, new gqmt());
        gghp gghp0 = gglj.b().c().a();
        for(Object object5: new ggkd(((ggke)map0))) {
            gghp0.v(((gqmz)((Map.Entry)object5).getKey()).a, ((gqna)((Map.Entry)object5).getValue()));
        }
        gged_interceptors gged2 = gqnc0.b;
        ggdy ggdy2 = new ggdy();
        for(Object object6: gghp0.y().entrySet()) {
            gqmh gqmh1 = (gqmh)((Map.Entry)object6).getKey();
            hhyo hhyo2 = ((hhyh)gqnd0.c.get(gqmh1)).d;
            if(hhyo2 == null) {
                hhyo2 = hhyo.a;
            }
            Collection collection2 = (Collection)((Map.Entry)object6).getValue();
            ggfn ggfn0 = new ggfn();
            for(Object object7: collection2) {
                ggfn0.k(((gqna)object7).b);
            }
            String s2 = gqmp.a(ggfn0.h());
            gged_interceptors gged3 = ggch.j(((Iterable)((Map.Entry)object6).getValue())).l(new gqmy(s2)).n();
            gqls gqls0 = gqlt.a();
            gqls0.b = s2;
            gqls0.c(hhyo2);
            gqls0.b(gged3);
            ggdy2.i(gqls0.a());
        }
        ggdy2.k(ggch.j(ggma.a(gged2, new gqmw()).map.v()).l(new gqmx()));
        return ggdy2.h();
    }
}

