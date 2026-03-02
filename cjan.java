import android.content.ComponentName;
import android.content.Intent;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

public final class cjan {
    public static final Set a;

    static {
        cjan.a = ibqg.c(new ComponentName[]{new ComponentName("com.google.android.gms", "com.google.android.gms.googlesettings.ui.GoogleSettingsActivity"), new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsActivity"), new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsLink"), new ComponentName("com.google.android.gms", "com.google.android.gms.app.settings.GoogleSettingsIALink")});
    }

    public static final String a() {
        UUID uUID0 = UUID.randomUUID();
        ibuq.e(uUID0, "randomUUID(...)");
        String s = uUID0.toString();
        ibuq.e(s, "toString(...)");
        return ibzk.ac(s, 12);
    }

    public static final Object b(Intent intent0, String s, Object object0, ibts ibts0) {
        Object object1 = ibts0.a(Integer.valueOf(intent0.getIntExtra(s, 0)));
        return ibuq.m(object1, object0) ? null : object1;
    }

    public static final boolean c(Intent intent0) {
        ibuq.f(intent0, "<this>");
        Iterator iterator0 = ibpg.T(new String[]{"com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_SOURCE", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_MEDIUM", "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_CAMPAIGN"}).a();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(intent0.hasExtra(((String)object0))) {
                return true;
            }
        }
        return false;
    }

    public static final cmfb d(Intent intent0) {
        ibuq.f(intent0, "<this>");
        if(cjan.c(intent0)) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cmfb.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ibuq.f(intent0, "<this>");
            cmfd cmfd0 = (cmfd)cjan.b(intent0, "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_SOURCE", cmfd.a, cjam.a);
            if(cmfd0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((cmfb)hftp0.b_message).c = cmfd0.f;
                ((cmfb)hftp0.b_message).b |= 1;
            }
            ibuq.f(intent0, "<this>");
            cmfa cmfa0 = (cmfa)cjan.b(intent0, "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_MEDIUM", cmfa.a, cjal.a);
            if(cmfa0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((cmfb)hftp0.b_message).d = cmfa0.e;
                ((cmfb)hftp0.b_message).b |= 2;
            }
            ibuq.f(intent0, "<this>");
            cmey cmey0 = (cmey)cjan.b(intent0, "com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_UTM_CAMPAIGN", cmey.a, cjaj.a);
            if(cmey0 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((cmfb)hftp0.b_message).e = cmey0.c;
                ((cmfb)hftp0.b_message).b |= 4;
            }
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            return (cmfb)hftv0;
        }
        return null;
    }
}

