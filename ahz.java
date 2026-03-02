import android.app.appsearch.SearchResult.MatchInfo;
import android.app.appsearch.SearchResult;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.List;

public final class ahz {
    public static afx a(SearchResult searchResult0) {
        kay.i(searchResult0);
        afa afa0 = ahm.b(searchResult0.getGenericDocument());
        afs afs0 = new afs(searchResult0.getPackageName(), searchResult0.getDatabaseName());
        afs0.e(afa0);
        afs0.g(searchResult0.getRankingSignal());
        List list0 = searchResult0.getMatchInfos();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            SearchResult.MatchInfo searchResult$MatchInfo0 = (SearchResult.MatchInfo)list0.get(v1);
            kay.i(searchResult$MatchInfo0);
            aft aft0 = new aft(searchResult$MatchInfo0.getPropertyPath());
            aft0.a = new afv(searchResult$MatchInfo0.getExactMatchRange().getStart(), searchResult$MatchInfo0.getExactMatchRange().getEnd());
            aft0.c = new afv(searchResult$MatchInfo0.getSnippetRange().getStart(), searchResult$MatchInfo0.getSnippetRange().getEnd());
            if(Build.VERSION.SDK_INT >= 33) {
                aft0.b = new afv(ahx.b(searchResult$MatchInfo0), ahx.a(searchResult$MatchInfo0));
            }
            afs0.d(aft0.a());
        }
        if(Build.VERSION.SDK_INT >= 34) {
            for(Object object0: ahy.a(searchResult0)) {
                afs0.c(ahz.a(((SearchResult)object0)));
            }
        }
        if(aii.b()) {
            List list1 = ahw.a(searchResult0);
            for(int v = 0; v < list1.size(); ++v) {
                Double double0 = (Double)list1.get(v);
                afs0.b();
                afs0.b.add(double0);
            }
            try {
                afs0.f(ahw.b(searchResult0));
                return afs0.a();
            }
            catch(NoSuchMethodError noSuchMethodError0) {
                Log.e("AppSearchSearchResPlatC", "Failed to set parent type map.", noSuchMethodError0);
                return afs0.a();
            }
        }
        return afs0.a();
    }
}

