import java.math.BigInteger;

public final class igqg extends igpm {
    @Override  // igpm
    protected final igpz b(igpz igpz0, BigInteger bigInteger0) {
        igpz igpz2;
        int[] arr_v1;
        int[] arr_v;
        BigInteger bigInteger1 = bigInteger0;
        int v = Math.max(2, Math.min(16, igqi.a(bigInteger1.bitLength())));
        igqh igqh0 = igqi.f(igpz0, v);
        igpz[] arr_igpz = igqh0.a;
        igpz[] arr_igpz1 = igqh0.b;
        int v1 = 0;
        if(v == 2) {
            if(bigInteger1.bitLength() >>> 16 != 0) {
                throw new IllegalArgumentException("\'k\' must have bitlength < 2^16");
            }
            if(bigInteger1.signum() == 0) {
                arr_v = igqi.a;
                goto label_62;
            }
            BigInteger bigInteger2 = bigInteger1.shiftLeft(1).add(bigInteger1);
            int v2 = bigInteger2.bitLength();
            arr_v1 = new int[v2 >> 1];
            BigInteger bigInteger3 = bigInteger2.xor(bigInteger1);
            int v3 = 0;
            for(int v4 = 1; v4 < v2 - 1; ++v4) {
                if(bigInteger3.testBit(v4)) {
                    arr_v1[v1] = (bigInteger1.testBit(v4) ? -1 : 1) << 16 | v3;
                    ++v4;
                    v3 = 1;
                    ++v1;
                }
                else {
                    ++v3;
                }
            }
            arr_v1[v1] = 0x10000 | v3;
            if(v2 >> 1 > v1 + 1) {
                arr_v = igqi.e(arr_v1, v1 + 1);
                goto label_62;
            }
            arr_v = arr_v1;
        }
        else {
            if(v < 2 || v > 16) {
                throw new IllegalArgumentException("\'width\' must be in the range [2, 16]");
            }
            if(bigInteger1.bitLength() >>> 16 != 0) {
                throw new IllegalArgumentException("\'k\' must have bitlength < 2^16");
            }
            if(bigInteger1.signum() == 0) {
                arr_v = igqi.a;
            }
            else {
                int v5 = bigInteger1.bitLength() / v + 1;
                arr_v1 = new int[v5];
                int v6 = 0;
                int v7 = 0;
                boolean z = false;
                while(v6 <= bigInteger1.bitLength()) {
                    if(bigInteger1.testBit(v6) == z) {
                        ++v6;
                    }
                    else {
                        bigInteger1 = bigInteger1.shiftRight(v6);
                        int v8 = bigInteger1.intValue() & (1 << v) - 1;
                        if(z) {
                            ++v8;
                        }
                        z = (v8 & 1 << v >>> 1) != 0;
                        if(z) {
                            v8 -= 1 << v;
                        }
                        if(v7 > 0) {
                            --v6;
                        }
                        arr_v1[v7] = v8 << 16 | v6;
                        v6 = v;
                        ++v7;
                    }
                }
                arr_v = v5 <= v7 ? arr_v1 : igqi.e(arr_v1, v7);
            }
        }
    label_62:
        igpz igpz1 = igpz0.b.k();
        int v9 = arr_v.length;
        if(v9 > 1) {
            --v9;
            int v10 = arr_v[v9];
            int v11 = (char)v10;
            igpz[] arr_igpz2 = v10 >> 16 >= 0 ? arr_igpz : arr_igpz1;
            int v12 = Math.abs(v10 >> 16);
            if(v12 << 2 < 1 << v) {
                int v13 = v - igqb.a[v12];
                igpz2 = arr_igpz2[(1 << v - 1) - 1 >>> 1].f(arr_igpz2[((v12 ^ 1 << igqb.a[v12] - 1) << v13) + 1 >>> 1]);
                v11 -= v13;
            }
            else {
                igpz2 = arr_igpz2[v12 >>> 1];
            }
            igpz1 = igpz2.m(v11);
        }
        while(v9 > 0) {
            --v9;
            int v14 = arr_v[v9];
            igpz1 = igpz1.i((v14 >> 16 >= 0 ? arr_igpz : arr_igpz1)[Math.abs(v14 >> 16) >>> 1]).m(((int)(((char)v14))));
        }
        return igpz1;
    }
}

