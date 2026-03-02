import android.os.Bundle;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class afc extends ajk {
    public final String a;
    final List b;
    final Bundle c;
    private Set d;

    public afc(String s, List list0, Bundle bundle0) {
        this.a = (String)Objects.requireNonNull(s);
        this.b = (List)Objects.requireNonNull(list0);
        this.c = (Bundle)Objects.requireNonNull(bundle0);
    }

    public final Map a() {
        Bundle bundle0 = this.c;
        Set set0 = bundle0.keySet();
        Map map0 = new bxd(set0.size());
        for(Object object0: set0) {
            String s = (String)object0;
            ArrayList arrayList0 = bundle0.getStringArrayList(s);
            if(arrayList0 != null) {
                map0.put(s, DesugarCollections.unmodifiableList(arrayList0));
            }
        }
        return map0;
    }

    public final Set b() {
        if(this.d == null) {
            this.d = DesugarCollections.unmodifiableSet(new bxf(this.b));
        }
        return this.d;
    }
}

