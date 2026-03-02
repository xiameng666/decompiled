import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public final class ajkc extends cjtm {
    private final azxs a;
    private final Account b;
    private final String c;
    private final int d;
    private final byte[] e;
    private final List f;

    public ajkc(azxs azxs0, String s, Account account0, int v, byte[] arr_b, List list0, azug azug0) {
        super(0x81, "RegisterGroupForDeviceSyncOperation", azug0);
        this.a = azxs0;
        this.b = account0;
        this.c = s;
        this.d = v;
        this.e = arr_b;
        this.f = list0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        boolean z;
        if(hptg.c()) {
            String s = this.b.name;
            Object object0 = new Object();
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.android.gms.auth.cryptauth.datastore.sharedpreferences.RegisteredDeviceSyncProperties", 0);
            int v = s.hashCode();
            synchronized(object0) {
                HashSet hashSet0 = new HashSet(sharedPreferences0.getStringSet(ajfx.b("ALL_KEYS", "ALL_KEY_NAMES", v), ggnj.a));
                hashSet0.add(this.c);
                sharedPreferences0.edit().putStringSet(ajfx.b("ALL_KEYS", "ALL_KEY_NAMES", v), ggog.g(hashSet0)).commit();
            }
            synchronized(object0) {
                SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                HashSet hashSet1 = ggog.g(this.f);
                sharedPreferences$Editor0.putStringSet(ajfx.b("FEATURE", this.c, v), hashSet1).commit();
            }
            String s1 = this.c;
            byte[] arr_b = ajfx.c(s1, sharedPreferences0, v);
            byte[] arr_b1 = this.e;
            if(!Arrays.equals(arr_b1, arr_b)) {
                ajfx.a(s1, object0, sharedPreferences0, v);
            }
            synchronized(object0) {
                sharedPreferences0.edit().putString(ajfx.b("METADATA", s1, v), bbmu.c(arr_b1)).commit();
            }
            Account account0 = this.b;
            ajga ajga0 = ajfz.a(context0, account0, new ajit(context0, 0, 3));
            z = ajgd.a(context0, ajga0).a(account0, this.c, this.d, this.e, this.f, 0, null);
            ajga0.a();
            if(!z) {
                ajgf.a(account0, context0);
            }
        }
        else {
            z = true;
        }
        this.a.a((z ? Status.b : Status.d));
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

