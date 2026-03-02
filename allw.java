import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class allw {
    private final Context a;

    public allw(Context context0) {
        this.a = context0;
    }

    public final gged_interceptors a() {
        Context context0 = this.a;
        List list0 = alft.b(context0, false, null);
        if(list0 == null) {
            return ggna.a;
        }
        HashSet hashSet0 = new HashSet();
        for(Object object0: bbmn.h(context0, "com.google.android.gms")) {
            Account account0 = (Account)object0;
            if(akwr.a(context0).d(account0, gqus.j)) {
                hashSet0.add(account0.name);
            }
        }
        ggdy ggdy0 = new ggdy();
        for(Object object1: list0) {
            SyncedCryptauthDevice syncedCryptauthDevice0 = (SyncedCryptauthDevice)object1;
            if(hashSet0.contains(syncedCryptauthDevice0.b)) {
                ggdy0.i(syncedCryptauthDevice0);
            }
        }
        return ggdy0.h();
    }

    public final List b() {
        Context context0 = this.a;
        List list0 = alft.b(context0, false, null);
        if(!hpzm.l()) {
            return list0;
        }
        if(list0 == null) {
            return null;
        }
        HashSet hashSet0 = new HashSet();
        for(Object object0: bbmn.h(context0, "com.google.android.gms")) {
            Account account0 = (Account)object0;
            if(akwr.a(context0).d(account0, gqus.j)) {
                hashSet0.add(account0.name);
            }
        }
        List list1 = new ArrayList();
        for(Object object1: list0) {
            SyncedCryptauthDevice syncedCryptauthDevice0 = (SyncedCryptauthDevice)object1;
            if(hashSet0.contains(syncedCryptauthDevice0.b)) {
                list1.add(syncedCryptauthDevice0);
            }
        }
        return list1;
    }

    public final boolean c() {
        Context context0 = this.a;
        for(Object object0: bbmn.h(context0, "com.google.android.gms")) {
            if(akwr.a(context0).d(((Account)object0), gqus.j)) {
                return true;
            }
        }
        return false;
    }
}

