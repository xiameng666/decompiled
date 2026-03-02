import java.math.BigInteger;

public final class igqi {
    public static final int[] a;
    private static final int[] b;
    private static final byte[] c;
    private static final igpz[] d;

    static {
        igqi.b = new int[]{13, 41, 0x79, 337, 897, 0x901};
        igqi.c = new byte[0];
        igqi.a = new int[0];
        igqi.d = new igpz[0];
    }

    public static int a(int v) {
        int[] arr_v = igqi.b;
        int v1;
        for(v1 = 0; v1 < 6 && v >= arr_v[v1]; ++v1) {
        }
        return v1 + 2;
    }

    public static igqh b(igpz igpz0) {
        return igqi.c(igpz0.b.r(igpz0, "bc_wnaf"));
    }

    public static igqh c(igqc igqc0) {
        return igqc0 == null || !(igqc0 instanceof igqh) ? new igqh() : ((igqh)igqc0);
    }

    public static byte[] d(int v, BigInteger bigInteger0) {
        if(v == 2) {
            if(bigInteger0.signum() == 0) {
                return igqi.c;
            }
            BigInteger bigInteger1 = bigInteger0.shiftLeft(1).add(bigInteger0);
            int v1 = bigInteger1.bitLength();
            byte[] arr_b = new byte[v1 - 1];
            BigInteger bigInteger2 = bigInteger1.xor(bigInteger0);
            for(int v2 = 1; v2 < v1 - 1; ++v2) {
                if(bigInteger2.testBit(v2)) {
                    arr_b[v2 - 1] = bigInteger0.testBit(v2) ? -1 : 1;
                    ++v2;
                }
            }
            arr_b[v1 - 2] = 1;
            return arr_b;
        }
        if(v < 2 || v > 8) {
            throw new IllegalArgumentException("\'width\' must be in the range [2, 8]");
        }
        if(bigInteger0.signum() == 0) {
            return igqi.c;
        }
        int v3 = bigInteger0.bitLength() + 1;
        byte[] arr_b1 = new byte[v3];
        int v4 = 0;
        int v5 = 0;
        boolean z = false;
        while(v4 <= bigInteger0.bitLength()) {
            if(bigInteger0.testBit(v4) == z) {
                ++v4;
            }
            else {
                bigInteger0 = bigInteger0.shiftRight(v4);
                int v6 = bigInteger0.intValue() & (1 << v) - 1;
                if(z) {
                    ++v6;
                }
                z = (v6 & 1 << v >>> 1) != 0;
                if(z) {
                    v6 -= 1 << v;
                }
                if(v5 > 0) {
                    --v4;
                }
                int v7 = v5 + v4;
                arr_b1[v7] = (byte)v6;
                v5 = v7 + 1;
                v4 = v;
            }
        }
        if(v3 > v5) {
            byte[] arr_b2 = new byte[v5];
            System.arraycopy(arr_b1, 0, arr_b2, 0, v5);
            return arr_b2;
        }
        return arr_b1;
    }

    public static int[] e(int[] arr_v, int v) {
        int[] arr_v1 = new int[v];
        System.arraycopy(arr_v, 0, arr_v1, 0, v);
        return arr_v1;
    }

    public static igqh f(igpz igpz0, int v) {
        int v4;
        int v3;
        igps igps0 = igpz0.b;
        igqh igqh0 = igqi.c(igps0.r(igpz0, "bc_wnaf"));
        int v1 = 0;
        int v2 = 1 << Math.max(0, v - 2);
        igpz[] arr_igpz = igqh0.a;
        if(arr_igpz == null) {
            arr_igpz = igqi.d;
            v3 = 0;
        }
        else {
            v3 = arr_igpz.length;
        }
        if(v3 < v2) {
            arr_igpz = igqi.g(arr_igpz, v2);
            if(v2 == 1) {
                arr_igpz[0] = igpz0.t();
            }
            else {
                if(v3 == 0) {
                    arr_igpz[0] = igpz0;
                    v4 = 1;
                }
                else {
                    v4 = v3;
                }
                igpv igpv0 = null;
                if(v2 == 2) {
                    arr_igpz[1] = igpz0.l();
                }
                else {
                    igpz igpz1 = igqh0.c;
                    igpz igpz2 = arr_igpz[v4 - 1];
                    if(igpz1 == null) {
                        igpz1 = arr_igpz[0].h();
                        igqh0.c = igpz1;
                        if(igpn.b(igps0) && igps0.d() >= 0x40 && (igps0.i == 2 || igps0.i == 3 || igps0.i == 4)) {
                            igpv igpv1 = igpz1.A();
                            igpz1 = igps0.o(igpz1.c.c(), igpz1.e().c());
                            igpv igpv2 = igpv1.m();
                            igpv igpv3 = igpv2.h(igpv1);
                            igpz2 = igpz2.b(igpv2).c(igpv3);
                            if(v3 == 0) {
                                arr_igpz[0] = igpz2;
                            }
                            igpv0 = igpv1;
                        }
                    }
                    while(v4 < v2) {
                        igpz2 = igpz2.f(igpz1);
                        arr_igpz[v4] = igpz2;
                        ++v4;
                    }
                }
                igps0.u(arr_igpz, v3, v2 - v3, igpv0);
            }
        }
        igqh0.a = arr_igpz;
        igpz[] arr_igpz1 = igqh0.b;
        if(arr_igpz1 == null) {
            arr_igpz1 = new igpz[v2];
        }
        else {
            v1 = arr_igpz1.length;
            if(v1 < v2) {
                arr_igpz1 = igqi.g(arr_igpz1, v2);
            }
        }
        while(v1 < v2) {
            arr_igpz1[v1] = arr_igpz[v1].g();
            ++v1;
        }
        igqh0.b = arr_igpz1;
        igps0.v(igpz0, "bc_wnaf", igqh0);
        return igqh0;
    }

    private static igpz[] g(igpz[] arr_igpz, int v) {
        igpz[] arr_igpz1 = new igpz[v];
        System.arraycopy(arr_igpz, 0, arr_igpz1, 0, arr_igpz.length);
        return arr_igpz1;
    }
}

