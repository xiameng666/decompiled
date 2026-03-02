public final class gpvu {
    public static void a(cjdt cjdt0, cjdt cjdt1, cjdt cjdt2) {
        gpvu.g(cjdt0, cjdt1, cjdt2);
        for(int v = 0; v < cjdt0.c; ++v) {
            cjdt2.d[v] = cjdt0.d[v] + cjdt1.d[v];
        }
    }

    public static void b(cjdt cjdt0, cjdt cjdt1, cjdt cjdt2) {
        int v = cjdt0.b;
        if(v != cjdt1.a) {
            throw new IllegalArgumentException(String.format("Number of columns in A doesn\'t match number of rows in B (%d != %d)", v, ((int)cjdt1.a)));
        }
        int v1 = cjdt0.a;
        if(cjdt2.a != v1 || cjdt2.b != cjdt1.b) {
            throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", v1, ((int)cjdt1.b), ((int)cjdt2.a), ((int)cjdt2.b)));
        }
        if(cjdt2 == cjdt0 || cjdt2 == cjdt1) {
            throw new IllegalArgumentException("c must be a different object from a or b");
        }
        int v2 = 0;
        for(int v3 = 0; v2 < cjdt2.c; v3 += cjdt1.a) {
            int v4 = cjdt1.a + v3;
            int v5 = 0;
            for(int v6 = v2; v5 < cjdt0.a; ++v6) {
                double f = 0.0;
                int v7 = v3;
                int v8 = v5;
                while(v7 < v4) {
                    f += cjdt0.d[v8] * cjdt1.d[v7];
                    v8 += cjdt0.a;
                    ++v7;
                }
                cjdt2.d[v6] = f;
                ++v5;
            }
            v2 += cjdt2.a;
        }
    }

    public static void c(cjdt cjdt0, cjdt cjdt1, cjdt cjdt2) {
        int v = cjdt0.b;
        if(v != cjdt1.a) {
            throw new IllegalArgumentException(String.format("Number of columns in A doesn\'t match number of rows in B (%d != %d)", v, ((int)cjdt1.a)));
        }
        int v1 = cjdt0.a;
        if(cjdt2.a != v1 || cjdt2.b != cjdt1.b) {
            throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", v1, ((int)cjdt1.b), ((int)cjdt2.a), ((int)cjdt2.b)));
        }
        if(cjdt2 == cjdt0 || cjdt2 == cjdt1) {
            throw new IllegalArgumentException("c must be a different object from a or b");
        }
        int v2 = 0;
        for(int v3 = 0; v2 < cjdt2.c; v3 += cjdt1.a) {
            int v4 = cjdt1.a + v3;
            int v5 = 0;
            for(int v6 = v2; v5 < cjdt0.a; ++v6) {
                double f = 0.0;
                int v7 = v3;
                int v8 = v5;
                while(v7 < v4) {
                    f += cjdt0.d[v8] * cjdt1.d[v7];
                    v8 += cjdt0.a;
                    ++v7;
                }
                cjdt2.d[v6] += f;
                ++v5;
            }
            v2 += cjdt2.a;
        }
    }

    public static void d(cjdt cjdt0, cjdt cjdt1, cjdt cjdt2) {
        int v = cjdt0.a;
        if(v != cjdt1.a) {
            throw new IllegalArgumentException(String.format("Number of columns in A\' doesn\'t match number of rows in B (%d != %d)", v, ((int)cjdt1.a)));
        }
        int v1 = cjdt0.b;
        if(cjdt2.a != v1 || cjdt2.b != cjdt1.b) {
            throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", v1, ((int)cjdt1.b), ((int)cjdt2.a), ((int)cjdt2.b)));
        }
        if(cjdt2 == cjdt0 || cjdt2 == cjdt1) {
            throw new IllegalArgumentException("c must be a different object from a or b");
        }
        int v2 = 0;
        for(int v3 = 0; v2 < cjdt2.c; v3 += cjdt1.a) {
            int v4 = cjdt1.a + v3;
            int v5 = 0;
            for(int v6 = v2; v5 < cjdt0.c; ++v6) {
                double f = 0.0;
                int v7 = v3;
                int v8 = v5;
                while(v7 < v4) {
                    f += cjdt0.d[v8] * cjdt1.d[v7];
                    ++v8;
                    ++v7;
                }
                cjdt2.d[v6] = f;
                v5 += cjdt0.a;
            }
            v2 += cjdt2.a;
        }
    }

    public static void e(cjdt cjdt0, cjdt cjdt1, cjdt cjdt2) {
        int v = cjdt0.b;
        if(v != cjdt1.b) {
            throw new IllegalArgumentException(String.format("Number of columns in A doesn\'t match number of rows in B\' (%d != %d)", v, ((int)cjdt1.b)));
        }
        int v1 = cjdt0.a;
        if(cjdt2.a != v1 || cjdt2.b != cjdt1.a) {
            throw new IllegalArgumentException(String.format("C has wrong dimensions (should be %d x %d but is %d x %d)", v1, ((int)cjdt1.a), ((int)cjdt2.a), ((int)cjdt2.b)));
        }
        if(cjdt2 == cjdt0 || cjdt2 == cjdt1) {
            throw new IllegalArgumentException("c must be a different object from a or b");
        }
        int v2 = 0;
        for(int v3 = 0; v2 < cjdt2.c; ++v3) {
            int v4 = cjdt1.c;
            int v5 = 0;
            for(int v6 = v2; v5 < cjdt0.a; ++v6) {
                double f = 0.0;
                int v7 = v3;
                int v8 = v5;
                while(v7 < v4) {
                    f += cjdt0.d[v8] * cjdt1.d[v7];
                    v8 += cjdt0.a;
                    v7 += cjdt1.a;
                }
                cjdt2.d[v6] = f;
                ++v5;
            }
            v2 += cjdt2.a;
        }
    }

    public static void f(cjdt cjdt0, cjdt cjdt1, cjdt cjdt2) {
        gpvu.g(cjdt0, cjdt1, cjdt2);
        for(int v = 0; v < cjdt0.c; ++v) {
            cjdt2.d[v] = cjdt0.d[v] - cjdt1.d[v];
        }
    }

    private static void g(cjdt cjdt0, cjdt cjdt1, cjdt cjdt2) {
        int v = cjdt0.b;
        if(v == cjdt1.b) {
            int v1 = cjdt0.a;
            if(v1 == cjdt1.a) {
                if(cjdt2.a == v1 && cjdt2.b == v) {
                    return;
                }
                throw new IllegalArgumentException(String.format("output has wrong dimensions (should be %d x %d but is %d x %d)", v1, ((int)cjdt0.b), ((int)cjdt2.a), ((int)cjdt2.b)));
            }
        }
        throw new IllegalArgumentException(String.format("Dimensions of A and B don\'t match (A is %d x %d and B is %d x %d)", ((int)cjdt0.a), ((int)cjdt0.b), ((int)cjdt1.a), ((int)cjdt1.b)));
    }
}

