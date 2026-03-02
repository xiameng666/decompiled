import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fuye {
    public int a;
    public int b;
    public int c;
    public long d;
    public float[][] e;
    public boolean f;
    public final fvur g;
    public final List h;

    public fuye(fvur fvur0) {
        this.h = new ArrayList();
        this.d = -1L;
        this.g = fvur0;
        try {
            gwvm gwvm0 = (gwvm)fvur0.a(((Parser)((ProtoLiteMessage)gwvm.a).jf(7, null)));
            if((gwvm0.b & 4) == 0) {
                this.m();
                return;
            }
            this.d = gwvm0.c;
            this.b = gwvm0.d;
            boolean z = true;
            int v = (gwvm0.d + 1) % 0xF0;
            this.a = v;
            if(v != 0 && !gwvm0.e) {
                z = false;
            }
            this.f = z;
            int v1 = gwvm0.f;
            int v2 = gwvm0.g.size() / v1;
            this.e = new float[0xF0][];
            for(int v3 = 0; true; ++v3) {
                if(v3 >= v2) {
                    if(gwvm0.h.size() > 0) {
                        int v4 = gwvm0.h.size() / 2;
                        for(int v5 = 0; v5 < v4; ++v5) {
                            int v6 = v5 + v5;
                            fvuf fvuf0 = new fvuf(gwvm0.h.a(v6), gwvm0.h.a(v6 + 1));
                            this.h.add(fvuf0);
                        }
                    }
                    this.c = 0;
                    return;
                }
                this.e[v3] = new float[5];
                if(v1 >= 5) {
                    for(int v7 = 0; v7 < v1; ++v7) {
                        float[] arr_f = this.e[v3];
                        arr_f[v7] = gwvm0.g.d(v3 * v1 + v7);
                    }
                }
                else {
                    for(int v8 = 0; v8 < v1; ++v8) {
                        float[] arr_f1 = this.e[v3];
                        arr_f1[v8] = gwvm0.g.d(v3 * v1 + v8);
                    }
                    for(int v9 = v1; v9 < 5; ++v9) {
                        this.e[v3][v9] = -1.0f;
                    }
                }
            }
        }
        catch(IOException unused_ex) {
            this.m();
        }
    }

    public final int a() {
        return this.f ? 0xF0 : this.a + 1;
    }

    public final int b() {
        float[][] arr2_f = this.f();
        long v = huwz.d();
        if(((long)arr2_f.length) < v) {
            return -1;
        }
        ArrayList arrayList0 = new ArrayList(arr2_f.length);
        for(int v1 = 0; v1 < arr2_f.length; ++v1) {
            arrayList0.add(Integer.valueOf(((int)(arr2_f[v1][0] * 100.0f))));
        }
        Collections.sort(arrayList0);
        return (int)(((Integer)arrayList0.get(((int)(((double)arr2_f.length) * 0.9)))));
    }

    public final int c() {
        return this.f ? 0xEF : this.a;
    }

    public final long d() {
        return this.d == -1L ? System.currentTimeMillis() : this.d;
    }

    public final List e() {
        List list0 = this.h;
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((long)(((Long)((fvuf)object0).b))) < System.currentTimeMillis() - 86400000L) {
                iterator0.remove();
            }
        }
        return list0;
    }

    public final float[][] f() {
        int v = this.a();
        float[][] arr2_f = new float[v][];
        for(int v1 = 0; v1 < v; ++v1) {
            arr2_f[v1] = this.f ? this.e[(this.a + 1 + v1) % 0xF0] : this.e[v1];
        }
        return arr2_f;
    }

    public final void g() {
        this.b = this.a;
        int v = (this.a + 1) % 0xF0;
        this.a = v;
        ++this.c;
        this.d += 360000L;
        if(v == 0 && !this.f) {
            this.f = true;
        }
    }

    public static final int h(long v, long v1, int v2) {
        return v <= v1 ? Math.max(0, v2 - ((int)((v1 - v) / huwz.g()))) : v2;
    }

    public static final long i(long v, long v1, int v2) {
        return v1 - (((long)v2) - v) * huwz.g();
    }

    public static final boolean j(float[] arr_f) {
        float f = arr_f[3];
        if(arr_f[2] == 1.0f) {
            if(Float.compare(f, 1.0f) != 0) {
                return arr_f[1] <= 5.0f ? arr_f[4] != 1.0f : false;
            }
            return arr_f[1] == 1.0f ? arr_f[4] != 1.0f : false;
        }
        return false;
    }

    public static final int k(fuyk[] arr_fuyk) {
        int v = 0;
        for(int v1 = 0; v1 < 2; ++v1) {
            int v2 = arr_fuyk[v1].b;
            if(v2 > v) {
                v = v2;
            }
        }
        return v;
    }

    public static final fvsl l(fvsl fvsl0, float[][] arr2_f, long v) {
        ArrayList arrayList2;
        long v1 = fvsl0.b;
        long v2 = fvsl0.c;
        fvsl fvsl1 = null;
        if(Long.compare(v1, v2) >= 0) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        int v3 = arr2_f.length - 1;
        int v4 = fuye.h(v1, v, v3);
        int v5 = fuye.h(v2, v, v3);
        int v6 = 0;
        boolean z = true;
        gftb.checkTrue(arr2_f.length > v5);
        while(v4 <= v5) {
            if(fuye.j(arr2_f[v4]) && arrayList0.size() == arrayList1.size()) {
                arrayList0.add(Integer.valueOf(v4));
            }
            if(arrayList0.size() > arrayList1.size() && (!fuye.j(arr2_f[v4]) || v4 == v5)) {
                arrayList1.add(Integer.valueOf(v4));
            }
            ++v4;
        }
        if(arrayList0.size() > arrayList1.size()) {
            arrayList1.add(Integer.valueOf(v5));
        }
        if(arrayList0.size() != arrayList1.size()) {
            z = false;
        }
        gftb.checkTrue(z);
        while(v6 < arrayList0.size()) {
            int v7 = (int)(((Integer)arrayList0.get(v6)));
            int v8 = (int)(((Integer)arrayList1.get(v6)));
            long v9 = ((long)(v8 - v7)) * huwz.g();
            if(v9 >= TimeUnit.MINUTES.toMillis(huwz.c())) {
                long v10 = fuye.i(v7, v, v3);
                arrayList2 = arrayList0;
                long v11 = fuye.i(v8, v, v3);
                if(v8 == v3 && v < v2) {
                    v9 = v2 - v10;
                    v11 = v2;
                }
                if(fvsl1 == null || v9 > fvsl1.a()) {
                    fvsl1 = new fvsl(v10, v11);
                }
            }
            else {
                arrayList2 = arrayList0;
            }
            ++v6;
            arrayList0 = arrayList2;
            v2 = v2;
        }
        return fvsl1;
    }

    private final void m() {
        this.a = 0;
        this.b = 0;
        this.f = false;
        this.e = new float[0xF0][];
        this.c = 0;
    }
}

