import android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig.Builder;
import android.app.appsearch.AppSearchSchema.EmbeddingPropertyConfig;
import android.app.appsearch.AppSearchSchema.PropertyConfig;
import j..util.Objects;

public final class ahq {
    public static AppSearchSchema.PropertyConfig a(aem aem0) {
        ajp ajp0 = aem0.a.j;
        int v = 0;
        AppSearchSchema.EmbeddingPropertyConfig.Builder appSearchSchema$EmbeddingPropertyConfig$Builder0 = new AppSearchSchema.EmbeddingPropertyConfig.Builder(aem0.g()).setCardinality(aem0.d()).setIndexingType((ajp0 == null ? 0 : ajp0.a));
        if(ajp0 != null) {
            v = ajp0.b;
        }
        return (AppSearchSchema.PropertyConfig)appSearchSchema$EmbeddingPropertyConfig$Builder0.setQuantizationType(v).build();
    }

    public static aem b(AppSearchSchema.EmbeddingPropertyConfig appSearchSchema$EmbeddingPropertyConfig0) {
        String s = appSearchSchema$EmbeddingPropertyConfig0.getName();
        kay.i(s);
        int v = appSearchSchema$EmbeddingPropertyConfig0.getCardinality();
        kay.f(v, 1, 3, "cardinality");
        int v1 = appSearchSchema$EmbeddingPropertyConfig0.getIndexingType();
        kay.f(v1, 0, 1, "indexingType");
        int v2 = appSearchSchema$EmbeddingPropertyConfig0.getQuantizationType();
        kay.f(v2, 0, 1, "quantizationType");
        return new aem(new ajt(((String)Objects.requireNonNull(s)), 7, v, null, null, null, null, null, ((String)Objects.requireNonNull("")), new ajp(v1, v2)));
    }
}

