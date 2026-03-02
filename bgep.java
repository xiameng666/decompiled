import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public final class bgep implements icih {
    final icih a;

    public bgep(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        boolean z3;
        boolean z2;
        boolean z1;
        Iterator iterator1;
        bgfb bgfb0;
        ArrayList arrayList0;
        bgeo bgeo0;
        if((ibrl0 instanceof bgeo)) {
            bgeo0 = (bgeo)ibrl0;
            int v = bgeo0.b;
            if((v & 0x80000000) == 0) {
                bgeo0 = new bgeo(this, ibrl0);
            }
            else {
                bgeo0.b = v - 0x80000000;
            }
        }
        else {
            bgeo0 = new bgeo(this, ibrl0);
        }
        Object object1 = bgeo0.a;
        Object object2 = ibrx.a;
        switch(bgeo0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                if(((gged_interceptors)object0) == null) {
                    arrayList0 = null;
                }
                else {
                    arrayList0 = new ArrayList(ibpo.q(((gged_interceptors)object0), 10));
                    Iterator iterator0 = ((gged_interceptors)object0).iterator();
                    while(iterator0.hasNext()) {
                        Object object3 = iterator0.next();
                        ibuq.c(((gqlt)object3));
                        ibuq.f(((gqlt)object3), "<this>");
                        gged_interceptors gged0 = ((gqlt)object3).c;
                        String s = ((bedg)((gqmd)gged0.get(0)).c().get(0)).c;
                        hhyo hhyo0 = ((gqlt)object3).b;
                        String s1 = hhyo0.e;
                        ibuq.e(s1, "getIconUrl(...)");
                        ibuq.f(s1, "<this>");
                        if(s1.length() == 0) {
                            String s2 = s.toLowerCase(Locale.ROOT);
                            ibuq.e(s2, "toLowerCase(...)");
                            bgfb0 = ibzk.W(s2, "android://") ? bgfc.a : bgfd.a;
                        }
                        else {
                            bgfb0 = new bgfb(s1);
                        }
                        String s3 = hhyo0.c;
                        ibuq.e(s3, "getName(...)");
                        Integer integer0 = (int)((ggna)gged0).c;
                        boolean z = (hhyc.b(hhyo0.d) == null ? hhyc.a : hhyc.b(hhyo0.d)) == hhyc.b;
                        ibuq.e(gged0, "getCredentialGroups(...)");
                        ibuq.f(gged0, "<this>");
                        if(!(gged0 instanceof Collection) || !gged0.isEmpty()) {
                            ggqk ggqk0 = gged0.E();
                            while(ggqk0.hasNext()) {
                                Object object4 = ggqk0.next();
                                gqmd gqmd0 = (gqmd)object4;
                                if(gqmd0.f()) {
                                    continue;
                                }
                                gged_interceptors gged1 = gqmd0.c();
                                if(gged1.isEmpty()) {
                                    continue;
                                }
                                ggqk ggqk1 = gged1.E();
                            label_52:
                                if(!ggqk1.hasNext()) {
                                    continue;
                                }
                                Object object5 = ggqk1.next();
                                if(!gqmq.b(((bedg)object5))) {
                                    goto label_52;
                                }
                                iterator1 = iterator0;
                                z1 = true;
                                goto label_60;
                            }
                        }
                        iterator1 = iterator0;
                        z1 = false;
                    label_60:
                        ibuq.e(gged0, "getCredentialGroups(...)");
                        ibuq.f(gged0, "<this>");
                        if(!(gged0 instanceof Collection) || !gged0.isEmpty()) {
                            ggqk ggqk2 = gged0.E();
                            while(ggqk2.hasNext()) {
                                Object object6 = ggqk2.next();
                                gqmd gqmd1 = (gqmd)object6;
                                if(gqmd1.f()) {
                                    continue;
                                }
                                gged_interceptors gged2 = gqmd1.c();
                                if(gged2.isEmpty()) {
                                    continue;
                                }
                                ggqk ggqk3 = gged2.E();
                            label_71:
                                if(!ggqk3.hasNext()) {
                                    continue;
                                }
                                Object object7 = ggqk3.next();
                                if(!gqmq.a(((bedg)object7))) {
                                    goto label_71;
                                }
                                z2 = gged0 instanceof Collection;
                                z3 = true;
                                goto label_79;
                            }
                        }
                        z2 = gged0 instanceof Collection;
                        z3 = false;
                    label_79:
                        boolean z4 = false;
                        ibuq.e(gged0, "getCredentialGroups(...)");
                        ibuq.f(gged0, "<this>");
                        if(!z2 || !gged0.isEmpty()) {
                            ggqk ggqk4 = gged0.E();
                            while(ggqk4.hasNext()) {
                                Object object8 = ggqk4.next();
                                if(((gqmd)object8).f()) {
                                    z4 = true;
                                    break;
                                }
                            }
                        }
                        arrayList0.add(new bgfa(bgfb0, s3, integer0, z, s, new bgbd(z1, z3, z4)));
                        iterator0 = iterator1;
                    }
                }
                bgeo0.b = 1;
                return icih0.a(arrayList0, bgeo0) == object2 ? object2 : ibom.a;
            }
            case 1: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

