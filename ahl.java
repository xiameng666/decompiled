import android.app.appsearch.EmbeddingVector;
import android.app.appsearch.GenericDocument.Builder;
import androidx.appsearch.safeparcel.PropertyParcel;

final class ahl {
    static void a(aez aez0, String s, EmbeddingVector[] arr_embeddingVector) {
        aex[] arr_aex = new aex[arr_embeddingVector.length];
        int v = 0;
        for(int v1 = 0; v1 < arr_embeddingVector.length; ++v1) {
            arr_aex[v1] = new aex(arr_embeddingVector[v1].getValues(), arr_embeddingVector[v1].getModelSignature());
        }
        kay.i(s);
        aez.l(s);
        while(v < arr_embeddingVector.length) {
            if(arr_aex[v] == null) {
                throw new IllegalArgumentException(a.f(v, "The EmbeddingVector at ", " is null."));
            }
            ++v;
            continue;
        }
        aju aju0 = new aju(s);
        aju0.f(arr_aex);
        PropertyParcel propertyParcel0 = aju0.a();
        aez0.a.b(s, propertyParcel0);
    }

    static void b(GenericDocument.Builder genericDocument$Builder0, String s, aex[] arr_aex) {
        EmbeddingVector[] arr_embeddingVector = new EmbeddingVector[arr_aex.length];
        for(int v = 0; v < arr_aex.length; ++v) {
            aex aex0 = arr_aex[v];
            arr_embeddingVector[v] = new EmbeddingVector(aex0.a, aex0.b);
        }
        genericDocument$Builder0.setPropertyEmbedding(s, arr_embeddingVector);
    }
}

