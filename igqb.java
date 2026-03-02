import java.math.BigInteger;

final class igqb implements Cloneable {
    static final byte[] a;
    public long[] b;
    private static final short[] c;

    static {
        igqb.c = new short[]{0, 1, 4, 5, 16, 17, 20, 21, 0x40, 65, 68, 69, 80, 81, 84, 85, 0x100, 0x101, 260, 0x105, 0x110, 273, 276, 277, 320, 321, 324, 325, 0x150, 337, 340, 341, 0x400, 0x401, 0x404, 0x405, 1040, 1041, 1044, 1045, 0x440, 1089, 1092, 1093, 0x450, 1105, 1108, 1109, 0x500, 0x501, 0x504, 0x505, 0x510, 0x511, 1300, 1301, 0x540, 0x541, 0x544, 0x545, 0x550, 0x551, 0x554, 0x555, 0x1000, 0x1001, 4100, 0x1005, 0x1010, 0x1011, 0x1014, 0x1015, 0x1040, 0x1041, 0x1044, 0x1045, 0x1050, 0x1051, 4180, 0x1055, 0x1100, 0x1101, 0x1104, 0x1105, 0x1110, 4369, 4372, 4373, 0x1140, 4417, 4420, 4421, 0x1150, 4433, 4436, 4437, 0x1400, 0x1401, 0x1404, 0x1405, 0x1410, 5137, 5140, 5141, 0x1440, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 0x1500, 0x1501, 5380, 0x1505, 0x1510, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 0x1550, 5457, 5460, 5461, 0x4000, 0x4001, 0x4004, 0x4005, 0x4010, 0x4011, 0x4014, 0x4015, 0x4040, 0x4041, 0x4044, 0x4045, 0x4050, 0x4051, 0x4054, 0x4055, 0x4100, 0x4101, 0x4104, 0x4105, 0x4110, 0x4111, 16660, 0x4115, 0x4140, 16705, 16708, 16709, 0x4150, 0x4151, 0x4154, 0x4155, 0x4400, 0x4401, 0x4404, 0x4405, 0x4410, 0x4411, 0x4414, 0x4415, 0x4440, 0x4441, 0x4444, 0x4445, 0x4450, 0x4451, 0x4454, 0x4455, 0x4500, 0x4501, 0x4504, 0x4505, 0x4510, 0x4511, 0x4514, 0x4515, 0x4540, 0x4541, 0x4544, 0x4545, 0x4550, 0x4551, 0x4554, 0x4555, 0x5000, 0x5001, 0x5004, 0x5005, 0x5010, 0x5011, 20500, 20501, 0x5040, 0x5041, 0x5044, 0x5045, 0x5050, 0x5051, 0x5054, 0x5055, 0x5100, 0x5101, 20740, 0x5105, 0x5110, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 0x5150, 20817, 20820, 20821, 0x5400, 0x5401, 0x5404, 0x5405, 0x5410, 0x5411, 0x5414, 0x5415, 0x5440, 0x5441, 0x5444, 0x5445, 0x5450, 0x5451, 0x5454, 0x5455, 0x5500, 0x5501, 0x5504, 0x5505, 0x5510, 0x5511, 21780, 0x5515, 0x5540, 0x5541, 0x5544, 0x5545, 0x5550, 0x5551, 0x5554, 0x5555};
        igqb.a = new byte[]{0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    }

    public igqb(int v) {
        this.b = new long[v];
    }

    public igqb(BigInteger bigInteger0) {
        int v = 1;
        super();
        if(bigInteger0.signum() < 0) {
            throw new IllegalArgumentException("invalid F2m field value");
        }
        if(bigInteger0.signum() == 0) {
            this.b = new long[]{0L};
            return;
        }
        byte[] arr_b = bigInteger0.toByteArray();
        int v1 = arr_b.length;
        if(arr_b[0] == 0) {
            --v1;
        }
        else {
            v = 0;
        }
        int v2 = (v1 + 7) / 8;
        this.b = new long[v2];
        int v3 = v2 - 1;
        int v4 = v1 % 8 + v;
        if(v < v4) {
            long v5 = 0L;
            while(v < v4) {
                v5 = v5 << 8 | ((long)(arr_b[v] & 0xFF));
                ++v;
            }
            this.b[v3] = v5;
            v3 = v2 - 2;
        }
        while(v3 >= 0) {
            long v6 = 0L;
            int v7 = 0;
            while(v7 < 8) {
                v6 = v6 << 8 | ((long)(arr_b[v] & 0xFF));
                ++v7;
                ++v;
            }
            this.b[v3] = v6;
            --v3;
        }
    }

    public igqb(long[] arr_v) {
        this.b = arr_v;
    }

    public igqb(long[] arr_v, int v) {
        if(v == arr_v.length) {
            this.b = arr_v;
            return;
        }
        long[] arr_v1 = new long[v];
        this.b = arr_v1;
        System.arraycopy(arr_v, 0, arr_v1, 0, v);
    }

    public final int a() {
        long v1;
        int v = this.b.length;
        do {
            if(v == 0) {
                return 0;
            }
            --v;
            v1 = this.b[v];
        }
        while(v1 == 0L);
        return (v << 6) + igqb.t(v1);
    }

    public final int b(int v) {
        long v2;
        int v1 = v + 62 >>> 6;
        do {
            if(v1 == 0) {
                return 0;
            }
            --v1;
            v2 = this.b[v1];
        }
        while(v2 == 0L);
        return (v1 << 6) + igqb.t(v2);
    }

    public final int c() {
        long[] arr_v = this.b;
        int v = Math.min(arr_v.length, arr_v.length);
        if(v <= 0) {
            return 0;
        }
        if(arr_v[0] == 0L) {
            while(true) {
                if(arr_v[v - 1] != 0L) {
                    return v;
                }
                if(v - 1 <= 0) {
                    return 0;
                }
                --v;
            }
        }
        while(arr_v[v - 1] == 0L) {
            --v;
        }
        return v;
    }

    @Override
    public final Object clone() {
        long[] arr_v = this.b;
        if(arr_v == null) {
            return new igqb(null);
        }
        long[] arr_v1 = new long[arr_v.length];
        System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
        return new igqb(arr_v1);
    }

    public static long d(long[] arr_v, int v, long[] arr_v1, int v1, int v2, int v3) {
        long v5 = 0L;
        for(int v4 = 0; v4 < v2; ++v4) {
            long v6 = arr_v1[v1 + v4];
            int v7 = v + v4;
            arr_v[v7] ^= v5 | v6 << v3;
            v5 = v6 >>> 0x40 - v3;
        }
        return v5;
    }

    public static long e(int v) {
        return ((long)(igqb.c[v & 0xFF] | igqb.c[v >>> 8 & 0xFF] << 16)) & 0xFFFFFFFFL | (((long)(igqb.c[v >>> 24] << 16 | igqb.c[v >>> 16 & 0xFF])) & 0xFFFFFFFFL) << 0x20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof igqb)) {
            return false;
        }
        int v = this.c();
        if(((igqb)object0).c() == v) {
            for(int v1 = 0; v1 < v; ++v1) {
                if(this.b[v1] != ((igqb)object0).b[v1]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void f(long[] arr_v, int v, long[] arr_v1, int v1, long[] arr_v2, int v2, int v3) {
        for(int v4 = 0; v4 < v3; ++v4) {
            arr_v2[v2 + v4] = arr_v[v + v4] ^ arr_v1[v1 + v4];
        }
    }

    public static void g(long[] arr_v, int v, long[] arr_v1, int v1, long[] arr_v2, int v2, int v3) {
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = v + v4;
            arr_v[v5] ^= arr_v1[v1 + v4] ^ arr_v2[v2 + v4];
        }
    }

    public final void h(igqb igqb0, int v, int v1) {
        int v2 = v + 0x3F >>> 6;
        if((v1 & 0x3F) == 0) {
            igqb.u(this.b, v1 >>> 6, igqb0.b, 0, v2);
            return;
        }
        long v3 = igqb.d(this.b, v1 >>> 6, igqb0.b, 0, v2, v1 & 0x3F);
        if(v3 != 0L) {
            int v4 = v2 + (v1 >>> 6);
            this.b[v4] ^= v3;
        }
    }

    @Override
    public final int hashCode() {
        int v = this.c();
        int v2 = 1;
        for(int v1 = 0; v1 < v; ++v1) {
            long v3 = this.b[v1];
            v2 = (v2 * 0x1F ^ ((int)v3)) * 0x1F ^ ((int)(v3 >>> 0x20));
        }
        return v2;
    }

    public final void i(int v, int[] arr_v) {
        long[] arr_v1 = this.b;
        int v1 = igqb.q(arr_v1, arr_v1.length, v, arr_v);
        if(v1 < arr_v1.length) {
            long[] arr_v2 = new long[v1];
            this.b = arr_v2;
            System.arraycopy(arr_v1, 0, arr_v2, 0, v1);
        }
    }

    public final boolean j() {
        long[] arr_v = this.b;
        if(arr_v[0] == 1L) {
            for(int v = 1; v < arr_v.length; ++v) {
                if(arr_v[v] != 0L) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean k() {
        long[] arr_v = this.b;
        for(int v = 0; v < arr_v.length; ++v) {
            if(arr_v[v] != 0L) {
                return false;
            }
        }
        return true;
    }

    public final long[] l(int v) {
        long[] arr_v = new long[v];
        System.arraycopy(this.b, 0, arr_v, 0, Math.min(this.b.length, v));
        return arr_v;
    }

    public final void m(igqb igqb0) {
        int v = igqb0.c();
        if(v == 0) {
            return;
        }
        if(v > this.b.length) {
            this.b = this.l(v);
        }
        igqb.u(this.b, 0, igqb0.b, 0, v);
    }

    public final igqb n(igqb igqb0) {
        int v = this.a();
        if(v == 0) {
            return this;
        }
        int v1 = igqb0.a();
        if(v1 == 0) {
            return igqb0;
        }
        igqb igqb1 = v <= v1 ? igqb0 : this;
        igqb igqb2 = v > v1 ? igqb0 : this;
        int v2 = v <= v1 ? v1 : v;
        if(v > v1) {
            v = v1;
        }
        int v3 = v + 0x3F >>> 6;
        int v4 = v + v2 + 62 >>> 6;
        int v5 = v2 + 0x3F >>> 6;
        if(v3 == 1) {
            long v7 = igqb2.b[0];
            if(v7 == 1L) {
                return igqb1;
            }
            long[] arr_v = new long[v4];
            igqb.o(v7, igqb1.b, v5, arr_v);
            return new igqb(arr_v, v4);
        }
        int v8 = v2 + 70 >>> 6;
        int v9 = v8 << 4;
        int[] arr_v1 = new int[16];
        long[] arr_v2 = new long[v9];
        arr_v1[1] = v8;
        System.arraycopy(igqb1.b, 0, arr_v2, v8, v5);
        int v10 = v8;
        int v11 = 2;
        while(v11 < 16) {
            int v12 = v10 + v8;
            arr_v1[v11] = v12;
            if((v11 & 1) == 0) {
                igqb.s(arr_v2, v12 >>> 1, arr_v2, v12, v8, 1);
            }
            else {
                igqb.f(arr_v2, v8, arr_v2, v12 - v8, arr_v2, v12, v8);
                v8 = v8;
                v12 = v12;
            }
            ++v11;
            v10 = v12;
        }
        long[] arr_v3 = new long[v9];
        igqb.s(arr_v2, 0, arr_v3, 0, v9, 4);
        long[] arr_v4 = igqb2.b;
        int v13 = v4 << 3;
        long[] arr_v5 = new long[v13];
        for(int v6 = 0; v6 < v3; ++v6) {
            long v14 = arr_v4[v6];
            for(int v15 = v6; true; v15 += v4) {
                igqb.g(arr_v5, v15, arr_v2, arr_v1[((int)v14) & 15], arr_v3, arr_v1[((int)(v14 >>> 4)) & 15], v8);
                arr_v2 = arr_v2;
                v8 = v8;
                v14 >>>= 8;
                if(v14 == 0L) {
                    break;
                }
            }
        }
        int v16;
        while((v16 = v13 - v4) != 0) {
            igqb.d(arr_v5, v16 - v4, arr_v5, v16, v4, 8);
            v13 = v16;
        }
        return new igqb(arr_v5, v4);
    }

    public static void o(long v, long[] arr_v, int v1, long[] arr_v1) {
        long[] arr_v3;
        int v2 = v1;
        long[] arr_v2 = arr_v1;
        if(Long.compare(v & 1L, 0L) == 0) {
            arr_v3 = arr_v;
        }
        else {
            arr_v3 = arr_v;
            igqb.u(arr_v2, 0, arr_v3, 0, v2);
        }
        long v3 = v;
        int v4 = 1;
        while(true) {
            v3 >>>= 1;
            if(v3 == 0L) {
                break;
            }
            if((v3 & 1L) != 0L) {
                long v5 = igqb.d(arr_v2, 0, arr_v3, 0, v2, v4);
                if(v5 != 0L) {
                    arr_v1[v1] ^= v5;
                }
            }
            ++v4;
            arr_v3 = arr_v;
            v2 = v1;
            arr_v2 = arr_v1;
        }
    }

    public static void p(long[] arr_v, int v, int v1, int[] arr_v1) {
        int v3;
        igqb.v(arr_v, v);
        int v2 = arr_v1.length;
        while(true) {
            v3 = v - v1;
            --v2;
            if(v2 < 0) {
                break;
            }
            igqb.v(arr_v, arr_v1[v2] + v3);
        }
        igqb.v(arr_v, v3);
    }

    public static int q(long[] arr_v, int v, int v1, int[] arr_v1) {
        int[] arr_v2 = arr_v1;
        int v2 = v1 + 0x3F >>> 6;
        if(v < v2) {
            return v;
        }
        int v3 = Math.min(v << 6, v1 + v1 - 1);
        int v4;
        for(v4 = (v << 6) - v3; v4 >= 0x40; v4 += 0xFFFFFFC0) {
            --v;
        }
        int v5 = arr_v2.length;
        int v6 = Math.max(v1, arr_v2[v5 - 1] + 0x40);
        int v7 = v4 + Math.min(v3 - v6, v1 - (v5 <= 1 ? 0 : arr_v2[v5 - 2])) >> 6;
        if(v7 > 1) {
            int v8 = v - v7;
            int v9 = v - v8;
            int v10 = (v8 << 6) - v1;
            while(true) {
                --v5;
                if(v5 < 0) {
                    break;
                }
                igqb.w(arr_v, arr_v, v8, v9, arr_v2[v5] + v10);
            }
            igqb.w(arr_v, arr_v, v8, v9, v10);
            while(v > v8) {
                --v;
                arr_v[v] = 0L;
            }
            v3 = v8 << 6;
        }
        if(v3 > v6) {
            while(true) {
                --v;
                if(v <= v6 >>> 6) {
                    break;
                }
                long v11 = arr_v[v];
                if(v11 != 0L) {
                    arr_v[v] = 0L;
                    igqb.y(arr_v, v << 6, v11, v1, arr_v2);
                }
                arr_v2 = arr_v1;
            }
            long v12 = arr_v[v6 >>> 6];
            long v13 = v12 >>> (v6 & 0x3F);
            if(v13 == 0L) {
                arr_v2 = arr_v1;
                v3 = v6;
            }
            else {
                arr_v[v6 >>> 6] = v12 ^ v13 << (v6 & 0x3F);
                arr_v2 = arr_v1;
                v3 = v6;
                igqb.y(arr_v, v3, v13, v1, arr_v2);
            }
        }
        int v14 = v3;
        if(v14 > v1) {
            while(true) {
                --v14;
                if(v14 < v1) {
                    break;
                }
                if((arr_v[v14 >>> 6] & 1L << (v14 & 0x3F)) != 0L) {
                    igqb.p(arr_v, v14, v1, arr_v2);
                }
            }
        }
        return v2;
    }

    public static igqb r(long[] arr_v, int v, int v1, int[] arr_v1) {
        return new igqb(arr_v, igqb.q(arr_v, v, v1, arr_v1));
    }

    public static void s(long[] arr_v, int v, long[] arr_v1, int v1, int v2, int v3) {
        long v5 = 0L;
        for(int v4 = 0; v4 < v2; ++v4) {
            long v6 = arr_v[v + v4];
            arr_v1[v1 + v4] = v5 | v6 << v3;
            v5 = v6 >>> 0x40 - v3;
        }
    }

    private static int t(long v) {
        int v1 = 0x20;
        int v2 = (int)(v >>> 0x20);
        if(v2 == 0) {
            v2 = (int)v;
            v1 = 0;
        }
        if(v2 >>> 16 == 0) {
            return v2 >>> 8 == 0 ? v1 + igqb.a[v2] : v1 + (igqb.a[v2 >>> 8] + 8);
        }
        return v2 >>> 24 == 0 ? v1 + (igqb.a[v2 >>> 16] + 16) : v1 + (igqb.a[v2 >>> 24] + 24);
    }

    @Override
    public final String toString() {
        int v = this.c();
        if(v == 0) {
            return "0";
        }
        int v1 = v - 1;
        StringBuffer stringBuffer0 = new StringBuffer(Long.toBinaryString(this.b[v1]));
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            String s = Long.toBinaryString(this.b[v1]);
            int v2 = s.length();
            if(v2 < 0x40) {
                stringBuffer0.append("0000000000000000000000000000000000000000000000000000000000000000".substring(v2));
            }
            stringBuffer0.append(s);
        }
        return stringBuffer0.toString();
    }

    private static void u(long[] arr_v, int v, long[] arr_v1, int v1, int v2) {
        for(int v3 = 0; v3 < v2; ++v3) {
            int v4 = v + v3;
            arr_v[v4] ^= arr_v1[v1 + v3];
        }
    }

    private static void v(long[] arr_v, int v) {
        int v1 = v >>> 6;
        arr_v[v1] ^= 1L << (v & 0x3F);
    }

    private static void w(long[] arr_v, long[] arr_v1, int v, int v1, int v2) {
        int v3 = v1;
        if((v2 & 0x3F) == 0) {
            igqb.u(arr_v, v2 >>> 6, arr_v1, v, v3);
            return;
        }
        int v4 = 0x40 - (v2 & 0x3F);
        long v5;
        for(v5 = 0L; true; v5 = v6 << 0x40 - v4) {
            --v3;
            if(v3 < 0) {
                break;
            }
            long v6 = arr_v1[v + v3];
            int v7 = (v2 >>> 6) + 1 + v3;
            arr_v[v7] ^= v5 | v6 >>> v4;
        }
        arr_v[v2 >>> 6] ^= v5;
    }

    private static void x(long[] arr_v, int v, long v1) {
        if((v & 0x3F) == 0) {
            arr_v[v >>> 6] ^= v1;
            return;
        }
        arr_v[v >>> 6] ^= v1 << (v & 0x3F);
        long v2 = v1 >>> 0x40 - (v & 0x3F);
        if(v2 != 0L) {
            int v3 = (v >>> 6) + 1;
            arr_v[v3] ^= v2;
        }
    }

    private static void y(long[] arr_v, int v, long v1, int v2, int[] arr_v1) {
        int v4;
        int v3 = arr_v1.length;
        while(true) {
            v4 = v - v2;
            --v3;
            if(v3 < 0) {
                break;
            }
            igqb.x(arr_v, v4 + arr_v1[v3], v1);
        }
        igqb.x(arr_v, v4, v1);
    }
}

