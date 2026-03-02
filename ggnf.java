import j..util.Objects;
import java.util.Arrays;

public final class ggnf extends ggeo {
    public static final ggeo a;
    final transient Object[] c;
    public final transient int d;
    private final transient Object e;
    private static final long serialVersionUID;

    static {
        ggnf.a = new ggnf(null, new Object[0], 0);
    }

    private ggnf(Object object0, Object[] arr_object, int v) {
        this.e = object0;
        this.c = arr_object;
        this.d = v;
    }

    private static Object A(Object[] arr_object, int v, int v1, int v2) {
        int v3 = 0;
        ggej ggej0 = null;
        if(v == 1) {
            ggag.a(Objects.requireNonNull(arr_object[v2]), Objects.requireNonNull(arr_object[v2 ^ 1]));
            return null;
        }
        if(v1 <= 0x80) {
            byte[] arr_b = new byte[v1];
            Arrays.fill(arr_b, -1);
            int v4 = 0;
            while(v3 < v) {
                int v5 = v3 + v3 + v2;
                int v6 = v4 + v4 + v2;
                Object object0 = Objects.requireNonNull(arr_object[v5]);
                Object object1 = Objects.requireNonNull(arr_object[v5 ^ 1]);
                ggag.a(object0, object1);
                for(int v7 = ggdk.a(object0.hashCode()); true; v7 = v8 + 1) {
                    int v8 = v7 & v1 - 1;
                    int v9 = arr_b[v8] & 0xFF;
                    if(v9 == 0xFF) {
                        arr_b[v8] = (byte)v6;
                        if(v4 < v3) {
                            arr_object[v6] = object0;
                            arr_object[v6 ^ 1] = object1;
                        }
                        ++v4;
                        break;
                    }
                    if(object0.equals(arr_object[v9])) {
                        ggej ggej1 = new ggej(object0, object1, Objects.requireNonNull(arr_object[v9 ^ 1]));
                        arr_object[v9 ^ 1] = object1;
                        ggej0 = ggej1;
                        break;
                    }
                }
                ++v3;
            }
            return v4 == v ? arr_b : new Object[]{arr_b, v4, ggej0};
        }
        if(v1 <= 0x8000) {
            short[] arr_v = new short[v1];
            Arrays.fill(arr_v, -1);
            int v10 = 0;
            while(v3 < v) {
                int v11 = v3 + v3 + v2;
                int v12 = v10 + v10 + v2;
                Object object2 = Objects.requireNonNull(arr_object[v11]);
                Object object3 = Objects.requireNonNull(arr_object[v11 ^ 1]);
                ggag.a(object2, object3);
                for(int v13 = ggdk.a(object2.hashCode()); true; v13 = v14 + 1) {
                    int v14 = v13 & v1 - 1;
                    int v15 = (char)arr_v[v14];
                    if(v15 == 0xFFFF) {
                        arr_v[v14] = (short)v12;
                        if(v10 < v3) {
                            arr_object[v12] = object2;
                            arr_object[v12 ^ 1] = object3;
                        }
                        ++v10;
                        break;
                    }
                    if(object2.equals(arr_object[v15])) {
                        ggej ggej2 = new ggej(object2, object3, Objects.requireNonNull(arr_object[v15 ^ 1]));
                        arr_object[v15 ^ 1] = object3;
                        ggej0 = ggej2;
                        break;
                    }
                }
                ++v3;
            }
            return v10 == v ? arr_v : new Object[]{arr_v, v10, ggej0};
        }
        int[] arr_v1 = new int[v1];
        Arrays.fill(arr_v1, -1);
        int v16 = 0;
        while(v3 < v) {
            int v17 = v3 + v3 + v2;
            int v18 = v16 + v16 + v2;
            Object object4 = Objects.requireNonNull(arr_object[v17]);
            Object object5 = Objects.requireNonNull(arr_object[v17 ^ 1]);
            ggag.a(object4, object5);
            for(int v19 = ggdk.a(object4.hashCode()); true; v19 = v20 + 1) {
                int v20 = v19 & v1 - 1;
                int v21 = arr_v1[v20];
                if(v21 == -1) {
                    arr_v1[v20] = v18;
                    if(v16 < v3) {
                        arr_object[v18] = object4;
                        arr_object[v18 ^ 1] = object5;
                    }
                    ++v16;
                    break;
                }
                if(object4.equals(arr_object[v21])) {
                    ggej ggej3 = new ggej(object4, object5, Objects.requireNonNull(arr_object[v21 ^ 1]));
                    arr_object[v21 ^ 1] = object5;
                    ggej0 = ggej3;
                    break;
                }
            }
            ++v3;
        }
        return v16 == v ? arr_v1 : new Object[]{arr_v1, v16, ggej0};
    }

