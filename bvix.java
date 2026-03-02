import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;

public final class bvix implements icih {
    final icih a;
    final bvkk b;
    final String c;

    public bvix(icih icih0, bvkk bvkk0, String s) {
        this.a = icih0;
        this.b = bvkk0;
        this.c = s;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvlo bvlo1;
        ibrx ibrx1;
        icih icih1;
        bvgt bvgt0;
        bviw bviw0;
        if((ibrl0 instanceof bviw)) {
            bviw0 = (bviw)ibrl0;
            int v = bviw0.b;
            if((v & 0x80000000) == 0) {
                bviw0 = new bviw(this, ibrl0);
            }
            else {
                bviw0.b = v - 0x80000000;
            }
        }
        else {
            bviw0 = new bviw(this, ibrl0);
        }
        Object object1 = bviw0.a;
        ibrx ibrx0 = ibrx.a;
        switch(bviw0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                Object object2 = ((ibnw)object0).a;
                bvkk bvkk0 = this.b;
                String s = this.c;
                if((object2 instanceof ibnv)) {
                    String s1 = bvkk0.r.b(0x7F1514C6);  // string:gs_services_tab_title "All services"
                    String s2 = bvkk0.r.b(0x7F1514C4);  // string:gs_services_tab_loading_error "@com.google.android.gms:string/common_something_went_wrong"
                    bvio bvio0 = new bvio(bvkk0);
                    bvgt0 = new bvgt(s1, s2, bvkk0.r.b(0x7F1514C5), bvio0);  // string:gs_services_tab_retry_button "@com.google.android.gms:string/common_retry"
                    icih1 = icih0;
                    ibrx1 = ibrx0;
                }
                else {
                    cmkg cmkg0 = new cmkg(cmkl.b, cmkk.c);
                    ibnx.b(object2);
                    ibuq.f(((List)object2), "settingsItems");
                    bvls bvls0 = (bvls)bvkk0.c;
                    List list0 = ibpo.ao(((List)object2), ((Comparator)bvls0.c.get()));
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                    for(Object object3: list0) {
                        awkv awkv0 = ((clob)object3).a;
                        ibuq.f(awkv0, "itemId");
                        buyi buyi0 = (buyi)bvls0.h.a.get(awkv0);
                        if(buyi0 == null) {
                            buyi0 = buyi.a;
                        }
                        if(buyi0 == buyi.a) {
                            bvlo bvlo2 = (bvlo)bvls0.f.get(awkv0);
                            bvlo1 = bvlo2 == null ? bvls0.e : bvlo2;
                        }
                        else {
                            bvlo bvlo0 = (bvlo)bvls0.d.get(buyi0);
                            if(bvlo0 == null) {
                                ((ggtj)bvls.a.j()).B("Category is not found for override id %s. Defaulting to \'other\'.", buyi0.name());
                                bvlo1 = bvls0.e;
                            }
                            else {
                                bvlo1 = bvlo0;
                            }
                        }
                        Object object4 = linkedHashMap0.get(bvlo1);
                        if(object4 == null) {
                            object4 = new ArrayList();
                            linkedHashMap0.put(bvlo1, object4);
                        }
                        ((List)object4).add(object3);
                    }
                    SortedMap sortedMap0 = ibpz.f(linkedHashMap0, ((Comparator)bvls0.b.get()));
                    ArrayList arrayList0 = new ArrayList(sortedMap0.size());
                    for(Object object5: sortedMap0.entrySet()) {
                        buyi buyi1 = ((bvlo)((Map.Entry)object5).getKey()).a;
                        String s3 = ((bvlo)((Map.Entry)object5).getKey()).b;
                        Object object6 = ((Map.Entry)object5).getValue();
                        ibuq.e(object6, "<get-value>(...)");
                        arrayList0.add(new clnz(buyi1, s3, ((List)object6)));
                    }
                    String s4 = bvkk0.r.b(0x7F1514C6);  // string:gs_services_tab_title "All services"
                    ibwm ibwm0 = ibpo.k(arrayList0);
                    ArrayList arrayList1 = new ArrayList(ibpo.q(ibwm0, 10));
                    ibpw ibpw0 = ibwm0.e();
                    while(((ibwl)ibpw0).a) {
                        int v1 = ibpw0.a();
                        clnz clnz0 = (clnz)arrayList0.get(v1);
                        String s5 = bvkk0.f;
                        ibuq.f(clnz0, "<this>");
                        buyi buyi2 = clnz0.a;
                        List list1 = clnz0.c;
                        ibwm ibwm1 = ibpo.k(list1);
                        String s6 = clnz0.b;
                        ArrayList arrayList2 = new ArrayList(ibpo.q(ibwm1, 10));
                        ibpw ibpw1 = ibwm1.e();
                        while(((ibwl)ibpw1).a) {
                            int v2 = ibpw1.a();
                            clob clob0 = (clob)list1.get(v2);
                            ibuq.f(clob0, "<this>");
                            bvgy bvgy0 = new bvgy(s, clob0);
                            arrayList2.add(new bvgr(clob0.a, clob0.c, bvgy0, bvhi.d(0x3047F, Integer.valueOf(v2), null, new bvgz(clob0, s5), 4)));
                            list1 = list1;
                            ibpw1 = ibpw1;
                            icih0 = icih0;
                            ibrx0 = ibrx0;
                            bviw0 = bviw0;
                            s4 = s4;
                        }
                        bvhc bvhc0 = new bvhc(s5);
                        arrayList1.add(new bvgq(buyi2, s6, arrayList2, bvhi.d(0x3047E, Integer.valueOf(v1), null, new bvhb(clnz0), 4), bvhc0));
                        arrayList0 = arrayList0;
                        ibpw0 = ibpw0;
                        icih0 = icih0;
                        ibrx0 = ibrx0;
                        bviw0 = bviw0;
                        s4 = s4;
                    }
                    icih1 = icih0;
                    ibrx1 = ibrx0;
                    bvgt0 = new bvgu(s4, arrayList1, bvkk0.a(s, cmkg0));
                }
                bviw0.b = 1;
                return icih1.a(bvgt0, bviw0) == ibrx1 ? ibrx1 : ibom.a;
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

