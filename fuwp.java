import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class fuwp {
    public final int a;
    private final int b;
    private final int c;
    private final boolean d;
    private final ByteBuffer e;
    private final List f;
    private final List g;
    private final List h;
    private final List i;
    private final List j;

    public fuwp(ByteBuffer byteBuffer0, boolean z) {
        this.e = byteBuffer0;
        this.d = z;
        byteBuffer0.getLong();
        this.b = byteBuffer0.getInt();
        this.c = byteBuffer0.getInt();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        int v = 0;
        int v1;
        for(v1 = 0; v < this.c; v1 = v3) {
            int v2 = byteBuffer0.getInt();
            int v3 = byteBuffer0.getInt();
            int v4 = this.b;
            switch(v4) {
                case 2: {
                    if(z) {
                        int v5 = byteBuffer0.position();
                        this.j.add(new int[]{v5, v3, v2});
                        byteBuffer0.position(v5 + (v2 + v2 + 8) * v3);
                    }
                    else {
                        short[][] arr2_v = new short[v3][v2];
                        float[] arr_f = new float[v3];
                        float[] arr_f1 = new float[v3];
                        for(int v6 = 0; v6 < v3; ++v6) {
                            arr_f[v6] = byteBuffer0.getFloat();
                            arr_f1[v6] = byteBuffer0.getFloat();
                            for(int v7 = 0; v7 < v2; ++v7) {
                                short[] arr_v = arr2_v[v6];
                                arr_v[v7] = byteBuffer0.getShort();
                            }
                        }
                        this.g.add(arr2_v);
                        this.h.add(arr_f);
                        this.i.add(arr_f1);
                    }
                    break;
                }
                case 4: {
                    float[][] arr2_f = new float[v3][v2];
                    for(int v8 = 0; v8 < v3; ++v8) {
                        for(int v9 = 0; v9 < v2; ++v9) {
                            float[] arr_f2 = arr2_f[v8];
                            arr_f2[v9] = byteBuffer0.getFloat();
                        }
                    }
                    this.f.add(arr2_f);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unsupported numBytesForFloat: " + v4);
                }
            }
            ++v;
        }
        this.a = v1;
    }

    public final float[] a(float[] arr_f) {
        for(int v = 0; true; ++v) {
            int v1 = this.c;
            if(v >= v1) {
                break;
            }
            if(this.b == 4) {
                arr_f = fuwb.o(((float[][])this.f.get(v)), arr_f);
            }
            else if(this.d) {
                int[] arr_v = (int[])this.j.get(v);
                arr_f = fuwb.p(this.e, arr_v, arr_f);
            }
            else {
                short[][] arr2_v = (short[][])this.g.get(v);
                float[] arr_f1 = (float[])this.i.get(v);
                float[] arr_f2 = (float[])this.h.get(v);
                float[] arr_f3 = new float[arr2_v.length];
                for(int v2 = 0; v2 < arr2_v.length; ++v2) {
                    arr_f3[v2] = fuwb.c(arr2_v[v2], arr_f1[v2], arr_f2[v2], arr_f);
                }
                arr_f = arr_f3;
            }
            if(v < v1 - 1) {
                fuwb.m(arr_f);
            }
        }
        if(this.a > 2) {
            fuwb.n(arr_f);
            return arr_f;
        }
        fuwb.q(arr_f, arr_f.length);
        return arr_f;
    }
}

