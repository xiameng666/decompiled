public final class ifto {
    protected iftm[] a;
    protected iftm[] b;
    private iftg c;
    private iftm d;

    public ifto(iftg iftg0, iftm iftm0) {
        int[] arr_v5;
        int v2;
        this.c = iftg0;
        this.d = iftm0;
        int v = iftm0.c();
        this.a = new iftm[v];
        for(int v1 = 0; true; ++v1) {
            v2 = v >> 1;
            if(v1 >= v2) {
                break;
            }
            int v3 = v1 + v1;
            int[] arr_v = new int[v3 + 1];
            arr_v[v3] = 1;
            iftm[] arr_iftm = this.a;
            arr_iftm[v1] = new iftm(this.c, arr_v);
        }
        while(v2 < v) {
            int v4 = v2 + v2;
            int[] arr_v1 = new int[v4 + 1];
            arr_v1[v4] = 1;
            iftm iftm1 = new iftm(this.c, arr_v1);
            iftm[] arr_iftm1 = this.a;
            int[] arr_v2 = iftm1.c;
            int[] arr_v3 = this.d.c;
            int v5 = iftm.a(arr_v3);
            if(v5 == -1) {
                throw new ArithmeticException("Division by zero");
            }
            int[] arr_v4 = new int[arr_v2.length];
            int v6 = iftm1.a.a(iftm.d(arr_v3));
            System.arraycopy(arr_v2, 0, arr_v4, 0, arr_v2.length);
            while(v5 <= iftm.a(arr_v4)) {
                int v7 = iftm.d(arr_v4);
                int v8 = iftm1.a.b(v7, v6);
                int v9 = iftm.a(arr_v4) - v5;
                int v10 = iftm.a(arr_v3);
                if(v10 == -1) {
                    arr_v5 = new int[1];
                }
                else {
                    int[] arr_v6 = new int[v10 + v9 + 1];
                    System.arraycopy(arr_v3, 0, arr_v6, v9, v10 + 1);
                    arr_v5 = arr_v6;
                }
                arr_v4 = iftm.i(iftm1.h(arr_v5, v8), arr_v4);
            }
            arr_iftm1[v2] = new iftm(iftm1.a, arr_v4);
            ++v2;
            continue;
        }
        int v11 = this.d.c();
        iftm[] arr_iftm2 = new iftm[v11];
        int v12 = v11 - 1;
        for(int v13 = v12; v13 >= 0; --v13) {
            arr_iftm2[v13] = new iftm(this.a[v13]);
        }
        this.b = new iftm[v11];
        while(v12 >= 0) {
            iftm[] arr_iftm3 = this.b;
            arr_iftm3[v12] = new iftm(this.c, v12);
            --v12;
        }
        for(int v14 = 0; v14 < v11; ++v14) {
            if(arr_iftm2[v14].b(v14) == 0) {
                boolean z = false;
                for(int v15 = v14 + 1; v15 < v11; ++v15) {
                    if(arr_iftm2[v15].b(v14) != 0) {
                        ifto.a(arr_iftm2, v14, v15);
                        ifto.a(this.b, v14, v15);
                        v15 = v11;
                        z = true;
                    }
                }
                if(!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int v16 = this.c.a(arr_iftm2[v14].b(v14));
            arr_iftm2[v14].g(v16);
            this.b[v14].g(v16);
            for(int v17 = 0; v17 < v11; ++v17) {
                if(v17 != v14) {
                    int v18 = arr_iftm2[v17].b(v14);
                    if(v18 != 0) {
                        iftm iftm2 = arr_iftm2[v14].e(v18);
                        iftm iftm3 = this.b[v14].e(v18);
                        arr_iftm2[v17].f(iftm2);
                        this.b[v17].f(iftm3);
                    }
                }
            }
        }
    }

    private static void a(iftm[] arr_iftm, int v, int v1) {
        iftm iftm0 = arr_iftm[v];
        arr_iftm[v] = arr_iftm[v1];
        arr_iftm[v1] = iftm0;
    }
}

