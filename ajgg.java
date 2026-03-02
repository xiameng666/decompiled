import android.accounts.Account;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ajgg {
    private static final baun a;
    private final Context b;
    private final ajfv c;

    static {
        ajgg.a = new baun(new String[]{"DeviceSyncUpdater"}, null);
    }

    public ajgg(Context context0) {
        ajfv ajfv0 = new ajfv(context0);
        super();
        this.b = context0;
        this.c = ajfv0;
    }

    public final boolean a(Account account0, String s, String s1) {
        gged_interceptors gged0;
        Map map0;
        try(ajfu ajfu0 = this.c.a()) {
            map0 = ajfu0.c(s);
        }
        List list0 = (List)map0.get(account0.name);
        if(list0 != null && !list0.isEmpty()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: ((gmju)list0.get(0)).c) {
                arrayList0.add(((gmjt)object0).b);
            }
            gged0 = gged_interceptors.i(arrayList0);
        }
        else {
            gged0 = ggna.a;
        }
        if(gged0.isEmpty()) {
            ajgg.a.m("Tried to initiate sync with no previous features synced", new Object[0]);
            return true;
        }
        Context context0 = this.b;
        ajga ajga0 = ajfz.a(context0, account0, new ajit(context0, 0, 3));
        String s2 = account0.name;
        byte[] arr_b = ajfx.c(s, context0.getSharedPreferences("com.google.android.gms.auth.cryptauth.datastore.sharedpreferences.RegisteredDeviceSyncProperties", 0), s2.hashCode());
        if(arr_b == null) {
            ajgg.a.m("Tried to initiate sync with no previous metadata synced", new Object[0]);
            return true;
        }
        boolean z = ajgd.a(context0, ajga0).a(account0, s, 10, arr_b, gged0, 0, s1);
        ajga0.a();
        if(!z) {
            ajgf.a(account0, context0);
        }
        return z;
    }
}

