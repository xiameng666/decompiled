import java.math.BigInteger;

public final class igqa extends igpm {
    protected final igps a;
    protected final igqm b;

    public igqa(igps igps0, igqm igqm0) {
        if(igps0.g == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.a = igps0;
        this.b = igqm0;
    }

    @Override  // igpm
    protected final igpz b(igpz igpz0, BigInteger bigInteger0) {
        if(!this.a.w(igpz0.b)) {
            throw new IllegalStateException();
        }
        BigInteger bigInteger1 = bigInteger0.mod(igpz0.b.g);
        BigInteger bigInteger2 = igqm.a(bigInteger1, this.b.a.f, this.b.a.h);
        BigInteger bigInteger3 = igqm.a(bigInteger1, this.b.a.g, this.b.a.h);
        BigInteger bigInteger4 = bigInteger1.subtract(bigInteger2.multiply(this.b.a.b).add(bigInteger3.multiply(this.b.a.d)));
        BigInteger bigInteger5 = bigInteger2.multiply(this.b.a.c).add(bigInteger3.multiply(this.b.a.e)).negate();
        int v = bigInteger4.signum();
        int v1 = bigInteger5.signum();
        BigInteger bigInteger6 = bigInteger4.abs();
        BigInteger bigInteger7 = bigInteger5.abs();
        int v2 = Math.max(2, Math.min(16, igqi.a(Math.max(bigInteger6.bitLength(), bigInteger7.bitLength()))));
        igps igps0 = igpz0.b;
        igqh igqh0 = igqi.f(igpz0, v2);
        igqd igqd0 = this.b.b;
        igpz igpz1 = igqd0.a(igpz0);
        igqh igqh1 = igqi.c(igps0.r(igpz1, "bc_wnaf"));
        igpz igpz2 = igqh0.c;
        if(igpz2 != null) {
            igqh1.c = igqd0.a(igpz2);
        }
        igpz[] arr_igpz = igqh0.a;
        igpz[] arr_igpz1 = new igpz[arr_igpz.length];
        for(int v3 = 0; v3 < arr_igpz.length; ++v3) {
            arr_igpz1[v3] = igqd0.a(arr_igpz[v3]);
        }
        igqh1.a = arr_igpz1;
        igpz[] arr_igpz2 = new igpz[arr_igpz.length];
        for(int v4 = 0; v4 < arr_igpz.length; ++v4) {
            arr_igpz2[v4] = arr_igpz1[v4].g();
        }
        igqh1.b = arr_igpz2;
        igps0.v(igpz1, "bc_wnaf", igqh1);
        igqh igqh2 = igqi.b(igpz0);
        igqh igqh3 = igqi.b(igpz1);
        igpz[] arr_igpz3 = v < 0 ? igqh2.b : igqh2.a;
        igpz[] arr_igpz4 = v1 < 0 ? igqh3.b : igqh3.a;
        igpz[] arr_igpz5 = v < 0 ? igqh2.a : igqh2.b;
        igpz[] arr_igpz6 = v1 < 0 ? igqh3.a : igqh3.b;
        byte[] arr_b = igqi.d(v2, bigInteger6);
        byte[] arr_b1 = igqi.d(v2, bigInteger7);
        igpz igpz3 = arr_igpz3[0].b.k();
        int v5 = Math.max(arr_b.length, arr_b1.length) - 1;
        int v6 = 0;
        igpz igpz4 = igpz3;
        while(v5 >= 0) {
            int v7 = v5 < arr_b.length ? arr_b[v5] : 0;
            int v8 = v5 < arr_b1.length ? arr_b1[v5] : 0;
            if((v7 | v8) == 0) {
                ++v6;
            }
            else {
                igpz igpz5 = v7 == 0 ? igpz3 : igpz3.f((v7 >= 0 ? arr_igpz3 : arr_igpz5)[Math.abs(v7) >>> 1]);
                if(v8 != 0) {
                    igpz5 = igpz5.f((v8 >= 0 ? arr_igpz4 : arr_igpz6)[Math.abs(v8) >>> 1]);
                }
                if(v6 > 0) {
                    igpz4 = igpz4.m(v6);
                    v6 = 0;
                }
                igpz4 = igpz4.i(igpz5);
            }
            --v5;
        }
        return v6 <= 0 ? igpz4 : igpz4.m(v6);
    }
}

