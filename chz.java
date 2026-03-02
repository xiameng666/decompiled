public final class chz implements cie {
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;

    public chz(float f, float f1, float f2, float f3) {
        int v1;
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        if(Float.isNaN(f) || Float.isNaN(f1) || Float.isNaN(f2) || Float.isNaN(f3)) {
            cjo.a(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f1 + ", " + f2 + ", " + f3 + '.'));
        }
        float[] arr_f = new float[5];
        float f4 = (1.0f - f3) * 3.0f;
        float f5 = (f3 - f1) * 3.0f;
        double f6 = (double)f5;
        float f7 = (f1 + 0.0f) * 3.0f;
        double f8 = f6 + f6;
        double f9 = (double)f4;
        double f10 = ((double)f7) - f8 + f9;
        if(Double.compare(f10, 0.0) != 0) {
            double f11 = -Math.sqrt(f6 * f6 - f9 * ((double)f7));
            double f12 = -((double)f7) + f6;
            int v2 = hkz.a(((float)(-(f11 + f12) / f10)), arr_f, 0);
            v1 = hkz.a(((float)((f11 - f12) / f10)), arr_f, v2) + v2;
            if(v1 > 1) {
                float f13 = arr_f[0];
                float f14 = arr_f[1];
                if((f13 > f14)) {
                    arr_f[0] = f14;
                    arr_f[1] = f13;
                }
                else if(f13 == f14) {
                    v1 = 1;
                }
            }
        }
        else if(f6 == f9) {
            v1 = 0;
        }
        else {
            v1 = hkz.a(((float)((f8 - f9) / (f8 - (f9 + f9)))), arr_f, 0);
        }
        float f15 = f4 - f5;
        float f16 = f5 - f7;
        float f17 = f16 + f16;
        int v3 = v1 + hkz.a(-f17 / (f15 + f15 - f17), arr_f, v1);
        float f18 = Math.min(0.0f, 1.0f);
        float f19 = Math.max(0.0f, 1.0f);
        for(int v = 0; v < v3; ++v) {
            float f20 = arr_f[v];
            float f21 = ((((f1 - f3) * 3.0f + 1.0f + 0.0f) * f20 + (f3 - (f1 + f1) + 0.0f) * 3.0f) * f20 + f7) * f20 + 0.0f;
            f18 = Math.min(f18, f21);
            f19 = Math.max(f19, f21);
        }
        long v4 = bxl.a(f18, f19);
        this.e = Float.intBitsToFloat(((int)(v4 >> 0x20)));
        this.f = Float.intBitsToFloat(((int)(v4 & 0xFFFFFFFFL)));
    }

    @Override  // cie
    public final float a(float f) {
        float f13;
        float f12;
        if((f > 0.0f) && (f < 1.0f)) {
            float f1 = Math.max(f, 1.192093E-07f);
            float f2 = this.a;
            float f3 = f2 - f1;
            float f4 = this.c;
            float f5 = f4 - f1;
            double f6 = ((double)(--f1)) + ((double)(f3 - f5)) * 3.0 + ((double)(1.0f - f1));
            float f7 = 0.0f;
            double f8 = ((double)(f3 - -f1)) * 3.0;
            double f9 = (double)f3;
            double f10 = (((double)(-f1)) - (f9 + f9) + ((double)f5)) * 3.0;
            if(Double.compare(Math.abs(f6 + 0.0), 1.000000E-07) >= 0) {
                double f19 = f10 / f6;
                double f20 = f8 / f6;
                double f21 = (f20 * 3.0 - f19 * f19) / 9.0;
                double f22 = ((f19 + f19) * f19 * f19 - f19 * 9.0 * f20 + ((double)(-f1)) / f6 * 27.0) / 54.0;
                double f23 = f21 * f21 * f21;
                double f24 = f22 * f22 + f23;
                int v = Double.compare(f24, 0.0);
                if(v < 0) {
                    double f25 = Math.sqrt(-f23);
                    double f26 = -f22 / f25;
                    if((f26 < -1.0)) {
                        f26 = -1.0;
                    }
                    if((f26 > 1.0)) {
                        f26 = 1.0;
                    }
                    double f27 = Math.acos(f26);
                    float f28 = jma.a(((float)f25));
                    double f29 = (double)(f28 + f28);
                    float f30 = (float)(Math.cos(f27 / 3.0) * f29 - f19 / 3.0);
                    float f31 = f30 < 0.0f ? 0.0f : f30;
                    if((f31 > 1.0f)) {
                        f31 = 1.0f;
                    }
                    if((Math.abs(f31 - f30) > 0.000001f)) {
                        f31 = NaNf;
                    }
                    if(Float.isNaN(f31)) {
                        float f32 = (float)(Math.cos((6.283185 + f27) / 3.0) * f29 - f19 / 3.0);
                        f31 = f32 < 0.0f ? 0.0f : f32;
                        if((f31 > 1.0f)) {
                            f31 = 1.0f;
                        }
                        if((Math.abs(f31 - f32) > 0.000001f)) {
                            f31 = NaNf;
                        }
                        if(Float.isNaN(f31)) {
                            float f33 = (float)(f29 * Math.cos((f27 + 12.566371) / 3.0) - f19 / 3.0);
                            if(f33 >= 0.0f) {
                                f7 = f33;
                            }
                            f12 = f7 > 1.0f ? 1.0f : f7;
                            f13 = Math.abs(f12 - f33) <= 0.000001f ? f12 : NaNf;
                        }
                        else {
                            f13 = f31;
                        }
                    }
                    else {
                        f13 = f31;
                    }
                }
                else if(v == 0) {
                    float f34 = -jma.a(((float)f22));
                    float f35 = f34 + f34 - ((float)(f19 / 3.0));
                    f13 = f35 < 0.0f ? 0.0f : f35;
                    if((f13 > 1.0f)) {
                        f13 = 1.0f;
                    }
                    if((Math.abs(f13 - f35) > 0.000001f)) {
                        f13 = NaNf;
                    }
                    if(Float.isNaN(f13)) {
                        float f36 = -f34 - ((float)(f19 / 3.0));
                        if(f36 >= 0.0f) {
                            f7 = f36;
                        }
                        f12 = f7 > 1.0f ? 1.0f : f7;
                        f13 = Math.abs(f12 - f36) <= 0.000001f ? f12 : NaNf;
                    }
                }
                else {
                    double f37 = Math.sqrt(f24);
                    float f38 = (float)(((double)(jma.a(((float)(-f22 + f37))) - jma.a(((float)(f22 + f37))))) - f19 / 3.0);
                    if(f38 >= 0.0f) {
                        f7 = f38;
                    }
                    f12 = f7 > 1.0f ? 1.0f : f7;
                    f13 = Math.abs(f12 - f38) > 0.000001f ? NaNf : f12;
                }
            }
            else if(!(Math.abs(f10 + 0.0) < 1.000000E-07)) {
                double f14 = f10 + f10;
                double f15 = Math.sqrt(f8 * f8 - 4.0 * f10 * ((double)(-f1)));
                float f16 = (float)((f15 - f8) / f14);
                float f17 = f16 < 0.0f ? 0.0f : f16;
                if((f17 > 1.0f)) {
                    f17 = 1.0f;
                }
                if((Math.abs(f17 - f16) > 0.000001f)) {
                    f17 = NaNf;
                }
                if(Float.isNaN(f17)) {
                    float f18 = (float)((-f8 - f15) / f14);
                    if(f18 >= 0.0f) {
                        f7 = f18;
                    }
                    f12 = f7 > 1.0f ? 1.0f : f7;
                    f13 = Math.abs(f12 - f18) <= 0.000001f ? f12 : NaNf;
                }
                else {
                    f13 = f17;
                }
            }
            else if(Math.abs(f8 + 0.0) >= 1.000000E-07) {
                float f11 = (float)(-((double)(-f1)) / f8);
                if(f11 >= 0.0f) {
                    f7 = f11;
                }
                f12 = f7 > 1.0f ? 1.0f : f7;
                f13 = Math.abs(f12 - f11) <= 0.000001f ? f12 : NaNf;
            }
            else {
                f13 = NaNf;
            }
            if(Float.isNaN(f13)) {
                throw new IllegalArgumentException("The cubic curve with parameters (" + f2 + ", " + this.b + ", " + f4 + ", " + this.d + ") has no solution at " + f);
            }
            float f39 = (((this.b - this.d + 0.333333f) * f13 + (this.d - (this.b + this.b))) * f13 + this.b) * 3.0f * f13;
            float f40 = this.e;
            float f41 = this.f;
            if((f39 < f40)) {
                f39 = f40;
            }
            return f39 > f41 ? f41 : f39;
        }
        return f;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof chz) && this.a == ((chz)object0).a && this.b == ((chz)object0).b && this.c == ((chz)object0).c && this.d == ((chz)object0).d;
    }

    @Override
    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b)) * 0x1F + Float.floatToIntBits(this.c)) * 0x1F + Float.floatToIntBits(this.d);
    }

    @Override
    public final String toString() {
        return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ')';
    }
}

