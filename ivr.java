import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public final class ivr {
    public static final int a;
    private static final Comparator[] b;
    private static final ibtw c;

    static {
        Comparator[] arr_comparator = new Comparator[2];
        for(int v = 0; v < 2; ++v) {
            itt itt0 = v == 0 ? itt.a : itq.a;
            arr_comparator[v] = new ivq(new ivp(itt0, ify.b));
        }
        ivr.b = arr_comparator;
        ivr.c = ivn.a;
    }

    public static final List a(iug iug0, ibts ibts0, ibts ibts1, List list0) {
        Comparator comparator0;
        List list1;
        ArrayList arrayList2;
        bxv bxv0 = new bxv(null);
        ArrayList arrayList0 = new ArrayList();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ivr.b(((iug)list0.get(v1)), arrayList0, ibts0, ibts1, bxv0);
        }
        int v2 = iug0.a.r == jlm.b ? 0 : 1;
        ArrayList arrayList1 = new ArrayList(arrayList0.size() / 2);
        int v3 = ibpo.d(arrayList0);
        if(v3 >= 0) {
            int v4 = 0;
            while(true) {
                iug iug1 = (iug)arrayList0.get(v4);
                if(v4 == 0) {
                label_36:
                    arrayList2 = arrayList0;
                    v4 = 0;
                }
                else {
                    float f = iug1.c().c;
                    float f1 = iug1.c().e;
                    int v5 = ibpo.d(arrayList1);
                    if(v5 >= 0) {
                        int v6 = 0;
                        while(true) {
                            hka hka0 = (hka)((ibns)arrayList1.get(v6)).a;
                            float f2 = hka0.c;
                            float f3 = hka0.e;
                            if(f < f1 && f2 < f3 && (Math.max(f, f2) < Math.min(f1, f3))) {
                                arrayList2 = arrayList0;
                                Object object0 = ((ibns)arrayList1.get(v6)).b;
                                arrayList1.set(v6, new ibns(new hka(Math.max(hka0.b, 0.0f), Math.max(f2, f), Math.min(hka0.d, Infinityf), Math.min(f3, f1)), object0));
                                ((List)((ibns)arrayList1.get(v6)).b).add(iug1);
                                goto label_39;
                            }
                            arrayList2 = arrayList0;
                            if(v6 == v5) {
                                goto label_38;
                            }
                            ++v6;
                            arrayList0 = arrayList2;
                        }
                    }
                    else {
                        arrayList2 = arrayList0;
                        goto label_38;
                    }
                    goto label_36;
                }
            label_38:
                arrayList1.add(new ibns(iug1.c(), ibpo.i(new iug[]{iug1})));
            label_39:
                if(v4 == v3) {
                    goto label_43;
                }
                ++v4;
                arrayList0 = arrayList2;
            }
        }
        else {
        label_43:
            ibpo.t(arrayList1, ivs.a);
            list1 = new ArrayList();
            comparator0 = ivr.b[v2];
            int v7 = arrayList1.size();
        }
        for(int v8 = 0; v8 < v7; ++v8) {
            Object object1 = ((ibns)arrayList1.get(v8)).b;
            ibpo.t(((List)object1), comparator0);
            ((ArrayList)list1).addAll(((Collection)object1));
        }
        ibpo.t(list1, new ivk(ivr.c));
        int v9 = 0;
        while(v9 <= ibpo.d(list1)) {
            List list2 = (List)bxv0.a(((iug)((ArrayList)list1).get(v9)).d);
            if(list2 == null) {
                ++v9;
            }
            else {
                if(((Boolean)ibts1.a(((ArrayList)list1).get(v9))).booleanValue()) {
                    ++v9;
                }
                else {
                    ((ArrayList)list1).remove(v9);
                }
                ((ArrayList)list1).addAll(v9, list2);
                v9 += list2.size();
            }
        }
        return list1;
    }

    private static final void b(iug iug0, ArrayList arrayList0, ibts ibts0, ibts ibts1, bxv bxv0) {
        boolean z = ((Boolean)iug0.b.d(iuz.m, ivo.a)).booleanValue();
        if(z || ((Boolean)ibts1.a(iug0)).booleanValue()) {
            if(((Boolean)ibts0.a(iug0)).booleanValue()) {
                arrayList0.add(iug0);
            }
            if(z) {
                List list0 = ivr.a(iug0, ibts0, ibts1, iug0.h());
                bxv0.g(iug0.d, list0);
                return;
            }
        }
        List list1 = iug0.h();
        int v = list1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ivr.b(((iug)list1.get(v1)), arrayList0, ibts0, ibts1, bxv0);
        }
    }
}

