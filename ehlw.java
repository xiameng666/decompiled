import com.google.android.gms.common.Feature;
import com.google.android.gms.core.settings.ControlPage;
import com.google.android.gms.core.settings.ControlPageRequest;
import com.google.android.gms.core.settings.ControlPageResponse;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class ehlw implements ehlp {
    private static final bboh a;
    private final bcxu b;

    static {
        ehlw.a = bboh.b("ServiceControlsProvider", bbcu.dO);
    }

    public ehlw(bcxu bcxu0) {
        this.b = bcxu0;
    }

    public final Object a(hgiq hgiq0, ibrl ibrl0) {
        ExecutionException executionException1;
        CancellationException cancellationException1;
        String s;
        aztb aztb1;
        Object object2;
        ehlv ehlv0;
        if((ibrl0 instanceof ehlv)) {
            ehlv0 = (ehlv)ibrl0;
            int v = ehlv0.c;
            if((v & 0x80000000) == 0) {
                ehlv0 = new ehlv(this, ibrl0);
            }
            else {
                ehlv0.c = v - 0x80000000;
            }
        }
        else {
            ehlv0 = new ehlv(this, ibrl0);
        }
        Object object0 = ehlv0.a;
        Object object1 = ibrx.a;
        switch(ehlv0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    if(hgiq0 == null) {
                        throw new NullPointerException("Null userServiceId");
                    }
                    gftb.b(hgiq0 != hgiq.u, "User Service Id must not be UNRECOGNIZED");
                    ControlPageRequest controlPageRequest0 = new ControlPageRequest(hgiq0.a(), 0);
                    azzc azzc0 = new azzc();
                    azzc0.c = new Feature[]{bcxj.a};
                    azzc0.d = 31401;
                    azzc0.a = new bcyd(((bcyf)this.b), controlPageRequest0);
                    azzd azzd0 = azzc0.a();
                    evql evql0 = ((azts)this.b).iG(azzd0);
                    ehlv0.d = "api call to fetch controls failed";
                    ehlv0.c = 1;
                    object2 = ictn.b(evql0, ehlv0);
                }
                catch(aztb aztb0) {
                    aztb1 = aztb0;
                    s = "api call to fetch controls failed";
                    a.ae(ehlw.a.i(), s, aztb1);
                    return new ehln(s);
                }
                catch(CancellationException cancellationException0) {
                    cancellationException1 = cancellationException0;
                    s = "api call to fetch controls failed";
                    a.ae(ehlw.a.i(), s, cancellationException1);
                    return new ehln(s);
                }
                catch(ExecutionException executionException0) {
                    executionException1 = executionException0;
                    s = "api call to fetch controls failed";
                    a.ae(ehlw.a.i(), s, executionException1);
                    return new ehln(s);
                }
                if(object2 != object1) {
                    object0 = object2;
                    s = "api call to fetch controls failed";
                    goto label_47;
                }
                return object1;
            }
            case 1: {
                try {
                    s = ehlv0.d;
                    ibnx.b(object0);
                label_47:
                    ibuq.e(((ControlPageResponse)object0).a, "getControlPageList(...)");
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object3: ((ControlPageResponse)object0).a) {
                        ibuq.c(((ControlPage)object3));
                        awkv awkv0 = ehlw.b(((ControlPage)object3));
                        if(ibpo.aw(ibpo.az(ibpo.az(ehli.a(hxid.a.b().a()), ehli.a), ibqg.c(new awkv[]{awkv.T, awkv.aZ})), ehli.a(hxid.a.b().b())).contains(awkv0)) {
                            arrayList0.add(object3);
                        }
                    }
                    ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
                    for(Object object4: arrayList0) {
                        ibuq.c(((ControlPage)object4));
                        awkv awkv1 = ehlw.b(((ControlPage)object4));
                        String s1 = ((ControlPage)object4).c;
                        ibuq.e(s1, "getTitle(...)");
                        String s2 = ((ControlPage)object4).f;
                        if(s2 == null) {
                            s2 = "";
                        }
                        ibuq.e(((ControlPage)object4).d, "getIntent(...)");
                        arrayList1.add(new ehlj(awkv1, s1, s2, ((ControlPage)object4).d, ((ControlPage)object4).h));
                    }
                    return new ehlm(arrayList1);
                }
                catch(aztb aztb2) {
                    break;
                }
                catch(CancellationException cancellationException2) {
                    cancellationException1 = cancellationException2;
                    a.ae(ehlw.a.i(), s, cancellationException1);
                    return new ehln(s);
                }
                catch(ExecutionException executionException2) {
                    executionException1 = executionException2;
                    a.ae(ehlw.a.i(), s, executionException1);
                    return new ehln(s);
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        aztb1 = aztb2;
        a.ae(ehlw.a.i(), s, aztb1);
        return new ehln(s);
    }

    private static final awkv b(ControlPage controlPage0) {
        int v = controlPage0.a;
        awkv awkv0 = awkv.b(v);
        if(awkv0 != null) {
            return awkv0;
        }
        throw new IllegalArgumentException("Missing enum id: " + v);
    }
}

