import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.chimera.android.Activity;
import java.util.Iterator;

public final class ddwg {
    public static final String a(Intent intent0) {
        boolean z2;
        boolean z1;
        boolean z = false;
        if(intent0 == null) {
            z1 = false;
        }
        else {
            Bundle bundle0 = intent0.getExtras();
            z1 = bundle0 == null ? false : bundle0.getBoolean("is_from_onboarding", false);
        }
        if(intent0 == null) {
            z2 = false;
        }
        else {
            Bundle bundle1 = intent0.getExtras();
            z2 = bundle1 == null ? false : bundle1.getBoolean("is_for_send_surface", false);
        }
        if(intent0 != null) {
            z = intent0.hasExtra("direct_share_target_bytes");
        }
        if(z1) {
            return ddwl.a.b;
        }
        if(intent0 != null) {
            ComponentName componentName0 = intent0.getComponent();
            if(componentName0 != null) {
                String s = componentName0.toString();
                if(s != null && ibzk.G(s, "com.google.android.gms.nearby.sharing.main.SettingsMainActivity")) {
                    return ddwj.a.b;
                }
            }
        }
        String s1 = intent0 == null ? null : intent0.getAction();
        if(s1 != null) {
            switch(s1.hashCode()) {
                case 0x8B7BED5E: {
                    if(s1.equals("com.google.android.gms.nearby.SEND_FOLDER")) {
                        return "home/send";
                    }
                    break;
                }
                case 0xBA1165CD: {
                    if(s1.equals("android.intent.action.SEND")) {
                        return "home/send";
                    }
                    return z2 || z ? "home/send" : "home/receive";
                }
                case 0xF46C27E2: {
                    if(s1.equals("android.service.quicksettings.action.QS_TILE_PREFERENCES")) {
                        return ddwj.a.b;
                    }
                    break;
                }
                case -58484670: {
                    if(!s1.equals("android.intent.action.SEND_MULTIPLE")) {
                        return z2 || z ? "home/send" : "home/receive";
                    }
                    return "home/send";
                }
                case 60472633: {
                    if(!s1.equals("com.google.android.gms.settings.SHARING")) {
                        return z2 || z ? "home/send" : "home/receive";
                    }
                    return ddwj.a.b;
                }
                case 1800870513: {
                    if(s1.equals("com.android.settings.action.IA_SETTINGS")) {
                        return ddwj.a.b;
                    }
                    break;
                }
                case 2076150343: {
                    if(s1.equals("com.google.android.gms.SHARE_NEARBY")) {
                        return "home/send";
                    }
                    break;
                }
                default: {
                    return z2 || z ? "home/send" : "home/receive";
                }
            }
        }
        return z2 || z ? "home/send" : "home/receive";
    }

    public static final void b(nry nry0, Activity activity0) {
        Object object0;
        ibuq.f(nry0, "<this>");
        Iterator iterator0 = ibpo.am(nry0.b.f).iterator();
        if(iterator0.hasNext()) {
            iterator0.next();
        }
        Iterator iterator1 = ibxv.b(iterator0).a();
        while(iterator1.hasNext()) {
            object0 = iterator1.next();
            if((((nrl)object0).a instanceof ntd)) {
                continue;
            }
            goto label_10;
        }
        object0 = null;
    label_10:
        if(((nrl)object0) == null) {
            if(activity0 != null) {
                activity0.finishAndRemoveTask();
            }
            return;
        }
        nry0.r();
    }

    public static final void c(nry nry0, goz goz0, int v) {
        nry nry1;
        goz goz1 = goz0.ao(0x32A2166F);
        if((((v & 6) == 0 ? v | 2 : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
            nry1 = nry0;
            goto label_50;
        }
        else {
            goz1.I();
            if((v & 1) != 0 && !goz1.aa()) {
                goz1.G();
                nry1 = nry0;
            }
            else {
                nry1 = nvs.a(new nuc[0], goz1);
            }
            goz1.w();
            Activity activity0 = (Activity)goz1.h(ddyi.a);
            Intent intent0 = activity0 == null ? null : activity0.getIntent();
            goz1.M(5004770);
            boolean z = goz1.X(intent0);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = ddwg.a(intent0);
                goz1.P(object0);
            }
            goz1.x();
            goz1.M(0x6E3C21FE);
            Object object1 = goz1.j();
            Object object2 = gop.a;
            if(object1 == object2) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState0 = new ParcelableSnapshotMutableState(Boolean.valueOf(false), gul.a);
                goz1.P(parcelableSnapshotMutableState0);
                object1 = parcelableSnapshotMutableState0;
            }
            goz1.x();
            goz1.M(-1633490746);
            boolean z1 = goz1.Z(nry1);
            Object object3 = goz1.j();
            if(z1 || object3 == object2) {
                object3 = new ddve(nry1, ((gra)object1));
                goz1.P(object3);
            }
            goz1.x();
            ddyg.b(((ibts)object3), goz1, 0);
            if(hvrc.a.b().C() && !((Boolean)((gra)object1).a()).booleanValue()) {
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new ddvf(nry1, v);
                }
            }
            else {
                goz1.M(-1633490746);
                int v1 = goz1.Z(nry1) | goz1.Z(activity0);
                Object object4 = goz1.j();
                if(v1 != 0 || object4 == object2) {
                    object4 = new ddvg(nry1, activity0);
                    goz1.P(object4);
                }
                goz1.x();
                nww.f(nry1, ((String)object0), null, null, null, null, null, null, ((ibts)object4), goz1, 0, 0, 1020);
            label_50:
                gsb gsb1 = goz1.af();
                if(gsb1 != null) {
                    gsb1.d = new ddvh(nry1, v);
                }
            }
        }
    }
}

