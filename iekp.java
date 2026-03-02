import java.util.Arrays;

public final class iekp {
    public static byte[] a(byte[] arr_b, byte[] arr_b1, int v, int v1, int v2, int v3) {
        byte[] arr_b3;
        int[] arr_v;
        int v4 = v;
        if(arr_b == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        }
        if(arr_b1 == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        if(v4 > 1) {
            int v5 = v4 - 1;
            if((v4 & v5) == 0) {
                int v6 = v1;
                if(v6 == 1) {
                    if(v4 >= 0x10000) {
                        throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
                    }
                    v6 = 1;
                }
                if(v6 <= 0) {
                    throw new IllegalArgumentException("Block size r must be >= 1.");
                }
                int v7 = 0x7FFFFFFF / (v6 * 0x400);
                if(v2 <= 0 || v2 > v7) {
                    throw new IllegalArgumentException(a.x(v6, v7, "Parallelisation parameter p must be >= 1 and <= ", " (based on block size r of ", ")"));
                }
                if(v3 <= 0) {
                    throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
                }
                byte[] arr_b2 = iekp.g(arr_b, arr_b1, v2 * (v6 * 0x80));
                try {
                    int v9 = arr_b2.length >>> 2;
                    arr_v = new int[v9];
                    ifua.h(arr_b2, 0, arr_v);
                    int v10 = v4 * v6;
                    int v11 = 0;
                    while(v4 - v11 > 2 && v10 > 0x400) {
                        ++v11;
                        v10 >>>= 1;
                    }
                    int v12 = v6 * 0x80 >>> 2;
                    int v13 = 0;
                    while(v13 < v9) {
                        int v14 = v4 >>> v11;
                        int v15 = 1 << v11;
                        int[] arr_v1 = new int[16];
                        int[] arr_v2 = new int[16];
                        int[] arr_v3 = new int[v6 * 0x20];
                        int[] arr_v4 = new int[v6 * 0x20];
                        int v16 = Integer.numberOfTrailingZeros(v4) - v11;
                        int[][] arr2_v = new int[v15][];
                        int v17 = 0;
                        try {
                            System.arraycopy(arr_v, v13, arr_v4, 0, v6 * 0x20);
                            while(v17 < v15) {
                                int[] arr_v5 = new int[v14 * (v6 * 0x20)];
                                arr2_v[v17] = arr_v5;
                                int v20 = 0;
                                for(int v19 = 0; v19 < v14; v19 += 2) {
                                    System.arraycopy(arr_v4, 0, arr_v5, v20, v6 * 0x20);
                                    int v21 = v20 + v6 * 0x20;
                                    iekp.b(arr_v4, arr_v1, arr_v2, arr_v3, v6);
                                    System.arraycopy(arr_v3, 0, arr_v5, v21, v6 * 0x20);
                                    v20 = v21 + v6 * 0x20;
                                    iekp.b(arr_v3, arr_v1, arr_v2, arr_v4, v6);
                                }
                                ++v17;
                                v11 = v11;
                                v15 = v15;
                            }
                            int v22 = 0;
                            while(v22 < v4) {
                                int v23 = arr_v4[v6 * 0x20 - 16] & v5;
                                System.arraycopy(arr2_v[v23 >>> v16], (v23 & v14 - 1) * (v6 * 0x20), arr_v3, 0, v6 * 0x20);
                                iekp.f(arr_v3, arr_v4, 0, arr_v3);
                                iekp.b(arr_v3, arr_v1, arr_v2, arr_v4, v6);
                                ++v22;
                                v4 = v;
                            }
                            System.arraycopy(arr_v4, 0, arr_v, v13, v6 * 0x20);
                        }
                        finally {
                            iekp.e(arr2_v);
                            iekp.e(new int[][]{arr_v4, arr_v1, arr_v2, arr_v3});
                        }
                        v13 += v12;
                        v4 = v;
                        v9 = v9;
                        v12 = v12;
                        v5 = v5;
                        v11 = v11;
                    }
                    ifua.p(arr_v, arr_b2);
                    arr_b3 = iekp.g(arr_b, arr_b2, v3);
                }
                finally {
                    iekp.c(arr_b2);
                    iekp.d(arr_v);
                }
                return arr_b3;
            }
        }
        throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
    }

    private static void b(int[] arr_v, int[] arr_v1, int[] arr_v2, int[] arr_v3, int v) {
        System.arraycopy(arr_v, arr_v.length - 16, arr_v1, 0, 16);
        int v1 = v + v;
        int v2 = 0;
        int v3 = 0;
        while(v1 > 0) {
            iekp.f(arr_v1, arr_v, v2, arr_v2);
            ieip.k(8, arr_v2, arr_v1);
            System.arraycopy(arr_v1, 0, arr_v3, v3, 16);
            v3 = (arr_v.length >>> 1) + v2 - v3;
            v2 += 16;
            --v1;
        }
    }

    private static void c(byte[] arr_b) {
        if(arr_b != null) {
            Arrays.fill(arr_b, 0);
        }
    }

    private static void d(int[] arr_v) {
        if(arr_v != null) {
            iftq.C(arr_v);
        }
    }

    private static void e(int[][] arr2_v) {
        for(int v = 0; v < arr2_v.length; ++v) {
            iekp.d(arr2_v[v]);
        }
    }

    private static void f(int[] arr_v, int[] arr_v1, int v, int[] arr_v2) {
        int v1 = arr_v2.length;
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            arr_v2[v1] = arr_v[v1] ^ arr_v1[v + v1];
        }
    }

    private static byte[] g(byte[] arr_b, byte[] arr_b1, int v) {
        iekm iekm0 = new iekm(new ieex());
        iekm0.d(arr_b, arr_b1, 1);
        return ((iepk)iekm0.b(v * 8)).b;
    }
}

