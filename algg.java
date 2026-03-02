import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatus;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatusChange;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.auth.proximity.FeatureReconcilerGmsTaskBoundService;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class algg extends cjtm {
    public static final int a;
    private static final bboh b;
    private final azxs c;
    private final List d;
    private final Account e;
    private final boolean f;
    private final boolean g;

    static {
        algg.b = alis.a("SetFeatureEnabled");
    }

    public algg(azxs azxs0, List list0, boolean z, String s, boolean z1, azug azug0) {
        super(0x8E, "SetFeatureEnabled", azug0);
        this.c = azxs0;
        this.f = z;
        this.d = list0;
        this.e = new Account(s, "com.google");
        this.g = z1;
    }

    public static boolean b(List list0, String s, Context context0) {
        return algg.d(list0, false, s, context0, false);
    }

    public static boolean c(List list0, String s, Context context0) {
        return algg.d(list0, true, s, context0, false);
    }

    public static boolean d(List list0, boolean z, String s, Context context0, boolean z1) {
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        algf algf0 = new algf(atomicBoolean0);
        context0.getPackageName();
        algg algg0 = new algg(algf0, list0, z, s, z1, null);
        try {
            algg0.f(context0);
            return atomicBoolean0.get();
        }
        catch(cjuh | RemoteException exception0) {
            a.ae(algg.b.j(), "Better Together feature was not enabled.", exception0);
            return false;
        }
    }

    @Override  // cjtm
    public final void f(Context context0) {
        int v;
        aliu aliu0 = new aliu();
        if(!hpyz.f()) {
            batl.l(this.d.size() == 1);
        }
        ArrayList arrayList0 = new ArrayList();
        try {
            for(Object object0: this.d) {
                gqus gqus0 = gqus.b(((String)object0));
                batl.b(gqus0 != gqus.a);
                arrayList0.add(gqus0);
            }
        }
        catch(IllegalArgumentException unused_ex) {
            aliu0.K(3);
            throw new cjuh(101, "Invalid feature name: " + this.d);
        }
        Account account0 = this.e;
        if(bbmn.m(context0, account0)) {
            akws akws0 = akwr.a(context0);
            if(hpyz.f()) {
                boolean z = this.f;
                boolean z1 = this.g;
                aliu aliu1 = new aliu();
                if(bbmn.m(akws0.d, account0)) {
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object1: arrayList0) {
                        gqus gqus1 = (gqus)object1;
                        if(akws0.i(account0, gqus1, z, z1, aliu1)) {
                            arrayList1.add(new DeviceFeatureStatusChange(new DeviceFeatureStatus(gqus1.name(), z), z && alae.a(gqus1.name())));
                        }
                    }
                    if(!arrayList1.isEmpty() && akws0.h(account0, arrayList1, z1, aliu1)) {
                        aliu1.q(0);
                        goto label_63;
                    }
                }
                else {
                    aliu1.q(1);
                }
            }
            else {
                gqus gqus2 = (gqus)arrayList0.get(0);
                boolean z2 = this.f;
                boolean z3 = this.g;
                Context context1 = akws0.d;
                aliu aliu2 = new aliu();
                if(!bbmn.m(context1, account0)) {
                    aliu2.q(1);
                }
                else if(akws0.i(account0, gqus2, z2, z3, aliu2)) {
                    boolean z4 = hpzt.f();
                    boolean z5 = alae.a(gqus2.name());
                    if(hpyz.g()) {
                    label_61:
                        if(akws0.h(account0, ggia.d(new DeviceFeatureStatusChange[]{new DeviceFeatureStatusChange(new DeviceFeatureStatus(gqus2.name(), z2), z2 && alae.a(gqus2.name()))}), z3, aliu2)) {
                            aliu2.q(0);
                            try {
                            label_63:
                                if(hpyz.f()) {
                                    this.c.a(Status.b);
                                }
                                else {
                                    boolean z6 = alae.b(((String)this.d.get(0)));
                                    aliu0.M(z6);
                                    evql evql0 = new akwa(new ajes(context0), new akww(context0), akws0).a(this.e, (z6 ? alem.b : alem.a), (hpyt.f() ? 3 : 1));
                                    evrg.o(evql0, hpyt.b(), TimeUnit.SECONDS);
                                    Status status0 = ((KeyRegistrationResult)evql0.j()).b;
                                    this.c.a(status0);
                                }
                                aliu0.K(0);
                                if(albt.c() && arrayList0.contains(gqus.n)) {
                                    aliu0.C("set_exo_enabled_result", ((int)this.f));
                                }
                                return;
                            }
                            catch(ExecutionException | InterruptedException | TimeoutException | akvz exception1) {
                                if(!(exception1 instanceof ExecutionException)) {
                                    v = 8;
                                }
                                else if((exception1.getCause() instanceof ajet)) {
                                    v = ((ajet)exception1.getCause()).b();
                                    if(ajev.b(v)) {
                                        aliu0.K(9);
                                        this.c.a(Status.b);
                                        return;
                                    }
                                }
                                else {
                                    v = 8;
                                }
                                if((exception1 instanceof ExecutionException)) {
                                    aliu0.K(5);
                                }
                                else if((exception1 instanceof InterruptedException)) {
                                    aliu0.K(6);
                                }
                                else if((exception1 instanceof TimeoutException)) {
                                    aliu0.K(7);
                                }
                                else {
                                    aliu0.K(8);
                                }
                                a.ae(algg.b.j(), "SetFeatureEnabledOperation failed", exception1);
                                throw new cjuh(v, "Failed to enroll for newly enabled/disabled feature");
                            }
                        }
                    }
                    else {
                        try {
                            bbey bbey0 = new bbey(context1, hpyq.a.b().b(), "cryptauth/v1/", false, null, null, 0x6301);
                            batl.s(context1);
                            alhg alhg0 = new alhg(bbey0);
                            alaf.a(account0.name, gqus2, z2, z5, alhg0, context1);
                            z2 = z2;
                            goto label_61;
                        }
                        catch(acse | VolleyError exception0) {
                            if((exception0 instanceof acse)) {
                                aliu2.q(2);
                            }
                            else {
                                aliu2.q(3);
                            }
                            if(z4 && z3) {
                                ((ggtj)akws.a.j()).x("SetFeatureEnabled failure. Scheduling retry");
                                FeatureReconcilerGmsTaskBoundService.d(akws0.d, account0);
                            }
                        }
                    }
                }
            }
            aliu0.K(1);
            this.c.a(Status.b);
            return;
        }
        aliu0.K(4);
        throw new cjuh(102, "Account not found: " + account0.name);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0);
    }
}

