import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.queries.QueryCall.Request;
import com.google.firebase.appindexing.Query;
import com.google.firebase.appindexing.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class bwte extends bwsu {
    private final goqo a;
    private final bwmx b;
    private final bwry c;
    private final bwud d;
    private final Query[] e;

    public bwte(bwmx bwmx0, bwry bwry0, bwud bwud0, goqo goqo0, Query[] arr_query) {
        bwmx0.d();
        bwsx bwsx0 = bwsx.a(bwmx0.b);
        super(bwry0, bwmx0.r, bwsx0, true);
        this.b = bwmx0;
        this.c = bwry0;
        this.d = bwud0;
        this.a = goqo0;
        this.e = arr_query;
    }

    @Override  // bwsu
    protected final Object a() {
        ResultSet[] arr_resultSet1;
        Query[] arr_query1;
        bwte bwte0 = this;
        Query[] arr_query = bwte0.e;
        ResultSet[] arr_resultSet = new ResultSet[arr_query.length];
        int v = 0;
        while(v < arr_query.length) {
            Query query0 = arr_query[v];
            bxgr bxgr0 = new bxgr(glrj.a, 8);
            bxgr0.g();
            HashSet hashSet0 = new HashSet();
            bwmx bwmx0 = bwte0.b;
            bwud bwud0 = bwte0.d;
            bwut bwut0 = bwmx0.f();
            ArrayList arrayList0 = new ArrayList();
            Object object0 = ((bwur)bwut0).p();
            String s = bwte0.c.a;
            synchronized(object0) {
                for(Object object1: ((bwur)bwut0).v(bwud0, null, true, s)) {
                    bwnq bwnq0 = ((bwur)bwut0).c(((bwvl)object1));
                    if(bwnq0 != null && bwsa.i(bwnq0.d)) {
                        arrayList0.add(bwnq0);
                    }
                }
            }
            for(Object object2: arrayList0) {
                hashSet0.add(((bwnq)object2).d);
            }
            HashSet hashSet1 = new HashSet();
            List list0 = query0.a;
            if(list0.isEmpty()) {
                hashSet1.addAll(hashSet0);
                arr_query1 = arr_query;
                arr_resultSet1 = arr_resultSet;
            }
            else {
                HashSet hashSet2 = new HashSet();
                for(Object object3: list0) {
                    String s1 = (String)object3;
                    int v2 = 0;
                    while(v2 < 3) {
                        int v3 = new int[]{1, 2, 3}[v2];
                        String s2 = new bwsa(bwtc.d(bwmx0.b).a(s1), s, v3).c();
                        if(hashSet0.contains(s2)) {
                            hashSet2.add(s2);
                        }
                        ++v2;
                        arr_resultSet = arr_resultSet;
                    }
                    arr_query = arr_query;
                }
                arr_query1 = arr_query;
                arr_resultSet1 = arr_resultSet;
                hashSet1.addAll(hashSet2);
            }
            String[] arr_s = (String[])hashSet1.toArray(new String[hashSet1.size()]);
            if(arr_s.length == 0) {
                throw new bwsy(a.l(s, (list0.isEmpty() ? "" : " for types " + list0), "No index", " is found for package: "), glrs.C);
            }
            QueryCall.Request queryCall$Request0 = new QueryCall.Request();
            queryCall$Request0.a = query0.b;
            queryCall$Request0.b = s;
            queryCall$Request0.c = arr_s;
            queryCall$Request0.e = 10;
            abwe abwe0 = new abwe();
            abwe0.e(new Section("thing_proto"));
            abwe0.c();
            abwe0.b = new STSortSpec(query0.c);
            queryCall$Request0.f = abwe0.a();
            SearchResults searchResults0 = elfe.n(bwmx0, queryCall$Request0, bwud0, bxgr0, bwmx0.r.k());
            if(searchResults0.a()) {
                throw new IllegalStateException(searchResults0.a);
            }
            ggdy ggdy0 = new ggdy();
            abwv abwv0 = new abwv(searchResults0);
            while(abwv0.hasNext()) {
                abwu abwu0 = abwv0.a();
                hlne hlne0 = abwu0.a();
                if(hlne0 == null) {
                    goqs.c(("Dropping document " + abwu0.d() + " from result set: invalid Thing proto"));
                }
                else {
                    ggdy0.i(bwth.a(hlne0));
                }
            }
            arr_resultSet1[v] = new ResultSet(ggdy0.h());
            ++v;
            bwte0 = this;
            arr_query = arr_query1;
            arr_resultSet = arr_resultSet1;
            continue;
        }
        return arr_resultSet;
    }

    @Override  // bwsu
    protected final void b(Status status0, Object object0) {
        this.a.b(status0, ((ResultSet[])object0));
    }
}

