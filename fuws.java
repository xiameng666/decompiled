import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class fuws implements fuwa {
    public final int b;
    private final float[] c;
    private final int d;
    private final int e;
    private final boolean f;
    private final ByteBuffer g;
    private final List h;
    private final List i;
    private final List j;
    private final List k;
    private final List l;
    private final List m;
    private final List n;
    private final int o;

    public fuws(ByteBuffer byteBuffer0, int v, boolean z) {
        byteBuffer0.rewind();
        this.g = byteBuffer0;
        this.f = z;
        byteBuffer0.getLong();
        this.d = byteBuffer0.getInt();
        this.e = byteBuffer0.getInt();
        this.h = new ArrayList();
        this.l = new ArrayList();
        this.n = new ArrayList();
        this.m = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        int v2 = 0;
        int v3 = 0;
        int v4;
        for(v4 = 0; v2 < this.e; v4 = v6) {
            int v5 = byteBuffer0.getInt();
            int v6 = byteBuffer0.getInt();
            if(v2 == 0) {
                v3 = v5 - v6 / 3 - 1;
                v2 = 0;
            }
            int v7 = this.d;
            switch(v7) {
                case 2: {
                    if(z) {
                        int v8 = byteBuffer0.position();
                        this.l.add(new int[]{v8, v6, v5});
                        byteBuffer0.position(v8 + (v5 + v5 + 8) * v6);
                    }
                    else {
                        short[][] arr2_v = new short[v6][v5];
                        float[] arr_f = new float[v6];
                        float[] arr_f1 = new float[v6];
                        for(int v9 = 0; v9 < v6; ++v9) {
                            arr_f[v9] = byteBuffer0.getFloat();
                            arr_f1[v9] = byteBuffer0.getFloat();
                            for(int v10 = 0; v10 < v5; ++v10) {
                                short[] arr_v = arr2_v[v9];
                                arr_v[v10] = byteBuffer0.getShort();
                            }
                        }
                        this.i.add(arr2_v);
                        this.j.add(arr_f);
                        this.k.add(arr_f1);
                    }
                    break;
                }
                case 4: {
                    float[][] arr2_f = new float[v6][v5];
                    for(int v11 = 0; v11 < v6; ++v11) {
                        for(int v12 = 0; v12 < v5; ++v12) {
                            float[] arr_f2 = arr2_f[v11];
                            arr_f2[v12] = byteBuffer0.getFloat();
                        }
                    }
                    this.h.add(arr2_f);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unsupported numBytesForFloat: " + v7);
                }
            }
            if(v2 < this.e - 1) {
                this.n.add(new float[v6]);
                this.m.add(new float[v6 / 3]);
            }
            else {
                this.m.add(new float[v6]);
            }
            ++v2;
        }
        this.b = v3;
        this.c = new float[v4 - 1];
        for(int v1 = 0; v1 < v4 - 1; ++v1) {
            this.c[v1] = byteBuffer0.getFloat();
        }
        this.o = v;
    }

    @Override  // fuwa
    public final List a(fuwf fuwf0) {
        throw new UnsupportedOperationException();
    }

    @Override  // fuwa
    public final List b(float[] arr_f) {
        int v = this.b;
        gftb.b(arr_f.length % v == 0, String.format(Locale.US, "%d %% %d != 0", ((int)arr_f.length), v));
        this.d();
        int v1 = arr_f.length / v;
        float[] arr_f1 = new float[v];
        float[] arr_f2 = null;
        for(int v2 = 0; v2 < v1; ++v2) {
            System.arraycopy(arr_f, v * v2, arr_f1, 0, v);
            arr_f2 = this.e(arr_f1);
        }
        this.c(arr_f2);
        return fuwb.e(arr_f2);
    }

    public final void c(float[] arr_f) {
        fuwb.l(this.o, arr_f, this.c);
    }

    public final void d() {
        for(Object object0: this.m) {
            Arrays.fill(((float[])object0), 0.0f);
        }
    }

    public final float[] e(float[] arr_f) {
        int v3;
        int v2;
        int v = 0;
        int v1 = 0;
        while(true) {
            v2 = this.e;
            v3 = v2 - 1;
            if(v1 >= v3) {
                break;
            }
            if(v1 > 0) {
                arr_f = (float[])this.m.get(v1 - 1);
            }
            float[] arr_f1 = arr_f;
            float[] arr_f2 = (float[])this.n.get(v1);
            int v4 = arr_f2.length / 3;
            int v5 = this.d;
            int v6 = v4 + v4;
            if(v5 == 4) {
                fuwb.i(((float[][])this.h.get(v1)), 0, v6, arr_f1, ((float[])this.m.get(v1)), arr_f2);
            }
            else {
                if(this.f) {
                    int[] arr_v = (int[])this.l.get(v1);
                    float[] arr_f3 = (float[])this.m.get(v1);
                    fuwb.j(this.g, arr_v, 0, v6, arr_f1, arr_f3, arr_f2);
                }
                else {
                    fuwb.k(((short[][])this.i.get(v1)), ((float[])this.k.get(v1)), ((float[])this.j.get(v1)), 0, v6, arr_f1, ((float[])this.m.get(v1)), arr_f2);
                }
                v6 = v6;
                arr_f1 = arr_f1;
                arr_f2 = arr_f2;
            }
            fuwb.q(arr_f2, v6);
            for(int v7 = 0; v7 < v4; ++v7) {
                arr_f2[v7] *= ((float[])this.m.get(v1))[v7];
            }
            int v8 = v4 * 3;
            if(v5 == 4) {
                fuwb.i(((float[][])this.h.get(v1)), v6, v8, arr_f1, arr_f2, arr_f2);
                arr_f2 = arr_f2;
                v8 = v8;
                v6 = v6;
            }
            else if(this.f) {
                int[] arr_v1 = (int[])this.l.get(v1);
                fuwb.j(this.g, arr_v1, v6, v8, arr_f1, arr_f2, arr_f2);
                v8 = v8;
                arr_f1 = arr_f1;
            }
            else {
                fuwb.k(((short[][])this.i.get(v1)), ((float[])this.k.get(v1)), ((float[])this.j.get(v1)), v6, v8, arr_f1, arr_f2, arr_f2);
                v6 = v6;
                arr_f1 = arr_f1;
                arr_f2 = arr_f2;
            }
            for(int v9 = v6; v9 < v8; ++v9) {
                arr_f2[v9] = (float)Math.tanh(arr_f2[v9]);
            }
            float[] arr_f4 = (float[])this.m.get(v1);
            for(int v10 = 0; v10 < v4; ++v10) {
                float f = arr_f2[v4 + v10];
                arr_f4[v10] = arr_f4[v10] * f + (1.0f - f) * arr_f2[v6 + v10];
            }
            ++v1;
            arr_f = arr_f1;
        }
        List list0 = this.m;
        float[] arr_f5 = (float[])list0.get(list0.size() - 1);
        if(this.d == 4) {
            float[][] arr2_f = (float[][])this.h.get(v3);
            float[] arr_f6 = (float[])list0.get(v2 - 2);
            while(v < arr2_f.length) {
                arr_f5[v] = fuwb.a(arr2_f[v], arr_f6);
                ++v;
            }
        }
        else if(this.f) {
            ByteBuffer byteBuffer0 = this.g;
            int[] arr_v2 = (int[])this.l.get(v3);
            float[] arr_f7 = (float[])list0.get(v2 - 2);
            int v11 = arr_v2[1];
            int v12 = arr_v2[0];
            int v13 = arr_v2[2];
            while(v < v11) {
                arr_f5[v] = fuwb.b(byteBuffer0, (v13 + v13 + 8) * v + v12, v13, arr_f7);
                ++v;
            }
        }
        else {
            short[][] arr2_v = (short[][])this.i.get(v3);
            float[] arr_f8 = (float[])this.k.get(v3);
            float[] arr_f9 = (float[])this.j.get(v3);
            float[] arr_f10 = (float[])list0.get(v2 - 2);
            while(v < arr2_v.length) {
                arr_f5[v] = fuwb.c(arr2_v[v], arr_f8[v], arr_f9[v], arr_f10);
                ++v;
            }
        }
        fuwb.n(arr_f5);
        return arr_f5;
    }
}

