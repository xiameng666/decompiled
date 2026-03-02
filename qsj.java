import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

public final class qsj implements qtg {
    private int a;

    public qsj(int v) {
        this.a = v;
    }

    @Override  // qtg
    public final Object a(qtl qtl0, float f) {
        int v22;
        int v19;
        float f6;
        float[] arr_f4;
        int v5;
        ArrayList arrayList0 = new ArrayList();
        int v = qtl0.q();
        if(v == 1) {
            qtl0.h();
        }
        while(qtl0.o()) {
            arrayList0.add(Float.valueOf(((float)qtl0.a())));
        }
        if(arrayList0.size() == 4 && ((float)(((Float)arrayList0.get(0)))) == 1.0f) {
            arrayList0.set(0, Float.valueOf(0.0f));
            arrayList0.add(Float.valueOf(1.0f));
            arrayList0.add(((Float)arrayList0.get(1)));
            arrayList0.add(((Float)arrayList0.get(2)));
            arrayList0.add(((Float)arrayList0.get(3)));
            this.a = 2;
        }
        if(v == 1) {
            qtl0.j();
        }
        int v1 = this.a;
        if(v1 == -1) {
            v1 = arrayList0.size() / 4;
            this.a = v1;
        }
        float[] arr_f = new float[v1];
        int[] arr_v = new int[v1];
        int v3 = 0;
        int v4 = 0;
        for(int v2 = 0; true; ++v2) {
            v5 = this.a * 4;
            if(v2 >= v5) {
                break;
            }
            double f1 = (double)(((float)(((Float)arrayList0.get(v2)))));
            if(v2 % 4 != 0) {
                switch(v2 % 4) {
                    case 1: {
                        v3 = (int)(f1 * 255.0);
                        break;
                    }
                    case 2: {
                        v4 = (int)(f1 * 255.0);
                        break;
                    }
                    case 3: {
                        arr_v[v2 / 4] = Color.argb(0xFF, v3, v4, ((int)(f1 * 255.0)));
                    }
                }
            }
            else if(v2 / 4 > 0 && (arr_f[v2 / 4 - 1] >= ((float)f1))) {
                arr_f[v2 / 4] = ((float)f1) + 0.01f;
            }
            else {
                arr_f[v2 / 4] = (float)f1;
            }
        }
        Object object0 = new qqm(arr_f, arr_v);
        if(arrayList0.size() > v5) {
            float[] arr_f1 = object0.a;
            int[] arr_v1 = object0.b;
            int v6 = (arrayList0.size() - v5) / 2;
            float[] arr_f2 = new float[v6];
            float[] arr_f3 = new float[v6];
            int v7 = 0;
            while(v5 < arrayList0.size()) {
                if(v5 % 2 == 0) {
                    arr_f2[v7] = (float)(((Float)arrayList0.get(v5)));
                }
                else {
                    arr_f3[v7] = (float)(((Float)arrayList0.get(v5)));
                    ++v7;
                }
                ++v5;
            }
            if(arr_f1.length == 0) {
                arr_f4 = arr_f2;
            }
            else if(v6 == 0) {
                arr_f4 = arr_f1;
            }
            else {
                int v8 = arr_f1.length + v6;
                arr_f4 = new float[v8];
                int v10 = 0;
                int v11 = 0;
                int v12 = 0;
                for(int v9 = 0; true; ++v9) {
                    float f2 = NaNf;
                    if(v9 >= v8) {
                        break;
                    }
                    float f3 = v11 >= arr_f1.length ? NaNf : arr_f1[v11];
                    if(v12 < v6) {
                        f2 = arr_f2[v12];
                    }
                    if(!Float.isNaN(f2) && f3 >= f2) {
                        ++v12;
                        if(!Float.isNaN(f3) && f2 >= f3) {
                            ++v11;
                            arr_f4[v9] = f3;
                            ++v10;
                        }
                        else {
                            arr_f4[v9] = f2;
                        }
                    }
                    else {
                        arr_f4[v9] = f3;
                        ++v11;
                    }
                }
                if(v10 != 0) {
                    arr_f4 = Arrays.copyOf(arr_f4, v8 - v10);
                }
            }
            int[] arr_v2 = new int[arr_f4.length];
            int v13 = 0;
            while(v13 < arr_f4.length) {
                float f4 = arr_f4[v13];
                int v14 = Arrays.binarySearch(arr_f1, f4);
                int v15 = Arrays.binarySearch(arr_f2, f4);
                if(v14 >= 0 && v15 <= 0) {
                    int v16 = arr_v1[v14];
                    if(v6 >= 2 && f4 > arr_f2[0]) {
                        int v17 = 1;
                        while(v17 < v6) {
                            float f5 = arr_f2[v17];
                            int v18 = Float.compare(f5, f4);
                            if(v18 < 0 && v17 != v6 - 1) {
                                ++v17;
                                continue;
                            }
                            if(v18 <= 0) {
                                f6 = arr_f3[v17];
                            }
                            else {
                                float f7 = arr_f2[v17 - 1];
                                float f8 = arr_f3[v17 - 1];
                                f6 = f8 + (f4 - f7) / (f5 - f7) * (arr_f3[v17] - f8);
                            }
                            v19 = Color.argb(((int)(f6 * 255.0f)), Color.red(v16), Color.green(v16), Color.blue(v16));
                            goto label_118;
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    else {
                        v19 = Color.argb(((int)(arr_f3[0] * 255.0f)), Color.red(v16), Color.green(v16), Color.blue(v16));
                    }
                label_118:
                    arr_v2[v13] = v19;
                }
                else {
                    if(v15 < 0) {
                        v15 = -(v15 + 1);
                    }
                    float f9 = arr_f3[v15];
                    if(arr_v1.length >= 2 && f4 != arr_f1[0]) {
                        int v20 = 1;
                        while(v20 < arr_f1.length) {
                            int v21 = arr_f1.length - 1;
                            float f10 = arr_f1[v20];
                            if((f10 < f4) && v20 != v21) {
                                ++v20;
                                continue;
                            }
                            if(v20 == v21 && (f4 >= f10)) {
                                v22 = Color.argb(((int)(f9 * 255.0f)), Color.red(arr_v1[v20]), Color.green(arr_v1[v20]), Color.blue(arr_v1[v20]));
                            }
                            else {
                                float f11 = arr_f1[v20 - 1];
                                int v23 = qto.a((f4 - f11) / (f10 - f11), arr_v1[v20 - 1], arr_v1[v20]);
                                v22 = Color.argb(((int)(f9 * 255.0f)), Color.red(v23), Color.green(v23), Color.blue(v23));
                            }
                            goto label_142;
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    v22 = arr_v1[0];
                label_142:
                    arr_v2[v13] = v22;
                }
                ++v13;
            }
            return new qqm(arr_f4, arr_v2);
        }
        return object0;
    }
}

