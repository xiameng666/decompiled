import com.google.android.gms.credential.manager.batchupload.BatchUploadResult.Conflict;
import com.google.android.gms.credential.manager.batchupload.BatchUploadResult.Error;
import com.google.android.gms.credential.manager.batchupload.BatchUploadResult.Success;
import com.google.android.gms.credential.manager.batchupload.BatchUploadResult;
import java.util.ArrayList;
import java.util.List;

final class bddl extends ibsl implements ibtw {
    int a;
    final bddm b;
    final String c;

    public bddl(bddm bddm0, String s, ibrl ibrl0) {
        this.b = bddm0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bddl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bddl(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        gqsm gqsm1;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            bddm bddm0 = this.b;
            bddm0.p.l(bddf.c);
            bddm0.h.l(Boolean.valueOf(true));
            bddm0.l.l(Boolean.valueOf(false));
            List list0 = bddm0.d;
            List list1 = bdde.a(bddm0.c, list0, false);
            bddm0.f.l(list1);
            gqsm gqsm0 = bddm.b(list0) ? gqsm.NY : gqsm.NX;
            bddm0.b.c(gqsm0);
            ArrayList arrayList0 = new ArrayList(ibpo.q(bddm0.c, 10));
            for(Object object2: bddm0.c) {
                arrayList0.add(((gqmd)((ibns)object2).a));
            }
            List list2 = ibpo.au(arrayList0, list0);
            ArrayList arrayList1 = new ArrayList();
            for(Object object3: list2) {
                if(((Boolean)((ibns)object3).b).booleanValue()) {
                    arrayList1.add(object3);
                }
            }
            ArrayList arrayList2 = new ArrayList(ibpo.q(arrayList1, 10));
            for(Object object4: arrayList1) {
                arrayList2.add(((ibns)object4).a);
            }
            ArrayList arrayList3 = new ArrayList();
            for(Object object5: arrayList2) {
                gged_interceptors gged0 = ((gqmd)object5).c();
                ArrayList arrayList4 = new ArrayList(ibpo.q(gged0, 10));
                ggqk ggqk0 = gged0.E();
                while(ggqk0.hasNext()) {
                    Object object6 = ggqk0.next();
                    arrayList4.add(((bedg)object6).e);
                }
                ibpo.D(arrayList3, arrayList4);
            }
            this.a = 1;
            object0 = bddu.b(bddm0.a, arrayList3, this.c, this);
            if(object0 == object1) {
                return object1;
            }
        }
        bddm bddm1 = this.b;
        if((((BatchUploadResult)object0) instanceof BatchUploadResult.Success)) {
            gqsm1 = gqsm.NZ;
        }
        else {
            if((((BatchUploadResult)object0) instanceof BatchUploadResult.Conflict)) {
                gqsm1 = gqsm.Oa;
                goto label_59;
            }
            if(!(((BatchUploadResult)object0) instanceof BatchUploadResult.Error)) {
                throw new ibnq();
            }
            gqsm1 = gqsm.Ob;
        }
    label_59:
        bddm1.b.c(gqsm1);
        if(!(((BatchUploadResult)object0) instanceof BatchUploadResult.Success) && !(((BatchUploadResult)object0) instanceof BatchUploadResult.Conflict)) {
            if(!(((BatchUploadResult)object0) instanceof BatchUploadResult.Error)) {
                throw new ibnq();
            }
            bddm1.t.l(ibom.a);
            bddm1.x.l(ibom.a);
            return ibom.a;
        }
        else {
            String s = this.c;
            bddm1.r.l(s);
            if(bddm.b(bddm1.d)) {
                bddm1.v.l(s);
                return ibom.a;
            }
        }
        bddm1.x.l(ibom.a);
        return ibom.a;
    }
}

