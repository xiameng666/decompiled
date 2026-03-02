import android.util.Log;
import com.google.android.gms.appsearch.EmbeddingVector;
import com.google.android.gms.appsearch.safeparcel.GenericDocumentParcel;
import com.google.android.gms.appsearch.safeparcel.PropertyParcel;
import j..util.DesugarCollections;
import j..util.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class achh {
    public final GenericDocumentParcel a;

    static {
        new achg("", "", "").a();
    }

    public achh(GenericDocumentParcel genericDocumentParcel0) {
        this.a = (GenericDocumentParcel)Objects.requireNonNull(genericDocumentParcel0);
    }

    public final int a() {
        return this.a.f;
    }

    public final long b() {
        return this.a.d;
    }

    public final long c() {
        return this.a.e;
    }

    public final Object d(String s) {
        Objects.requireNonNull(s);
        Object object0 = achh.j(new achz(s), 0, this.a.i);
        if((object0 instanceof GenericDocumentParcel)) {
            return new achh[]{new achh(((GenericDocumentParcel)object0))};
        }
        if((object0 instanceof GenericDocumentParcel[])) {
            achh[] arr_achh = new achh[((GenericDocumentParcel[])object0).length];
            for(int v = 0; v < ((GenericDocumentParcel[])object0).length; ++v) {
                GenericDocumentParcel genericDocumentParcel0 = ((GenericDocumentParcel[])object0)[v];
                if(genericDocumentParcel0 == null) {
                    Log.e("AppSearchGenericDocumen", a.s(s, v, "The inner parcel is null at ", ", for path: "));
                }
                else {
                    arr_achh[v] = new achh(genericDocumentParcel0);
                }
            }
            return arr_achh;
        }
        return object0;
    }

    public final String e() {
        return this.a.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof achh) ? this.a.equals(((achh)object0).a) : false;
    }

    public final String f() {
        return this.a.a;
    }

    public final String g() {
        return this.a.c;
    }

    public final Set h() {
        return DesugarCollections.unmodifiableSet(this.a.i.keySet());
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    final void i(acko acko0) {
        Objects.requireNonNull(acko0);
        acko0.a("{\n");
        acko0.d();
        acko0.a("namespace: \"");
        acko0.a(this.f());
        acko0.a("\",\n");
        acko0.a("id: \"");
        acko0.a(this.e());
        acko0.a("\",\n");
        acko0.a("score: ");
        acko0.b(Integer.valueOf(this.a()));
        acko0.a(",\n");
        acko0.a("schemaType: \"");
        acko0.a(this.g());
        acko0.a("\",\n");
        List list0 = this.a.h;
        List list1 = list0 == null ? null : DesugarCollections.unmodifiableList(list0);
        if(list1 != null) {
            acko0.a("parentTypes: ");
            acko0.b(list1);
            acko0.a("\n");
        }
        acko0.a("creationTimestampMillis: ");
        acko0.b(Long.valueOf(this.b()));
        acko0.a(",\n");
        acko0.a("timeToLiveMillis: ");
        acko0.b(Long.valueOf(this.c()));
        acko0.a(",\n");
        acko0.a("properties: {\n");
        String[] arr_s = (String[])this.h().toArray(new String[0]);
        Arrays.sort(arr_s);
        for(int v = 0; v < arr_s.length; ++v) {
            Object object0 = Objects.requireNonNull(this.d(arr_s[v]));
            acko0.d();
            String s = arr_s[v];
            Objects.requireNonNull(s);
            Objects.requireNonNull(object0);
            Objects.requireNonNull(acko0);
            acko0.a("\"");
            acko0.a(s);
            acko0.a("\": [");
            if((object0 instanceof achh[])) {
                for(int v1 = 0; v1 < ((achh[])object0).length; ++v1) {
                    acko0.a("\n");
                    acko0.d();
                    ((achh[])object0)[v1].i(acko0);
                    if(v1 != ((achh[])object0).length - 1) {
                        acko0.a(",");
                    }
                    acko0.a("\n");
                    acko0.c();
                }
            }
            else {
                int v2 = Array.getLength(object0);
                for(int v3 = 0; v3 < v2; ++v3) {
                    Object object1 = Array.get(object0, v3);
                    if((object1 instanceof String)) {
                        acko0.a("\"");
                        acko0.a(((String)object1));
                        acko0.a("\"");
                    }
                    else if((object1 instanceof byte[])) {
                        acko0.a(Arrays.toString(((byte[])object1)));
                    }
                    else if(object1 != null) {
                        acko0.a(object1.toString());
                    }
                    if(v3 != v2 - 1) {
                        acko0.a(", ");
                    }
                }
            }
            acko0.a("]");
            if(v != arr_s.length - 1) {
                acko0.a(",\n");
            }
            acko0.c();
        }
        acko0.a("\n");
        acko0.a("}");
        acko0.c();
        acko0.a("\n");
        acko0.a("}");
    }

    private static Object j(achz achz0, int v, Map map0) {
        Objects.requireNonNull(achz0);
        Objects.requireNonNull(map0);
        while(v < achz0.a()) {
            achy achy0 = achz0.b(v);
            Object[] arr_object = map0.get(achy0.a);
            if(arr_object == null) {
                return null;
            }
            int v1 = achy0.b;
            if(v1 != -1) {
                String[] arr_s = ((PropertyParcel)arr_object).b;
                if(arr_s == null) {
                    long[] arr_v = ((PropertyParcel)arr_object).c;
                    if(arr_v == null) {
                        double[] arr_f = ((PropertyParcel)arr_object).d;
                        if(arr_f == null) {
                            boolean[] arr_z = ((PropertyParcel)arr_object).e;
                            if(arr_z == null) {
                                byte[][] arr2_b = ((PropertyParcel)arr_object).f;
                                if(arr2_b == null) {
                                    GenericDocumentParcel[] arr_genericDocumentParcel = ((PropertyParcel)arr_object).g;
                                    if(arr_genericDocumentParcel == null) {
                                        EmbeddingVector[] arr_embeddingVector = ((PropertyParcel)arr_object).h;
                                        if(arr_embeddingVector == null) {
                                            throw new IllegalStateException("Unsupported value type: " + arr_object.toString());
                                        }
                                        arr_object = v1 < arr_embeddingVector.length ? Arrays.copyOfRange(arr_embeddingVector, v1, v1 + 1) : null;
                                    }
                                    else if(v1 < arr_genericDocumentParcel.length) {
                                        arr_object = arr_genericDocumentParcel[v1];
                                    }
                                    else {
                                        arr_object = null;
                                    }
                                }
                                else if(v1 < arr2_b.length) {
                                    arr_object = Arrays.copyOfRange(arr2_b, v1, v1 + 1);
                                }
                                else {
                                    arr_object = null;
                                }
                            }
                            else if(v1 < arr_z.length) {
                                arr_object = Arrays.copyOfRange(arr_z, v1, v1 + 1);
                            }
                            else {
                                arr_object = null;
                            }
                        }
                        else if(v1 < arr_f.length) {
                            arr_object = Arrays.copyOfRange(arr_f, v1, v1 + 1);
                        }
                        else {
                            arr_object = null;
                        }
                    }
                    else if(v1 < arr_v.length) {
                        arr_object = Arrays.copyOfRange(arr_v, v1, v1 + 1);
                    }
                    else {
                        arr_object = null;
                    }
                }
                else if(v1 < arr_s.length) {
                    arr_object = Arrays.copyOfRange(arr_s, v1, v1 + 1);
                }
                else {
                    arr_object = null;
                }
            }
            if(arr_object != null && v != achz0.a() - 1) {
                if((arr_object instanceof GenericDocumentParcel)) {
                    ++v;
                    map0 = ((GenericDocumentParcel)arr_object).i;
                    continue;
                }
                if((arr_object instanceof PropertyParcel)) {
                    GenericDocumentParcel[] arr_genericDocumentParcel1 = ((PropertyParcel)arr_object).g;
                    if(arr_genericDocumentParcel1 == null) {
                        Log.e("AppSearchGenericDocumen", "Failed to apply path to document; no nested value found: " + achz0.toString());
                        return null;
                    }
                    if(arr_genericDocumentParcel1.length == 1) {
                        ++v;
                        map0 = arr_genericDocumentParcel1[0].i;
                        continue;
                    }
                    ArrayList arrayList0 = new ArrayList(arr_genericDocumentParcel1.length);
                    for(int v2 = 0; v2 < arr_genericDocumentParcel1.length; ++v2) {
                        Object object0 = achh.j(achz0, v + 1, arr_genericDocumentParcel1[v2].i);
                        if(object0 != null) {
                            arrayList0.add(object0);
                        }
                    }
                    if(arrayList0.isEmpty()) {
                        return null;
                    }
                    Object object1 = arrayList0.get(0);
                    if((object1 instanceof String[])) {
                        int v4 = 0;
                        for(int v3 = 0; v3 < arrayList0.size(); ++v3) {
                            v4 += ((String[])arrayList0.get(v3)).length;
                        }
                        String[] arr_s1 = new String[v4];
                        int v6 = 0;
                        for(int v5 = 0; v5 < arrayList0.size(); ++v5) {
                            String[] arr_s2 = (String[])arrayList0.get(v5);
                            System.arraycopy(arr_s2, 0, arr_s1, v6, arr_s2.length);
                            v6 += arr_s2.length;
                        }
                        return arr_s1;
                    }
                    if((object1 instanceof long[])) {
                        int v8 = 0;
                        for(int v7 = 0; v7 < arrayList0.size(); ++v7) {
                            v8 += ((long[])arrayList0.get(v7)).length;
                        }
                        long[] arr_v1 = new long[v8];
                        int v10 = 0;
                        for(int v9 = 0; v9 < arrayList0.size(); ++v9) {
                            long[] arr_v2 = (long[])arrayList0.get(v9);
                            System.arraycopy(arr_v2, 0, arr_v1, v10, arr_v2.length);
                            v10 += arr_v2.length;
                        }
                        return arr_v1;
                    }
                    if((object1 instanceof double[])) {
                        int v12 = 0;
                        for(int v11 = 0; v11 < arrayList0.size(); ++v11) {
                            v12 += ((double[])arrayList0.get(v11)).length;
                        }
                        double[] arr_f1 = new double[v12];
                        int v14 = 0;
                        for(int v13 = 0; v13 < arrayList0.size(); ++v13) {
                            double[] arr_f2 = (double[])arrayList0.get(v13);
                            System.arraycopy(arr_f2, 0, arr_f1, v14, arr_f2.length);
                            v14 += arr_f2.length;
                        }
                        return arr_f1;
                    }
                    if((object1 instanceof boolean[])) {
                        int v16 = 0;
                        for(int v15 = 0; v15 < arrayList0.size(); ++v15) {
                            v16 += ((boolean[])arrayList0.get(v15)).length;
                        }
                        boolean[] arr_z1 = new boolean[v16];
                        int v18 = 0;
                        for(int v17 = 0; v17 < arrayList0.size(); ++v17) {
                            boolean[] arr_z2 = (boolean[])arrayList0.get(v17);
                            System.arraycopy(arr_z2, 0, arr_z1, v18, arr_z2.length);
                            v18 += arr_z2.length;
                        }
                        return arr_z1;
                    }
                    if((object1 instanceof byte[][])) {
                        int v20 = 0;
                        for(int v19 = 0; v19 < arrayList0.size(); ++v19) {
                            v20 += ((byte[][])arrayList0.get(v19)).length;
                        }
                        byte[][] arr2_b1 = new byte[v20][];
                        int v22 = 0;
                        for(int v21 = 0; v21 < arrayList0.size(); ++v21) {
                            byte[][] arr2_b2 = (byte[][])arrayList0.get(v21);
                            System.arraycopy(arr2_b2, 0, arr2_b1, v22, arr2_b2.length);
                            v22 += arr2_b2.length;
                        }
                        return arr2_b1;
                    }
                    if(!(object1 instanceof GenericDocumentParcel[])) {
                        throw new IllegalStateException("Unexpected property type: " + object1);
                    }
                    int v24 = 0;
                    for(int v23 = 0; v23 < arrayList0.size(); ++v23) {
                        v24 += ((GenericDocumentParcel[])arrayList0.get(v23)).length;
                    }
                    GenericDocumentParcel[] arr_genericDocumentParcel2 = new GenericDocumentParcel[v24];
                    int v26 = 0;
                    for(int v25 = 0; v25 < arrayList0.size(); ++v25) {
                        GenericDocumentParcel[] arr_genericDocumentParcel3 = (GenericDocumentParcel[])arrayList0.get(v25);
                        System.arraycopy(arr_genericDocumentParcel3, 0, arr_genericDocumentParcel2, v26, arr_genericDocumentParcel3.length);
                        v26 += arr_genericDocumentParcel3.length;
                    }
                    return arr_genericDocumentParcel2;
                }
                Log.e("AppSearchGenericDocumen", "Failed to apply path to document; no nested value found: " + achz0.toString());
                return null;
            }
            if((arr_object instanceof PropertyParcel)) {
                String[] arr_s3 = ((PropertyParcel)arr_object).b;
                if(arr_s3 != null) {
                    return arr_s3;
                }
                long[] arr_v3 = ((PropertyParcel)arr_object).c;
                if(arr_v3 != null) {
                    return arr_v3;
                }
                double[] arr_f3 = ((PropertyParcel)arr_object).d;
                if(arr_f3 != null) {
                    return arr_f3;
                }
                boolean[] arr_z3 = ((PropertyParcel)arr_object).e;
                if(arr_z3 != null) {
                    return arr_z3;
                }
                byte[][] arr2_b3 = ((PropertyParcel)arr_object).f;
                if(arr2_b3 != null) {
                    return arr2_b3;
                }
                GenericDocumentParcel[] arr_genericDocumentParcel4 = ((PropertyParcel)arr_object).g;
                if(arr_genericDocumentParcel4 != null) {
                    return arr_genericDocumentParcel4;
                }
                EmbeddingVector[] arr_embeddingVector1 = ((PropertyParcel)arr_object).h;
                return arr_embeddingVector1 == null ? null : arr_embeddingVector1;
            }
            return arr_object;
        }
        return null;
    }

    @Override
    public final String toString() {
        acko acko0 = new acko();
        this.i(acko0);
        return acko0.toString();
    }
}

