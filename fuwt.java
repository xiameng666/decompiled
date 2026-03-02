import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class fuwt {
    public fuzc a;
    private final fuwa b;
    private final fuwh c;
    private final Class d;

    public fuwt(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1, fuwh fuwh0, Class class0, fuzc fuzc0) {
        this.d = class0;
        if(class0 == fuwq.class) {
            this.b = new fuwq(byteBuffer0, byteBuffer1, ((int)hupk.c()), hupk.i());
        }
        else if(class0 == fuwk.class) {
            this.b = new fuwk(byteBuffer0, ((int)hupk.c()), hupk.h());
        }
        else {
            this.b = new fuwj(byteBuffer0, fuwu.d.r);
        }
        this.c = fuwh0;
        this.a = fuzc0;
    }

    public final List a(fvsf fvsf0) {
        fuwi fuwi1;
        List list0;
        double f26;
        double f25;
        int v11;
        fuwg fuwg0 = new fuwg();
        if(this.d == fuwk.class) {
            fuwa fuwa0 = this.b;
            double[][] arr2_f = fuwr.g(fvsf0, 40.0);
            int v = arr2_f[0].length;
            int v1 = fuwe.a;
            if(v != v1) {
                double[][] arr2_f1 = new double[3][v1];
                int v2 = Math.min(v, v1);
                for(int v3 = 0; v3 < v2; ++v3) {
                    System.arraycopy(arr2_f[0], 0, arr2_f1[0], 0, v2);
                    System.arraycopy(arr2_f[1], 0, arr2_f1[1], 0, v2);
                    System.arraycopy(arr2_f[2], 0, arr2_f1[2], 0, v2);
                }
                for(int v4 = v2; v4 < v1; ++v4) {
                    double[] arr_f = arr2_f1[0];
                    arr_f[v4] = arr_f[v2 - 1];
                    double[] arr_f1 = arr2_f1[1];
                    arr_f1[v4] = arr_f1[v2 - 1];
                    double[] arr_f2 = arr2_f1[2];
                    arr_f2[v4] = arr_f2[v2 - 1];
                }
                arr2_f = arr2_f1;
            }
            float[] arr_f3 = new float[(v1 + 2) * 7];
            int v6 = 7;
            for(int v5 = 0; true; ++v5) {
                double f = 0.0;
                if(v5 >= v1) {
                    break;
                }
                arr_f3[v6 + 3] = (float)arr2_f[0][v5];
                arr_f3[v6 + 4] = (float)arr2_f[1][v5];
                int v7 = v6 + 6;
                arr_f3[v6 + 5] = (float)arr2_f[2][v5];
                v6 += 7;
                for(int v8 = 0; v8 < 3; ++v8) {
                    double f1 = arr2_f[v8][v5];
                    f += f1 * f1;
                }
                arr_f3[v7] = (float)Math.abs(Math.sqrt(f) - 9.80655);
                arr_f3 = arr_f3;
            }
            double[] arr_f4 = new double[3];
            for(int v9 = 0; v9 < 3; ++v9) {
                arr_f4[v9] = fuwr.a(arr2_f[v9]);
                for(int v10 = 0; v10 < arr2_f[0].length; ++v10) {
                    double[] arr_f5 = arr2_f[v9];
                    arr_f5[v10] -= arr_f4[v9];
                }
            }
            if(Double.compare(fuwe.a(arr_f4), 0.0) == 0) {
                arr_f4[2] = 1.0;
            }
            fuwe.b(arr_f4);
            if(Math.abs(arr_f4[0]) <= Math.abs(arr_f4[1]) && Math.abs(arr_f4[0]) <= Math.abs(arr_f4[2])) {
                v11 = 0;
            }
            else {
                v11 = Math.abs(arr_f4[1]) < Math.abs(arr_f4[2]) ? 1 : 2;
            }
            double[] arr_f6 = new double[3];
            switch(v11) {
                case 0: {
                    arr_f6[1] = arr_f4[2];
                    arr_f6[2] = -arr_f4[1];
                    break;
                }
                case 1: {
                    arr_f6[0] = arr_f4[2];
                    arr_f6[2] = -arr_f4[0];
                    break;
                }
                default: {
                    arr_f6[0] = arr_f4[1];
                    arr_f6[1] = -arr_f4[0];
                }
            }
            fuwe.b(arr_f6);
            double f2 = arr_f4[1];
            double f3 = arr_f6[2];
            double f4 = arr_f4[2];
            double f5 = arr_f6[1];
            double f6 = arr_f6[0];
            double f7 = arr_f4[0];
            double[] arr_f7 = {f2 * f3 - f4 * f5, f4 * f6 - f3 * f7, f7 * f5 - f2 * f6};
            fuwe.b(arr_f7);
            double f8 = 0.0;
            double f9 = 0.0;
            double f10 = 0.0;
            for(int v12 = 0; v12 < arr2_f[0].length; ++v12) {
                double f11 = arr_f6[0];
                double[] arr_f8 = arr2_f[0];
                double f12 = arr_f8[v12];
                double f13 = arr_f6[1];
                double[] arr_f9 = arr2_f[1];
                double f14 = arr_f9[v12];
                double f15 = arr_f6[2];
                double[] arr_f10 = arr2_f[2];
                double f16 = arr_f10[v12];
                double f17 = arr_f7[0] * f12;
                double f18 = arr_f7[1] * f14;
                double f19 = arr_f7[2] * f16;
                double f20 = arr_f4[0] * f12;
                double f21 = arr_f4[1] * f14;
                double f22 = arr_f4[2] * f16;
                double f23 = f11 * f12 + f13 * f14 + f15 * f16;
                arr_f8[v12] = f23;
                double f24 = f17 + f18 + f19;
                arr_f9[v12] = f24;
                arr_f10[v12] = f20 + f21 + f22;
                f9 += f23 * f23;
                f8 += f23 * f24;
                f10 += f24 * f24;
            }
            if(Double.compare(f8, 0.0) == 0) {
                f25 = 1.0;
                f26 = 0.0;
            }
            else {
                double[] arr_f11 = new double[2];
                double f27 = (f9 + f10) * 0.5;
                arr_f11[0] = f27 + Math.sqrt(f27 * f27 - (f9 * f10 - f8 * f8)) - f10;
                arr_f11[1] = f8;
                fuwe.b(arr_f11);
            }
            for(int v13 = 0; v13 < arr2_f[0].length; ++v13) {
                double[] arr_f12 = arr2_f[0];
                double f28 = arr_f12[v13];
                double[] arr_f13 = arr2_f[1];
                double f29 = arr_f13[v13];
                arr_f12[v13] = f25 * f28 + f26 * f29;
                arr_f13[v13] = -f26 * f28 + f25 * f29;
            }
            int v15 = 7;
            for(int v14 = 0; v14 < v1; ++v14) {
                arr_f3[v15] = (float)arr2_f[0][v14];
                arr_f3[v15 + 1] = (float)arr2_f[1][v14];
                arr_f3[v15 + 2] = (float)arr2_f[2][v14];
                v15 += 7;
            }
            list0 = fuwa0.b(arr_f3);
            if(this.a != null) {
                fuwd.a(fuwg0, fvsf0);
            }
        }
        else {
            fuwd.a(fuwg0, fvsf0);
            list0 = this.b.a(fuwg0);
        }
        if(this.a != null && this.a.a != null) {
            ArrayList arrayList0 = new ArrayList();
            if(!arrayList0.isEmpty()) {
                fuwh[] arr_fuwh = fuza.a;
                fuwh fuwh0 = null;
                int v16 = 0;
                int v17 = 0;
                while(true) {
                    if(v17 >= 6) {
                        goto label_174;
                    }
                    int v18 = 0;
                    fuwh fuwh1 = arr_fuwh[v17];
                    for(Object object0: list0) {
                        fuwi fuwi0 = (fuwi)object0;
                        if(fuwi0.a == fuwh1) {
                            v18 = fuwi0.b;
                            break;
                        }
                    }
                    if(v18 > 50) {
                        fuwi1 = new fuwi(fuwh1, v18);
                    }
                    else {
                        if(v18 > v16) {
                            fuwh0 = fuwh1;
                        }
                        if(v18 > v16) {
                            v16 = v18;
                        }
                        ++v17;
                        continue;
                    label_174:
                        fuwi1 = new fuwi(fuwh0, v16);
                    }
                    break;
                }
                if(fuwi1.a == fuwh.b || huvr.a.b().b() && fuwi1.a == fuwh.d) {
                    Iterator iterator1 = arrayList0.iterator();
                    if(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        fuza fuza0 = (fuza)object1;
                        throw null;
                    }
                }
            }
        }
        return this.c == null ? list0 : Collections.singletonList(new fuwi(this.c, 100));
    }
}

