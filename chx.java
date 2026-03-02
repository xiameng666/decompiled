public final class chx {
    public final chw[][] a;

    public chx(int[] arr_v, float[] arr_f, float[][] arr2_f) {
        int v5;
        int v = arr_f.length - 1;
        chw[][] arr2_chw = new chw[v][];
        int v2 = 1;
        int v3 = 1;
        for(int v1 = 0; v1 < v; ++v1) {
            int v4 = arr_v[v1];
            switch(v4) {
                case 1: {
                    v2 = 1;
                    v5 = v2;
                    break;
                }
                case 2: {
                    v2 = 2;
                    v5 = v2;
                    break;
                }
                case 3: {
                    v2 = v2 == 1 ? 2 : 1;
                    v5 = v2;
                    break;
                }
                case 0: 
                case 4: {
                    v5 = 3;
                    break;
                }
                default: {
                    v5 = v4 == 5 ? 3 : v3;
                }
            }
            float[] arr_f1 = arr2_f[v1];
            float[] arr_f2 = arr2_f[v1 + 1];
            float f = arr_f[v1];
            float f1 = arr_f[v1 + 1];
            int v6 = (arr_f1.length & 1) + (arr_f1.length >> 1);
            chw[] arr_chw = new chw[v6];
            int v7 = 0;
            while(v7 < v6) {
                int v8 = v7 + v7;
                arr_chw[v7] = new chw(v5, f, f1, arr_f1[v8], arr_f1[v8 + 1], arr_f2[v8], arr_f2[v8 + 1]);
                ++v7;
                v6 = v6;
                arr_chw = arr_chw;
            }
            arr2_chw[v1] = arr_chw;
            v3 = v5;
        }
        this.a = arr2_chw;
    }
}

