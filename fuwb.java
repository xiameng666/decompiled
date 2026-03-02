import com.google.android.gms.location.DetectedActivity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fuwb {
    static final float[] a;
    public static final float[] b;
    public static final float[] c;
    private static final float[] d;

    static {
        fuwb.d = new float[]{0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.5f};
        fuwb.a = new float[]{0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f};
        fuwb.b = new float[]{0.36592f, 0.008365f, -0.088269f, 0.31573f, 0.67873f, 0.55648f, 0.4064f, 0.29001f, 0.081794f, 0.056677f, 0.032503f, 0.019009f, 0.49607f, 0.5427f, 0.38709f, 0.20032f, 0.072968f, 0.083739f, 0.056961f, 0.035255f, 0.022811f, 0.0489f, 0.035685f, 0.023737f, 0.014843f, 3.663f, 4.257f, 5.7366f, 12.575f, 0.97695f, 1.5652f, 2.5211f, 0.051406f, 4.6232f, 0.53133f, -2.3709f, -1.4972f, -0.76761f, -0.028139f, 0.39413f, 1.1236f, 1.9754f, 6.3464f};
        fuwb.c = new float[]{0.2477f, 0.43512f, 0.54924f, 0.63361f, 0.21239f, 0.25206f, 0.28133f, 0.2768f, 0.019607f, 0.013281f, 0.009662f, 0.011474f, 0.040815f, 0.1954f, 0.1983f, 0.14983f, 0.084914f, 0.020931f, 0.014333f, 0.008826f, 0.006903f, 0.018713f, 0.013256f, 0.009708f, 0.007464f, 12.888f, 15.513f, 23.292f, 37.334f, 1.4572f, 2.2731f, 3.6728f, 0.053859f, 12.99f, 0.10446f, 3.6804f, 2.4326f, 1.388f, 0.4665f, 0.7232f, 1.9556f, 3.3468f, 21.591999f};
    }

    public static float a(float[] arr_f, float[] arr_f1) {
        float f = arr_f[arr_f.length - 1];
        for(int v = 0; v < arr_f1.length; ++v) {
            f += arr_f[v] * arr_f1[v];
        }
        return f;
    }

    public static float b(ByteBuffer byteBuffer0, int v, int v1, float[] arr_f) {
        int v2 = v1 - 1;
        float f = (float)(((char)byteBuffer0.getShort(v2 + v2 + (v + 8))));
        float f1 = 1.0f;
        for(int v3 = 0; v3 < arr_f.length; ++v3) {
            int v4 = (char)byteBuffer0.getShort(v3 + v3 + (v + 8));
            float f2 = arr_f[v3];
            f += ((float)v4) * f2;
            f1 += f2;
        }
        return byteBuffer0.getFloat(v + 4) * f + byteBuffer0.getFloat(v) * f1;
    }

    public static float c(short[] arr_v, float f, float f1, float[] arr_f) {
        float f2 = (float)(((char)arr_v[arr_v.length - 1]));
        float f3 = 1.0f;
        for(int v = 0; v < arr_f.length; ++v) {
            int v1 = (char)arr_v[v];
            float f4 = arr_f[v];
            f2 += ((float)v1) * f4;
            f3 += f4;
        }
        return f * f2 + f1 * f3;
    }

    public static int d(float[] arr_f) {
        float f = 0.0f;
        int v1 = -1;
        for(int v = 0; v < arr_f.length; ++v) {
            if(Float.compare(arr_f[v], f) > 0) {
                f = arr_f[v];
                v1 = v;
            }
        }
        return v1;
    }

    public static List e(float[] arr_f) {
        int v = (int)Math.floor(arr_f[0] * 100.0f);
        int v1 = (int)Math.floor(arr_f[1] * 100.0f);
        int v2 = (int)Math.floor(arr_f[2] * 100.0f);
        int v3 = (int)Math.floor(arr_f[3] * 100.0f);
        int v4 = (int)Math.floor(arr_f[4] * 100.0f);
        int v5 = (int)Math.floor(arr_f[5] * 100.0f);
        int v6 = 100 - v - v1 - v2 - v3 - v4 - v5;
        if(v6 > 0 && v6 < arr_f.length) {
            switch(fuwb.d(arr_f)) {
                case 0: {
                    ++v;
                    break;
                }
                case 1: {
                    ++v1;
                    break;
                }
                case 2: {
                    ++v2;
                    break;
                }
                case 3: {
                    ++v3;
                    break;
                }
                case 4: {
                    ++v4;
                    break;
                }
                case 5: {
                    ++v5;
                }
            }
            --v6;
        }
        List list0 = new ArrayList();
        fuwb.r(list0, fuwh.b, v);
        fuwb.r(list0, fuwh.e, v1);
        fuwb.r(list0, fuwh.d, v2);
        fuwb.r(list0, fuwh.c, Math.max(v1, v2));
        fuwb.r(list0, fuwh.l, v3);
        fuwb.r(list0, fuwh.m, v4);
        fuwb.r(list0, fuwh.a, Math.max(v3, v4));
        fuwb.r(list0, fuwh.f, v5);
        fuwb.r(list0, fuwh.i, v6);
        Collections.sort(list0, fuwa.a);
        return list0;
    }

    // This method was un-flattened
    public static List f(List list0) {
        int v;
        List list1 = new ArrayList();
        for(Object object0: list0) {
            fuwi fuwi0 = (fuwi)object0;
            switch(fuwi0.a.ordinal()) {
                case 0: {
                    list1.add(new DetectedActivity(v, fuwi0.b));
                    break;
                }
                case 1: {
                    v = 1;
                    list1.add(new DetectedActivity(1, fuwi0.b));
                    break;
                }
                case 2: {
                    v = 2;
                    list1.add(new DetectedActivity(2, fuwi0.b));
                    break;
                }
                case 3: {
                    v = 7;
                    list1.add(new DetectedActivity(7, fuwi0.b));
                    break;
                }
                case 4: {
                    v = 8;
                    list1.add(new DetectedActivity(8, fuwi0.b));
                    break;
                }
                case 5: {
                    v = 3;
                    list1.add(new DetectedActivity(3, fuwi0.b));
                    break;
                }
                case 6: 
                case 8: {
                    v = 4;
                    list1.add(new DetectedActivity(4, fuwi0.b));
                    break;
                }
                case 11: {
                    v = 16;
                    list1.add(new DetectedActivity(16, fuwi0.b));
                    break;
                }
                case 12: {
                    v = 17;
                    list1.add(new DetectedActivity(17, fuwi0.b));
                    break;
                }
                case 13: {
                    v = 18;
                    list1.add(new DetectedActivity(18, fuwi0.b));
                    break;
                }
                case 14: {
                    v = 19;
                    list1.add(new DetectedActivity(19, fuwi0.b));
                    break;
                }
                case 15: {
                    v = 20;
                    list1.add(new DetectedActivity(20, fuwi0.b));
                    break;
                }
                case 16: {
                    v = 21;
                    list1.add(new DetectedActivity(21, fuwi0.b));
                    break;
                }
                default: {
                    v = -1;
                }
            }
        }
        if(!list1.isEmpty()) {
            return list1;
        }
        throw new IllegalArgumentException("Unsupported activities in results");
    }

    public static void g(List list0, float[] arr_f) {
        int v = (int)Math.floor(arr_f[0] * 100.0f);
        int v1 = (int)Math.floor(arr_f[1] * 100.0f);
        fuwb.r(list0, fuwh.o, v);
        fuwb.r(list0, fuwh.n, v1);
        Collections.sort(list0, fuwa.a);
    }

    public static void h(List list0, float f, float[] arr_f) {
        int v = (int)Math.floor(arr_f[1] * f * 100.0f);
        int v1 = (int)Math.floor(arr_f[2] * f * 100.0f);
        int v2 = ((int)Math.floor(f * 100.0f)) - v - v1;
        fuwb.r(list0, fuwh.p, v2);
        fuwb.r(list0, fuwh.q, v);
        fuwb.r(list0, fuwh.o, v2 + v);
        fuwb.r(list0, fuwh.n, v1);
        Collections.sort(list0, fuwa.a);
    }

    public static void i(float[][] arr2_f, int v, int v1, float[] arr_f, float[] arr_f1, float[] arr_f2) {
        while(v < v1) {
            float[] arr_f3 = arr2_f[v];
            float f = arr_f3[arr_f3.length - 1];
            int v2;
            for(v2 = 0; v2 < arr_f.length; ++v2) {
                f += arr_f3[v2] * arr_f[v2];
            }
            while(v2 < arr_f3.length - 1) {
                f += arr_f3[v2] * arr_f1[v2 - arr_f.length];
                ++v2;
            }
            arr_f2[v] = f;
            ++v;
        }
    }

    public static void j(ByteBuffer byteBuffer0, int[] arr_v, int v, int v1, float[] arr_f, float[] arr_f1, float[] arr_f2) {
        int v2 = arr_v[0];
        int v3 = arr_v[2];
        for(int v4 = v; v4 < v1; ++v4) {
            int v5 = (v3 + v3 + 8) * v4 + v2;
            int v6 = v3 - 1;
            int v7 = v5 + 8;
            float f = (float)(((char)byteBuffer0.getShort(v6 + v6 + v7)));
            float f1 = 1.0f;
            int v8;
            for(v8 = 0; v8 < arr_f.length; ++v8) {
                int v9 = (char)byteBuffer0.getShort(v8 + v8 + v7);
                float f2 = arr_f[v8];
                f += ((float)v9) * f2;
                f1 += f2;
            }
            while(v8 < v6) {
                int v10 = (char)byteBuffer0.getShort(v8 + v8 + v7);
                float f3 = arr_f1[v8 - arr_f.length];
                f += ((float)v10) * f3;
                f1 += f3;
                ++v8;
            }
            arr_f2[v4] = byteBuffer0.getFloat(v5 + 4) * f + byteBuffer0.getFloat(v5) * f1;
        }
    }

    public static void k(short[][] arr2_v, float[] arr_f, float[] arr_f1, int v, int v1, float[] arr_f2, float[] arr_f3, float[] arr_f4) {
        while(v < v1) {
            short[] arr_v = arr2_v[v];
            float f = arr_f[v];
            float f1 = arr_f1[v];
            float f2 = (float)(((char)arr_v[arr_v.length - 1]));
            int v2 = 0;
            float f3 = 1.0f;
            while(v2 < arr_f2.length) {
                int v3 = (char)arr_v[v2];
                float f4 = arr_f2[v2];
                f2 += ((float)v3) * f4;
                f3 += f4;
                ++v2;
            }
            while(v2 < arr_v.length - 1) {
                int v4 = (char)arr_v[v2];
                float f5 = arr_f3[v2 - arr_f2.length];
                f2 += ((float)v4) * f5;
                f3 += f5;
                ++v2;
            }
            arr_f4[v] = f * f2 + f1 * f3;
            ++v;
        }
    }

    public static void l(int v, float[] arr_f, float[] arr_f1) {
        switch(v) {
            case 0: {
                break;
            }
            case 1: 
            case 2: {
                int v1 = fuwb.d(arr_f);
                if(v1 < arr_f.length - 1 && Float.compare(arr_f[v1], arr_f1[v1]) < 0) {
                    System.arraycopy((v == 1 ? fuwb.d : fuwb.a), 0, arr_f, 0, 6);
                }
                break;
            }
            default: {
                throw new IllegalArgumentException("Unsupported mode: " + v);
            }
        }
    }

    public static void m(float[] arr_f) {
        for(int v = 0; v < arr_f.length; ++v) {
            arr_f[v] = Math.max(arr_f[v], 0.0f);
        }
    }

    public static void n(float[] arr_f) {
        float f = arr_f[0];
        for(int v1 = 1; v1 < arr_f.length; ++v1) {
            f = Math.max(f, arr_f[v1]);
        }
        float f1 = 0.0f;
        for(int v2 = 0; v2 < arr_f.length; ++v2) {
            float f2 = (float)Math.exp(arr_f[v2] - f);
            arr_f[v2] = f2;
            f1 += f2;
        }
        for(int v = 0; v < arr_f.length; ++v) {
            arr_f[v] /= f1;
        }
    }

    public static float[] o(float[][] arr2_f, float[] arr_f) {
        float[] arr_f1 = new float[arr2_f.length];
        for(int v = 0; v < arr2_f.length; ++v) {
            arr_f1[v] = fuwb.a(arr2_f[v], arr_f);
        }
        return arr_f1;
    }

    public static float[] p(ByteBuffer byteBuffer0, int[] arr_v, float[] arr_f) {
        int v1 = arr_v[0];
        int v2 = arr_v[1];
        int v3 = arr_v[2];
        float[] arr_f1 = new float[v2];
        for(int v = 0; v < v2; ++v) {
            arr_f1[v] = fuwb.b(byteBuffer0, (v3 + v3 + 8) * v + v1, v3, arr_f);
        }
        return arr_f1;
    }

    public static void q(float[] arr_f, int v) {
        for(int v1 = 0; v1 < v; ++v1) {
            arr_f[v1] = (float)(1.0 / (Math.exp(-arr_f[v1]) + 1.0));
        }
    }

    private static void r(List list0, fuwh fuwh0, int v) {
        if(v > 0) {
            list0.add(new fuwi(fuwh0, v));
        }
    }
}

