import android.os.Bundle;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class aga extends ajk {
    public final int a;
    final Bundle b;
    public final int c;
    final Bundle d;
    final Bundle e;
    public final String f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final List k;
    private final List l;
    private final List m;
    private final List n;

    public aga(int v, List list0, List list1, Bundle bundle0, List list2, int v1, Bundle bundle1, Bundle bundle2, List list3, List list4, List list5, List list6, List list7) {
        this.a = v;
        kay.i(list0);
        this.l = DesugarCollections.unmodifiableList(list0);
        kay.i(list1);
        this.m = DesugarCollections.unmodifiableList(list1);
        kay.i(bundle0);
        this.b = bundle0;
        kay.i(list2);
        this.n = DesugarCollections.unmodifiableList(list2);
        this.c = v1;
        kay.i(bundle1);
        this.d = bundle1;
        kay.i(bundle2);
        this.e = bundle2;
        this.f = "";
        this.g = DesugarCollections.unmodifiableList(list3);
        this.h = list4 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list4);
        this.i = list5 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list5);
        this.j = list6 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list6);
        this.k = list7 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list7);
    }

    public final List a() {
        return this.m == null ? Collections.EMPTY_LIST : this.m;
    }

    public final List b() {
        return this.n == null ? Collections.EMPTY_LIST : this.n;
    }

    public final List c() {
        return this.l == null ? Collections.EMPTY_LIST : this.l;
    }

    public final Map d() {
        Bundle bundle0 = this.b;
        Set set0 = bundle0.keySet();
        Map map0 = new bxd(set0.size());
        for(Object object0: set0) {
            ArrayList arrayList0 = bundle0.getStringArrayList(((String)object0));
            kay.i(arrayList0);
            map0.put(((String)object0), arrayList0);
        }
        return map0;
    }

    public final Map e() {
        Bundle bundle0 = this.d;
        Set set0 = bundle0.keySet();
        Map map0 = new bxd(set0.size());
        for(Object object0: set0) {
            map0.put(((String)object0), ((List)Objects.requireNonNull(bundle0.getStringArrayList(((String)object0)))));
        }
        return map0;
    }

    public final Map f() {
        Bundle bundle0 = this.e;
        Set set0 = bundle0.keySet();
        Map map0 = new bxd(set0.size());
        for(Object object0: set0) {
            String s = (String)object0;
            Bundle bundle1 = bundle0.getBundle(s);
            if(bundle1 != null) {
                Set set1 = bundle1.keySet();
                bxd bxd0 = new bxd(set1.size());
                for(Object object1: set1) {
                    bxd0.put(((String)object1), Double.valueOf(bundle1.getDouble(((String)object1))));
                }
                map0.put(s, bxd0);
            }
        }
        return map0;
    }

    public final boolean g() {
        return this.g.contains("LIST_FILTER_HAS_PROPERTY_FUNCTION");
    }

    public final boolean h() {
        return this.g.contains("LIST_FILTER_MATCH_SCORE_EXPRESSION_FUNCTION");
    }

    public final boolean i() {
        return this.g.contains("LIST_FILTER_QUERY_LANGUAGE");
    }

    public final boolean j() {
        return this.g.contains("NUMERIC_SEARCH");
    }

    public final boolean k() {
        return this.g.contains("SCHEMA_SCORABLE_PROPERTY_CONFIG");
    }

    public final boolean l() {
        return this.g.contains("VERBATIM_SEARCH");
    }
}

