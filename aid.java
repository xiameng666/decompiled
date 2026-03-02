import android.app.appsearch.SearchSpec.Builder;
import android.app.appsearch.SearchSpec;
import android.content.Context;
import android.os.Build.VERSION;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;

public final class aid {
    public static SearchSpec a(Context context0, aga aga0) {
        SearchSpec.Builder searchSpec$Builder0 = new SearchSpec.Builder();
        String s = aga0.f;
        if(s.isEmpty()) {
            searchSpec$Builder0.setRankingStrategy(0);
        }
        else {
            if(Build.VERSION.SDK_INT < 34) {
                throw new UnsupportedOperationException("SEARCH_SPEC_ADVANCED_RANKING_EXPRESSION is not available on this AppSearch implementation.");
            }
            aib.c(searchSpec$Builder0, s);
        }
        searchSpec$Builder0.setTermMatch(aga0.a).addFilterSchemas(aga0.c()).addFilterNamespaces(aga0.a()).addFilterPackageNames(aga0.b()).setResultCountPerPage(aga0.c).setOrder(0).setSnippetCount(0).setSnippetCountPerProperty(10000).setMaxSnippetSize(0);
        if(Build.VERSION.SDK_INT >= 34 || aii.a(context0) >= 340800000L) {
            for(Object object0: aga0.e().entrySet()) {
                searchSpec$Builder0.addProjection(((String)((Map.Entry)object0).getKey()), ((Collection)((Map.Entry)object0).getValue()));
            }
        }
        if(!aga0.f().isEmpty()) {
            if(Build.VERSION.SDK_INT < 34) {
                throw new UnsupportedOperationException("Property weights are not supported with this backend/Android API level combination.");
            }
            aib.b(searchSpec$Builder0, aga0.f());
        }
        if(!aga0.g.isEmpty()) {
            if(aga0.j() || aga0.l() || aga0.i()) {
                if(Build.VERSION.SDK_INT < 34) {
                    throw new UnsupportedOperationException("Advanced query features (NUMERIC_SEARCH, VERBATIM_SEARCH and LIST_FILTER_QUERY_LANGUAGE) are not supported with this backend/Android API level combination.");
                }
                aib.a(searchSpec$Builder0, aga0);
            }
            if(aga0.g()) {
                if(Build.VERSION.SDK_INT < 35) {
                    throw new UnsupportedOperationException("LIST_FILTER_HAS_PROPERTY_FUNCTION is not available on this AppSearch implementation.");
                }
                aic.b(searchSpec$Builder0, aga0);
            }
            if(aga0.h()) {
                throw new UnsupportedOperationException("LIST_FILTER_MATCH_SCORE_EXPRESSION_FUNCTION is not available on this AppSearch implementation.");
            }
        }
        List list0 = aga0.h;
        if(!list0.isEmpty()) {
            if(!aii.b()) {
                throw new UnsupportedOperationException("SCHEMA_EMBEDDING_PROPERTY_CONFIG is not available on this AppSearch implementation.");
            }
            aia.a(searchSpec$Builder0, list0);
            aia.c(searchSpec$Builder0, 1);
        }
        if(!aga0.j.isEmpty()) {
            throw new UnsupportedOperationException("SEARCH_SPEC_SEARCH_STRING_PARAMETERS is not available on this AppSearch implementation.");
        }
        if(!aga0.d().isEmpty()) {
            if(Build.VERSION.SDK_INT < 35) {
                throw new UnsupportedOperationException("SEARCH_SPEC_ADD_FILTER_PROPERTIES is not available on this AppSearch implementation.");
            }
            aic.a(searchSpec$Builder0, aga0.d());
        }
        List list1 = aga0.i;
        if(!list1.isEmpty()) {
            if(!aii.b()) {
                throw new UnsupportedOperationException("SEARCH_SPEC_ADD_INFORMATIONAL_RANKING_EXPRESSIONS are not available on this AppSearch implementation.");
            }
            aia.b(searchSpec$Builder0, list1);
        }
        if(!aga0.k.isEmpty()) {
            throw new UnsupportedOperationException("SEARCH_SPEC_ADD_FILTER_DOCUMENT_IDS is not available on this AppSearch implementation.");
        }
        if(!aga0.k()) {
            return searchSpec$Builder0.build();
        }
        throw new UnsupportedOperationException("SCHEMA_SCORABLE_PROPERTY_CONFIG is not available on this AppSearch implementation.");
    }
}

