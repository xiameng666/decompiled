import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import dagger.internal.Preconditions;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class ebts {
    public static final bboh a;
    public final donp b;
    public final Context c;
    public easa d;
    public String e;
    public gmcg f;
    public fhwb g;
    public fich h;
    public azts i;
    private static final Set j;
    private final dyfv k;
    private dycl l;

    static {
        ebts.a = bboh.b("Pay", bbcu.cZ);
        ebts.j = ibqg.c(new String[]{"com.google.android.gms.pay.sidecar", "com.felicanetworks.mfc", "com.felicanetworks.mfm.main"});
    }

    public ebts(dyfv dyfv0, donp donp0, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(context0, "context");
        super();
        this.k = dyfv0;
        this.b = donp0;
        this.c = context0;
    }

    public final gmcg a() {
        gmcg gmcg0 = this.f;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("highSpeedExecutor");
        return null;
    }

    public final void b() {
        Context context0 = this.c;
        dyfv dyfv0 = this.k;
        String s = eccr.b(context0, dyfv0.d);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new ebkx(domv0).inject(this);
        fich fich0 = this.h;
        azts azts0 = null;
        if(fich0 == null) {
            ibuq.j("sloManager");
            fich0 = null;
        }
        ficj ficj0 = fich0.a(2L, TimeUnit.MINUTES);
        fhwb fhwb0 = this.g;
        if(fhwb0 == null) {
            ibuq.j("semanticLogger");
            fhwb0 = null;
        }
        fhvz fhvz0 = fhwa.a(203499);
        fhvz0.c(fhwp.b(dyfv0.d));
        fhvz0.b(ficj0.a());
        fhwb0.a(fhvz0.a());
        ibuq.c(s);
        String s1 = this.e;
        if(s1 == null) {
            ibuq.j("environment");
            s1 = null;
        }
        dycl dycl0 = new dycl(s, s1);
        this.l = dycl0;
        Object object0 = dycl0.b().get();
        ibuq.e(object0, "get(...)");
        switch(((dymw)object0).b) {
            case 1: 
            case 2: {
                dymv[] arr_dymv = new dymv[2];
                dymv dymv0 = dymv.d;
                arr_dymv[0] = dymv0;
                arr_dymv[1] = dymv.c;
                Set set0 = ibqg.c(arr_dymv);
                dymv dymv1 = dymv.b(((dymw)object0).e);
                if(dymv1 == null) {
                    dymv1 = dymv.f;
                }
                if(set0.contains(dymv1)) {
                    for(Object object1: ebts.j) {
                        String s2 = (String)object1;
                        if(!bbmq.U(context0, s2)) {
                            donp donp0 = this.b;
                            Status status0 = Status.b;
                            ibuq.f(context0, "context");
                            ibuq.f(s2, "packageName");
                            dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
                            dygs dygs0 = dygr.a(((ProtoLiteMessage)dygq.a).v_newBuilder());
                            dygu dygu0 = dygt.a(((ProtoLiteMessage)dygp.a).v_newBuilder());
                            String s3 = context0.getString(0x7F152123, new Object[]{ebtr.b(context0, s2)});  // string:pay_se_error_download_app_generic_title "To continue, download the %1$s app"
                            ibuq.e(s3, "getString(...)");
                            dygu0.e(s3);
                            String s4 = context0.getString(0x7F152122, new Object[]{ebtr.b(context0, s2), "Wallet"});  // string:pay_se_error_download_app_generic_subtitle "%1$s lets e-money cards work 
                                                                                                                       // with %2$s"
                            ibuq.e(s4, "getString(...)");
                            dygu0.c(s4);
                            ibuq.e("Download", "getString(...)");
                            dygu0.b("Download");
                            ibuq.e("Cancel", "getString(...)");
                            dygu0.d("Cancel");
                            dygs0.b(dygu0.a());
                            ibuq.f(s2, "value");
                            ProtoLiteBuilder hftp0 = dygs0.a;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            dygq dygq0 = (dygq)hftp0.b_message;
                            s2.getClass();
                            dygq0.c = 2;
                            dygq0.d = s2;
                            dyga0.b(dygs0.a());
                            donp0.b(status0, dyga0.a().toBytesArray());
                            ficj0.c(1);
                            ficj0.close();
                            return;
                        }
                    }
                    dycl dycl1 = this.l;
                    if(dycl1 == null) {
                        ibuq.j("dataStore");
                        dycl1 = null;
                    }
                    ((glyq)dycl1.c(dymv0)).u();
                    dyfx dyfx0 = dyfw.a(((ProtoLiteMessage)dyfv.a).v_newBuilder());
                    String s5 = dyfv0.d;
                    ibuq.e(s5, "getAccountName(...)");
                    dyfx0.b(s5);
                    dyfx0.e(hfsx.a(((ProtoLiteMessage)hfsw.a).v_newBuilder()).a());
                    dyfv dyfv1 = dyfx0.a();
                    azts azts1 = this.i;
                    if(azts1 == null) {
                        ibuq.j("payClient");
                    }
                    else {
                        azts0 = azts1;
                    }
                    evql evql0 = azts0.ba(dyfv1.toBytesArray());
                    evql0.v(this.a(), (Exception exception0) -> {
                        a.ae(ebts.a.i(), "finishEmoneyCardsSetup failed", exception0);
                        this.d(dymv.c);
                        this.b.x(Status.d);
                        ficj0.c(2);
                        ficj0.close();
                    });
                    evql0.y(this.a(), new ebtq(new ebtp(this, ficj0)));
                    return;
                }
            }
        }
        byte[] arr_b = ebtr.a().toBytesArray();
        this.b.b(Status.b, arr_b);
        ficj0.c(1);
        ficj0.close();
    }

    // Detected as a lambda impl.
    public final void c(Exception exception0, ficj ficj0) {
        a.ae(ebts.a.i(), "finishEmoneyCardsSetup failed", exception0);
        this.d(dymv.c);
        this.b.x(Status.d);
        ficj0.c(2);
        ficj0.close();
    }

    public final void d(dymv dymv0) {
        dycl dycl0 = this.l;
        easa easa0 = null;
        if(dycl0 == null) {
            ibuq.j("dataStore");
            dycl0 = null;
        }
        ((glyq)dycl0.c(dymv0)).u();
        easa easa1 = this.d;
        if(easa1 == null) {
            ibuq.j("listenersManager");
        }
        else {
            easa0 = easa1;
        }
        easa0.a();
    }
}

