import android.accounts.Account;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class dmbi implements dmba {
    private static final bboh a;
    private final Account b;
    private final dmtv c;
    private final ibnn d;

    static {
        dmbi.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmbi(Account account0, dmtv dmtv0) {
        this.b = account0;
        this.c = dmtv0;
        this.d = new ibnz(() -> try {
            return this.c.a(this.b, 1);
        }
        catch(InterruptedException interruptedException0) {
            a.ae(dmbi.a.j(), "Could not get payment methods.", interruptedException0);
            return null;
        }
        catch(ExecutionException executionException0) {
            a.ae(dmbi.a.j(), "Could not get payment methods.", executionException0);
            return null;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(dmbi.a.j(), "Could not get payment methods.", timeoutException0);
            return null;
        });
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        int v;
        ibuq.f(hjrn0, "bullet");
        ibuq.f(hjwe0, "filter");
        if(hjwe0.b != 66) {
            throw new IllegalStateException("Cannot evaluate filter that is not fop issuer filter");
        }
        String s = ((hjti)hjwe0.c).b;
        ibuq.e(s, "getIssuerName(...)");
        if(s.length() <= 0) {
            throw new IllegalStateException("Issuer name cannot be empty");
        }
        hjti hjti0 = hjwe0.b == 66 ? ((hjti)hjwe0.c) : hjti.a;
        ibuq.e(hjti0, "getFopIssuerFilter(...)");
        dxeo dxeo0 = (dxeo)this.d.a();
        if(dxeo0 != null) {
            hfuo hfuo0 = dxeo0.b;
            if(hfuo0 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: hfuo0) {
                    hkhr hkhr0 = ((dxev)object0).c;
                    if(hkhr0 == null) {
                        hkhr0 = hkhr.b;
                    }
                    if((hkhm.b(hkhr0.f) == null ? hkhm.k : hkhm.b(hkhr0.f)) == hkhm.b) {
                        arrayList0.add(object0);
                    }
                }
                if(!arrayList0.isEmpty()) {
                    switch(hjti0.c) {
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
                alab1:
                    switch(v - 2) {
                        case 1: {
                            if(arrayList0.isEmpty()) {
                                return false;
                            }
                            Iterator iterator1 = arrayList0.iterator();
                            while(true) {
                                if(!iterator1.hasNext()) {
                                    break alab1;
                                }
                                Object object1 = iterator1.next();
                                ibuq.c(((dxev)object1));
                                String s1 = hjti0.b;
                                ibuq.e(s1, "getIssuerName(...)");
                                if(!dmbi.c(((dxev)object1), s1)) {
                                    continue;
                                }
                                return true;
                            }
                        }
                        case 2: {
                            if(arrayList0.isEmpty()) {
                                return true;
                            }
                            for(Object object2: arrayList0) {
                                ibuq.c(((dxev)object2));
                                String s2 = hjti0.b;
                                ibuq.e(s2, "getIssuerName(...)");
                                if(!dmbi.c(((dxev)object2), s2)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        default: {
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    // Detected as a lambda impl.
    public static final dxeo b(dmbi dmbi0) {
        try {
            return dmbi0.c.a(dmbi0.b, 1);
        }
        catch(InterruptedException interruptedException0) {
            a.ae(dmbi.a.j(), "Could not get payment methods.", interruptedException0);
            return null;
        }
        catch(ExecutionException executionException0) {
            a.ae(dmbi.a.j(), "Could not get payment methods.", executionException0);
            return null;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(dmbi.a.j(), "Could not get payment methods.", timeoutException0);
            return null;
        }
    }

    private static final boolean c(dxev dxev0, String s) {
        hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
        String s1 = null;
        if(hkhr0 != null) {
            hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
            if(hkhh0 != null) {
                hkgs hkgs0 = hkhh0.h == null ? hkgs.a : hkhh0.h;
                if(hkgs0 != null) {
                    s1 = hkgs0.c;
                }
            }
        }
        if(s1 == null) {
            s1 = "";
        }
        String s2 = s1.toLowerCase(Locale.ROOT);
        ibuq.e(s2, "toLowerCase(...)");
        return ibzk.G(s2, s);
    }
}

