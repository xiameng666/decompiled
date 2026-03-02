import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class bvik implements icih {
    final icih a;
    final bvkk b;
    final String c;

    public bvik(icih icih0, bvkk bvkk0, String s) {
        this.a = icih0;
        this.b = bvkk0;
        this.c = s;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvgm bvgm0;
        bvij bvij0;
        if((ibrl0 instanceof bvij)) {
            bvij0 = (bvij)ibrl0;
            int v = bvij0.b;
            if((v & 0x80000000) == 0) {
                bvij0 = new bvij(this, ibrl0);
            }
            else {
                bvij0.b = v - 0x80000000;
            }
        }
        else {
            bvij0 = new bvij(this, ibrl0);
        }
        Object object1 = bvij0.a;
        Object object2 = ibrx.a;
        switch(bvij0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                bvkk bvkk0 = this.b;
                String s = this.c;
                if(((List)object0).isEmpty()) {
                    String s1 = bvkk0.r.b(0x7F1514C1);  // string:gs_recommended_tab_title "Recommended"
                    String s2 = bvkk0.r.b(0x7F1514BF);  // string:gs_recommended_tab_loading_error "@com.google.android.gms:string/common_something_went_wrong"
                    bvin bvin0 = new bvin(bvkk0);
                    bvgm0 = new bvgm(s1, s2, bvkk0.r.b(0x7F1514C0), bvin0);  // string:gs_recommended_tab_retry_button "@com.google.android.gms:string/common_retry"
                }
                else {
                    clnw clnw0 = bvkk0.r;
                    String s3 = clnw0.b(0x7F1514C1);  // string:gs_recommended_tab_title "Recommended"
                    cmai cmai0 = bvkk0.a(s, new cmkg(cmkl.b, cmkk.b));
                    bvft bvft0 = null;
                    if(htva.a.b().l()) {
                        bvle bvle0 = bvkk0.q;
                        ibuq.f(((List)object0), "<this>");
                        ibuq.f(((List)object0), "cards");
                        ArrayList arrayList0 = new ArrayList();
                        ArrayList arrayList1 = new ArrayList();
                        for(Object object3: ((List)object0)) {
                            if(((Set)bvle0.a.a()).contains(((clnf)object3).d)) {
                                arrayList0.add(object3);
                            }
                            else {
                                arrayList1.add(object3);
                            }
                        }
                        ibns ibns0 = new ibns(arrayList0, arrayList1);
                        bvlb bvlb0 = new bvlb(bvlc.a(((List)ibns0.b), bvle0.b), bvlc.a(((List)ibns0.a), bvle0.c));
                        List list0 = bvlb0.b;
                        if(!list0.isEmpty()) {
                            bvft0 = new bvft(clnw0.b(0x7F1514B5), bvkk.c(list0, bvkk0));  // string:gs_continue_to_manage_section_label "Continue to manage"
                        }
                        bvgm0 = new bvgn(s3, bvkk.c(bvlb0.a, bvkk0), bvft0, cmai0);
                    }
                    else {
                        bvgm0 = new bvgn(s3, bvkk.c(bvlc.a(((List)object0), bvkk0.p), bvkk0), null, cmai0);
                    }
                }
                bvij0.b = 1;
                return icih0.a(bvgm0, bvij0) == object2 ? object2 : ibom.a;
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

