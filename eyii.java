import android.app.KeyguardManager;
import android.content.Intent;
import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import com.google.android.gms.trustagent.activeunlock.primary.trustagent.ActiveUnlockTrustAgentChimeraService;
import j..time.Duration;
import java.util.List;

public final class eyii extends ibsl implements ibtw {
    int a;
    final ActiveUnlockTrustAgentChimeraService b;
    final String c;

    public eyii(ActiveUnlockTrustAgentChimeraService activeUnlockTrustAgentChimeraService0, String s, ibrl ibrl0) {
        this.b = activeUnlockTrustAgentChimeraService0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyii)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyii(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        exwr exwr1;
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eyjw eyjw0 = this.b.f();
            this.a = 1;
            object2 = eyjw0.g(this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = object0;
        }
        ActiveUnlockTrustAgentChimeraService activeUnlockTrustAgentChimeraService0 = this.b;
        String s = this.c;
        eyjx eyjx0 = ((eyja)object2).a;
        exwv exwv0 = ((eyja)object2).b;
        String s1 = exwv0 == null ? null : exwv0.b;
        icbr icbr0 = ((eyja)object2).h;
        iccs iccs0 = ((eyja)object2).c;
        exjx exjx0 = ((eyja)object2).d;
        ConnectionInfo connectionInfo0 = exwv0 == null ? null : exwv0.d;
        if(eyjx0 == eyjx.a && s1 != null && icbr0 != null && iccs0 != null) {
            int v1 = activeUnlockTrustAgentChimeraService0.m.b ? 3 : 0;
            ((ggtj)activeUnlockTrustAgentChimeraService0.a().h()).P("grantTrust: device: %s | flags: %s", s1, v1 | 12);
            String s2 = !homm.a.b().c() || exjx0 == null || exjx0.b() == -1 ? "Unlocked by your watch" : activeUnlockTrustAgentChimeraService0.getString(0x7F15348F, new Object[]{activeUnlockTrustAgentChimeraService0.getString(exjx0.b())});  // string:unlocked_by_device_with_ranging_method "Unlocked by watch (%1$s)"
            ibuq.c(s2);
            ibuq.e(Duration.ZERO, "ZERO");
            eyif eyif0 = new eyif(activeUnlockTrustAgentChimeraService0, icbr0, s, iccs0);
            ibuq.f(s2, "message");
            ibuq.f(Duration.ZERO, "duration");
            long v2 = Duration.ZERO.toMillis();
            activeUnlockTrustAgentChimeraService0.n.a.grantTrust(s2, v2, v1 | 12, eyif0);
            icbb.b(activeUnlockTrustAgentChimeraService0.g(), null, null, new eyim(activeUnlockTrustAgentChimeraService0, icbr0, exjx0, connectionInfo0, null), 3);
        }
        else {
            if(connectionInfo0 != null && homm.a.b().a().b.contains(eyjx0.name())) {
                exwr exwr0 = activeUnlockTrustAgentChimeraService0.i;
                if(exwr0 == null) {
                    ibuq.j("notificationRepository");
                    exwr1 = null;
                }
                else {
                    exwr1 = exwr0;
                }
                String s3 = eyjx0.name();
                ibuq.f(s3, "errorTypeName");
                if(homm.c()) {
                    ((ggtj)exwr1.c.h()).x("Sending bugreport notification");
                    Intent intent0 = new Intent("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK").putExtra("EXTRA_DEEPLINK", true).putExtra("EXTRA_ISSUE_TITLE", a.a(s3, "[AU-UWB][BRN] ", " error")).putExtra("EXTRA_COMPONENT_ID", 1426803L).putExtra("EXTRA_HOTLIST_ID_LIST", new long[]{0x535B3CL}).putExtra("EXTRA_BUG_SEVERITY", 4).putExtra("EXTRA_BUG_ASSIGNEE", "active-unlock-bug-triage@google.com");
                    ibuq.e(intent0, "putExtra(...)");
                    List list0 = exwr1.d.getPackageManager().queryIntentActivities(intent0, 0);
                    ibuq.e(list0, "queryIntentActivities(...)");
                    ibuq.e("Watch Unlock encountered an error.", "getString(...)");
                    ibuq.e("Watch unlock encountered an error, please file a cross-device bugreport for the watch.", "getString(...)");
                    exwr.f(exwr1, connectionInfo0.hashCode(), "com.google.android.gms.trustagent.activeunlock.primary.data.enrolleddevice.notification.BUGREPORT_CHANNEL_ID", "Watch Unlock encountered an error.", "Watch unlock encountered an error, please file a cross-device bugreport for the watch.", true, (list0.size() <= 0 ? null : new juf(avyq.a(exwr1.d, 0x7F080C19), "File a bug", exwr1.a(intent0)).a()), exwr1.a(exwr.b), true, 0x80);  // drawable:quantum_gm_ic_security_vd_theme_24
                }
                ((ggtj)activeUnlockTrustAgentChimeraService0.a().h()).B("showBugReportNotification: %s", eyjx0.name());
            }
            if(eyjx0 == eyjx.j || eyjx0 == eyjx.k || eyjx0 == eyjx.ah) {
                eygq eygq0 = activeUnlockTrustAgentChimeraService0.d();
                eygp eygp0 = new eygp(eygq0, exjx0, connectionInfo0, null);
                icbb.b(eygq0.c, null, null, eygp0, 3);
            }
            KeyguardManager keyguardManager0 = (KeyguardManager)activeUnlockTrustAgentChimeraService0.getSystemService(KeyguardManager.class);
            if(keyguardManager0 != null && !keyguardManager0.isDeviceLocked()) {
                activeUnlockTrustAgentChimeraService0.a();
            }
            else {
                switch(eyjx0.ordinal()) {
                    case 8: {
                        ibuq.e("To unlock, first unlock watch", "getString(...)");
                        activeUnlockTrustAgentChimeraService0.n.c("To unlock, first unlock watch");
                        break;
                    }
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 14: 
                    case 15: 
                    case 16: 
                    case 17: 
                    case 18: 
                    case 19: 
                    case 20: 
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: 
                    case 30: 
                    case 0x1F: 
                    case 0x20: 
                    case 33: 
                    case 34: 
                    case 35: 
                    case 36: 
                    case 37: 
                    case 38: 
                    case 39: 
                    case 40: 
                    case 41: 
                    case 42: 
                    case 43: 
                    case 44: 
                    case 45: 
                    case 46: 
                    case 0x2F: 
                    case 0x30: 
                    case 49: 
                    case 50: 
                    case 51: 
                    case 52: 
                    case 53: 
                    case 54: 
                    case 55: 
                    case 56: 
                    case 57: 
                    case 58: {
                        ((ggtj)activeUnlockTrustAgentChimeraService0.a().h()).B("Encountered silent failure %s, finishing silently without unlocking.", eyjx0);
                        break;
                    }
                    case 9: 
                    case 10: 
                    case 59: {
                        ibuq.e("To unlock, move watch closer", "getString(...)");
                        activeUnlockTrustAgentChimeraService0.n.c("To unlock, move watch closer");
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
            }
        }
        eyih eyih0 = activeUnlockTrustAgentChimeraService0.m;
        int v3 = eyih0.a - 1;
        eyih0.a = v3;
        if(v3 == 0) {
            eyih0.b = false;
        }
        return ibom.a;
    }
}

