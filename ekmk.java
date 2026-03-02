import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public final class ekmk {
    private final Context a;
    private final Map b;

    public ekmk(Context context0) {
        this.a = context0;
        this.b = new HashMap();
    }

    public final lqd a(String s, String s1, boolean z) {
        Map map0 = this.b;
        Map map1 = (Map)map0.get(s);
        if(map1 != null) {
            lqd lqd0 = (lqd)map1.get(s1);
            if(lqd0 != null) {
                return lqd0;
            }
            ejyv ejyv0 = ejyv.d(this.a);
            ejyn ejyn0 = new ejyn(this.a);
            lqd lqd1 = new ekmj(this.a, ejyv0, ejyn0, z);
            map1.put(s1, lqd1);
            return lqd1;
        }
        ejyv ejyv1 = ejyv.d(this.a);
        ejyn ejyn1 = new ejyn(this.a);
        lqd lqd2 = new ekmj(this.a, ejyv1, ejyn1, z);
        HashMap hashMap0 = new HashMap();
        hashMap0.put(s1, lqd2);
        map0.put(s, hashMap0);
        return lqd2;
    }
}

