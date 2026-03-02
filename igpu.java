import java.math.BigInteger;
import java.util.Random;

public final class igpu extends igpv {
    BigInteger a;
    BigInteger g;
    BigInteger h;

    public igpu(BigInteger bigInteger0, BigInteger bigInteger1, BigInteger bigInteger2) {
        if(bigInteger2 == null || bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger0) >= 0) {
            throw new IllegalArgumentException("x value invalid in Fp field element");
        }
        this.a = bigInteger0;
        this.g = bigInteger1;
        this.h = bigInteger2;
    }

    @Override  // igpv
    public final int b() {
        return this.a.bitLength();
    }

    @Override  // igpv
    public final BigInteger c() {
        return this.h;
    }

    @Override  // igpv
    public final igpv d(igpv igpv0) {
        BigInteger bigInteger0 = this.a;
        BigInteger bigInteger1 = this.g;
        BigInteger bigInteger2 = this.h.add(igpv0.c());
        if(bigInteger2.compareTo(this.a) >= 0) {
            bigInteger2 = bigInteger2.subtract(this.a);
        }
        return new igpu(bigInteger0, bigInteger1, bigInteger2);
    }

    @Override  // igpv
    public final igpv e() {
        BigInteger bigInteger0 = this.h.add(igpo.c);
        if(bigInteger0.compareTo(this.a) == 0) {
            bigInteger0 = igpo.b;
        }
        return new igpu(this.a, this.g, bigInteger0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof igpu) ? this.a.equals(((igpu)object0).a) && this.h.equals(((igpu)object0).h) : false;
    }

    @Override  // igpv
    public final igpv f(igpv igpv0) {
        return new igpu(this.a, this.g, this.v(this.h, this.u(igpv0.c())));
    }

    @Override  // igpv
    public final igpv g() {
        return new igpu(this.a, this.g, this.u(this.h));
    }

    @Override  // igpv
    public final igpv h(igpv igpv0) {
        return new igpu(this.a, this.g, this.v(this.h, igpv0.c()));
    }

    @Override
    public final int hashCode() {
        return this.h.hashCode() ^ this.a.hashCode();
    }

    @Override  // igpv
    public final igpv i(igpv igpv0, igpv igpv1, igpv igpv2) {
        BigInteger bigInteger0 = this.h;
        BigInteger bigInteger1 = igpv0.c();
        BigInteger bigInteger2 = igpv1.c();
        BigInteger bigInteger3 = igpv2.c();
        BigInteger bigInteger4 = bigInteger0.multiply(bigInteger1);
        BigInteger bigInteger5 = bigInteger2.multiply(bigInteger3);
        return new igpu(this.a, this.g, this.w(bigInteger4.subtract(bigInteger5)));
    }

    @Override  // igpv
    public final igpv j(igpv igpv0, igpv igpv1, igpv igpv2) {
        BigInteger bigInteger0 = this.h;
        BigInteger bigInteger1 = igpv0.c();
        BigInteger bigInteger2 = igpv1.c();
        BigInteger bigInteger3 = igpv2.c();
        BigInteger bigInteger4 = bigInteger0.multiply(bigInteger1);
        BigInteger bigInteger5 = bigInteger2.multiply(bigInteger3);
        return new igpu(this.a, this.g, this.w(bigInteger4.add(bigInteger5)));
    }

    @Override  // igpv
    public final igpv k() {
        return this.h.signum() == 0 ? this : new igpu(this.a, this.g, this.a.subtract(this.h));
    }

    @Override  // igpv
    public final igpv l() {
        if(!this.s() && !this.r()) {
            if(this.a.testBit(0)) {
                if(this.a.testBit(1)) {
                    BigInteger bigInteger0 = this.a.shiftRight(2).add(igpo.c);
                    return this.x(new igpu(this.a, this.g, this.h.modPow(bigInteger0, this.a)));
                }
                if(this.a.testBit(2)) {
                    BigInteger bigInteger1 = this.h.modPow(this.a.shiftRight(3), this.a);
                    BigInteger bigInteger2 = this.v(bigInteger1, this.h);
                    if(this.v(bigInteger2, bigInteger1).equals(igpo.c)) {
                        return this.x(new igpu(this.a, this.g, bigInteger2));
                    }
                    BigInteger bigInteger3 = this.a.shiftRight(2);
                    BigInteger bigInteger4 = this.v(bigInteger2, igpo.d.modPow(bigInteger3, this.a));
                    return this.x(new igpu(this.a, this.g, bigInteger4));
                }
                BigInteger bigInteger5 = this.a.shiftRight(1);
                BigInteger bigInteger6 = this.h.modPow(bigInteger5, this.a);
                BigInteger bigInteger7 = igpo.c;
                igpv igpv0 = null;
                if(!bigInteger6.equals(bigInteger7)) {
                    return null;
                }
                BigInteger bigInteger8 = this.h;
                BigInteger bigInteger9 = this.q(this.q(bigInteger8));
                BigInteger bigInteger10 = bigInteger5.add(bigInteger7);
                BigInteger bigInteger11 = this.a.subtract(bigInteger7);
                Random random0 = new Random();
                while(true) {
                    BigInteger bigInteger12 = new BigInteger(this.a.bitLength(), random0);
                    if(bigInteger12.compareTo(this.a) < 0 && this.w(bigInteger12.multiply(bigInteger12).subtract(bigInteger9)).modPow(bigInteger5, this.a).equals(bigInteger11)) {
                        int v = bigInteger10.bitLength();
                        int v1 = bigInteger10.getLowestSetBit();
                        int v2 = v - 1;
                        BigInteger bigInteger13 = igpo.d;
                        BigInteger bigInteger14 = bigInteger7;
                        BigInteger bigInteger15 = bigInteger14;
                        BigInteger bigInteger16 = bigInteger12;
                        BigInteger bigInteger17 = bigInteger15;
                        while(v2 >= v1 + 1) {
                            bigInteger15 = this.v(bigInteger15, bigInteger17);
                            if(bigInteger10.testBit(v2)) {
                                BigInteger bigInteger18 = this.v(bigInteger15, bigInteger8);
                                BigInteger bigInteger19 = this.v(bigInteger14, bigInteger16);
                                BigInteger bigInteger20 = this.w(bigInteger16.multiply(bigInteger13).subtract(bigInteger12.multiply(bigInteger15)));
                                bigInteger16 = this.w(bigInteger16.multiply(bigInteger16).subtract(bigInteger18.shiftLeft(1)));
                                bigInteger13 = bigInteger20;
                                bigInteger14 = bigInteger19;
                                bigInteger17 = bigInteger18;
                            }
                            else {
                                BigInteger bigInteger21 = this.w(bigInteger14.multiply(bigInteger13).subtract(bigInteger15));
                                BigInteger bigInteger22 = this.w(bigInteger16.multiply(bigInteger13).subtract(bigInteger12.multiply(bigInteger15)));
                                bigInteger13 = this.w(bigInteger13.multiply(bigInteger13).subtract(bigInteger15.shiftLeft(1)));
                                bigInteger17 = bigInteger15;
                                bigInteger16 = bigInteger22;
                                bigInteger14 = bigInteger21;
                            }
                            --v2;
                            bigInteger5 = bigInteger5;
                        }
                        BigInteger bigInteger23 = this.v(bigInteger15, bigInteger17);
                        BigInteger bigInteger24 = this.v(bigInteger23, bigInteger8);
                        BigInteger bigInteger25 = this.w(bigInteger14.multiply(bigInteger13).subtract(bigInteger23));
                        BigInteger bigInteger26 = this.w(bigInteger16.multiply(bigInteger13).subtract(bigInteger12.multiply(bigInteger23)));
                        BigInteger bigInteger27 = this.v(bigInteger23, bigInteger24);
                        for(int v3 = 1; v3 <= v1; ++v3) {
                            bigInteger25 = this.v(bigInteger25, bigInteger26);
                            bigInteger26 = this.w(bigInteger26.multiply(bigInteger26).subtract(bigInteger27.shiftLeft(1)));
                            bigInteger27 = this.v(bigInteger27, bigInteger27);
                        }
                        if(this.v(bigInteger26, bigInteger26).equals(bigInteger9)) {
                            BigInteger bigInteger28 = this.a;
                            BigInteger bigInteger29 = this.g;
                            if(bigInteger26.testBit(0)) {
                                bigInteger26 = this.a.subtract(bigInteger26);
                            }
                            return new igpu(bigInteger28, bigInteger29, bigInteger26.shiftRight(1));
                        }
                        if(!bigInteger25.equals(bigInteger7) && !bigInteger25.equals(bigInteger11)) {
                            return igpv0;
                        }
                        igpv0 = igpv0;
                        bigInteger5 = bigInteger5;
                    }
                }
            }
            throw new RuntimeException("not done yet");
        }
        return this;
    }

    @Override  // igpv
    public final igpv m() {
        return new igpu(this.a, this.g, this.v(this.h, this.h));
    }

    @Override  // igpv
    public final igpv n(igpv igpv0, igpv igpv1) {
        BigInteger bigInteger0 = this.h;
        BigInteger bigInteger1 = igpv0.c();
        BigInteger bigInteger2 = igpv1.c();
        BigInteger bigInteger3 = bigInteger0.multiply(bigInteger0);
        BigInteger bigInteger4 = bigInteger1.multiply(bigInteger2);
        return new igpu(this.a, this.g, this.w(bigInteger3.add(bigInteger4)));
    }

    @Override  // igpv
    public final igpv p(igpv igpv0) {
        BigInteger bigInteger0 = this.a;
        BigInteger bigInteger1 = this.g;
        BigInteger bigInteger2 = this.h.subtract(igpv0.c());
        if(bigInteger2.signum() < 0) {
            bigInteger2 = bigInteger2.add(this.a);
        }
        return new igpu(bigInteger0, bigInteger1, bigInteger2);
    }

    protected final BigInteger q(BigInteger bigInteger0) {
        BigInteger bigInteger1 = bigInteger0.shiftLeft(1);
        return bigInteger1.compareTo(this.a) < 0 ? bigInteger1 : bigInteger1.subtract(this.a);
    }

    protected final BigInteger u(BigInteger bigInteger0) {
        int v7;
        byte[] arr_b;
        int v = this.b();
        int[] arr_v = igqu.d(v, this.a);
        int[] arr_v1 = igqu.d(v, bigInteger0);
        int v1 = v + 0x1F >> 5;
        int[] arr_v2 = new int[v1];
        int v3 = 0;
        while(v3 < arr_v.length) {
            if(arr_v1[v3] != 0) {
                if(igqu.b(arr_v.length, arr_v1)) {
                    System.arraycopy(arr_v1, 0, arr_v2, 0, arr_v.length);
                }
                else {
                    int[] arr_v3 = igqu.c(arr_v.length, arr_v1);
                    int[] arr_v4 = new int[arr_v.length];
                    arr_v4[0] = 1;
                    int v4 = (arr_v3[0] & 1) == 0 ? igqt.a(arr_v, arr_v3, arr_v.length, arr_v4, 0) : 0;
                    if(igqu.b(arr_v.length, arr_v3)) {
                        igqt.b(arr_v, v4, arr_v4, arr_v2);
                    }
                    else {
                        int[] arr_v5 = igqu.c(arr_v.length, arr_v);
                        int[] arr_v6 = new int[arr_v.length];
                        int v5 = arr_v.length;
                        int v6 = 0;
                        while(true) {
                            while(true) {
                                v7 = v5 - 1;
                                if(arr_v3[v7] == 0 && arr_v5[v7] == 0) {
                                    v5 = v7;
                                }
                                else {
                                label_29:
                                    if(v7 < 0) {
                                        goto label_41;
                                    }
                                    int v8 = arr_v3[v7] ^ 0x80000000;
                                    int v9 = arr_v5[v7] ^ 0x80000000;
                                    if(v8 >= v9) {
                                        goto label_38;
                                    }
                                    igqu.a(v5, arr_v3, arr_v5);
                                    v6 = igqt.a(arr_v, arr_v5, v5, arr_v6, v6 + (igqu.a(arr_v.length, arr_v4, arr_v6) - v4));
                                    if(igqu.b(v5, arr_v5)) {
                                        break;
                                    }
                                }
                            }
                            igqt.b(arr_v, v6, arr_v6, arr_v2);
                            break;
                        label_38:
                            if(v8 <= v9) {
                                --v7;
                                goto label_29;
                            }
                        label_41:
                            igqu.a(v5, arr_v5, arr_v3);
                            v4 = igqt.a(arr_v, arr_v3, v5, arr_v4, v4 + (igqu.a(arr_v.length, arr_v6, arr_v4) - v6));
                            if(igqu.b(v5, arr_v3)) {
                                igqt.b(arr_v, v4, arr_v4, arr_v2);
                                break;
                            }
                        }
                    }
                }
                arr_b = new byte[v1 << 2];
                for(int v2 = 0; v2 < v1; ++v2) {
                    int v10 = arr_v2[v2];
                    if(v10 != 0) {
                        igqz.a(v10, arr_b, v1 - 1 - v2 << 2);
                    }
                }
                return new BigInteger(1, arr_b);
            }
            ++v3;
        }
        throw new IllegalArgumentException("\'x\' cannot be 0");
    }

    protected final BigInteger v(BigInteger bigInteger0, BigInteger bigInteger1) {
        return this.w(bigInteger0.multiply(bigInteger1));
    }

    protected final BigInteger w(BigInteger bigInteger0) {
        if(this.g != null) {
            boolean z = bigInteger0.signum() < 0;
            if(z) {
                bigInteger0 = bigInteger0.abs();
            }
            int v = this.a.bitLength();
            boolean z1 = this.g.equals(igpo.c);
            while(bigInteger0.bitLength() > v + 1) {
                BigInteger bigInteger1 = bigInteger0.shiftRight(v);
                BigInteger bigInteger2 = bigInteger0.subtract(bigInteger1.shiftLeft(v));
                if(!z1) {
                    bigInteger1 = bigInteger1.multiply(this.g);
                }
                bigInteger0 = bigInteger1.add(bigInteger2);
            }
            while(bigInteger0.compareTo(this.a) >= 0) {
                bigInteger0 = bigInteger0.subtract(this.a);
            }
            return !z || bigInteger0.signum() == 0 ? bigInteger0 : this.a.subtract(bigInteger0);
        }
        return bigInteger0.mod(this.a);
    }

    private final igpv x(igpv igpv0) {
        return igpv0.m().equals(this) ? igpv0 : null;
    }
}

