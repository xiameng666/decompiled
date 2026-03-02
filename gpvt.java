public final class gpvt {
    public boolean a;
    private cjdt b;

    public gpvt() {
        this.a = false;
        this.b = null;
    }

    public final void a(cjdt cjdt0) {
        int v = cjdt0.a;
        if(v != cjdt0.b) {
            throw new IllegalArgumentException(String.format("Input matrix must be square (is size %d x %d)", v, ((int)cjdt0.b)));
        }
        cjdt cjdt1 = this.b != null && this.b.a >= v ? this.b : new cjdt(v, v);
        cjdt1.f(v, v);
        this.b = cjdt1;
        int v1 = cjdt0.a;
        for(int v2 = 0; v2 < cjdt0.c; v2 += cjdt0.a + 1) {
            int v3 = v2;
            double f = 0.0;
            while(v3 < v1) {
                double f1 = cjdt0.d[v3];
                int v4 = v3 - cjdt0.a;
                for(int v5 = v2 - cjdt0.a; v5 >= 0; v5 -= cjdt0.a) {
                    double[] arr_f = this.b.d;
                    f1 -= arr_f[v4] * arr_f[v5];
                    v4 -= cjdt0.a;
                }
                if(v3 == v2) {
                    if(this.a && f1 <= 0.0) {
                        throw new ArithmeticException(String.format("Input matrix must be positive definite.  Internal Sum: %f  Matrix: %s", f1, cjdt0.c(';')));
                    }
                    if((f1 < 0.0)) {
                        if(f1 < -0.001) {
                            throw new IllegalArgumentException(String.format("Input matrix must be positive definite\nMatrix: %s\nInternal Sum: %f", cjdt0, f1));
                        }
                        f = 0.0;
                    }
                    else {
                        f = Math.sqrt(f1);
                    }
                    this.b.d[v3] = f;
                }
                else {
                    this.b.d[v3] = f1 / f;
                }
                ++v3;
            }
            v1 += cjdt0.a;
        }
    }

    public final void b(cjdt cjdt0) {
        int v18;
        cjdt cjdt4;
        int v8;
        int v5;
        cjdt cjdt1 = this.b;
        if(cjdt1 == null) {
            throw new IllegalStateException("Must call decompose before calling invert");
        }
        int v = cjdt1.a;
        if(cjdt0.a != v || cjdt0.b != cjdt1.b) {
            throw new IllegalArgumentException(String.format("output has the wrong size, should be %d x %d but is %d x %d", v, ((int)this.b.b), ((int)cjdt0.a), ((int)cjdt0.b)));
        }
        int v1 = cjdt1.c;
        int v2 = 0;
        int v3 = 0;
        for(int v4 = 0; true; v4 += v8 + 1) {
            v5 = 1;
            if(v2 >= v1) {
                break;
            }
            int v6 = v3;
            int v7 = v4;
            while(true) {
                v8 = this.b.a;
                if(v6 >= v8) {
                    break;
                }
                double f = v3 == v6 ? 1.0 : 0.0;
                int v9 = v7 - v8;
                for(int v10 = v6 - 1; v10 >= v3; --v10) {
                    cjdt cjdt2 = this.b;
                    f -= cjdt2.d[v9] * cjdt0.d[v2 + v10];
                    v9 -= cjdt2.a;
                }
                cjdt cjdt3 = this.b;
                cjdt0.d[v2 + v6] = f / cjdt3.d[v7];
                v7 += cjdt3.a + 1;
                ++v6;
            }
            v2 += v8;
            ++v3;
        }
        int v11 = this.b.a;
        for(int v12 = v1 - v11; true; v12 -= this.b.a) {
            --v11;
            if(v11 < 0) {
                break;
            }
            int v13 = v1 - 1;
            int v14 = this.b.a;
            while(true) {
                --v14;
                if(v14 < v11) {
                    break;
                }
                int v15 = v12 + v14;
                double f1 = cjdt0.d[v15];
                int v16 = v13 + 1;
                for(int v17 = v14 + 1; true; ++v17) {
                    cjdt4 = this.b;
                    v18 = cjdt4.a;
                    if(v17 >= v18) {
                        break;
                    }
                    f1 -= cjdt4.d[v16] * cjdt0.d[v12 + v17];
                    ++v16;
                }
                cjdt0.d[v15] = f1 / cjdt4.d[v13];
                v13 -= v18 + 1;
            }
        }
        for(int v19 = this.b.a; v19 < v1; v19 += this.b.a) {
            int v20 = 0;
            for(int v21 = 0; v20 < v5; v21 += this.b.a) {
                cjdt0.d[v19 + v20] = cjdt0.d[v21 + v5];
                ++v20;
            }
            ++v5;
        }
    }
}

