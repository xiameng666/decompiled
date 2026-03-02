import android.accounts.Account;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class dmmx implements dmmu {
    private final cchj a;
    private final dmmi b;
    private final dmpp c;
    private final dmpt d;
    private final azts e;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public dmmx(cchj cchj0, azts azts0) {
        this.a = cchj0;
        this.e = azts0;
        this.b = new dmmi(azts0);
        this.c = new dmpp(azts0);
        this.d = new dmpt(azts0);
    }

    @Override  // dmmu
    public final Object a(List list0, ibrl ibrl0) {
        dmls dmls0;
        List list1;
        dmmv dmmv0;
        if((ibrl0 instanceof dmmv)) {
            dmmv0 = (dmmv)ibrl0;
            int v = dmmv0.d;
            if((v & 0x80000000) == 0) {
                dmmv0 = new dmmv(this, ibrl0);
            }
            else {
                dmmv0.d = v - 0x80000000;
            }
        }
        else {
            dmmv0 = new dmmv(this, ibrl0);
        }
        Object object0 = dmmv0.b;
        Object object1 = ibrx.a;
        switch(dmmv0.d) {
            case 0: {
                ibnx.b(object0);
                dmmv0.a = list0;
                dmmv0.d = 1;
                object0 = this.b.d(list0, dmmv0);
                if(object0 != object1) {
                    goto label_21;
                }
                return object1;
            }
            case 1: {
                list0 = (List)dmmv0.a;
                ibnx.b(object0);
            label_21:
                dmpp dmpp0 = this.c;
                dmmv0.a = list0;
                dmmv0.e = (dmls)object0;
                dmmv0.d = 2;
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: list0) {
                    dmmb dmmb0 = (dmmb)object2;
                    if((dmmb0 instanceof dmma) && !((dmma)dmmb0).c()) {
                        arrayList0.add(object2);
                    }
                }
                ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
                for(Object object3: arrayList0) {
                    ibuq.d(((dmmb)object3), "null cannot be cast to non-null type com.google.android.gms.pay.factoryreset.wizard.CardToHandle.SePrepaidCard");
                    arrayList1.add(((dmma)(((dmmb)object3))));
                }
                Object object4 = arrayList1.isEmpty() ? dmls.a : dmpp0.e(arrayList1, dmmv0);
                if(object4 != object1) {
                    list1 = list0;
                    dmls0 = (dmls)object0;
                    object0 = object4;
                    goto label_52;
                }
                return object1;
            }
            case 2: {
                dmls0 = dmmv0.e;
                list1 = (List)dmmv0.a;
                ibnx.b(object0);
            label_52:
                dmpt dmpt0 = this.d;
                dmmv0.a = dmls0;
                dmmv0.e = (dmls)object0;
                dmmv0.d = 3;
                ArrayList arrayList2 = new ArrayList();
                for(Object object5: list1) {
                    dmmb dmmb1 = (dmmb)object5;
                    if((dmmb1 instanceof dmma) && ((dmma)dmmb1).c()) {
                        arrayList2.add(object5);
                    }
                }
                ArrayList arrayList3 = new ArrayList(ibpo.q(arrayList2, 10));
                for(Object object6: arrayList2) {
                    ibuq.d(((dmmb)object6), "null cannot be cast to non-null type com.google.android.gms.pay.factoryreset.wizard.CardToHandle.SePrepaidCard");
                    arrayList3.add(((dmma)(((dmmb)object6))));
                }
                Object object7 = arrayList3.isEmpty() ? dmls.a : dmpt0.c(((dmma)ibpo.R(arrayList3)).a, arrayList3, dmmv0);
                return object7 != object1 ? dmls0.a(((dmls)object0)).a(((dmls)object7)) : object1;
            }
            case 3: {
                dmls dmls1 = dmmv0.e;
                dmls0 = (dmls)dmmv0.a;
                ibnx.b(object0);
                return dmls0.a(dmls1).a(((dmls)object0));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // dmmu
    public final Object b(ibrl ibrl0) {
        Object object5;
        Account[] arr_account2;
        Object object4;
        Account[] arr_account1;
        dmmw dmmw0;
        if((ibrl0 instanceof dmmw)) {
            dmmw0 = (dmmw)ibrl0;
            int v = dmmw0.e;
            if((v & 0x80000000) == 0) {
                dmmw0 = new dmmw(this, ibrl0);
            }
            else {
                dmmw0.e = v - 0x80000000;
            }
        }
        else {
            dmmw0 = new dmmw(this, ibrl0);
        }
        Object object0 = dmmw0.c;
        Object object1 = ibrx.a;
        switch(dmmw0.e) {
            case 0: {
                ibnx.b(object0);
                Account[] arr_account = this.a.o();
                if(arr_account == null) {
                    return ibps.a;
                }
                dmmw0.a = arr_account;
                dmmw0.e = 1;
                Object object2 = this.b.a(arr_account, dmmw0);
                if(object2 == object1) {
                    return object1;
                }
                arr_account1 = arr_account;
                object0 = object2;
                goto label_26;
            }
            case 1: {
                arr_account1 = (Account[])dmmw0.a;
                ibnx.b(object0);
            label_26:
                if(hwja.a.b().f()) {
                    dmmw0.a = arr_account1;
                    dmmw0.b = (List)object0;
                    dmmw0.e = 2;
                    Object object3 = this.c.a(arr_account1, dmmw0);
                    if(object3 == object1) {
                        return object1;
                    }
                    object4 = (List)object0;
                    object0 = object3;
                    arr_account2 = arr_account1;
                    goto label_43;
                }
                else {
                    object4 = (List)object0;
                    object5 = ibps.a;
                    arr_account2 = arr_account1;
                }
                goto label_44;
            }
            case 2: {
                object4 = dmmw0.b;
                arr_account2 = (Account[])dmmw0.a;
                ibnx.b(object0);
            label_43:
                object5 = (List)object0;
            label_44:
                if(hwja.a.b().e()) {
                    dmmw0.a = object4;
                    dmmw0.b = object5;
                    dmmw0.e = 3;
                    Object object6 = this.d.a(arr_account2, dmmw0);
                    return object6 == object1 ? object1 : ibpo.ak(ibpo.ak(((Collection)object4), ((Iterable)object5)), ((List)object6));
                }
                return ibpo.ak(ibpo.ak(((Collection)object4), ((Iterable)object5)), ibps.a);
            }
            case 3: {
                Object object7 = dmmw0.b;
                Object object8 = (List)dmmw0.a;
                ibnx.b(object0);
                return ibpo.ak(ibpo.ak(((Collection)object8), ((Iterable)object7)), ((List)object0));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

