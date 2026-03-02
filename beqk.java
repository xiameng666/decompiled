import java.util.Iterator;
import java.util.List;

public final class beqk implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ggdy ggdy0 = new ggdy();
        Iterator iterator0 = ((grbi)object0).d.iterator();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            grbg grbg0 = (grbg)object1;
            graz graz0 = graz.b(grbg0.c) == null ? graz.a : graz.b(grbg0.c);
            if(beqd.b.contains(graz0)) {
                ggdy ggdy1 = new ggdy();
                ggek ggek0 = new ggek();
                int v = 0;
                for(Object object2: grbg0.e) {
                    grbe grbe0 = (grbe)object2;
                    ggdy ggdy2 = new ggdy();
                    for(Object object3: grbe0.c) {
                        grax grax0 = (grax)object3;
                        if(grax0.g) {
                            ggek0.i(grax0, new hfuh(grbe0.d, grbe.a));
                        }
                        else {
                            ggdy2.i(grax0);
                        }
                    }
                    gged_interceptors gged0 = ggdy2.h();
                    if(gged0.isEmpty()) {
                        continue;
                    }
                    v += ((ggna)gged0).c;
                    grbb grbb0 = (grbb)((ProtoLiteMessage)grbe.b).v_newBuilder();
                    grbb0.k(gged0);
                    grbb0.a(new hfuh(grbe0.d, grbe.a));
                    ggdy1.i(((grbe)((ProtoLiteBuilder)grbb0).N_build()));
                }
                ggdy ggdy3 = new ggdy();
                gged_interceptors gged1 = ggdy1.h();
                graz graz1 = graz.b(grbg0.c) == null ? graz.a : graz.b(grbg0.c);
                ggdy ggdy4 = new ggdy();
                ggdy ggdy5 = new ggdy();
                graz graz2 = graz.b;
                if(gged1.isEmpty()) {
                    ggdy4.i(new bede(bedd.d, 0, gfqx.a, gfqx.a, gfqx.a));
                }
                else {
                    gfqx gfqx0 = gfqx.a;
                    ggdy4.i(new bede(bedd.c, 0, gfqx0, gfqx0, gfqx0));
                    ggqk ggqk0 = gged1.E();
                    while(ggqk0.hasNext()) {
                        Object object4 = ggqk0.next();
                        grbe grbe1 = (grbe)object4;
                        if(graz1 == graz.d) {
                            bede bede0 = new bede(bedd.b, grbe1.c.size(), gfqx0, gfqx0, gfqx0);
                            gfqx0 = gfqx0;
                            ggdy4.i(bede0);
                        }
                        for(Object object5: grbe1.c) {
                            bede bede1 = bede.a(beqd.a(((grax)object5)), new hfuh(grbe1.d, grbe.a));
                            if(graz1 == graz2) {
                                ggdy5.i(bede1);
                            }
                            else {
                                ggdy4.i(bede1);
                            }
                            iterator0 = iterator0;
                        }
                    }
                }
                Iterator iterator4 = iterator0;
                if(graz1 == graz2) {
                    ggdy4.k(beqd.e(ggdy5.h()));
                }
                gged_interceptors gged2 = ggdy4.h();
                if((graz.b(grbg0.c) == null ? graz.a : graz.b(grbg0.c)) == graz2) {
                    ggdy ggdy6 = new ggdy();
                    bede bede2 = (bede)gged2.get(0);
                    if(bede2.a == bedd.c || bede2.a == bedd.d) {
                        ggdy6.i(bede2);
                    }
                    ggdy6.k(ggch.j(gged2).i(new bepz()).n());
                    ggdy3.k(ggdy6.h());
                    if(ggch.j(gged2).s(new beqc())) {
                        gged_interceptors gged3 = ggch.j(gged2).i(new bepy()).n();
                        ggdy3.i(bede.b(gged_interceptors.l(new beds(graz2, gged3.size(), gged3, 2))));
                    }
                }
                else {
                    ggdy3.k(gged2);
                }
                ggeo ggeo0 = ggek0.b();
                if(!ggeo0.isEmpty()) {
                    graz graz3 = graz.b(grbg0.c) == null ? graz.a : graz.b(grbg0.c);
                    int v1 = ((ggnf)ggeo0).d;
                    ggdy ggdy7 = new ggdy();
                    ggqj ggqj0 = ggeo0.w().om();
                    while(ggqj0.hasNext()) {
                        Object object6 = ggqj0.next();
                        ggdy7.i(bede.a(beqd.a(((grax)object6)), ((List)ggeo0.get(((grax)object6)))));
                    }
                    ggdy3.i(bede.b(gged_interceptors.l(new beds(graz3, v1, beqd.e(ggdy7.h()), 1))));
                }
                bedp bedp0 = new bedp();
                bedp0.c(0);
                bedq bedq0 = bedq.c;
                bedp0.b(bedq0);
                graz graz4 = graz.b(grbg0.c) == null ? graz.a : graz.b(grbg0.c);
                if(graz4 != null) {
                    bedp0.a = graz4;
                    bedp0.c(v);
                    gged_interceptors gged4 = ggdy3.h();
                    if(gged4 != null) {
                        bedp0.b = gged4;
                        bedr bedr0 = bedp0.a();
                        switch(bedr0.a.ordinal()) {
                            case 1: {
                                z = ggch.j(bedr0.c).s(new bepv());
                                z1 = ggch.j(bedr0.c).s(new bepw());
                                break;
                            }
                            case 2: 
                            case 3: {
                                z1 = bedr0.b > 0;
                                z = false;
                                break;
                            }
                            default: {
                                boolean z = false;
                                boolean z1 = false;
                            }
                        }
                        if(z) {
                            bedq0 = bedq.a;
                        }
                        else if(z1) {
                            bedq0 = bedq.b;
                        }
                        bedp0.b(bedq0);
                        ggdy0.i(bedp0.a());
                        goto label_122;
                    }
                    throw new NullPointerException("Null checkupResultEntries");
                }
                throw new NullPointerException("Null checkupIssueType");
            }
            else {
                iterator4 = iterator0;
                ((ggtj)beqd.a.j()).z("Unsupported checkup issue type %s. Issues are ignored and not displayed.", (graz.b(grbg0.c) == null ? graz.a : graz.b(grbg0.c)).e);
            }
        label_122:
            iterator0 = iterator4;
        }
        gged_interceptors gged5 = ggdy0.h();
        bedr[] arr_bedr = new bedr[3];
        int v2 = ((ggna)gged5).c;
        for(int v3 = 0; v3 < v2; ++v3) {
            bedr bedr1 = (bedr)gged5.get(v3);
            graz graz5 = bedr1.a;
            if(graz5.equals(graz.b)) {
                arr_bedr[0] = bedr1;
            }
            else if(graz5.equals(graz.d)) {
                arr_bedr[1] = bedr1;
            }
            else if(graz5.equals(graz.c)) {
                arr_bedr[2] = bedr1;
            }
        }
        return ggch.k(arr_bedr).i(new bepx()).n();
    }
}