    public static ggnf b(int v, Object[] arr_object) {
        return ggnf.e(v, arr_object, null);
    }

    @Override  // ggeo
    public final boolean c() {
        return false;
    }

    @Override  // ggeo
    public final ggfp d() {
        return new ggnd(this, ((gged_interceptors)new ggne(this.c, 0, this.d)));
    }

    static ggnf e(int v, Object[] arr_object, ggek ggek0) {
        if(v == 0) {
            return (ggnf)ggnf.a;
        }
        if(v == 1) {
            ggag.a(Objects.requireNonNull(arr_object[0]), Objects.requireNonNull(arr_object[1]));
            return new ggnf(null, arr_object, 1);
        }
        gftb.D(v, arr_object.length >> 1);
        Object object0 = ggnf.A(arr_object, v, ggfp.B(v), 0);
        if((object0 instanceof Object[])) {
            ggej ggej0 = (ggej)((Object[])object0)[2];
            if(ggek0 == null) {
                throw ggej0.a();
            }
            ggek0.e = ggej0;
            Object object1 = ((Object[])object0)[0];
            int v1 = (int)(((Integer)((Object[])object0)[1]));
            return new ggnf(object1, Arrays.copyOf(arr_object, v1 + v1), v1);
        }
        return new ggnf(object0, arr_object, v);
    }

    @Override  // ggeo
    public final ggds f() {
        return new ggne(this.c, 1, this.d);
    }

    @Override  // ggeo
    public final Object get(Object object0) {
        Object object1 = ggnf.z(this.e, this.c, this.d, 0, object0);
        return object1 == null ? null : object1;
    }

    @Override  // ggeo
    public final ggfp ou() {
        return new ggnc(this, this.c, 0, this.d);
    }

    @Override
    public final int size() {
        return this.d;
    }

    @Override  // ggeo
    public Object writeReplace() {
        return super.writeReplace();
    }

    static Object y(Object[] arr_object, int v, int v1, int v2) {
        Object object0 = ggnf.A(arr_object, v, v1, v2);
        if(!(object0 instanceof Object[])) {
            return object0;
        }
        throw ((ggej)((Object[])object0)[2]).a();
    }

    static Object z(Object object0, Object[] arr_object, int v, int v1, Object object1) {
        if(object1 != null) {
            if(v == 1) {
                return Objects.requireNonNull(arr_object[v1]).equals(object1) ? Objects.requireNonNull(arr_object[v1 ^ 1]) : null;
            }
            if(object0 == null) {
                return null;
            }
            if((object0 instanceof byte[])) {
                int v2 = ((byte[])object0).length - 1;
                for(int v3 = ggdk.a(object1.hashCode()); true; v3 = v4 + 1) {
                    int v4 = v3 & v2;
                    int v5 = ((byte[])object0)[v4] & 0xFF;
                    if(v5 == 0xFF) {
                        return null;
                    }
                    if(object1.equals(arr_object[v5])) {
                        return arr_object[v5 ^ 1];
                    }
                }
            }
            if((object0 instanceof short[])) {
                int v6 = ((short[])object0).length - 1;
                for(int v7 = ggdk.a(object1.hashCode()); true; v7 = v8 + 1) {
                    int v8 = v7 & v6;
                    int v9 = (char)((short[])object0)[v8];
                    if(v9 == 0xFFFF) {
                        return null;
                    }
                    if(object1.equals(arr_object[v9])) {
                        return arr_object[v9 ^ 1];
                    }
                }
            }
            int v10 = ((int[])object0).length - 1;
            for(int v11 = ggdk.a(object1.hashCode()); true; v11 = v12 + 1) {
                int v12 = v11 & v10;
                int v13 = ((int[])object0)[v12];
                if(v13 == -1) {
                    break;
                }
                if(object1.equals(arr_object[v13])) {
                    return arr_object[v13 ^ 1];
                }
            }
        }
        return null;
    }
}

