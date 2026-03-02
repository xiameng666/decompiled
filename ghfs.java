public final class ghfs extends ghfj {
    public static final ghfz a;

    static {
        ghfs.a = new ghfs();
    }

    @Override  // ghff
    public final ghfy f(byte[] arr_b, int v) {
        long v30;
        long v29;
        long v27;
        int v24;
        byte[] arr_b1 = arr_b;
        gftb.p(0, v, arr_b1.length);
        if(v <= 0x20) {
            if(v <= 16) {
                if(v >= 8) {
                    long v1 = (long)v;
                    long v2 = v1 + v1 - 0x651E95C4D06FBFB1L;
                    long v3 = ghgl.b(arr_b1, 0) - 0x651E95C4D06FBFB1L;
                    long v4 = ghgl.b(arr_b1, v - 8);
                    return new ghfx(ghfs.i(Long.rotateRight(v4, 37) * v2 + v3, (Long.rotateRight(v3, 25) + v4) * v2, v2));
                }
                if(v >= 4) {
                    return new ghfx(ghfs.i(((long)v) + ((((long)ghgl.a(arr_b1, 0)) & 0xFFFFFFFFL) << 3), ((long)ghgl.a(arr_b1, v - 4)) & 0xFFFFFFFFL, ((long)(v + v)) - 0x651E95C4D06FBFB1L));
                }
                return v <= 0 ? new ghfx(0x9AE16A3B2F90404FL) : new ghfx(0x9AE16A3B2F90404FL * ghfs.j(((long)((arr_b1[0] & 0xFF) + ((arr_b1[v >> 1] & 0xFF) << 8))) * 0x9AE16A3B2F90404FL ^ ((long)(((arr_b1[v - 1] & 0xFF) << 2) + v)) * 0xC3A5C85C97CB3127L));
            }
            long v5 = ghgl.b(arr_b1, 0) * 0xB492B66FBE98F273L;
            long v6 = ghgl.b(arr_b1, 8);
            long v7 = (long)v;
            long v8 = v7 + v7 - 0x651E95C4D06FBFB1L;
            long v9 = ghgl.b(arr_b1, v - 8) * v8;
            return new ghfx(ghfs.i(Long.rotateRight(v5 + v6, 43) + Long.rotateRight(v9, 30) + ghgl.b(arr_b1, v - 16) * 0x9AE16A3B2F90404FL, v5 + Long.rotateRight(v6 - 0x651E95C4D06FBFB1L, 18) + v9, v8));
        }
        if(v <= 0x40) {
            long v10 = ghgl.b(arr_b1, 0) * 0x9AE16A3B2F90404FL;
            long v11 = ghgl.b(arr_b1, 8);
            long v12 = (long)v;
            long v13 = v12 + v12 - 0x651E95C4D06FBFB1L;
            long v14 = ghgl.b(arr_b1, v - 8) * v13;
            long v15 = ghgl.b(arr_b1, v - 16) * 0x9AE16A3B2F90404FL;
            long v16 = ghgl.b(arr_b1, 16) * v13;
            long v17 = ghgl.b(arr_b1, 24);
            long v18 = Long.rotateRight(v10 + v11, 43) + Long.rotateRight(v14, 30) + v15;
            long v19 = (v18 + ghgl.b(arr_b1, v - 0x20)) * v13;
            return new ghfx(ghfs.i(Long.rotateRight(v16 + v17, 43) + Long.rotateRight(v19, 30) + (ghfs.i(v18, Long.rotateRight(v11 - 0x651E95C4D06FBFB1L, 18) + v10 + v14, v13) + ghgl.b(arr_b1, v - 24)) * v13, v16 + Long.rotateRight(v17 + v10, 18) + v19, v13));
        }
        long[] arr_v = new long[2];
        long[] arr_v1 = new long[2];
        long v20 = ghgl.b(arr_b1, 0) + 0x1529CBA0CA458FFL;
        long v21 = 1390051526045402406L;
        int v23 = 0;
        for(long v22 = 2480279821605975764L; true; v22 = v30) {
            v24 = (v - 1 >> 6) * 0x40;
            long v25 = Long.rotateRight(v20 + v22 + arr_v[0] + ghgl.b(arr_b1, v23 + 8), 37) * 0xB492B66FBE98F273L;
            long v26 = Long.rotateRight(v22 + arr_v[1] + ghgl.b(arr_b1, v23 + 0x30), 42) * 0xB492B66FBE98F273L;
            v27 = v25 ^ arr_v1[1];
            long v28 = arr_v[0] + ghgl.b(arr_b1, v23 + 40);
            v29 = Long.rotateRight(v21 + arr_v1[0], 33) * 0xB492B66FBE98F273L;
            ghfs.k(arr_b1, v23, arr_v[1] * 0xB492B66FBE98F273L, v27 + arr_v1[0], arr_v);
            v30 = v26 + v28;
            ghfs.k(arr_b1, v23 + 0x20, v29 + arr_v1[1], ghgl.b(arr_b1, v23 + 16) + v30, arr_v1);
            v23 += 0x40;
            if(v23 == v24) {
                break;
            }
            arr_b1 = arr_b;
            v21 = v27;
            v20 = v29;
            arr_v = arr_v;
        }
        int v31 = v - 1 & 0x3F;
        int v32 = v24 + v31;
        long v33 = v27 & 0xFFL;
        long v34 = v33 + v33 - 0x4B6D499041670D8DL;
        long v35 = arr_v1[0] + ((long)v31);
        long v36 = arr_v[0] + v35;
        arr_v[0] = v36;
        arr_v1[0] = v35 + v36;
        long v37 = Long.rotateRight(v29 + v30 + v36 + ghgl.b(arr_b1, v32 - 55), 37) * v34;
        long v38 = Long.rotateRight(v30 + arr_v[1] + ghgl.b(arr_b1, v32 - 15), 42) * v34;
        long v39 = arr_v1[1] * 9L;
        long v40 = arr_v[0] * 9L + ghgl.b(arr_b1, v32 - 23);
        long v41 = Long.rotateRight(v27 + arr_v1[0], 33) * v34;
        long v42 = v37 ^ v39;
        ghfs.k(arr_b1, v32 - 0x3F, arr_v[1] * v34, v42 + arr_v1[0], arr_v);
        long v43 = v38 + v40;
        ghfs.k(arr_b1, v32 - 0x1F, arr_v1[1] + v41, ghgl.b(arr_b1, v32 - 0x2F) + v43, arr_v1);
        return new ghfx(ghfs.i(ghfs.i(arr_v[0], arr_v1[0], v34) + ghfs.j(v43) * 0xC3A5C85C97CB3127L + v42, ghfs.i(arr_v[1], arr_v1[1], v34) + v41, v34));
    }

    private static long i(long v, long v1, long v2) {
        long v3 = (v ^ v1) * v2;
        long v4 = (v3 ^ v3 >>> 0x2F ^ v1) * v2;
        return (v4 ^ v4 >>> 0x2F) * v2;
    }

    // String Decryptor: 1 succeeded, 0 failed
    private static long j(long v) {
        return v ^ v >>> 0x2F;
    }

    private static void k(byte[] arr_b, int v, long v1, long v2, long[] arr_v) {
        long v3 = v1 + ghgl.b(arr_b, v);
        long v4 = ghgl.b(arr_b, v + 8);
        long v5 = ghgl.b(arr_b, v + 16);
        long v6 = ghgl.b(arr_b, v + 24);
        long v7 = v4 + v3 + v5;
        arr_v[0] = v7 + v6;
        arr_v[1] = Long.rotateRight(v2 + v3 + v6, 21) + Long.rotateRight(v7, 44) + v3;
    }

    @Override
    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}

