import android.accounts.Account;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class dlwr implements dmba {
    private static final bboh a;
    private final Account b;
    private final dmtv c;
    private final ibnn d;

    static {
        dlwr.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlwr(Account account0, dmtv dmtv0) {
        this.b = account0;
        this.c = dmtv0;
        this.d = new ibnz(() -> try {
            return this.c.a(this.b, 1);
        }
        catch(InterruptedException interruptedException0) {
            a.ae(dlwr.a.j(), "Could not get payment methods.", interruptedException0);
            return null;
        }
        catch(ExecutionException executionException0) {
            a.ae(dlwr.a.j(), "Could not get payment methods.", executionException0);
            return null;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(dlwr.a.j(), "Could not get payment methods.", timeoutException0);
            return null;
        });
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ArrayList arrayList2;
        ibuq.f(hjrn0, "bullet");
        ibuq.f(hjwe0, "filter");
        gftb.g(hjwe0.b == 43, "Cannot evaluate filter that is not bank account count filter", new Object[0]);
        hjri hjri0 = hjwe0.b == 43 ? ((hjri)hjwe0.c) : hjri.a;
        ibuq.e(hjri0, "getBankAccountCountFilter(...)");
        dxeo dxeo0 = (dxeo)this.d.a();
        if(dxeo0 != null) {
            hfuo hfuo0 = dxeo0.b;
            ibuq.e(hfuo0, "getPaymentMethodDataList(...)");
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: hfuo0) {
                hkhr hkhr0 = ((dxev)object0).c;
                if(hkhr0 == null) {
                    hkhr0 = hkhr.b;
                }
                ibuq.e(hkhr0, "getPaymentMethod(...)");
                if(fscr.a(hkhr0)) {
                    arrayList0.add(object0);
                }
            }
            ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
            for(Object object1: arrayList0) {
                hkhr hkhr1 = ((dxev)object1).c;
                if(hkhr1 == null) {
                    hkhr1 = hkhr.b;
                }
                arrayList1.add(hkhr1);
            }
            int v = hjri0.e;
            hkid hkid0 = hkid.a;
            if((hkid.b(v) == null ? hkid.z : hkid.b(v)) != hkid0) {
                hkid hkid1 = hkid.b(v) == null ? hkid.z : hkid.b(v);
                ibuq.e(hkid1, "getFilterFopsWithActionType(...)");
                arrayList2 = new ArrayList();
                Iterator iterator2 = arrayList1.iterator();
            label_36:
                while(iterator2.hasNext()) {
                    Object object2 = iterator2.next();
                    hfuo hfuo1 = ((hkhr)object2).n;
                    ibuq.e(hfuo1, "getExistingPaymentMethodActionsList(...)");
                    if(!(hfuo1 instanceof Collection) || !hfuo1.isEmpty()) {
                        for(Object object3: hfuo1) {
                            hkid hkid2 = hkid.b(((hkhs)object3).c);
                            if(hkid2 == null) {
                                hkid2 = hkid.z;
                            }
                            if(hkid2 == hkid1) {
                                continue label_36;
                            }
                        }
                    }
                    arrayList2.add(object2);
                }
                return (hjri0.b & 2) == 0 || arrayList2.size() <= (hjri0.d == null ? hftw.a : hjri0.d).b ? (hjri0.b & 1) == 0 || arrayList2.size() >= (hjri0.c == null ? hftw.a : hjri0.c).b : false;
            }
            int v1 = hjri0.f;
            if((hkid.b(v1) == null ? hkid.z : hkid.b(v1)) != hkid0) {
                hkid hkid3 = hkid.b(v1) == null ? hkid.z : hkid.b(v1);
                ibuq.e(hkid3, "getIncludeFopsWithActionType(...)");
                arrayList2 = new ArrayList();
                Iterator iterator4 = arrayList1.iterator();
            label_58:
                while(iterator4.hasNext()) {
                    Object object4 = iterator4.next();
                    hfuo hfuo2 = ((hkhr)object4).n;
                    ibuq.e(hfuo2, "getExistingPaymentMethodActionsList(...)");
                    if(!(hfuo2 instanceof Collection) || !hfuo2.isEmpty()) {
                        Iterator iterator5 = hfuo2.iterator();
                        do {
                            if(!iterator5.hasNext()) {
                                continue label_58;
                            }
                            Object object5 = iterator5.next();
                            hkid hkid4 = hkid.b(((hkhs)object5).c);
                            if(hkid4 == null) {
                                hkid4 = hkid.z;
                            }
                        }
                        while(hkid4 != hkid3);
                        arrayList2.add(object4);
                    }
                }
                return (hjri0.b & 2) == 0 || arrayList2.size() <= (hjri0.d == null ? hftw.a : hjri0.d).b ? (hjri0.b & 1) == 0 || arrayList2.size() >= (hjri0.c == null ? hftw.a : hjri0.c).b : false;
            }
            return (hjri0.b & 2) == 0 || arrayList1.size() <= (hjri0.d == null ? hftw.a : hjri0.d).b ? (hjri0.b & 1) == 0 || arrayList1.size() >= (hjri0.c == null ? hftw.a : hjri0.c).b : false;
        }
        return false;
    }

    // Detected as a lambda impl.
    public static final dxeo b(dlwr dlwr0) {
        try {
            return dlwr0.c.a(dlwr0.b, 1);
        }
        catch(InterruptedException interruptedException0) {
            a.ae(dlwr.a.j(), "Could not get payment methods.", interruptedException0);
            return null;
        }
        catch(ExecutionException executionException0) {
            a.ae(dlwr.a.j(), "Could not get payment methods.", executionException0);
            return null;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(dlwr.a.j(), "Could not get payment methods.", timeoutException0);
            return null;
        }
    }
}

