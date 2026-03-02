import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import java.util.HashMap;

public final class egyc {
    public final frli a;
    public static final int b;
    private static final HashMap c;

    static {
        egyc.c = new HashMap();
    }

    public egyc(Account account0) {
        Context context0 = AppContextProvider.a();
        frie frie0 = frif.a();
        frie0.e(((MessageLite)ehiw.a));
        frce frce0 = new frce(context0);
        frce0.d("people");
        frce0.c(account0);
        frce0.j();
        frce0.e("google_contacts_remove_result.pb");
        frie0.f(frce0.a());
        frif frif0 = frie0.a();
        this.a = cjtb.a.a(frif0);
    }

    public static egyc a(Account account0) {
        HashMap hashMap0 = egyc.c;
        if(!hashMap0.containsKey(account0.name)) {
            synchronized(hashMap0) {
                if(!hashMap0.containsKey(account0.name)) {
                    hashMap0.put(account0.name, new egyc(account0));
                }
            }
            return (egyc)hashMap0.get(account0.name);
        }
        return (egyc)hashMap0.get(account0.name);
    }

    public final gmcd b() {
        return glzd.f(this.a.a(), new egyb(), gmap.a);
    }

    public final gmcd c() {
        return glzd.f(this.a.a(), new egxy(), gmap.a);
    }

    public final gmcd d() {
        return glzd.f(this.a.a(), new egxp(), gmap.a);
    }

    public final gmcd e() {
        return glzd.f(this.a.a(), new egxs(), gmap.a);
    }

    public final gmcd f(boolean z) {
        egxr egxr0 = new egxr(z);
        return this.a.b(egxr0, gmap.a);
    }

    public final gmcd g(boolean z) {
        egxt egxt0 = new egxt(z);
        return this.a.b(egxt0, gmap.a);
    }

    public final void h(long v) {
        egxq egxq0 = new egxq(v);
        this.a.b(egxq0, gmap.a);
    }
}

