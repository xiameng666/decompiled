import android.os.Bundle;
import com.google.android.gms.appsearch.SearchSpec;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class ajg {
    public static SearchSpec a(aga aga0) {
        acil acil0 = new acil();
        String s = aga0.f;
        if(s.isEmpty()) {
            acil0.b();
            acil0.h = 0;
            acil0.i = "";
        }
        else {
            batl.q(s);
            acil0.b();
            acil0.h = 9;
            acil0.i = s;
        }
        acil0.e(aga0.a);
        acil0.c(aga0.c());
        List list0 = aga0.a();
        Objects.requireNonNull(list0);
        acil0.b();
        acil0.a.addAll(list0);
        List list1 = aga0.b();
        Objects.requireNonNull(list1);
        acil0.b();
        acil0.c.addAll(list1);
        batl.o(aga0.c, 0, 10000, "resultCountPerPage");
        acil0.b();
        acil0.f = aga0.c;
        acil0.b();
        acil0.b();
        acil0.b();
        acil0.g = 10000;
        acil0.b();
        for(Object object0: aga0.e().entrySet()) {
            String s1 = (String)((Map.Entry)object0).getKey();
            Collection collection0 = (Collection)((Map.Entry)object0).getValue();
            Objects.requireNonNull(s1);
            Objects.requireNonNull(collection0);
            acil0.b();
            ArrayList arrayList0 = new ArrayList(collection0.size());
            for(Object object1: collection0) {
                Objects.requireNonNull(((String)object1));
                arrayList0.add(((String)object1));
            }
            acil0.d.putStringArrayList(s1, arrayList0);
        }
        if(!aga0.f().isEmpty()) {
            for(Object object2: aga0.f().entrySet()) {
                String s2 = (String)((Map.Entry)object2).getKey();
                Map map0 = (Map)((Map.Entry)object2).getValue();
                Objects.requireNonNull(s2);
                Objects.requireNonNull(map0);
                Bundle bundle0 = new Bundle();
                for(Object object3: map0.entrySet()) {
                    String s3 = (String)Objects.requireNonNull(((String)((Map.Entry)object3).getKey()));
                    Double double0 = (Double)Objects.requireNonNull(((Double)((Map.Entry)object3).getValue()));
                    if(((double)double0) <= 0.0) {
                        throw new IllegalArgumentException("Cannot set non-positive property weight value " + double0 + " for property path: " + s3);
                    }
                    bundle0.putDouble(s3, double0.doubleValue());
                    continue;
                }
                acil0.e.putBundle(s2, bundle0);
            }
        }
        if(!aga0.g.isEmpty()) {
            if(aga0.j()) {
                acil0.d("NUMERIC_SEARCH");
            }
            if(aga0.l()) {
                acil0.d("VERBATIM_SEARCH");
            }
            if(aga0.i()) {
                acil0.d("LIST_FILTER_QUERY_LANGUAGE");
            }
            if(aga0.g()) {
                acil0.d("LIST_FILTER_HAS_PROPERTY_FUNCTION");
            }
            if(aga0.h()) {
                throw new UnsupportedOperationException("LIST_FILTER_MATCH_SCORE_EXPRESSION_FUNCTION is not available on this AppSearch implementation.");
            }
        }
        if(!aga0.h.isEmpty()) {
            throw new UnsupportedOperationException("SCHEMA_EMBEDDING_PROPERTY_CONFIG is not available on this AppSearch implementation.");
        }
        if(!aga0.j.isEmpty()) {
            throw new UnsupportedOperationException("SEARCH_SPEC_SEARCH_STRING_PARAMETERS is not available on this AppSearch implementation.");
        }
        if(!aga0.d().isEmpty()) {
            for(Object object4: aga0.d().entrySet()) {
                String s4 = (String)((Map.Entry)object4).getKey();
                Collection collection1 = (Collection)((Map.Entry)object4).getValue();
                Objects.requireNonNull(s4);
                Objects.requireNonNull(collection1);
                acil0.b();
                ArrayList arrayList1 = new ArrayList(collection1.size());
                for(Object object5: collection1) {
                    Objects.requireNonNull(((String)object5));
                    arrayList1.add(((String)object5));
                }
                acil0.b.putStringArrayList(s4, arrayList1);
            }
        }
        if(!aga0.i.isEmpty()) {
            throw new UnsupportedOperationException("SEARCH_SPEC_ADD_INFORMATIONAL_RANKING_EXPRESSIONS are not available on this AppSearch implementation.");
        }
        if(!aga0.k.isEmpty()) {
            throw new UnsupportedOperationException("SEARCH_SPEC_ADD_FILTER_DOCUMENT_IDS is not available on this AppSearch implementation.");
        }
        if(!aga0.k()) {
            return acil0.a();
        }
        throw new UnsupportedOperationException("SCHEMA_SCORABLE_PROPERTY_CONFIG is not available on this AppSearch implementation.");
    }
}

