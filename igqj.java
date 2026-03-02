import java.math.BigInteger;

public final class igqj extends igpm {
    @Override  // igpm
    protected final igpz b(igpz igpz0, BigInteger bigInteger0) {
        igpx[] arr_igpx;
        boolean z;
        int v12;
        int v7;
        int v6;
        int v5;
        int v4;
        igqe igqe9;
        igqe igqe8;
        int v3;
        BigInteger bigInteger1;
        if(!(igpz0 instanceof igpx)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        igpp igpp0 = (igpp)((igpx)igpz0).b;
        int v = igpp0.a;
        int v1 = igpp0.e.c().byteValue();
        int v2 = igqf.a(v1);
        BigInteger[] arr_bigInteger = igpp0.c();
        if(v2 == 1) {
            bigInteger1 = arr_bigInteger[0].add(arr_bigInteger[1]);
            v3 = 1;
        }
        else {
            bigInteger1 = arr_bigInteger[0].subtract(arr_bigInteger[1]);
            v3 = v2;
        }
        BigInteger bigInteger2 = igqf.b(((byte)v3), v, ((byte)true))[1];
        igqe igqe0 = igqf.c(bigInteger0, arr_bigInteger[0], bigInteger2, ((byte)v1), v);
        igqe igqe1 = igqf.c(bigInteger0, arr_bigInteger[1], bigInteger2, ((byte)v1), v);
        if(igqe1.a != igqe0.a) {
            throw new IllegalArgumentException("lambda0 and lambda1 do not have same scale");
        }
        if(v3 != -1 && v3 != 1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigInteger3 = igqe0.c();
        BigInteger bigInteger4 = igqe1.c();
        igqe igqe2 = igqe0.e(bigInteger3);
        igqe igqe3 = igqe1.e(bigInteger4);
        igqe igqe4 = igqe2.d(igqe2);
        igqe igqe5 = v3 == 1 ? igqe4.d(igqe3) : igqe4.f(igqe3);
        igqe igqe6 = igqe3.d(igqe3).d(igqe3);
        igqe igqe7 = igqe6.d(igqe3);
        if(v3 == 1) {
            igqe8 = igqe2.f(igqe6);
            igqe9 = igqe2.d(igqe7);
        }
        else {
            igqe8 = igqe2.d(igqe6);
            igqe9 = igqe2.f(igqe7);
        }
        BigInteger bigInteger5 = igpo.c;
        if(igqe5.a(bigInteger5) < 0) {
            if(igqe9.a(igpo.d) >= 0) {
                v6 = 0;
                v5 = v1;
                v4 = v3;
            }
            else {
                v6 = 0;
                v4 = 0;
                v5 = v1;
            }
        }
        else if(igqe8.a(igqf.a) >= 0) {
            v4 = 0;
            v5 = v1;
            v6 = 1;
        }
        else {
            v6 = 0;
            v5 = v1;
            v4 = v3;
        }
        if(igqe5.a(igqf.a) >= 0) {
            v7 = igqe9.a(igqf.b) >= 0 ? v4 : -v3;
        }
        else if(igqe8.a(bigInteger5) < 0) {
            v7 = v4;
            v6 = -1;
        }
        else {
            v7 = -v3;
        }
        igql igql0 = new igql(bigInteger3.add(BigInteger.valueOf(v6)), bigInteger4.add(BigInteger.valueOf(v7)));
        igql igql1 = new igql(bigInteger0.subtract(bigInteger1.multiply(igql0.a)).subtract(BigInteger.valueOf(2L).multiply(arr_bigInteger[1]).multiply(igql0.b)), arr_bigInteger[1].multiply(igql0.a).subtract(arr_bigInteger[0].multiply(igql0.b)));
        igqc igqc0 = igpp0.r(((igpx)igpz0), "bc_wtnaf");
        igql[] arr_igql = v5 == 0 ? igqf.c : igqf.e;
        BigInteger bigInteger6 = v2 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        BigInteger bigInteger7 = BigInteger.valueOf(16L);
        if(v2 != -1 && v2 != 1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        BigInteger bigInteger8 = igql1.a;
        BigInteger bigInteger9 = igql1.b;
        BigInteger bigInteger10 = bigInteger8.multiply(bigInteger8);
        BigInteger bigInteger11 = bigInteger8.multiply(bigInteger9);
        BigInteger bigInteger12 = bigInteger9.multiply(bigInteger9).shiftLeft(1);
        int v8 = (v2 == 1 ? bigInteger10.add(bigInteger11).add(bigInteger12) : bigInteger10.subtract(bigInteger11).add(bigInteger12)).bitLength();
        int v9 = v8 <= 30 ? 38 : v8 + 8;
        byte[] arr_b = new byte[v9];
        BigInteger bigInteger13 = bigInteger7.shiftRight(1);
        int v10 = 0;
        while(!bigInteger8.equals(igpo.b) || !bigInteger9.equals(igpo.b)) {
            if(bigInteger8.testBit(0)) {
                BigInteger bigInteger14 = bigInteger8.add(bigInteger9.multiply(bigInteger6)).mod(bigInteger7);
                int v11 = bigInteger14.compareTo(bigInteger13) < 0 ? bigInteger14.intValue() : bigInteger14.subtract(bigInteger7).intValue();
                arr_b[v10] = (byte)v11;
                if(((byte)v11) < 0) {
                    v12 = (byte)(-((byte)v11));
                    z = false;
                }
                else {
                    v12 = (byte)v11;
                    z = true;
                }
                if(z) {
                    bigInteger8 = bigInteger8.subtract(arr_igql[v12].a);
                    bigInteger9 = bigInteger9.subtract(arr_igql[v12].b);
                }
                else {
                    bigInteger8 = bigInteger8.add(arr_igql[v12].a);
                    bigInteger9 = bigInteger9.add(arr_igql[v12].b);
                }
            }
            else {
                arr_b[v10] = 0;
            }
            BigInteger bigInteger15 = v2 == 1 ? bigInteger9.add(bigInteger8.shiftRight(1)) : bigInteger9.subtract(bigInteger8.shiftRight(1));
            ++v10;
            BigInteger bigInteger16 = bigInteger8.shiftRight(1).negate();
            bigInteger8 = bigInteger15;
            bigInteger9 = bigInteger16;
        }
        igpp igpp1 = (igpp)((igpx)igpz0).b;
        int v13 = igpp1.e.c().byteValue();
        if(igqc0 != null && (igqc0 instanceof igqk)) {
            arr_igpx = ((igqk)igqc0).a;
        }
        else {
            byte[][] arr2_b = v13 == 0 ? igqf.d : igqf.f;
            igpx[] arr_igpx1 = new igpx[4];
            arr_igpx1[0] = (igpx)igpz0;
            for(int v14 = 3; v14 < 8; v14 += 2) {
                byte[] arr_b1 = arr2_b[v14];
                igpx igpx0 = (igpx)((igpx)igpz0).b.k();
                igpz igpz1 = ((igpx)igpz0).g();
                int v15 = arr_b1.length - 1;
                igpx igpx1 = igpx0;
                int v16 = 0;
                while(v15 >= 0) {
                    ++v16;
                    int v17 = arr_b1[v15];
                    if(v17 != 0) {
                        igpx igpx2 = igpx1.a(v16);
                        igpz igpz2 = v17 > 0 ? ((igpx)igpz0) : igpz1;
                        igpx1 = (igpx)igpx2.f(igpz2);
                        v16 = 0;
                    }
                    --v15;
                }
                if(v16 > 0) {
                    igpx1 = igpx1.a(v16);
                }
                arr_igpx1[v14 >>> 1] = igpx1;
            }
            ((igpx)igpz0).b.t(arr_igpx1);
            igqk igqk0 = new igqk();
            igqk0.a = arr_igpx1;
            igpp1.v(((igpx)igpz0), "bc_wtnaf", igqk0);
            arr_igpx = arr_igpx1;
        }
        igpx[] arr_igpx2 = new igpx[4];
        for(int v18 = 0; v18 < 4; ++v18) {
            arr_igpx2[v18] = (igpx)arr_igpx[v18].g();
        }
        int v19 = v9 - 1;
        igpz igpz3 = (igpx)((igpx)igpz0).b.k();
        int v20 = 0;
        while(v19 >= 0) {
            ++v20;
            int v21 = arr_b[v19];
            if(v21 != 0) {
                igpz3 = (igpx)((igpx)igpz3).a(v20).f((v21 <= 0 ? arr_igpx2[-v21 >>> 1] : arr_igpx[v21 >>> 1]));
                v20 = 0;
            }
            --v19;
        }
        return v20 > 0 ? ((igpx)igpz3).a(v20) : igpz3;
    }
}

