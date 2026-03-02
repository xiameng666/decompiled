import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class ggwh extends AbstractMap {
    public static final Comparator a;
    public final Object[] b;
    public final int[] c;
    public final Set d;
    private Integer e;
    private String f;

    static {
        ggwh.a = new ggwe();
    }

    // This method was un-flattened
    public ggwh(ggwh ggwh0, ggwh ggwh1) {
        Object[] arr_object1;
        Object object2;
        int v10;
        int v9;
        ggwh ggwh2 = this;
        super();
        ggwh2.d = new ggwg(ggwh2, -1);
        ggwh2.e = null;
        ggwh2.f = null;
        int v = ggwh0.size() + ggwh1.size();
        int v1 = ggwh0.b() + ggwh1.b();
        Object[] arr_object = new Object[v1];
        int[] arr_v = new int[v + 1];
        arr_v[0] = v;
        Map.Entry map$Entry0 = ggwh1.c(0);
        int v2 = 0;
        int v3 = 0;
        int v4 = v;
        Map.Entry map$Entry1 = ggwh0.c(0);
        int v5 = 0;
        while(map$Entry1 != null || map$Entry0 != null) {
            if(map$Entry1 != null) {
                if(map$Entry0 == null) {
                    ++v2;
                    v4 = this.a(map$Entry1, v5, v4, arr_object, arr_v);
                    map$Entry1 = ggwh0.c(v2);
                    goto label_68;
                }
                else {
                    int v6 = ((String)map$Entry1.getKey()).compareTo(((String)map$Entry0.getKey()));
                    if(v6 == 0) {
                        arr_object[v5] = ggwh2.d(((String)map$Entry1.getKey()), v5);
                        ggwg ggwg0 = (ggwg)map$Entry1.getValue();
                        ggwg ggwg1 = (ggwg)map$Entry0.getValue();
                        int v7 = 0;
                        int v8 = 0;
                        while(v7 < ggwg0.size() || v8 < ggwg1.size()) {
                            if(v7 == ggwg0.size()) {
                                v9 = 1;
                            }
                            else if(v8 == ggwg1.size()) {
                                v9 = -1;
                            }
                            else {
                                Object object0 = ggwg0.c(v7);
                                Object object1 = ggwg1.c(v8);
                                v9 = ggwj.a.compare(object0, object1);
                            }
                            if(v9 < 0) {
                                v10 = v7 + 1;
                                object2 = ggwg0.c(v7);
                            }
                            else {
                                Object object3 = ggwg1.c(v8);
                                if(v9 == 0) {
                                    ++v7;
                                }
                                ++v8;
                                v10 = v7;
                                object2 = object3;
                            }
                            arr_object[v4] = object2;
                            v7 = v10;
                            ++v4;
                            ggwh2 = this;
                        }
                        arr_v[v5 + 1] = v4;
                        map$Entry1 = ggwh0.c(v2 + 1);
                        map$Entry0 = ggwh1.c(v3 + 1);
                        ++v3;
                        ++v2;
                        ++v5;
                        continue;
                    }
                    else if(v6 < 0) {
                        ++v2;
                        v4 = this.a(map$Entry1, v5, v4, arr_object, arr_v);
                        map$Entry1 = ggwh0.c(v2);
                        goto label_68;
                    }
                }
            }
            ++v3;
            int v11 = this.a(map$Entry0, v5, v4, arr_object, arr_v);
            map$Entry0 = ggwh1.c(v3);
            v4 = v11;
            map$Entry1 = map$Entry1;
        label_68:
            ++v5;
            ggwh2 = this;
        }
        int v12 = arr_v[0];
        int v13 = v12 - v5;
        if(v13 != 0) {
            for(int v14 = 0; v14 <= v5; ++v14) {
                arr_v[v14] -= v13;
            }
            int v15 = arr_v[v5];
            if(ggwh.e(v1, v15)) {
                arr_object1 = new Object[v15];
                System.arraycopy(arr_object, 0, arr_object1, 0, v5);
            }
            else {
                arr_object1 = arr_object;
            }
            System.arraycopy(arr_object, v12, arr_object1, v5, v15 - v5);
            arr_object = arr_object1;
        }
        ggwh2.b = arr_object;
        int v16 = arr_v[0] + 1;
        if(ggwh.e(v + 1, v16)) {
            arr_v = Arrays.copyOf(arr_v, v16);
        }
        ggwh2.c = arr_v;
    }

    public ggwh(List list0) {
        this.d = new ggwg(this, -1);
        this.e = null;
        this.f = null;
        Iterator iterator0 = list0.iterator();
        if(!iterator0.hasNext()) {
            int v = list0.size();
            Object[] arr_object = new Object[v];
            Iterator iterator1 = list0.iterator();
            if(!iterator1.hasNext()) {
                if(ggwh.e(v, 0)) {
                    arr_object = Arrays.copyOf(arr_object, 0);
                }
                this.b = arr_object;
                this.c = new int[]{0};
                return;
            }
            Object object0 = iterator1.next();
            ggwd ggwd0 = (ggwd)object0;
            throw null;
        }
        Object object1 = iterator0.next();
        ggwd ggwd1 = (ggwd)object1;
        throw null;
    }

    private final int a(Map.Entry map$Entry0, int v, int v1, Object[] arr_object, int[] arr_v) {
        ggwg ggwg0 = (ggwg)map$Entry0.getValue();
        int v2 = ggwg0.a() - ggwg0.b();
        int v3 = ggwg0.b();
        System.arraycopy(ggwg0.b.b, v3, arr_object, v1, v2);
        arr_object[v] = this.d(((String)map$Entry0.getKey()), v);
        int v4 = v1 + v2;
        arr_v[v + 1] = v4;
        return v4;
    }

    private final int b() {
        return this.c[this.size()];
    }

    private final Map.Entry c(int v) {
        return v >= this.c[0] ? null : ((Map.Entry)this.b[v]);
    }

    private final Map.Entry d(String s, int v) {
        return new AbstractMap.SimpleImmutableEntry(s, new ggwg(this, v));
    }

    private static boolean e(int v, int v1) {
        return v > 16 && v * 9 > v1 * 10;
    }

    @Override
    public final Set entrySet() {
        return this.d;
    }

    @Override
    public final int hashCode() {
        if(this.e == null) {
            this.e = super.hashCode();
        }
        return (int)this.e;
    }

    @Override
    public final String toString() {
        if(this.f == null) {
            this.f = super.toString();
        }
        return this.f;
    }
}

