import j..util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class bgiy {
    public static final bboh a;

    static {
        bgiy.a = bboh.b("ReuseRunner", bbcu.cX);
    }

    public static final evql a(gged_interceptors gged0) {
        grbm grbm0;
        Object object17;
        glvu glvu0;
        Iterator iterator10;
        ggek ggek0 = new ggek();
        ggqk ggqk0 = gged0.E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            ggek0.i(((bedh)object0).a, ((bedh)object0).b);
        }
        ggeo ggeo0 = ggek0.b();
        gged_interceptors gged1 = ggeo0.w().v();
        ibuq.f(gged1, "credentialGroups");
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: gged1) {
            if(((gqmd)object1).h().i()) {
                arrayList0.add(object1);
            }
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object2: arrayList0) {
            gqmr gqmr0 = (gqmr)((gqmd)object2).h().d();
            Object object3 = linkedHashMap0.get(gqmr0);
            if(object3 == null) {
                object3 = new ArrayList();
                linkedHashMap0.put(gqmr0, object3);
            }
            ((List)object3).add(object2);
        }
        Collection collection0 = linkedHashMap0.values();
        ArrayList arrayList1 = new ArrayList(ibpo.q(collection0, 10));
        for(Object object4: collection0) {
            List list0 = (List)object4;
            if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                for(Object object5: list0) {
                    if(((gqmd)object5).a().i()) {
                        continue;
                    }
                    ((ggsc)((ggsc)grbo.a.j()).o(1, TimeUnit.MINUTES).ar(0x4D8F)).x("Not all credentials have affiliated_group_id set.");
                    goto label_53;
                }
            }
            List list1 = ibpo.ao(list0, new grbn());
            HashSet hashSet0 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for(Object object6: list1) {
                Object object7 = ((gqmd)object6).a().d();
                String s = ((gqmd)object6).k();
                ibuq.e(s, "getUsername(...)");
                if(hashSet0.add(new ibns(object7, gfqw.a(s)))) {
                    arrayList2.add(object6);
                }
            }
            list0 = ggdx.d(arrayList2);
        label_53:
            arrayList1.add(list0);
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object8: arrayList1) {
            Collection collection1 = (Collection)object8;
            if(collection1.size() > 1) {
                goto label_61;
            }
            continue;
            try {
            label_61:
                ArrayList arrayList4 = new ArrayList(ibpo.q(collection1, 10));
                for(Object object9: collection1) {
                    arrayList4.add(((gqmd)object9).a());
                }
                if(grbo.a(arrayList4)) {
                    continue;
                }
                ArrayList arrayList5 = new ArrayList(ibpo.q(collection1, 10));
                for(Object object10: collection1) {
                    arrayList5.add(((gqmd)object10).k());
                }
                ArrayList arrayList6 = new ArrayList();
                for(Object object11: arrayList5) {
                    ibuq.c(((String)object11));
                    if(((String)object11).length() > 0) {
                        arrayList6.add(object11);
                    }
                }
                ArrayList arrayList7 = new ArrayList(ibpo.q(arrayList6, 10));
                for(Object object12: arrayList6) {
                    ibuq.c(((String)object12));
                    arrayList7.add(gfqw.a(((String)object12)));
                }
                boolean z = grbo.a(arrayList7);
                if(!(collection1 instanceof Collection) || !collection1.isEmpty()) {
                    iterator10 = collection1.iterator();
                    while(true) {
                    label_92:
                        if(!iterator10.hasNext()) {
                            goto label_93;
                        }
                        goto label_153;
                    }
                }
                else {
                label_93:
                    ArrayList arrayList8 = new ArrayList();
                    for(Object object13: collection1) {
                        ibpo.D(arrayList8, ((gqmd)object13).d());
                    }
                    ArrayList arrayList9 = new ArrayList();
                    for(Object object14: arrayList8) {
                        String s1 = ((hhyf)object14).c;
                        ibuq.e(s1, "getId(...)");
                        if(!grbo.b(s1)) {
                            arrayList9.add(object14);
                        }
                    }
                    boolean z1 = true;
                    Set set0 = ibpo.ay(arrayList9);
                    if(set0.size() > 1 && (!(set0 instanceof Collection) || !set0.isEmpty())) {
                        for(Object object15: set0) {
                            if(!((hhyf)object15).g) {
                                ArrayList arrayList10 = new ArrayList(ibpo.q(set0, 10));
                                for(Object object16: set0) {
                                    String s2 = ((hhyf)object16).c;
                                    ibuq.e(s2, "getId(...)");
                                    try {
                                        glwc glwc0 = glwb.a(s2);
                                        String s3 = glwc0.b;
                                        gftb.u(((boolean)(gfta.c(s3) ^ 1)), "Uri has no authority: %s", glwc0);
                                        Objects.requireNonNull(s3);
                                        int v = s3.indexOf("@") + 1;
                                        int v1 = s3.indexOf(58, v);
                                        if(v1 >= 0) {
                                            int v2;
                                            for(v2 = v1 + 1; v2 < s3.length(); ++v2) {
                                                int v3 = s3.charAt(v2);
                                                if(v3 < 0x30 || v3 > 57) {
                                                    break;
                                                }
                                            }
                                            gftb.u(v2 == s3.length() && v2 > v1 + 1, "Authority doesn\'t match web pattern: %s", glwc0);
                                        }
                                        else {
                                            v1 = s3.length();
                                        }
                                        String s4 = s3.substring(v, v1);
                                        try {
                                            glvu0 = glvu.c(s4);
                                        }
                                        catch(IllegalArgumentException illegalArgumentException0) {
                                            throw new IllegalStateException("Invalid domain \'" + s4 + "\' found in URI \'" + glwc0.toString() + "\'", illegalArgumentException0);
                                        }
                                    }
                                    catch(IllegalStateException unused_ex) {
                                        object17 = null;
                                        goto label_148;
                                    }
                                    object17 = glvu0.e() ? ((String)glvu0.d().b.get(0)) : null;
                                label_148:
                                    arrayList10.add(object17);
                                }
                                if(!arrayList10.contains(null) && grbo.a(arrayList10)) {
                                    break;
                                }
                                z1 = false;
                                break;
                            label_153:
                                Object object18 = iterator10.next();
                                ggfp ggfp0 = ((gqmd)object18).d();
                                if(!ggfp0.isEmpty()) {
                                    Iterator iterator15 = ggfp0.iterator();
                                label_157:
                                    if(iterator15.hasNext()) {
                                        Object object19 = iterator15.next();
                                        String s5 = ((hhyf)object19).c;
                                        ibuq.e(s5, "getId(...)");
                                        if(!grbo.b(s5)) {
                                            goto label_92;
                                        }
                                        goto label_157;
                                    }
                                }
                                z1 = false;
                                break;
                            }
                        }
                    }
                }
            }
            catch(RuntimeException runtimeException0) {
                ((ggsc)((ggsc)grbo.a.j()).s(runtimeException0).ar(0x4D90)).x("Error occurred while checking a reuse group for duplicates");
                arrayList3.add(object8);
                continue;
            }
            if(!z || !z1) {
                arrayList3.add(object8);
            }
        }
        ArrayList arrayList11 = new ArrayList(ibpo.q(arrayList3, 10));
        for(Object object20: arrayList3) {
            ggfn ggfn0 = null;
            for(Object object21: ((Collection)object20)) {
                if(ggfn0 == null) {
                    ggfn0 = new ggfn();
                }
                ggfn0.i(((gqmd)object21));
            }
            int v4 = ((Collection)object20).size();
            if(v4 == 0) {
                throw new AssertionError("PasswordReuse count must not be 0.");
            }
            if(v4 > 0 && v4 < 6) {
                grbm0 = grbm.a;
            }
            else {
                grbm0 = v4 < 6 || v4 >= 11 ? grbm.c : grbm.b;
            }
            if(grbm0 == null) {
                throw new NullPointerException("Null severity");
            }
            ggfp ggfp1 = ggfn0 == null ? ggnj.a : ggfn0.h();
            arrayList11.add(new grbp(grbm0, ggfp1));
            continue;
        }
        gged_interceptors gged2 = ggch.j(ggdx.d(arrayList11)).l(new bgix(ggeo0)).n();
        return evrg.d(new bggc(graz.d, gged2));
    }
}

