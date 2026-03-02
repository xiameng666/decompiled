import android.accounts.Account;
import com.google.android.gms.pay.GetSeFeatureReadinessStatusRequest;
import com.google.android.gms.pay.GetSeFeatureReadinessStatusResponse;
import com.google.android.gms.pay.PageData;
import com.google.android.gms.pay.SeServiceProvider;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class dlyc implements dmba {
    private static final bboh a;
    private final Account b;
    private final dmtv c;
    private final PageData d;
    private final ibnn e;
    private final azts f;

    static {
        dlyc.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlyc(azts azts0, Account account0, dmtv dmtv0, PageData pageData0) {
        this.f = azts0;
        this.b = account0;
        this.c = dmtv0;
        this.d = pageData0;
        this.e = new ibnz(() -> try {
            return this.c.a(this.b, 1);
        }
        catch(InterruptedException interruptedException0) {
            a.ae(dlyc.a.j(), "Could not get payment methods due to interrupted.", interruptedException0);
            return null;
        }
        catch(ExecutionException executionException0) {
            a.ae(dlyc.a.j(), "Could not get payment methods due to execution exception.", executionException0);
            return null;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(dlyc.a.j(), "Could not get payment methods due to timeout.", timeoutException0);
            return null;
        });
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        int v;
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        if(hwfk.r()) {
            if(hjwe0.b != 77) {
                throw new IllegalArgumentException("Cannot evaluate filter that is not client felica readiness check filter");
            }
            dxeo dxeo0 = (dxeo)this.e.a();
            hkhr hkhr0 = null;
            if(dxeo0 != null) {
                hfuo hfuo0 = dxeo0.b;
                if(hfuo0 != null) {
                    for(Object object0: hfuo0) {
                        if(!ibuq.m(((dxev)object0).e, this.d.a)) {
                            continue;
                        }
                        goto label_15;
                    }
                    object0 = null;
                label_15:
                    if(((dxev)object0) != null) {
                        hkhr0 = ((dxev)object0).c;
                        if(hkhr0 == null) {
                            hkhr0 = hkhr.b;
                        }
                    }
                }
            }
            if(hkhr0 != null) {
                hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
                if(hkhh0 != null) {
                    hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
                    if(hkir0 != null) {
                        hktu hktu0 = hktu.b(hkir0.f) == null ? hktu.D : hktu.b(hkir0.f);
                        if(hktu0 != null) {
                            if(hktu0 == hktu.C) {
                                v = 6;
                                goto label_31;
                            }
                            if(hktu0 == hktu.B) {
                                v = 5;
                            label_31:
                                GetSeFeatureReadinessStatusRequest getSeFeatureReadinessStatusRequest0 = new GetSeFeatureReadinessStatusRequest();
                                SeServiceProvider seServiceProvider0 = new SeServiceProvider();
                                seServiceProvider0.a = v;
                                getSeFeatureReadinessStatusRequest0.c = seServiceProvider0;
                                getSeFeatureReadinessStatusRequest0.a = this.b;
                                getSeFeatureReadinessStatusRequest0.b = 1;
                                try {
                                    if(((GetSeFeatureReadinessStatusResponse)evrg.n(this.f.aL(getSeFeatureReadinessStatusRequest0))).a != 0) {
                                        return true;
                                    }
                                }
                                catch(InterruptedException interruptedException0) {
                                    a.ae(dlyc.a.j(), "Could not get SE feature readiness status.", interruptedException0);
                                }
                                catch(ExecutionException executionException0) {
                                    a.ae(dlyc.a.j(), "Could not get SE feature readiness status.", executionException0);
                                }
                                catch(TimeoutException timeoutException0) {
                                    a.ae(dlyc.a.j(), "Could not get SE feature readiness status.", timeoutException0);
                                }
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    // Detected as a lambda impl.
    public static final dxeo b(dlyc dlyc0) {
        try {
            return dlyc0.c.a(dlyc0.b, 1);
        }
        catch(InterruptedException interruptedException0) {
            a.ae(dlyc.a.j(), "Could not get payment methods due to interrupted.", interruptedException0);
            return null;
        }
        catch(ExecutionException executionException0) {
            a.ae(dlyc.a.j(), "Could not get payment methods due to execution exception.", executionException0);
            return null;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(dlyc.a.j(), "Could not get payment methods due to timeout.", timeoutException0);
            return null;
        }
    }
}

