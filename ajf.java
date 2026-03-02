import com.google.android.gms.appsearch.SearchResult.MatchInfo;
import com.google.android.gms.appsearch.SearchResult;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ajf {
    public static afx a(SearchResult searchResult0) {
        kay.i(searchResult0);
        afa afa0 = aje.a(searchResult0.a());
        afs afs0 = new afs(searchResult0.c, searchResult0.d);
        afs0.e(afa0);
        afs0.g(searchResult0.e);
        if(searchResult0.h == null) {
            List list0 = searchResult0.b;
            searchResult0.h = new ArrayList(list0.size());
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                SearchResult.MatchInfo searchResult$MatchInfo0 = (SearchResult.MatchInfo)list0.get(v1);
                searchResult0.a();
                List list1 = searchResult0.h;
                if(list1 != null) {
                    list1.add(searchResult$MatchInfo0);
                }
            }
            searchResult0.h = DesugarCollections.unmodifiableList(searchResult0.h);
        }
        List list2 = (List)Objects.requireNonNull(searchResult0.h);
        for(int v = 0; v < list2.size(); ++v) {
            SearchResult.MatchInfo searchResult$MatchInfo1 = (SearchResult.MatchInfo)list2.get(v);
            kay.i(searchResult$MatchInfo1);
            aft aft0 = new aft(searchResult$MatchInfo1.a);
            aft0.a = new afv(searchResult$MatchInfo1.a().b, searchResult$MatchInfo1.a().a);
            aft0.c = new afv(searchResult$MatchInfo1.b().b, searchResult$MatchInfo1.b().a);
            aft0.b = new afv(searchResult$MatchInfo1.c().b, searchResult$MatchInfo1.c().a);
            afs0.d(aft0.a());
        }
        for(Object object0: searchResult0.f) {
            afs0.c(ajf.a(((SearchResult)object0)));
        }
        return afs0.a();
    }
}

