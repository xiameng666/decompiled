import java.nio.ByteBuffer;
import java.util.List;

public final class fuwk implements fuwa {
    private final float[] b;
    private final int c;
    private final boolean d;
    private final fuwl e;
    private final fuwp f;
    private final fuwp g;

    public fuwk(ByteBuffer byteBuffer0, int v, boolean z) {
        this.e = new fuwl(byteBuffer0, hupk.e());
        fuwp fuwp0 = new fuwp(byteBuffer0, hupk.e());
        this.f = fuwp0;
        int v1 = fuwp0.a - 1;
        this.b = new float[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            this.b[v2] = byteBuffer0.getFloat();
        }
        this.c = v;
        this.d = z;
        this.g = z ? new fuwp(byteBuffer0, hupk.e()) : null;
    }

    @Override  // fuwa
    public final List a(fuwf fuwf0) {
        throw new UnsupportedOperationException();
    }

    @Override  // fuwa
    public final List b(float[] arr_f) {
        float[] arr_f7;
        float[] arr_f4;
        List list1;
        int v13;
        int v = 0;
        int v1 = 0;
        float[] arr_f1 = null;
        float[] arr_f2 = arr_f;
        while(true) {
            fuwl fuwl0 = this.e;
            int v2 = fuwl0.a;
            if(v1 >= v2) {
                break;
            }
            int[] arr_v = fuwl0.c;
            int v3 = arr_v[v1];
            switch(v3) {
                case 1: {
                    List list0 = fuwl0.k;
                    int v4 = ((int[])list0.get(v1))[1];
                    int v5 = v1 == 0 ? ((int[])fuwl0.g.get(0))[0] : ((int[])list0.get(v1 - 1))[1];
                    int v6 = (int)(((Integer)fuwl0.h.get(v1)));
                    int v7 = ((int[])fuwl0.g.get(v1))[1];
                    int v8 = ((arr_f2.length / v5 - v7) / v6 + 1) * v4;
                    float[] arr_f3 = new float[v8];
                    while(v < v4) {
                        int v9 = v5 * v6;
                        if(fuwl0.b) {
                            ByteBuffer byteBuffer0 = fuwl0.d;
                            int[] arr_v1 = (int[])list0.get(v1);
                            int v10 = arr_v1[2];
                            int v11 = v10 + v10;
                            int v12 = arr_v1[0] + (v11 + 24) * v;
                            v13 = v;
                            int v14 = v13;
                            list1 = list0;
                            int v15 = 0;
                            while(v15 <= arr_f2.length - v10) {
                                float f = 0.0f;
                                float f1 = 0.0f;
                                for(int v16 = 0; v16 < v10; ++v16) {
                                    int v17 = v15 + v16;
                                    f += arr_f2[v17] * ((float)(((char)byteBuffer0.getShort(v12 + 8 + (v16 + v16)))));
                                    f1 += arr_f2[v17];
                                }
                                float f2 = byteBuffer0.getFloat(v12 + 4) * f;
                                float f3 = byteBuffer0.getFloat(v12) * f1;
                                int v18 = v12 + 8 + v11;
                                arr_f3[v14] = byteBuffer0.getFloat(v18 + 8) * (f2 + f3 - byteBuffer0.getFloat(v18)) / byteBuffer0.getFloat(v18 + 4) + byteBuffer0.getFloat(v18 + 12);
                                v15 += v9;
                                v14 += v4;
                            }
                            arr_f4 = arr_f2;
                        }
                        else {
                            v13 = v;
                            list1 = list0;
                            float[] arr_f5 = ((float[][])fuwl0.e.get(v1))[v13];
                            float f4 = ((float[][])fuwl0.f.get(v1))[v13][0];
                            float f5 = ((float[][])fuwl0.f.get(v1))[v13][1];
                            float f6 = ((float[][])fuwl0.f.get(v1))[v13][2];
                            float f7 = ((float[][])fuwl0.f.get(v1))[v13][3];
                            float f8 = f4;
                            int v19 = 0;
                            int v20 = v13;
                            while(true) {
                                arr_f4 = arr_f2;
                                if(v19 > arr_f2.length - arr_f5.length) {
                                    break;
                                }
                                float f9 = 0.0f;
                                for(int v21 = 0; v21 < arr_f5.length; ++v21) {
                                    f9 += arr_f4[v19 + v21] * arr_f5[v21];
                                }
                                arr_f3[v20] = (f9 - f8) * f6 / f5 + f7;
                                v19 += v9;
                                v20 += v4;
                                arr_f2 = arr_f4;
                            }
                        }
                        v = v13 + 1;
                        list0 = list1;
                        arr_f2 = arr_f4;
                        continue;
                    }
                    fuwb.m(arr_f3);
                    int v22 = (int)(((Integer)fuwl0.i.get(v1)));
                    int v23 = (int)(((Integer)fuwl0.j.get(v1)));
                    int v24 = v1 + 1 >= v2 || arr_v[v1 + 1] != 1 ? 0 : 1;
                    int v25 = (v8 / v4 - v23) / v22 + 1;
                    float[] arr_f6 = new float[(v24 + v24 + v25) * v4];
                    for(int v26 = 0; v26 < v4; ++v26) {
                        for(int v27 = 0; v27 < v25 * v22; v27 += v22) {
                            float f10 = -3.402823E+38f;
                            for(int v28 = v27; v28 < v27 + v23; ++v28) {
                                f10 = Math.max(f10, arr_f3[v4 * v28 + v26]);
                            }
                            arr_f6[(v27 / v22 + v24) * v4 + v26] = f10;
                        }
                    }
                    arr_f1 = arr_f6;
                    break;
                }
                case 2: {
                    if(fuwl0.b) {
                        int[] arr_v2 = (int[])fuwl0.k.get(v1);
                        arr_f7 = fuwb.p(fuwl0.d, arr_v2, arr_f2);
                    }
                    else {
                        arr_f7 = fuwb.o(((float[][])fuwl0.e.get(v1)), arr_f2);
                    }
                    if(v1 < v2 - 1) {
                        fuwb.m(arr_f7);
                    }
                    else {
                        fuwb.n(arr_f7);
                    }
                    arr_f1 = arr_f7;
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unsupported layerType: " + v3);
                }
            }
            ++v1;
            arr_f2 = arr_f1;
            v = 0;
        }
        float[] arr_f8 = this.f.a(arr_f1);
        fuwb.l(this.c, arr_f8, this.b);
        List list2 = fuwb.e(arr_f8);
        if(this.d) {
            fuwb.h(list2, arr_f8[3], this.g.a(arr_f1));
        }
        return list2;
    }
}

