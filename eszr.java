import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskChimeraService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eszr {
    public static final bboh a;
    static final AtomicBoolean b;

    static {
        eszr.a = bboh.b("TapAndPay", bbcu.aM);
        eszr.b = new AtomicBoolean(false);
    }

    public static void a(Context context0) {
        cjpa cjpa0 = new eubv(context0).c.c();
        cjpa0.e("force_disable_hp_hce", true);
        cjpd.g(cjpa0);
        eszr.e(context0);
    }

    public static void b(Context context0) {
        try {
            if(esgb.d(context0) && eszr.c(context0)) {
                eszr.g(context0);
                return;
            }
            if(eszr.d(context0)) {
                eszr.f(context0);
                ((ggtj)eszr.a.h()).x("Enabling TapAndPay Services");
                cjpa cjpa0 = new eubv(context0).c.c();
                cjpa0.e("tap_and_pay_enabled", true);
                cjpd.f(cjpa0);
                eszr.g(context0);
                return;
            }
            eszr.e(context0);
        }
        catch(IllegalStateException | eshj exception0) {
            a.ae(eszr.a.j(), "Error initializing Google Pay", exception0);
        }
    }

    public static boolean c(Context context0) {
        return new eubv(context0).s();
    }

    public static boolean d(Context context0) {
        return esgb.d(context0) ? hyoz.i() || etrk.r(context0) : false;
    }

    private static void e(Context context0) {
        ((ggtj)eszr.a.h()).x("Disabling TapAndPay HCE service");
        bbmq.K(new ComponentName(context0, "com.google.android.gms.tapandpay.hce.service.TpHceService"), 2);
    }

    private static void f(Context context0) {
        if(!esgb.c(context0)) {
            ((ggtj)eszr.a.h()).x("Not enabling TapAndPay HCE service; device does not support tapandpay");
            return;
        }
        if(eszr.h(context0)) {
            ((ggtj)eszr.a.h()).x("Not enabling TapAndPay HCE service; service is explicitly disabled");
            return;
        }
        ((ggtj)eszr.a.h()).x("Enabling TapAndPay HCE service");
        bbmq.K(new ComponentName(context0, "com.google.android.gms.tapandpay.hce.service.TpHceService"), 1);
        esyv.a(context0, 2, false);
    }

    private static void g(Context context0) {
        if(eszr.b.compareAndSet(false, true)) {
            ((ggtj)eszr.a.h()).x("Initialize tap and pay services");
            if(eszr.h(context0)) {
                eszr.e(context0);
            }
            else {
                eszr.f(context0);
            }
            Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.tapandpay.androidid.AndroidIdValidationIntentOperation", "com.google.android.gms.tapandpay.androidid.ANDROID_ID_VALIDATION_ACTION");
            batl.s(intent0);
            context0.startService(intent0);
            etvi.a(context0);
            etmo.i();
            esuw.p();
            esfh.b(context0);
            TapAndPayGcmTaskChimeraService.d(context0);
            esyj.a().i(context0, "init gcore");
            etts.a().b("init gcore");
            eswo.c(context0);
            if(bbqa.a()) {
                if(Build.VERSION.SDK_INT < 36) {
                    if(!ao.a) {
                        ao.a();
                    }
                    if(ao.b) {
                        goto label_22;
                    }
                }
                else {
                label_22:
                    if(hysu.c()) {
                        eswc.a().b(context0);
                    }
                }
            }
            ettk.a(context0);
        }
    }

    private static boolean h(Context context0) {
        return cjpd.i(new eubv(context0).c, "force_disable_hp_hce", false);
    }
}

