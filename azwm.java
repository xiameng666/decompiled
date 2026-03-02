import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class azwm extends azwq {
    final azwr a;
    private final ArrayList c;

    public azwm(azwr azwr0, ArrayList arrayList0) {
        Objects.requireNonNull(azwr0);
        this.a = azwr0;
        super(azwr0);
        this.c = arrayList0;
    }

    @Override  // azwq
    public final void a() {
        Set set0;
        azwr azwr0 = this.a;
        azxa azxa0 = azwr0.a;
        baqv baqv0 = azwr0.j;
        if(baqv0 == null) {
            set0 = Collections.EMPTY_SET;
        }
        else {
            HashSet hashSet0 = new HashSet(baqv0.b);
            Map map0 = baqv0.d;
            for(Object object0: map0.keySet()) {
                azta_api azta0 = (azta_api)object0;
                if(!azxa0.g.containsKey(azta0.c)) {
                    baqu baqu0 = (baqu)map0.get(azta0);
                    hashSet0.addAll(null);
                }
            }
            set0 = hashSet0;
        }
        azww azww0 = azxa0.l;
        azww0.j = set0;
        ArrayList arrayList0 = this.c;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((azsz)arrayList0.get(v1)).z(azwr0.g, azww0.j);
        }
    }
}

