import android.app.appsearch.EmbeddingVector;
import android.app.appsearch.SearchSpec.Builder;
import java.util.List;

final class aia {
    static void a(SearchSpec.Builder searchSpec$Builder0, List list0) {
        EmbeddingVector[] arr_embeddingVector = new EmbeddingVector[list0.size()];
        for(int v = 0; v < list0.size(); ++v) {
            arr_embeddingVector[v] = new EmbeddingVector(((aex)list0.get(v)).a, ((aex)list0.get(v)).b);
        }
        searchSpec$Builder0.addEmbeddingParameters(arr_embeddingVector);
    }

    static void b(SearchSpec.Builder searchSpec$Builder0, List list0) {
        searchSpec$Builder0.addInformationalRankingExpressions(list0);
    }

    static void c(SearchSpec.Builder searchSpec$Builder0, int v) {
        searchSpec$Builder0.setDefaultEmbeddingSearchMetricType(v);
    }
}

