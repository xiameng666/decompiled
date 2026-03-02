import android.util.Log;
import androidx.appsearch.app.AppSearchDocumentClassMap;
import androidx.appsearch.safeparcel.GenericDocumentParcel;
import androidx.appsearch.safeparcel.PropertyParcel;
import j..util.DesugarCollections;
import j..util.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class afa {
    public final GenericDocumentParcel a;
    public static final int b;

    static {
        new aez("", "", "").e();
    }

    public afa(GenericDocumentParcel genericDocumentParcel0) {
        this.a = (GenericDocumentParcel)Objects.requireNonNull(genericDocumentParcel0);
    }

    public final double a(String s) {
        double[] arr_f = (double[])afa.x(s, this.h(s), double[].class);
        if(arr_f != null && arr_f.length != 0) {
            afa.q("Double", s, arr_f.length);
            return arr_f[0];
        }
        return 0.0;
    }

    public final int b() {
        return this.a.f;
    }

    public final long c() {
        return this.a.d;
    }

    public final long d(String s) {
        long[] arr_v = this.s(s);
        if(arr_v != null && arr_v.length != 0) {
            afa.q("Long", s, arr_v.length);
            return arr_v[0];
        }
        return 0L;
    }

    public final long e() {
        return this.a.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof afa) ? this.a.equals(((afa)object0).a) : false;
    }

    public static afa f(Object object0) {
        kay.i(object0);
        aev aev0 = aev.b();
        kay.i(object0);
        return aev0.a(object0.getClass()).b(object0);
    }

    public final afa g(String s) {
        kay.i(s);
        afa[] arr_afa = this.t(s);
        if(arr_afa != null && arr_afa.length != 0) {
            afa.q("Document", s, arr_afa.length);
            return arr_afa[0];
        }
        return null;
    }

    public final Object h(String s) {
        Objects.requireNonNull(s);
        Object object0 = afa.w(new afl(s), 0, this.a.i);
        if((object0 instanceof GenericDocumentParcel)) {
            return new afa[]{new afa(((GenericDocumentParcel)object0))};
        }
        if((object0 instanceof GenericDocumentParcel[])) {
            afa[] arr_afa = new afa[((GenericDocumentParcel[])object0).length];
            for(int v = 0; v < ((GenericDocumentParcel[])object0).length; ++v) {
                GenericDocumentParcel genericDocumentParcel0 = ((GenericDocumentParcel[])object0)[v];
                if(genericDocumentParcel0 == null) {
                    Log.e("AppSearchGenericDocumen", a.s(s, v, "The inner parcel is null at ", ", for path: "));
                }
                else {
                    arr_afa[v] = new afa(genericDocumentParcel0);
                }
            }
            return arr_afa;
        }
        return object0;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Object i(Class class0) {
        return this.j(class0, aew.a);
    }

    public final Object j(Class class0, aew aew0) {
        kay.i(aew0);
        Map map0 = aew0.b;
        aev aev0 = aev.b();
        if(!map0.isEmpty()) {
            Class class1 = AppSearchDocumentClassMap.a(map0, this.m(), class0);
            if(class1 != null) {
                return aev0.a(class1).c(this, aew0);
            }
            List list0 = aew0.c.containsKey(this.m()) ? ((List)aew0.c.get(this.m())) : this.n();
            if(list0 != null) {
                for(int v = 0; v < list0.size(); ++v) {
                    Class class2 = AppSearchDocumentClassMap.a(map0, ((String)list0.get(v)), class0);
                    if(class2 != null) {
                        return aev0.a(class2).c(this, aew0);
                    }
                }
            }
            Log.w("AppSearchGenericDocumen", "Cannot find any compatible target class to deserialize. Perhaps the annotation processor was not run or the generated document class map was proguarded out?\nTry to deserialize to " + class0.getCanonicalName() + " directly.");
        }
        return aev0.a(class0).c(this, aew0);
    }

    public final String k() {
        return this.a.b;
    }

    public final String l() {
        return this.a.a;
    }

    public final String m() {
        return this.a.c;
    }

    @Deprecated
    public final List n() {
        List list0 = this.a.h;
        return list0 == null ? null : DesugarCollections.unmodifiableList(list0);
    }

    public final Set o() {
        return DesugarCollections.unmodifiableSet(this.a.i.keySet());
    }

    final void p(aka aka0) {
        aka0.a("{\n");
        aka0.d();
        aka0.a("namespace: \"");
        aka0.a(this.l());
        aka0.a("\",\n");
        aka0.a("id: \"");
        aka0.a(this.k());
        aka0.a("\",\n");
        aka0.a("score: ");
        aka0.b(Integer.valueOf(this.b()));
        aka0.a(",\n");
        aka0.a("schemaType: \"");
        aka0.a(this.m());
        aka0.a("\",\n");
        List list0 = this.n();
        if(list0 != null) {
            aka0.a("parentTypes: ");
            aka0.b(list0);
            aka0.a("\n");
        }
        aka0.a("creationTimestampMillis: ");
        aka0.b(Long.valueOf(this.c()));
        aka0.a(",\n");
        aka0.a("timeToLiveMillis: ");
        aka0.b(Long.valueOf(this.e()));
        aka0.a(",\n");
        aka0.a("properties: {\n");
        String[] arr_s = (String[])this.o().toArray(new String[0]);
        Arrays.sort(arr_s);
        for(int v = 0; v < arr_s.length; ++v) {
            Object object0 = this.h(arr_s[v]);
            kay.i(object0);
            aka0.d();
            String s = arr_s[v];
            kay.i(s);
            aka0.a("\"");
            aka0.a(s);
            aka0.a("\": [");
            if((object0 instanceof afa[])) {
                for(int v1 = 0; v1 < ((afa[])object0).length; ++v1) {
                    aka0.a("\n");
                    aka0.d();
                    ((afa[])object0)[v1].p(aka0);
                    if(v1 != ((afa[])object0).length - 1) {
                        aka0.a(",");
                    }
                    aka0.a("\n");
                    aka0.c();
                }
            }
            else {
                int v2 = Array.getLength(object0);
                for(int v3 = 0; v3 < v2; ++v3) {
                    Object object1 = Array.get(object0, v3);
                    if((object1 instanceof String)) {
                        aka0.a("\"");
                        aka0.a(((String)object1));
                        aka0.a("\"");
                    }
                    else if((object1 instanceof byte[])) {
                        aka0.a(Arrays.toString(((byte[])object1)));
                    }
                    else if(object1 != null) {
                        aka0.a(object1.toString());
                    }
                    if(v3 != v2 - 1) {
                        aka0.a(", ");
                    }
                }
            }
            aka0.a("]");
            if(v != arr_s.length - 1) {
                aka0.a(",\n");
            }
            aka0.c();
        }
        aka0.a("\n");
        aka0.a("}");
        aka0.c();
        aka0.a("\n");
        aka0.a("}");
    }

    public static void q(String s, String s1, int v) {
        if(v > 1) {
            Log.w("AppSearchGenericDocumen", "The value for \"" + s1 + "\" contains " + v + " elements. Only the first one will be returned from getProperty" + s + "(). Try getProperty" + s + "Array().");
        }
    }

    public final boolean r(String s) {
        boolean[] arr_z = (boolean[])afa.x(s, this.h(s), boolean[].class);
        if(arr_z != null && arr_z.length != 0) {
            afa.q("Boolean", s, arr_z.length);
            return arr_z[0];
        }
        return false;
    }

    public final long[] s(String s) {
        return (long[])afa.x(s, this.h(s), long[].class);
    }

    public final afa[] t(String s) {
        kay.i(s);
        return (afa[])afa.x(s, this.h(s), afa[].class);
    }

    @Override
    public final String toString() {
        aka aka0 = new aka();
        this.p(aka0);
        return aka0.toString();
    }

    public final String[] u(String s) {
        return (String[])afa.x(s, this.h(s), String[].class);
    }

    public final byte[][] v(String s) {
        return (byte[][])afa.x(s, this.h(s), byte[][].class);
    }

    private static Object w(afl afl0, int v, Map map0) {
        Objects.requireNonNull(afl0);
        Objects.requireNonNull(map0);
        while(v < afl0.a()) {
            afk afk0 = afl0.b(v);
            Object[] arr_object = map0.get(afk0.a);
            if(arr_object == null) {
                return null;
            }
            int v1 = afk0.b;
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
                                        aex[] arr_aex = ((PropertyParcel)arr_object).h;
                                        if(arr_aex != null) {
                                            arr_object = v1 < arr_aex.length ? Arrays.copyOfRange(arr_aex, v1, v1 + 1) : null;
                                            goto label_60;
                                        }
                                        java.util.Objects.toString(arr_object);
                                        throw new IllegalStateException("Unsupported value type: " + arr_object.toString());
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
        label_60:
            if(arr_object != null && v != afl0.a() - 1) {
                if((arr_object instanceof GenericDocumentParcel)) {
                    ++v;
                    map0 = ((GenericDocumentParcel)arr_object).i;
                    continue;
                }
                if((arr_object instanceof PropertyParcel)) {
                    GenericDocumentParcel[] arr_genericDocumentParcel1 = ((PropertyParcel)arr_object).g;
                    if(arr_genericDocumentParcel1 == null) {
                        java.util.Objects.toString(afl0);
                        Log.e("AppSearchGenericDocumen", "Failed to apply path to document; no nested value found: " + afl0.toString());
                        return null;
                    }
                    if(arr_genericDocumentParcel1.length == 1) {
                        ++v;
                        map0 = arr_genericDocumentParcel1[0].i;
                        continue;
                    }
                    ArrayList arrayList0 = new ArrayList(arr_genericDocumentParcel1.length);
                    for(int v2 = 0; v2 < arr_genericDocumentParcel1.length; ++v2) {
                        Object object0 = afa.w(afl0, v + 1, arr_genericDocumentParcel1[v2].i);
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
                    if((object1 instanceof GenericDocumentParcel[])) {
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
                    java.util.Objects.toString(object1);
                    throw new IllegalStateException("Unexpected property type: " + object1);
                }
                java.util.Objects.toString(afl0);
                Log.e("AppSearchGenericDocumen", "Failed to apply path to document; no nested value found: " + afl0.toString());
                return null;
            }
            if(arr_object != null && (arr_object instanceof PropertyParcel)) {
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
                aex[] arr_aex1 = ((PropertyParcel)arr_object).h;
                return arr_aex1 == null ? null : arr_aex1;
            }
            return arr_object;
        }
        return null;
    }

    private static Object x(String s, Object object0, Class class0) {
        if(object0 == null) {
            return null;
        }
        try {
            return class0.cast(object0);
        }
        catch(ClassCastException classCastException0) {
            Log.w("AppSearchGenericDocumen", a.a(s, "Error casting to requested type for path \"", "\""), classCastException0);
            return null;
        }
    }
}

