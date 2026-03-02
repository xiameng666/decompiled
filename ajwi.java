import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.folsom.operation.FolsomNotificationIntentOperation;
import com.google.android.gms.auth.folsom.ui.GenericChimeraActivity;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.List;

public final class ajwi extends cjtm {
    private static final bboh a;
    private final ajtc b;
    private final String c;
    private final String d;
    private final aked e;
    private final akba f;
    private final String g;

    static {
        ajwi.a = akea.b("PromptForLskfConsentOperation");
    }

    public ajwi(ajtc ajtc0, String s, String s1, String s2, azug azug0) {
        super(0xAC, "PromptForLskfConsent", azug0);
        this.b = ajtc0;
        this.c = s1;
        this.d = s;
        this.e = (aked)aked.a.b();
        this.f = (akba)akba.b.b();
        this.g = s2;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        boolean z1;
        try {
            boolean z = ((akeh)akeh.a.b()).b(this.c, this.d, this.g);
            try {
                List list0 = this.f.i(this.c, this.d);
                if(!list0.isEmpty() && ((ajxe)list0.get(0)).c != 0) {
                    if(akdy.c(((ajxe)gggq.p(list0)).d.toByteArray())) {
                        ((ggtj)ajwi.a.h()).x("Only pre-enrollment key is available locally");
                    }
                    z1 = true;
                }
                else {
                    goto label_14;
                }
                goto label_15;
            }
            catch(IOException | acse exception1) {
                a.ae(ajwi.a.j(), "Error during local keys check", exception1);
            }
        }
        catch(acse | IOException exception0) {
            a.ae(ajwi.a.j(), "Error retrieving consent", exception0);
            this.b.a(Status.d, ApiMetadata.b);
            return;
        }
    label_14:
        z1 = false;
    label_15:
        if(z) {
            this.b.a(Status.b, ApiMetadata.b);
            return;
        }
        if(!z1) {
            this.b.a(Status.b, ApiMetadata.b);
            return;
        }
        aked aked0 = this.e;
        String s = this.c;
        String s1 = this.d;
        String s2 = this.g;
        if(!hpvi.a.b().f()) {
            if(!hpvv.j()) {
                aked.b.d("Notifications experiment not enabled.", new Object[0]);
            }
            else if(!aked0.c(s)) {
                aked.b.d("Skipping notification for signed out account.", new Object[0]);
            }
            else if(!akdv.b) {
                aked.b.d("Device can\'t enroll lskf", new Object[0]);
            }
            else if(hpvv.l()) {
                try {
                    long v = System.currentTimeMillis();
                    akba akba0 = (akba)akba.b.b();
                    String s3 = akba0.c.a(s);
                    ajwt ajwt0 = (ajwt)akba.g(akba0.d.a());
                    ajww ajww0 = ajww.a;
                    s3.getClass();
                    ajww ajww1 = (ajww)ajwt0.c.get(s3);
                    if(ajww1 != null) {
                        ajww0 = ajww1;
                    }
                    ajxj ajxj0 = ajxj.a;
                    s1.getClass();
                    ajxj ajxj1 = (ajxj)ajww0.b.get(s1);
                    if(ajxj1 != null) {
                        ajxj0 = ajxj1;
                    }
                    if(v - ajxj0.q <= hpvv.a.g().f()) {
                        goto label_54;
                    }
                    else {
                        goto label_56;
                    }
                    goto label_92;
                }
                catch(acse | IOException unused_ex) {
                    aked.b.d("Error fetching notification last shown time", new Object[0]);
                    goto label_56;
                }
            label_54:
                aked.b.d("Skipping notification - another was recently shown.", new Object[0]);
            }
            else {
            label_56:
                Context context1 = aked0.d;
                bayn bayn0 = bayn.f(context1);
                if(bayn0 == null) {
                    ((ggtj)aked.c.j()).x("Unable to send notification.");
                }
                else {
                    baun baun0 = aked.b;
                    baun0.d("Creating notification channel.", new Object[0]);
                    aked0.a(bayn0);
                    if(hpvv.h() && !aked0.d(bayn0)) {
                        akdz.i(s1, 15, s2);
                    }
                    else {
                        baun0.d("Showing LSKF consent notification.", new Object[0]);
                        PendingIntent pendingIntent0 = cjok.a(context1, 0, GenericChimeraActivity.m(s, s1, s2), 0x4C000000);
                        PendingIntent pendingIntent1 = FolsomNotificationIntentOperation.a(context1, s1, s, 10);
                        int v1 = avyq.a(context1, 0x7F080D3E);
                        juo juo0 = new juo(context1, "folsom");
                        juo0.h(true);
                        juo0.v = "folsom_notification_group";
                        juo0.y = true;
                        juo0.h = pendingIntent0;
                        juo0.s(v1);
                        juo0.p(true);
                        juo0.m = 0;
                        juo0.D("On-device encryption");
                        juo0.k("Use your screen lock as another way to unlock your encrypted data");
                        juk juk0 = new juk();
                        juk0.e("Use your screen lock as another way to unlock your encrypted data");
                        juo0.v(juk0);
                        juo0.l(pendingIntent1);
                        Notification notification0 = juo0.a();
                        bayn0.y(aked.e("lskf_consent", s), 1, evuh.ba, notification0);
                        akdz.i(s1, 2, s2);
                        if(hpvv.l()) {
                            try {
                                akba akba1 = (akba)akba.b.b();
                                String s4 = akba1.c.a(s);
                                akba.g(akba1.d.b(new akah(akba1, s4, s1, System.currentTimeMillis()), gmap.a));
                            }
                            catch(acse | IOException unused_ex) {
                            }
                        }
                    }
                }
            }
        }
    label_92:
        this.b.a(Status.b, ApiMetadata.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, ApiMetadata.b);
    }
}

