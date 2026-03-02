import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import com.google.android.gms.appsearch.safeparcel.PropertyParcel;
import j..util.Objects;

public final class aje {
    public static afa a(achh achh0) {
        kay.i(achh0);
        aez aez0 = new aez(achh0.f(), achh0.e(), achh0.g());
        aez0.c(achh0.a()).d(achh0.c()).g(achh0.b());
        for(Object object0: achh0.h()) {
            String s = (String)object0;
            Object object1 = achh0.d(s);
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
            if(!(object1 instanceof achh[])) {
                throw new IllegalStateException(String.format("Property \"%s\" has unsupported value type %s", s, object1.getClass().toString()));
            }
            afa[] arr_afa = new afa[((achh[])object1).length];
            for(int v = 0; v < ((achh[])object1).length; ++v) {
                arr_afa[v] = aje.a(((achh[])object1)[v]);
            }
            aez0.a(s, arr_afa);
            continue;
        }
        return aez0.e();
    }

    public static achh b(afa afa0) {
        kay.i(afa0);
        achg achg0 = new achg(afa0.l(), afa0.k(), afa0.m());
        int v = afa0.b();
        if(v < 0) {
            throw new IllegalArgumentException("Document score cannot be negative.");
        }
        ackc ackc0 = achg0.a;
        ackc0.f = v;
        achg0.b.a.e = afa0.e();
        achg0.b.b.a.d = afa0.c();
        for(Object object0: afa0.o()) {
            String s = (String)object0;
            Object object1 = afa0.h(s);
            int v1 = 0;
            if(!(object1 instanceof String[])) {
                if((object1 instanceof long[])) {
                    Objects.requireNonNull(s);
                    Objects.requireNonNull(((long[])object1));
                    achg.b(s);
                    ackc0.a(s, new PropertyParcel(((String)Objects.requireNonNull(s)), null, ((long[])Objects.requireNonNull(((long[])object1))), null, null, null, null, null));
                    continue;
                }
                else if((object1 instanceof double[])) {
                    Objects.requireNonNull(s);
                    Objects.requireNonNull(((double[])object1));
                    achg.b(s);
                    ackc0.a(s, new PropertyParcel(((String)Objects.requireNonNull(s)), null, null, ((double[])Objects.requireNonNull(((double[])object1))), null, null, null, null));
                    continue;
                }
                else if((object1 instanceof boolean[])) {
                    Objects.requireNonNull(s);
                    Objects.requireNonNull(((boolean[])object1));
                    achg.b(s);
                    ackc0.a(s, new PropertyParcel(((String)Objects.requireNonNull(s)), null, null, null, ((boolean[])Objects.requireNonNull(((boolean[])object1))), null, null, null));
                    continue;
                }
                else if((object1 instanceof byte[][])) {
                    Objects.requireNonNull(s);
                    Objects.requireNonNull(((byte[][])object1));
                    achg.b(s);
                    while(v1 < ((byte[][])object1).length) {
                        if(((byte[][])object1)[v1] == null) {
                            throw new IllegalArgumentException(a.f(v1, "The byte[] at ", " is null."));
                        }
                        ++v1;
                        continue;
                    }
                    ackc0.a(s, new PropertyParcel(((String)Objects.requireNonNull(s)), null, null, null, null, ((byte[][])Objects.requireNonNull(((byte[][])object1))), null, null));
                    continue;
                }
                else {
                    if((object1 instanceof afa[])) {
                        achh[] arr_achh = new achh[((afa[])object1).length];
                        for(int v2 = 0; v2 < ((afa[])object1).length; ++v2) {
                            arr_achh[v2] = aje.b(((afa[])object1)[v2]);
                        }
                        Objects.requireNonNull(s);
                        Objects.requireNonNull(arr_achh);
                        achg.b(s);
                        GenericDocumentParcel[] arr_genericDocumentParcel = new GenericDocumentParcel[((afa[])object1).length];
                        while(v1 < ((afa[])object1).length) {
                            achh achh0 = arr_achh[v1];
                            if(achh0 == null) {
                                throw new IllegalArgumentException(a.f(v1, "The document at ", " is null."));
                            }
                            arr_genericDocumentParcel[v1] = achh0.a;
                            ++v1;
                            continue;
                        }
                        ackc0.a(s, new PropertyParcel(((String)Objects.requireNonNull(s)), null, null, null, null, null, ((GenericDocumentParcel[])Objects.requireNonNull(arr_genericDocumentParcel)), null));
                        continue;
                    }
                    if((object1 instanceof aex[])) {
                        throw new UnsupportedOperationException("SCHEMA_EMBEDDING_PROPERTY_CONFIG is not available on this AppSearch implementation.");
                    }
                    if((object1 instanceof ady[])) {
                        throw new UnsupportedOperationException("BLOB_STORAGE is not available on this AppSearch implementation.");
                    }
                    throw new IllegalStateException(String.format("Property \"%s\" has unsupported value type %s", s, object1.getClass().toString()));
                }
                break;
            }
            Objects.requireNonNull(s);
            Objects.requireNonNull(((String[])object1));
            achg.b(s);
            while(v1 < ((String[])object1).length) {
                if(((String[])object1)[v1] == null) {
                    throw new IllegalArgumentException(a.f(v1, "The String at ", " is null."));
                }
                ++v1;
                continue;
            }
            ackc0.a(s, new PropertyParcel(((String)Objects.requireNonNull(s)), ((String[])Objects.requireNonNull(((String[])object1))), null, null, null, null, null, null));
        }
        return achg0.a();
    }
}

