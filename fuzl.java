import j..util.DesugarTimeZone;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Map;
import java.util.TimeZone;

public final class fuzl implements Serializable {
    public static final Object a;
    public static fuzl b;
    private final fuzf c;
    private final fuzf[] d;
    private final fuzf[] e;
    private int f;
    private int g;
    private float h;

    static {
        fuzl.a = new Object();
    }

    public fuzl() {
        this.f = 0;
        this.g = 0;
        float f = 1.0f;
        this.h = 1.0f;
        this.c = new fuzf(5);
        this.d = new fuzf[3];
        this.e = new fuzf[10];
        for(int v1 = 0; v1 < 3; ++v1) {
            this.d[v1] = new fuzf(5);
        }
        for(int v = 0; v < 10; ++v) {
            this.e[v] = new fuzf(5);
        }
        Map map0 = fuzg.a;
        if(map0.containsKey("")) {
            f = (float)(((Float)map0.get("")));
        }
        this.h = f;
    }

    public final fuzk a(Map map0, int v) {
        fuzk fuzk0;
        int v28;
        int v25;
        int v23;
        int v16;
        synchronized(this) {
            fuzk0 = new fuzk();
            fvsf fvsf0 = (fvsf)map0.get(fvns.m);
            int v2 = v - this.f;
            int v3 = Math.min((this.f == 0 ? 0 : (v2 + 60) / 360 - 1), 4);
            int v4 = this.f == 0 || v2 >= 330 ? 1 : 0;
            if(fvsf0 == null) {
                v16 = v4;
            }
            else {
                int v5 = fvsf0.c;
                if(v5 > 0) {
                    int v6 = Math.min((this.g == 0 ? 0 : (v - this.g + 60) / 360 - 1), 4);
                    int v7 = 0;
                    float f = 0.0f;
                    float f1 = 0.0f;
                    for(int v8 = 0; v8 < v5; ++v8) {
                        float f2 = fvsf0.a(v8, 0);
                        if(!Float.isInfinite(f2) && !Float.isNaN(f2)) {
                            f += f2;
                            f1 += f2 * f2;
                            ++v7;
                        }
                    }
                    float f3 = v7 == 0 ? 0.0f : f / ((float)v7);
                    float f4 = v7 == 0 ? 0.0f : (f1 - f * f3) / ((float)v7);
                    fuzk0.j = Math.max(fuzl.b(f3), 20.0f);
                    fuzk0.k = fuzl.b(((float)Math.sqrt(f4)));
                    fuzk0.l = ((float)Math.sqrt(f4)) / f3;
                    for(int v9 = 1; v9 < 23; ++v9) {
                        float f5 = 0.0f;
                        for(int v10 = 0; v10 < v5; ++v10) {
                            f5 += fuzl.b(fvsf0.a(v10, v9 + 44));
                        }
                        fuzk0.b("soundMeanLogBark" + v9, f5 / ((float)v5));
                    }
                    for(int v11 = 0; v11 < 10; ++v11) {
                        float f6 = Math.max(fuzk0.a("soundMeanLogBark" + (v11 + 12)), 30.0f);
                        if(v6 > 0) {
                            fuzf[] arr_fuzf = this.e;
                            float f7 = arr_fuzf[v11].c() == 0 ? f6 : arr_fuzf[v11].b();
                            for(int v12 = 0; v12 < v6; ++v12) {
                                arr_fuzf[v11].d((f7 + f6) / 2.0f);
                            }
                        }
                        if(v4 == 0) {
                            fuzf fuzf0 = this.e[v11];
                            fuzf0.e((f6 + fuzf0.b()) / 2.0f);
                        }
                        else {
                            this.e[v11].d(f6);
                        }
                    }
                    fuzf[] arr_fuzf1 = this.e;
                    int v13 = arr_fuzf1[0].f().length;
                    float[] arr_f = new float[v13];
                    if(v13 > 0) {
                        float[] arr_f1 = new float[v13];
                        for(int v14 = 0; v14 < 10; ++v14) {
                            float[] arr_f2 = arr_fuzf1[v14].f();
                            int v15 = 0;
                            while(v15 < v13) {
                                arr_f1[v15] += (float)Math.pow(arr_f2[v15], 2.0);
                                ++v15;
                                v4 = v4;
                                arr_fuzf1 = arr_fuzf1;
                            }
                        }
                        v16 = v4;
                        for(int v17 = 0; v17 < v13; ++v17) {
                            arr_f[v17] = (float)Math.round(Math.sqrt(arr_f1[v17]));
                        }
                    }
                    else {
                        v16 = v4;
                    }
                    for(int v18 = 0; v18 < 3; ++v18) {
                        fuzl.c(fuzk0, "soundMeanLogBark", v18, (v13 > v18 ? arr_f[v13 - v18 - 1] : 2.0f));
                    }
                    this.g = v;
                }
                else {
                    v16 = v4;
                }
            }
            fvsf fvsf1 = (fvsf)map0.get(fvns.d);
            if(fvsf1 == null) {
                v28 = v16;
            }
            else {
                int v19 = fvsf1.c;
                if(v19 > 0) {
                    float f8 = 0.0f;
                    float f9 = 0.0f;
                    float f10 = 0.0f;
                    for(int v20 = 0; v20 < v19; ++v20) {
                        f10 += fvsf1.a(v20, 0);
                        f9 += fvsf1.a(v20, 1);
                        f8 += fvsf1.a(v20, 2);
                    }
                    float f11 = f10 / ((float)v19);
                    float f12 = f9 / ((float)v19);
                    float f13 = f8 / ((float)v19);
                    float f14 = (float)Math.sqrt(f11 * f11 + f12 * f12 + f13 * f13);
                    int v21 = Float.compare(f14, 0.0f);
                    float f15 = v21 == 0 ? 0.0f : f11 / f14;
                    float f16 = v21 == 0 ? 0.0f : f12 / f14;
                    float f17 = v21 == 0 ? 0.0f : f13 / f14;
                    if(v3 > 0) {
                        fuzf[] arr_fuzf2 = this.d;
                        float f18 = arr_fuzf2[0].c() == 0 ? f15 : arr_fuzf2[0].b();
                        float f19 = arr_fuzf2[1].c() == 0 ? f16 : arr_fuzf2[1].b();
                        float f20 = arr_fuzf2[2].c() == 0 ? f17 : arr_fuzf2[2].b();
                        for(int v22 = 0; v22 < v3; ++v22) {
                            arr_fuzf2[0].d(f18);
                            arr_fuzf2[1].d(f19);
                            arr_fuzf2[2].d(f20);
                        }
                    }
                    if(v16 == 0) {
                        fuzf fuzf1 = this.d[0];
                        fuzf1.e((f15 + fuzf1.b()) / 2.0f);
                        fuzf fuzf2 = this.d[1];
                        fuzf2.e((f16 + fuzf2.b()) / 2.0f);
                        fuzf fuzf3 = this.d[2];
                        fuzf3.e((f17 + fuzf3.b()) / 2.0f);
                        v23 = 0;
                    }
                    else {
                        this.d[0].d(f15);
                        this.d[1].d(f16);
                        this.d[2].d(f17);
                        v23 = 1;
                    }
                    fuzf[] arr_fuzf3 = this.d;
                    int v24 = arr_fuzf3[0].c();
                    if(v24 == 1) {
                        fuzk0.g = 0.002f;
                        fuzk0.h = 0.002f;
                        fuzk0.i = 0.002f;
                        v25 = v23;
                    }
                    else {
                        float[] arr_f3 = arr_fuzf3[0].f();
                        float[] arr_f4 = arr_fuzf3[1].f();
                        float[] arr_f5 = arr_fuzf3[2].f();
                        float[] arr_f6 = new float[v24 - 1];
                        int v26 = 0;
                        while(v26 < v24 - 1) {
                            arr_f6[v26] = (float)Math.sqrt(Math.pow(arr_f3[v26], 2.0) + Math.pow(arr_f4[v26], 2.0) + Math.pow(arr_f5[v26], 2.0));
                            ++v26;
                            arr_f3 = arr_f3;
                            arr_f5 = arr_f5;
                            arr_f6 = arr_f6;
                            v23 = v23;
                        }
                        v25 = v23;
                        for(int v27 = 0; v27 < 3; ++v27) {
                            fuzl.c(fuzk0, "accelGravityDir", v27, (v24 - 1 <= v27 ? 0.002f : arr_f6[v24 - 1 - v27 - 1]));
                        }
                    }
                    v28 = v25;
                }
                else {
                    v28 = v16;
                }
            }
            fvsf fvsf2 = (fvsf)map0.get(fvns.k);
            if(fvsf2 != null) {
                int v29 = fvsf2.c;
                if(v29 > 0) {
                    float f21 = 0.0f;
                    for(int v30 = 0; v30 < v29; ++v30) {
                        f21 += fvsf2.a(v30, 0);
                    }
                    float f22 = Math.min(1000.0f, this.h * (f21 / ((float)v29)));
                    fuzk0.c = f22;
                    if(v3 > 0) {
                        fuzf fuzf4 = this.c;
                        float f23 = (fuzk0.c + (fuzf4.c() == 0 ? f22 : fuzf4.b())) / 2.0f;
                        for(int v31 = 0; v31 < v3; ++v31) {
                            fuzf4.d(f23);
                        }
                    }
                    if(v28 == 0) {
                        float f24 = (f22 + this.c.b()) / 2.0f;
                        this.c.e(f24);
                    }
                    else {
                        this.c.d(f22);
                    }
                    float[] arr_f7 = this.c.f();
                    for(int v32 = 0; v32 < 3; ++v32) {
                        fuzl.c(fuzk0, "meanLightLevel", v32, (arr_f7.length < v32 + 1 ? 0.0f : arr_f7[arr_f7.length - (v32 + 1)]));
                    }
                }
            }
            Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone(TimeZone.getDefault().getID()));
            calendar0.setTimeInMillis(((long)v) * 1000L);
            fuzk0.L = (float)calendar0.get(11);
            if(v28 != 0) {
                this.f = v;
            }
        }
        return fuzk0;
    }

    static final float b(float f) {
        return (float)Math.max(Math.log10(Math.abs(f)) * 10.0, -10000.0);
    }

    private static final void c(fuzk fuzk0, String s, int v, float f) {
        fuzk0.b(s + fuzk.a[v], f);
    }
}

