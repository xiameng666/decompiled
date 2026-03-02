import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import java.util.ArrayList;
import java.util.List;

public final class dxkl implements evpo {
    public final dxkp a;

    public dxkl(dxkp dxkp0) {
        this.a = dxkp0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        dohl dohl0;
        Object object0 = evql0.j();
        ibuq.e(object0, "getResult(...)");
        ibuq.f(((Iterable)object0), "valuableGroups");
        Object object1 = new ArrayList();
        for(Object object2: ((Iterable)object0)) {
            gged_interceptors gged0 = ((ValuableGroup)object2).a;
            ibuq.e(gged0, "valuables(...)");
            ArrayList arrayList0 = new ArrayList();
            for(Object object3: gged0) {
                Valuable valuable0 = (Valuable)object3;
                if(!valuable0.m || !valuable0.n) {
                    arrayList0.add(object3);
                }
            }
            ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
            for(Object object4: arrayList0) {
                Valuable valuable1 = (Valuable)object4;
                ibuq.c(valuable1);
                guwf guwf0 = valuable1.R;
                if(guwf0 != null) {
                    switch(guwf0.ordinal()) {
                        case 1: {
                            dohl0 = new doha(valuable1);
                            goto label_42;
                        }
                        case 2: {
                            dohl0 = new dogy(valuable1);
                            goto label_42;
                        }
                        case 5: {
                            dohl0 = new dogw(valuable1);
                            goto label_42;
                        }
                        case 6: {
                            dohl0 = new dogs(valuable1);
                            goto label_42;
                        }
                        case 7: {
                            dohl0 = new dohi(valuable1);
                            goto label_42;
                        }
                        case 8: {
                            dohl0 = new dogz(this.a.a, valuable1);
                            goto label_42;
                        }
                        case 10: {
                            dohl0 = new dogx(valuable1);
                            goto label_42;
                        }
                    }
                }
                dohl0 = new dohl(valuable1);
            label_42:
                arrayList1.add(dohl0);
            }
            ((List)object1).addAll(arrayList1);
        }
        return object1;
    }
}

