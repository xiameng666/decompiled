import android.app.appsearch.EmbeddingVector;
import android.app.appsearch.GenericDocument.Builder;
import android.app.appsearch.GenericDocument;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.List;

public final class ahm {
    public static GenericDocument a(afa afa0) {
        kay.i(afa0);
        GenericDocument.Builder genericDocument$Builder0 = new GenericDocument.Builder(afa0.l(), afa0.k(), afa0.m());
        genericDocument$Builder0.setScore(afa0.b()).setTtlMillis(afa0.e()).setCreationTimestampMillis(afa0.c());
        for(Object object0: afa0.o()) {
            String s = (String)object0;
            Object object1 = afa0.h(s);
            if((object1 instanceof String[])) {
                genericDocument$Builder0.setPropertyString(s, ((String[])object1));
                continue;
            }
            if((object1 instanceof long[])) {
                genericDocument$Builder0.setPropertyLong(s, ((long[])object1));
                continue;
            }
            if((object1 instanceof double[])) {
                genericDocument$Builder0.setPropertyDouble(s, ((double[])object1));
                continue;
            }
            if((object1 instanceof boolean[])) {
                genericDocument$Builder0.setPropertyBoolean(s, ((boolean[])object1));
                continue;
            }
            if((object1 instanceof byte[][])) {
                if((Build.VERSION.SDK_INT == 0x1F || Build.VERSION.SDK_INT == 0x20) && ((byte[][])object1).length == 0) {
                    continue;
                }
                genericDocument$Builder0.setPropertyBytes(s, ((byte[][])object1));
                continue;
            }
            if((object1 instanceof afa[])) {
                if((Build.VERSION.SDK_INT == 0x1F || Build.VERSION.SDK_INT == 0x20) && ((afa[])object1).length == 0) {
                    continue;
                }
                GenericDocument[] arr_genericDocument = new GenericDocument[((afa[])object1).length];
                for(int v = 0; v < ((afa[])object1).length; ++v) {
                    arr_genericDocument[v] = ahm.a(((afa[])object1)[v]);
                }
                genericDocument$Builder0.setPropertyDocument(s, arr_genericDocument);
                continue;
            }
            if((object1 instanceof aex[])) {
                if(!aii.b()) {
                    throw new UnsupportedOperationException("SCHEMA_EMBEDDING_PROPERTY_CONFIG is not available on this AppSearch implementation.");
                }
                ahl.b(genericDocument$Builder0, s, ((aex[])object1));
                continue;
            }
            if((object1 instanceof ady[])) {
                throw new UnsupportedOperationException("BLOB_STORAGE is not available on this AppSearch implementation.");
            }
            throw new IllegalStateException(String.format("Property \"%s\" has unsupported value type %s", s, object1.getClass().toString()));
        }
        return genericDocument$Builder0.build();
    }

    public static afa b(GenericDocument genericDocument0) {
        kay.i(genericDocument0);
        aez aez0 = new aez(genericDocument0.getNamespace(), genericDocument0.getId(), genericDocument0.getSchemaType());
        aez0.c(genericDocument0.getScore()).d(genericDocument0.getTtlMillis()).g(genericDocument0.getCreationTimestampMillis());
        for(Object object0: genericDocument0.getPropertyNames()) {
            String s = (String)object0;
            Object object1 = genericDocument0.getProperty(s);
            if(s.equals("$$__AppSearch__parentTypes")) {
                if(!(object1 instanceof String[])) {
                    throw new IllegalStateException(String.format("Parents list must be of String[] type, but got %s", object1.getClass().toString()));
                }
                List list0 = Arrays.asList(((String[])object1));
                aez0.a.c(list0);
                continue;
            }
            if((object1 instanceof String[])) {
                aez0.b(s, ((String[])object1));
                continue;
            }
            if((object1 instanceof long[])) {
                aez0.k(s, ((long[])object1));
                continue;
            }
            if((object1 instanceof double[])) {
                aez0.j(s, ((double[])object1));
                continue;
            }
            if((object1 instanceof boolean[])) {
                aez0.h(s, ((boolean[])object1));
                continue;
            }
            if((object1 instanceof byte[][])) {
                aez0.i(s, ((byte[][])object1));
                continue;
            }
            if((object1 instanceof GenericDocument[])) {
                afa[] arr_afa = new afa[((GenericDocument[])object1).length];
                for(int v = 0; v < ((GenericDocument[])object1).length; ++v) {
                    arr_afa[v] = ahm.b(((GenericDocument[])object1)[v]);
                }
                aez0.a(s, arr_afa);
                continue;
            }
            if(!aii.b() || !(object1 instanceof EmbeddingVector[])) {
                throw new IllegalStateException(String.format("Property \"%s\" has unsupported value type %s", s, object1.getClass().toString()));
            }
            ahl.a(aez0, s, ((EmbeddingVector[])object1));
            continue;
        }
        return aez0.e();
    }
}

