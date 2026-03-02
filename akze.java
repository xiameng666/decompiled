import android.util.Base64;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import j..util.Objects;
import java.util.List;
import java.util.Map;

final class akze implements gmbg {
    final akzh a;

    public akze(akzh akzh0) {
        Objects.requireNonNull(akzh0);
        this.a = akzh0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        akzh.a.n("Beacon seeds could be fetched", throwable0, new Object[0]);
        this.a.a(null);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        List list0 = (List)object0;
        if(list0 != null && !list0.isEmpty()) {
            akzh akzh0 = this.a;
            synchronized(akzh0.e) {
                Map map0 = akzh0.f;
                map0.clear();
                for(Object object2: list0) {
                    map0.put(Base64.encodeToString(((SyncedCryptauthDevice)object2).a, 8), ((SyncedCryptauthDevice)object2).a());
                }
                akzh0.h = false;
                akzh0.a(map0);
            }
            return;
        }
        akzh.a.m("No valid beacon seeds could be fetched.", new Object[0]);
        this.a.a(null);
    }
}

