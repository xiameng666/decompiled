public final class ghft extends ghfj {
    public static final ghfz a;

    static {
        ghft.a = new ghft();
    }

    @Override  // ghff
    public final ghfy f(byte[] arr_b, int v) {
        long v29;
        long v28;
        long v26;
        long v6;
        byte[] arr_b1 = arr_b;
        gftb.p(0, v, arr_b1.length);
        if(v <= 0x20) {
            long v1 = ((long)v) * 0xC6A4A7935BD1E995L ^ 0xEC9B9EE68CF8F8DDL;
            for(int v2 = 0; v2 < (v & -8); v2 += 8) {
                v1 = (v1 ^ ghft.j(ghgl.b(arr_b1, v2) * 0xC6A4A7935BD1E995L) * 0xC6A4A7935BD1E995L) * 0xC6A4A7935BD1E995L;
            }
            if((v & 7) != 0) {
                int v3 = Math.min(v & 7, 8);
                long v5 = 0L;
                for(int v4 = 0; v4 < v3; ++v4) {
                    v5 |= (((long)arr_b1[(v & -8) + v4]) & 0xFFL) << v4 * 8;
                }
                v1 = (v1 ^ v5) * 0xC6A4A7935BD1E995L;
            }
            v6 = ghft.j(ghft.j(v1) * 0xC6A4A7935BD1E995L);
        }
        else if(v <= 0x40) {
            long v7 = ghgl.b(arr_b1, 24);
            long v8 = ghgl.b(arr_b1, 0) + (((long)v) + ghgl.b(arr_b1, v - 16)) * -6505348102511208375L;
            long v9 = v8 + ghgl.b(arr_b1, 8);
            long v10 = v9 + ghgl.b(arr_b1, 16);
            long v11 = ghgl.b(arr_b1, 16) + ghgl.b(arr_b1, v - 0x20);
            long v12 = ghgl.b(arr_b1, v - 8);
            long v13 = v11 + ghgl.b(arr_b1, v - 24);
            long v14 = v13 + ghgl.b(arr_b1, v - 16);
            long v15 = Long.rotateRight(v8 + v7, 52) + Long.rotateRight(v10, 0x1F) + (Long.rotateRight(v8, 37) + Long.rotateRight(v9, 7));
            v6 = ghft.j(ghft.j((v7 + v10 + (Long.rotateRight(v11 + v12, 52) + Long.rotateRight(v14, 0x1F) + (Long.rotateRight(v11, 37) + Long.rotateRight(v13, 7)))) * 0xC47B6E9E3A970ED3L + (v14 + v12 + v15) * -6505348102511208375L) * -6505348102511208375L + v15) * 0xC47B6E9E3A970ED3L;
        }
        else {
            long v16 = ghgl.b(arr_b1, 0);
            long v17 = ghgl.b(arr_b1, v - 16) ^ 0x8D58AC26AFE12E47L;
            long v18 = ghgl.b(arr_b1, v - 56) ^ -6505348102511208375L;
            long[] arr_v = new long[2];
            long[] arr_v1 = new long[2];
            ghft.k(arr_b1, v - 0x40, ((long)v), v17, arr_v1);
            arr_b1 = arr_b;
            ghft.k(arr_b1, v - 0x20, ((long)v) * 0x8D58AC26AFE12E47L, -6505348102511208375L, arr_v);
            long v19 = v18 + ghft.j(arr_v1[1]) * 0x8D58AC26AFE12E47L;
            long v20 = Long.rotateRight(v19 + v16, 39) * 0x8D58AC26AFE12E47L;
            long v21 = Long.rotateRight(v17, 33) * 0x8D58AC26AFE12E47L;
            int v22 = v - 1 & 0xFFFFFFC0;
            int v23 = 0;
            while(true) {
                long v24 = Long.rotateRight(v20 + v21 + arr_v1[0] + ghgl.b(arr_b1, v23 + 16), 37) * 0x8D58AC26AFE12E47L;
                long v25 = Long.rotateRight(v21 + arr_v1[1] + ghgl.b(arr_b1, v23 + 0x30), 42) * 0x8D58AC26AFE12E47L;
                v26 = arr_v[1] ^ v24;
                long v27 = v25 ^ arr_v1[0];
                v28 = Long.rotateRight(v19 ^ arr_v[0], 33);
                ghft.k(arr_b1, v23, arr_v1[1] * 0x8D58AC26AFE12E47L, v26 + arr_v[0], arr_v1);
                arr_b1 = arr_b;
                v29 = v27;
                ghft.k(arr_b1, v23 + 0x20, v28 + arr_v[1], v29, arr_v);
                v22 += 0xFFFFFFC0;
                if(v22 == 0) {
                    break;
                }
                v21 = v29;
                v23 += 0x40;
                v20 = v28;
                v19 = v26;
            }
            v6 = ghft.i(ghft.i(arr_v1[0], arr_v[0]) + ghft.j(v29) * 0x8D58AC26AFE12E47L + v26, ghft.i(arr_v1[1], arr_v[1]) + v28);
        }
        long v30 = v < 8 ? -6505348102511208375L : ghgl.b(arr_b1, 0);
        long v31 = ghft.i(v6 + (v < 9 ? -6505348102511208375L : ghgl.b(arr_b1, v - 8)), v30);
        if(v31 != 0L) {
            return v31 == 1L ? new ghfx(-1L) : new ghfx(v31);
        }
        return new ghfx(-2L);
    }

    static long i(long v, long v1) {
        long v2 = (v1 ^ v) * 0xC6A4A7935BD1E995L;
        long v3 = (v ^ (v2 ^ v2 >>> 0x2F)) * 0xC6A4A7935BD1E995L;
        return (v3 ^ v3 >>> 0x2F) * 0xC6A4A7935BD1E995L;
    }

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
        arr_v[1] = Long.rotateRight(v2 + v3 + v6, 51) + Long.rotateRight(v7, 23) + v3;
    }

    @Override
    public final String toString() {
        return "Hashing.fingerprint2011()";
    }
}

