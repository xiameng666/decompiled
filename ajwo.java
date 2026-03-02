import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.auth.folsom.ui.GenericChimeraActivity;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public final class ajwo extends cjtm {
    private static final bboh a;
    private final ajtc b;
    private final String c;
    private final String d;
    private final akba e;
    private final int f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    static {
        ajwo.a = akea.b("StartUxFlowOperation");
    }

    public ajwo(ajtc ajtc0, String s, String s1, int v, String s2, String s3, String s4, String s5, azug azug0) {
        super(0xAC, "StartUxFlow", azug0);
        this.b = ajtc0;
        batl.q(s1);
        this.c = s1;
        batl.q(s);
        this.d = s;
        this.f = v;
        this.g = s5;
        this.e = (akba)akba.b.b();
        this.h = s2;
        this.i = s3;
        this.j = s4;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        Intent intent0;
        ggtj ggtj0 = (ggtj)ajwo.a.h();
        String s = this.g;
        ggtj0.B("StartUxFlowOperation: %s", s);
        boolean z = true;
        switch(this.f) {
            case 2: {
                try {
                    akba akba0 = this.e;
                    String s1 = this.c;
                    String s2 = this.d;
                    List list0 = akba0.F(s1, s2) == 3 ? akba0.i(s1, s2) : ggna.a;
                    if(list0.isEmpty()) {
                        akbm akbm0 = new akbm();
                        akbm0.a = new Account(s1, "com.google");
                        akbm0.b(s2);
                        akbm0.b = akbn.e;
                        new akbl(akbm0.a()).s();
                        list0 = akba0.i(s1, s2);
                        if(list0.isEmpty()) {
                            z = false;
                        }
                        else {
                            goto label_23;
                        }
                    }
                    else {
                    label_23:
                        if(list0.size() == 1 && ((ajxe)list0.get(0)).c == 0) {
                            z = false;
                        }
                    }
                }
                catch(IOException | acse | akbi unused_ex) {
                    z = false;
                }
                intent0 = GenericChimeraActivity.k(this.c, this.d, z, this.g);
                break;
            }
            case 4: {
                KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
                boolean z1 = keyguardManager0 != null && keyguardManager0.isDeviceSecure();
                if(akdv.b() && hpvv.a.g().y() && "chromesync".equals(this.d)) {
                    ajvt.c(true);
                }
                Bundle bundle0 = new Bundle();
                bundle0.putString("account_name", this.c);
                bundle0.putString("security_domain", this.d);
                bundle0.putInt("operation", 4);
                bundle0.putBoolean("is_inline_lskf_consent_possible", z1);
                bundle0.putString("utm_source", this.h);
                bundle0.putString("utm_medium", this.i);
                bundle0.putString("utm_campaign", this.j);
                bundle0.putString("session_id", this.g);
                Uri uri0 = Uri.parse(String.format(Locale.US, "intent://com.google.android.gms.auth.folsom.ui.GenericChimeraActivity/%s/%s/%d", this.c, this.d, ((int)4)));
                intent0 = new Intent().setClassName(AppContextProvider.a(), GenericChimeraActivity.n()).setAction("com.google.android.gms.auth.folsom.InitialPasswordEnrollment").putExtras(bundle0).setData(uri0);
                break;
            }
            case 5: {
                ajqo ajqo0 = new ajqo();
                ajqo0.a = this.d;
                ajqo0.e = s;
                ajqp ajqp0 = ajqo0.a();
                new azts(akek.a, ajqp0).jy(this.c);
                intent0 = GenericChimeraActivity.m(this.c, this.d, s);
                break;
            }
            default: {
                Status status0 = new Status(10, "Did not recognize operation type.");
                this.b.a(status0, ApiMetadata.b);
                return;
            }
        }
        Status status1 = new Status(0, "UX flow PendingIntent retrieved.", cjok.a(AppContextProvider.a(), 0, intent0, 0x4C000000));
        this.b.a(status1, ApiMetadata.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.a(status0, ApiMetadata.b);
    }
}

