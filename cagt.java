import android.app.PendingIntent;
import android.content.Context;
import android.widget.Toast;
import java.security.GeneralSecurityException;

final class cagt extends ibsl implements ibtw {
    int a;
    final String b;
    final fm c;
    final String d;
    final acp e;
    final Context f;
    final String g;
    final caje h;
    private Object i;

    public cagt(caje caje0, String s, fm fm0, String s1, acp acp0, Context context0, String s2, ibrl ibrl0) {
        this.h = caje0;
        this.b = s;
        this.c = fm0;
        this.d = s1;
        this.e = acp0;
        this.f = context0;
        this.g = s2;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cagt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cagt(this.h, this.b, this.c, this.d, this.e, this.f, this.g, ibrl0);
        ibrl1.i = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            icck icck0 = (icck)this.i;
            try {
                gmcd gmcd0 = this.h.b(this.b);
                this.a = 1;
                if(icpu.c(gmcd0, this) == object1) {
                    return object1;
                }
                object2 = ibom.a;
                goto label_14;
            }
            catch(Throwable throwable0) {
            }
            goto label_13;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                goto label_13;
            }
        }
        object2 = ibom.a;
        goto label_14;
    label_13:
        object2 = ibnx.a(throwable0);
    label_14:
        fm fm0 = this.c;
        String s = this.d;
        if(ibnw.b(object2)) {
            ibom ibom0 = (ibom)object2;
            if(fm0 != null && fm0.h("biometric_auth_dialog") == null) {
                caja.a(s).showNow(fm0, "biometric_auth_dialog");
            }
        }
        acp acp0 = this.e;
        Context context0 = this.f;
        String s1 = this.g;
        Throwable throwable1 = ibnw.a(object2);
        if(throwable1 != null) {
            if((throwable1 instanceof azuh)) {
                PendingIntent pendingIntent0 = ((azuh)throwable1).c();
                ibuq.e(pendingIntent0, "getResolution(...)");
                acp0.b(new acy(pendingIntent0).a());
                return ibom.a;
            }
            if(!(throwable1 instanceof GeneralSecurityException) && !(throwable1 instanceof aztb) && !(throwable1 instanceof UnsupportedOperationException)) {
                throw throwable1;
            }
            Toast.makeText(context0, context0.getString(0x7F1515E4, new Object[]{s1}), 1).show();  // string:intrusiondetection_logs_download_failed_with_unexpected_error "Logs download 
                                                                                                   // failed for %s due to an unexpected error"
        }
        return ibom.a;
    }
}

