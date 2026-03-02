import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ezcn {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public Set e;
    public int f;
    private static ezcn g;
    private final ezce h;

    private ezcn() {
        ezce ezce0 = ezce.a(AppContextProvider.a());
        super();
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = true;
        this.h = ezce0;
    }

    public static ezcn a() {
        synchronized(ezcn.class) {
            if(ezcn.g == null) {
                ezcn ezcn0 = new ezcn();
                ezcn.g = ezcn0;
                ezcn0.b();
            }
        }
        return ezcn.g;
    }

    public final boolean b() {
        boolean z2;
        this.a = true;
        this.b = true;
        this.c = true;
        this.d = true;
        this.e = new HashSet();
        this.f = 0xF0;
        DevicePolicyManager devicePolicyManager0 = this.h.a;
        boolean z = (devicePolicyManager0.getKeyguardDisabledFeatures(null) & 16) == 16;
        if(z) {
            List list0 = devicePolicyManager0.getTrustAgentConfiguration(null, new ComponentName(AppContextProvider.a(), "com.google.android.gms.auth.trustagent.GoogleTrustAgent"));
            if(list0 == null || list0.isEmpty()) {
                goto label_48;
            }
            for(Object object0: list0) {
                PersistableBundle persistableBundle0 = (PersistableBundle)object0;
                this.a = this.a && ezcn.c("google.trustagent.bluetoothunlock", persistableBundle0);
                this.b = this.b && ezcn.c("google.trustagent.onbodyunlock", persistableBundle0);
                this.c = this.c && ezcn.c("google.trustagent.placesunlock", persistableBundle0);
                if(this.d) {
                    boolean z1 = ezcn.c("google.trustagent.placesunlock", persistableBundle0);
                    if(z1 && persistableBundle0.containsKey("google.trustagent.placesunlock")) {
                        z1 = ((PersistableBundle)persistableBundle0.get("google.trustagent.placesunlock")).getBoolean("custom_places_enabled", true);
                    }
                    if(z1) {
                        z2 = true;
                        goto label_26;
                    }
                }
                z2 = false;
            label_26:
                this.d = z2;
                if(persistableBundle0.containsKey("google.trustagent.idletimeout")) {
                    int v = persistableBundle0.getInt("google.trustagent.idletimeout", 0x7FFFFFFF);
                    int v1 = this.f;
                    if(v >= v1) {
                        v = v1;
                    }
                    this.f = v;
                }
            }
            Set set0 = this.e;
            if(this.a) {
                for(Object object1: list0) {
                    int[] arr_v = ((PersistableBundle)((PersistableBundle)object1).get("google.trustagent.bluetoothunlock")).getIntArray("disabled_major_classes");
                    if(arr_v != null) {
                        for(int v2 = 0; v2 < arr_v.length; ++v2) {
                            set0.add(Integer.valueOf(arr_v[v2]));
                        }
                    }
                }
                return z;
            label_48:
                this.a = false;
                this.b = false;
                this.c = false;
                this.d = false;
                return true;
            }
        }
        return z;
    }

    private static final boolean c(String s, PersistableBundle persistableBundle0) {
        return persistableBundle0.containsKey(s) && ((PersistableBundle)persistableBundle0.get(s)).getBoolean("enabled", false);
    }
}

