import android.accounts.Account;
import android.content.Context;
import android.os.Build.VERSION;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.proximity.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.ToggleEasyUnlockRequestEntity;
import java.util.HashSet;

public final class alaf {
    public static final int a;
    private static final baun b;

    static {
        alaf.b = new baun("ProximityAuth", new String[]{"DeviceSyncRequester"});
    }

    public static final void a(String s, gqus gqus0, boolean z, boolean z1, alhg alhg0, Context context0) {
        String s2;
        aliu aliu0 = new aliu();
        byte[] arr_b = alfp.b(context0);
        if(arr_b == null) {
            alaf.b.m("There was an error retrieving public key.", new Object[0]);
            aliu0.L(1);
            return;
        }
        String s1 = bbmu.b(arr_b);
        if(hpyz.g()) {
            alaf.b.m("Trying to make v1 ToggleEasyUnlockRequest even though v1 is off!", new Object[0]);
            return;
        }
        alaf.b.h("Making v1 ToggleEasyUnlockRequest. Feature: %s Enabled: %s isExclusive: %s", new Object[]{gqus0.name(), Boolean.valueOf(z), Boolean.valueOf(z1)});
        HashSet hashSet0 = new HashSet();
        hashSet0.add(Integer.valueOf(7));
        hashSet0.add(Integer.valueOf(4));
        hashSet0.add(Integer.valueOf(6));
        alhe alhe0 = alaf.c(context0);
        hashSet0.add(Integer.valueOf(3));
        if(gqus0 == gqus.d) {
            s2 = null;
        }
        else {
            s2 = gfrd.e.d(gfrd.c, gqus0.name());
            hashSet0.add(Integer.valueOf(5));
        }
        aliu aliu1 = new aliu();
        try {
            baqr baqr0 = alaf.b(s, context0);
            ToggleEasyUnlockRequestEntity toggleEasyUnlockRequestEntity0 = new ToggleEasyUnlockRequestEntity(hashSet0, false, ((DeviceClassifierEntity)alhe0), z, s2, z1, s1);
            alhg0.a.o(baqr0, 1, "deviceSync/toggleeasyunlock", toggleEasyUnlockRequestEntity0);
            aliu1.L(0);
        }
        catch(VolleyError volleyError0) {
            alaf.b.n("VolleyError setting feature enabled", volleyError0, new Object[0]);
            aliu1.L(2);
            throw volleyError0;
        }
        catch(acse acse0) {
            alaf.b.n("GoogleAuthException setting feature enabled", acse0, new Object[0]);
            aliu1.L(3);
            throw acse0;
        }
    }

    public static final baqr b(String s, Context context0) {
        Account account0 = new Account(s, "com.google");
        baqr baqr0 = new baqr();
        baqr0.d = "com.google.android.gms";
        baqr0.e = "com.google.android.gms";
        baqr0.a = context0.getApplicationInfo().uid;
        baqr0.c = account0;
        baqr0.b = account0;
        baqr0.l(hpyq.a.b().a());
        return baqr0;
    }

    public static final alhe c(Context context0) {
        HashSet hashSet0 = new HashSet();
        long v = (long)Build.VERSION.SDK_INT;
        hashSet0.add(Integer.valueOf(2));
        hashSet0.add(Integer.valueOf(3));
        hashSet0.add(Integer.valueOf(4));
        hashSet0.add(Integer.valueOf(5));
        return new DeviceClassifierEntity(hashSet0, v, "com.google.android.gms", 0xF1B18ADL, "android");
    }
}

