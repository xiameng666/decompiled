final class ifqq {
    static ifqp a(ifqc ifqc0, ifqf ifqf0, ifpz ifpz0) {
        int v = ifqc0.a.b;
        byte[][] arr2_b = ifqy.k(ifqf0.a);
        ifqp[] arr_ifqp = new ifqp[arr2_b.length];
        for(int v1 = 0; v1 < arr2_b.length; ++v1) {
            arr_ifqp[v1] = new ifqp(0, arr2_b[v1]);
        }
        ifpy ifpy0 = new ifpy();
        ifpy0.e = ifpz0.d;
        ifpy0.f = ifpz0.e;
        ifpy0.a = ifpz0.a;
        ifpy0.b = 0;
        ifpy0.c = ifpz0.c;
        ifpy0.g = ifpz0.f;
        for(ifpz ifpz1 = new ifpz(ifpy0); v > 1; ifpz1 = new ifpz(ifpy2)) {
            for(int v2 = 0; v2 < ((int)Math.floor(v >> 1)); ++v2) {
                ifpy ifpy1 = new ifpy();
                ifpy1.e = ifpz1.d;
                ifpy1.f = ifpz1.e;
                ifpy1.a = ifpz1.a;
                ifpy1.b = ifpz1.b;
                ifpy1.c = v2;
                ifpy1.g = ifpz1.f;
                ifpz1 = new ifpz(ifpy1);
                int v3 = v2 + v2;
                arr_ifqp[v2] = ifqq.b(ifqc0, arr_ifqp[v3], arr_ifqp[v3 + 1], ifpz1);
            }
            if((v & 1) == 1) {
                arr_ifqp[((int)Math.floor(v >> 1))] = arr_ifqp[v - 1];
            }
            v = (int)Math.ceil(((double)v) / 2.0);
            ifpy ifpy2 = new ifpy();
            ifpy2.e = ifpz1.d;
            ifpy2.f = ifpz1.e;
            ifpy2.a = ifpz1.a;
            ifpy2.b = ifpz1.b + 1;
            ifpy2.c = ifpz1.c;
            ifpy2.g = ifpz1.f;
        }
        return arr_ifqp[0];
    }

    static ifqp b(ifqc ifqc0, ifqp ifqp0, ifqp ifqp1, ifqh ifqh0) {
        if(ifqp0 == null) {
            throw new NullPointerException("left == null");
        }
        if(ifqp1 == null) {
            throw new NullPointerException("right == null");
        }
        int v = ifqp0.a;
        if(v != ifqp1.a) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        byte[] arr_b = iftq.j(ifqc0.c);
        if((ifqh0 instanceof ifpz)) {
            ifpy ifpy0 = new ifpy();
            ifpy0.e = ((ifpz)ifqh0).d;
            ifpy0.f = ((ifpz)ifqh0).e;
            ifpy0.a = ((ifpz)ifqh0).a;
            ifpy0.b = ((ifpz)ifqh0).b;
            ifpy0.c = ((ifpz)ifqh0).c;
            ifpy0.g = 0;
            ifqh0 = new ifpz(ifpy0);
        }
        else if((ifqh0 instanceof ifpw)) {
            ifpv ifpv0 = new ifpv();
            ifpv0.e = ((ifpw)ifqh0).d;
            ifpv0.f = ((ifpw)ifqh0).e;
            ifpv0.a = ((ifpw)ifqh0).a;
            ifpv0.b = ((ifpw)ifqh0).b;
            ifpv0.g = 0;
            ifqh0 = new ifpw(ifpv0);
        }
        ifpx ifpx0 = ifqc0.b;
        byte[] arr_b1 = ifpx0.a(arr_b, ifqh0.a());
        if((ifqh0 instanceof ifpz)) {
            ifpy ifpy1 = new ifpy();
            ifpy1.e = ((ifpz)ifqh0).d;
            ifpy1.f = ((ifpz)ifqh0).e;
            ifpy1.a = ((ifpz)ifqh0).a;
            ifpy1.b = ((ifpz)ifqh0).b;
            ifpy1.c = ((ifpz)ifqh0).c;
            ifpy1.g = 1;
            ifqh0 = new ifpz(ifpy1);
        }
        else if((ifqh0 instanceof ifpw)) {
            ifpv ifpv1 = new ifpv();
            ifpv1.e = ((ifpw)ifqh0).d;
            ifpv1.f = ((ifpw)ifqh0).e;
            ifpv1.a = ((ifpw)ifqh0).a;
            ifpv1.b = ((ifpw)ifqh0).b;
            ifpv1.g = 1;
            ifqh0 = new ifpw(ifpv1);
        }
        byte[] arr_b2 = ifpx0.a(arr_b, ifqh0.a());
        if((ifqh0 instanceof ifpz)) {
            ifpy ifpy2 = new ifpy();
            ifpy2.e = ((ifpz)ifqh0).d;
            ifpy2.f = ((ifpz)ifqh0).e;
            ifpy2.a = ((ifpz)ifqh0).a;
            ifpy2.b = ((ifpz)ifqh0).b;
            ifpy2.c = ((ifpz)ifqh0).c;
            ifpy2.g = 2;
            ifqh0 = new ifpz(ifpy2);
        }
        else if((ifqh0 instanceof ifpw)) {
            ifpv ifpv2 = new ifpv();
            ifpv2.e = ((ifpw)ifqh0).d;
            ifpv2.f = ((ifpw)ifqh0).e;
            ifpv2.a = ((ifpw)ifqh0).a;
            ifpv2.b = ((ifpw)ifqh0).b;
            ifpv2.g = 2;
            ifqh0 = new ifpw(ifpv2);
        }
        byte[] arr_b3 = ifpx0.a(arr_b, ifqh0.a());
        int v2 = ifqc0.a.a;
        int v3 = v2 + v2;
        byte[] arr_b4 = new byte[v3];
        for(int v4 = 0; v4 < v2; ++v4) {
            arr_b4[v4] = (byte)(ifqp0.a()[v4] ^ arr_b2[v4]);
        }
        for(int v1 = 0; v1 < v2; ++v1) {
            arr_b4[v1 + v2] = (byte)(ifqp1.a()[v1] ^ arr_b3[v1]);
        }
        int v5 = ifpx0.a;
        if(arr_b1.length != v5) {
            throw new IllegalArgumentException("wrong key length");
        }
        if(v3 == v5 + v5) {
            return new ifqp(v, ifpx0.b(1, arr_b1, arr_b4));
        }
        throw new IllegalArgumentException("wrong in length");
    }
}

