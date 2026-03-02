import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.ApplicationInfoFlags;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;
import com.google.android.gms.trustagent.activeunlock.common.data.communication.ConnectionInfo;
import com.google.android.gms.trustagent.activeunlock.common.data.communication.WearConnectionInfo;

public final class eydr {
    private final bboh a;
    private final fcfg b;
    private final PackageManager c;

    public eydr(bboh bboh0, fcfg fcfg0) {
        this.a = bboh0;
        this.b = fcfg0;
        this.c = AppContextProvider.a().getPackageManager();
    }

    public final Object a(ConnectionInfo connectionInfo0, ibrl ibrl0) {
        ApplicationInfo applicationInfo0;
        eydp eydp0;
        if((ibrl0 instanceof eydp)) {
            eydp0 = (eydp)ibrl0;
            int v = eydp0.c;
            if((v & 0x80000000) == 0) {
                eydp0 = new eydp(this, ibrl0);
            }
            else {
                eydp0.c = v - 0x80000000;
            }
        }
        else {
            eydp0 = new eydp(this, ibrl0);
        }
        Object object0 = eydp0.a;
        Object object1 = ibrx.a;
        switch(eydp0.c) {
            case 0: {
                ibnx.b(object0);
                eydp0.c = 1;
                object0 = this.b(connectionInfo0, eydp0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s = (String)object0;
        String s1 = null;
        if(s == null) {
            return null;
        }
        try {
            if(bbqa.c()) {
                PackageManager.ApplicationInfoFlags packageManager$ApplicationInfoFlags0 = PackageManager.ApplicationInfoFlags.of(0L);
                applicationInfo0 = this.c.getApplicationInfo(s, packageManager$ApplicationInfoFlags0);
            }
            else {
                applicationInfo0 = this.c.getApplicationInfo(s, 0);
            }
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            a.ae(this.a.j(), "Unable to get companion application info", packageManager$NameNotFoundException0);
            goto label_36;
        }
        ibuq.c(applicationInfo0);
        String s2 = this.c.getApplicationLabel(applicationInfo0).toString();
        if(!ibzk.D(s2)) {
            s1 = s2;
        }
    label_36:
        Intent intent0 = this.c.getLaunchIntentForPackage(s);
        if(intent0 == null) {
            intent0 = new Intent("android.intent.action.VIEW", Uri.parse(("market://details?id=" + s))).addFlags(0x10000000);
            ibuq.e(intent0, "addFlags(...)");
        }
        return new eydo(s1, intent0);
    }

    public final Object b(ConnectionInfo connectionInfo0, ibrl ibrl0) {
        eydq eydq0;
        if((ibrl0 instanceof eydq)) {
            eydq0 = (eydq)ibrl0;
            int v = eydq0.c;
            if((v & 0x80000000) == 0) {
                eydq0 = new eydq(this, ibrl0);
            }
            else {
                eydq0.c = v - 0x80000000;
            }
        }
        else {
            eydq0 = new eydq(this, ibrl0);
        }
        Object object0 = eydq0.a;
        Object object1 = ibrx.a;
        switch(eydq0.c) {
            case 0: {
                goto label_13;
            }
            case 1: {
                goto label_23;
            }
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        WearConnectionInfo wearConnectionInfo0 = connectionInfo0.a;
        if(wearConnectionInfo0 != null) {
            String s = wearConnectionInfo0.a;
            if(s != null) {
                try {
                    evql evql0 = this.b.e(s);
                    eydq0.c = 1;
                    object0 = ictn.b(evql0, eydq0);
                    if(object0 == object1) {
                        return object1;
                    label_23:
                        ibnx.b(object0);
                    }
                    CharSequence charSequence0 = (CharSequence)object0;
                    if(ibzk.D(charSequence0)) {
                        charSequence0 = null;
                    }
                    return (String)charSequence0;
                }
                catch(aztb aztb0) {
                    a.ae(this.a.j(), "Unable to get companion app package", aztb0);
                }
            }
        }
        return null;
    }
}

