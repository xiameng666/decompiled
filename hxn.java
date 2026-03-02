public final class hxn {
    private final boolean a;
    private final int b;
    private final hxk[] c;
    private int d;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private final int h;

    public hxn() {
        this(0, 3);
    }

    public hxn(int v, int v1) {
        this(false, v | ((v1 & 2) == 0 ? 1 : 0) ^ 1);
    }

    public hxn(boolean z, int v) {
        int v1;
        this.a = z;
        this.h = v;
        if(z) {
            switch(v) {
                case 0: {
                    throw null;
                }
                case 1: {
                    throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
                }
            }
        }
        if(v == 0) {
            throw null;
        }
        switch(v - 1) {
            case 0: {
                v1 = 3;
                break;
            }
            case 1: {
                v1 = 2;
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        this.b = v1;
        this.c = new hxk[20];
        this.e = new float[20];
        this.f = new float[20];
        this.g = new float[3];
    }

    public hxn(byte[] arr_b) {
        this(true, 2);
    }

    public final float a() {
        float[] arr_f1;
        float[] arr_f;
        hxk[] arr_hxk = this.c;
        int v = this.d;
        hxk hxk0 = arr_hxk[v];
        if(hxk0 != null) {
            hxk hxk1 = hxk0;
            int v1 = 0;
            do {
                arr_f = this.f;
                arr_f1 = this.e;
                hxk hxk2 = arr_hxk[v];
                if(hxk2 == null) {
                    break;
                }
                long v2 = hxk0.a - hxk2.a;
                float f = (float)Math.abs(hxk2.a - hxk1.a);
                hxk1 = this.h == 1 || this.a ? hxk2 : hxk0;
                if(((float)v2) > 100.0f || f > 40.0f) {
                    break;
                }
                arr_f1[v1] = hxk2.b;
                arr_f[v1] = -((float)v2);
                if(v == 0) {
                    v = 20;
                }
                --v;
                ++v1;
            }
            while(v1 < 20);
            if(v1 >= this.b) {
                int v3 = this.h - 1;
                if(this.h != 0) {
                    switch(v3) {
                        case 0: {
                            try {
                                float[] arr_f2 = this.g;
                                int v4 = v1 > 2 ? 2 : 1;
                                float[][] arr2_f = new float[v4 + 1][];
                                for(int v5 = 0; v5 < v4 + 1; ++v5) {
                                    arr2_f[v5] = new float[v1];
                                }
                                for(int v6 = 0; v6 < v1; ++v6) {
                                    arr2_f[0][v6] = 1.0f;
                                    for(int v7 = 1; v7 < v4 + 1; ++v7) {
                                        arr2_f[v7][v6] = arr2_f[v7 - 1][v6] * arr_f[v6];
                                    }
                                }
                                float[][] arr2_f1 = new float[v4 + 1][];
                                for(int v8 = 0; v8 < v4 + 1; ++v8) {
                                    arr2_f1[v8] = new float[v1];
                                }
                                float[][] arr2_f2 = new float[v4 + 1][];
                                for(int v9 = 0; v9 < v4 + 1; ++v9) {
                                    arr2_f2[v9] = new float[v4 + 1];
                                }
                                for(int v10 = 0; v10 < v4 + 1; ++v10) {
                                    float[] arr_f3 = arr2_f1[v10];
                                    ibpg.Z(arr2_f[v10], arr_f3, v1);
                                    for(int v11 = 0; v11 < v10; ++v11) {
                                        float[] arr_f4 = arr2_f1[v11];
                                        float f1 = hxp.a(arr_f3, arr_f4);
                                        for(int v12 = 0; v12 < v1; ++v12) {
                                            arr_f3[v12] -= arr_f4[v12] * f1;
                                        }
                                    }
                                    float f2 = ((float)Math.sqrt(hxp.a(arr_f3, arr_f3))) < 0.000001f ? 0.000001f : ((float)Math.sqrt(hxp.a(arr_f3, arr_f3)));
                                    for(int v13 = 0; v13 < v1; ++v13) {
                                        arr_f3[v13] *= 1.0f / f2;
                                    }
                                    float[] arr_f5 = arr2_f2[v10];
                                    for(int v14 = 0; v14 < v4 + 1; ++v14) {
                                        arr_f5[v14] = v14 >= v10 ? hxp.a(arr_f3, arr2_f[v14]) : 0.0f;
                                    }
                                }
                                for(int v15 = v4; v15 >= 0; --v15) {
                                    float f3 = hxp.a(arr2_f1[v15], arr_f1);
                                    float[] arr_f6 = arr2_f2[v15];
                                    if(v15 + 1 <= v4) {
                                        for(int v16 = v4; true; --v16) {
                                            f3 -= arr_f6[v16] * arr_f2[v16];
                                            if(v16 == v15 + 1) {
                                                break;
                                            }
                                        }
                                    }
                                    arr_f2[v15] = f3 / arr_f6[v15];
                                }
                                return arr_f2[1] * 1000.0f;
                            }
                            catch(IllegalArgumentException unused_ex) {
                                return 0.0f;
                            }
                        }
                        case 1: {
                            boolean z = this.a;
                            float f4 = arr_f[v1 - 1];
                            int v17 = v1 - 1;
                            float f5 = 0.0f;
                            while(v17 > 0) {
                                float f6 = arr_f[v17 - 1];
                                if(f4 != f6) {
                                    float f7 = Math.abs(f5);
                                    float f8 = (z ? -arr_f1[v17 - 1] : arr_f1[v17] - arr_f1[v17 - 1]) / (f4 - f6);
                                    f5 += (f8 - Math.signum(f5) * ((float)Math.sqrt(f7 + f7))) * Math.abs(f8);
                                    if(v17 == v1 - 1) {
                                        f5 *= 0.5f;
                                    }
                                }
                                --v17;
                                f4 = f6;
                            }
                            float f9 = Math.abs(f5);
                            return Math.signum(f5) * ((float)Math.sqrt(f9 + f9)) * 1000.0f;
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                }
                throw null;
            }
        }
        return 0.0f;
    }

    public final float b(float f) {
        if(f <= 0.0f) {
            hxt.d(("maximumVelocity should be a positive value. You specified=" + f));
        }
        float f1 = this.a();
        if(f1 == 0.0f) {
            return 0.0f;
        }
        if(Float.isNaN(f1)) {
            return 0.0f;
        }
        return f1 > 0.0f ? ibwt.e(f1, f) : ibwt.d(f1, -f);
    }

    public final void c(long v, float f) {
        int v1 = (this.d + 1) % 20;
        this.d = v1;
        hxk[] arr_hxk = this.c;
        hxk hxk0 = arr_hxk[v1];
        if(hxk0 == null) {
            arr_hxk[v1] = new hxk(v, f);
            return;
        }
        hxk0.a = v;
        hxk0.b = f;
    }

    public final void d() {
        ibpg.ak(this.c, null);
        this.d = 0;
    }
}

