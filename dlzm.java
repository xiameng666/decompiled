import android.accounts.Account;
import com.google.android.gms.pay.PageData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class dlzm implements dmba {
    private static final bboh a;
    private final Account b;
    private final dmtv c;
    private final PageData d;
    private dxeo e;

    static {
        dlzm.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlzm(Account account0, dmtv dmtv0, PageData pageData0) {
        this.b = account0;
        this.c = dmtv0;
        this.d = pageData0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        int v;
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        gftb.g(hjwe0.b == 0x20, "Cannot evaluate filter that is not payment method action filter", new Object[0]);
        if(this.e == null) {
            try {
                this.e = this.c.a(this.b, 1);
            }
            catch(InterruptedException interruptedException0) {
                a.ae(dlzm.a.j(), "Could not get payment methods.", interruptedException0);
                return false;
            }
            catch(ExecutionException executionException0) {
                a.ae(dlzm.a.j(), "Could not get payment methods.", executionException0);
                return false;
            }
            catch(TimeoutException timeoutException0) {
                a.ae(dlzm.a.j(), "Could not get payment methods.", timeoutException0);
                return false;
            }
        }
        dxeo dxeo0 = this.e;
        if(dxeo0 != null) {
            hfuo hfuo0 = dxeo0.b;
            if(hfuo0 == null) {
                return false;
            }
            hfuh hfuh0 = new hfuh((hjwe0.b == 0x20 ? ((hjuq)hjwe0.c) : hjuq.b).d, hjuq.a);
            String s = this.d.a;
            switch((hjwe0.b == 0x20 ? ((hjuq)hjwe0.c) : hjuq.b).c) {
                case 0: {
                    v = 2;
                    break;
                }
                case 1: {
                    v = 3;
                    break;
                }
                case 2: {
                    v = 4;
                    break;
                }
                default: {
                    v = 0;
                }
            }
            if(v == 0) {
                v = 1;
            }
            switch(v - 2) {
                case 1: {
                    goto label_34;
                }
                case 2: {
                    goto label_61;
                }
            }
            return false;
        label_34:
            if(s != null) {
                if(s.length() == 0) {
                    return false;
                }
                for(Object object0: hfuo0) {
                    if(!ibuq.m(((dxev)object0).e, s)) {
                        continue;
                    }
                    goto label_43;
                }
                object0 = null;
            label_43:
                if(((dxev)object0) != null) {
                    hkhr hkhr0 = ((dxev)object0).c;
                    if(hkhr0 == null) {
                        hkhr0 = hkhr.b;
                    }
                    if(hkhr0 == null) {
                        return false;
                    }
                    hfuo hfuo1 = hkhr0.n;
                    ibuq.e(hfuo1, "getExistingPaymentMethodActionsList(...)");
                    if((hfuo1 instanceof Collection) && hfuo1.isEmpty()) {
                        return false;
                    }
                    for(Object object1: hfuo1) {
                        hkid hkid0 = hkid.b(((hkhs)object1).c);
                        if(hkid0 == null) {
                            hkid0 = hkid.z;
                        }
                        if(!hfuh0.contains(hkid0)) {
                            continue;
                        }
                        return true;
                    label_61:
                        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
                        for(Object object2: hfuo0) {
                            hkhr hkhr1 = ((dxev)object2).c;
                            if(hkhr1 == null) {
                                hkhr1 = hkhr.b;
                            }
                            arrayList0.add(hkhr1);
                        }
                        for(Object object3: arrayList0) {
                            hfuo hfuo2 = ((hkhr)object3).n;
                            ibuq.e(hfuo2, "getExistingPaymentMethodActionsList(...)");
                            if(!(hfuo2 instanceof Collection) || !hfuo2.isEmpty()) {
                                for(Object object4: hfuo2) {
                                    hkid hkid1 = hkid.b(((hkhs)object4).c);
                                    if(hkid1 == null) {
                                        hkid1 = hkid.z;
                                    }
                                    if(hfuh0.contains(hkid1)) {
                                        return true;
                                    }
                                }
                            }
                        }
                        return false;
                    }
                }
            }
        }
        return false;
    }
}

