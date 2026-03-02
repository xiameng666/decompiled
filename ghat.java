import java.math.BigDecimal;

public final class ghat {
    public static int a(ghae ghae0, ghae ghae1) {
        double f = ghae0.b(ghae1);
        if((f > 4.057643E-16)) {
            return 1;
        }
        return f < -0.0 ? -1 : 0;
    }

    public static int b(ghae ghae0, ghae ghae1, ghae ghae2) {
        double f4;
        double f3;
        ghae ghae3 = ghae0;
        ghae ghae4 = ghae2;
        int v = 0;
        if(!ghae0.t(ghae1) && !ghae1.t(ghae2) && !ghae4.t(ghae3)) {
            ghae ghae5 = ghae.r(ghae1, ghae3);
            ghae ghae6 = ghae.r(ghae4, ghae1);
            ghae ghae7 = ghae.r(ghae3, ghae4);
            double f = ghae5.g();
            double f1 = ghae6.g();
            double f2 = ghae7.g();
            if(Double.compare(f, f1) >= 0 && (f >= f2)) {
                f3 = -ghae.i(ghae4, ghae7, ghae6);
                f4 = Math.sqrt(f2 * f1);
            }
            else if((f1 >= f2)) {
                f3 = -ghae.i(ghae3, ghae5, ghae7);
                f4 = Math.sqrt(f * f2);
            }
            else {
                f3 = -ghae.i(ghae1, ghae6, ghae5);
                f4 = Math.sqrt(f1 * f);
            }
            int v1 = -1;
            if(Double.compare(f3, f4 * 7.176704E-16) > 0) {
                v = 1;
            }
            else if((f3 < -(f4 * 7.176704E-16))) {
                v = -1;
            }
            if(v == 0) {
                int v2 = ggxf.a(ghae0, ghae1, ghae2);
                if(v2 != 0) {
                    return v2;
                }
                int v3 = ghae0.j(ghae1);
                if(v3 <= 0) {
                    v1 = 1;
                }
                ghae ghae8 = v3 <= 0 ? ghae1 : ghae3;
                if(v3 > 0) {
                    ghae3 = ghae1;
                }
                if(ghae8.j(ghae4) > 0) {
                    v1 = -v1;
                }
                else {
                    ghae ghae9 = ghae8;
                    ghae8 = ghae4;
                    ghae4 = ghae9;
                }
                if(ghae3.j(ghae4) > 0) {
                    v1 = -v1;
                    ghae ghae10 = ghae4;
                    ghae4 = ghae3;
                    ghae3 = ghae10;
                }
                if(ghae3.t(ghae3) && ghae4.t(ghae4) && ghae8.t(ghae8)) {
                    ggxb ggxb0 = new ggxb(ghae3);
                    ggxb ggxb1 = new ggxb(ghae4);
                    ggxb ggxb2 = new ggxb(ghae8);
                    ggxb ggxb3 = ggxb1.a(ggxb2);
                    BigDecimal bigDecimal0 = ggxb3.a;
                    BigDecimal bigDecimal1 = ggxb0.a;
                    BigDecimal bigDecimal2 = ggxb3.b;
                    BigDecimal bigDecimal3 = ggxb0.b;
                    BigDecimal bigDecimal4 = bigDecimal0.multiply(bigDecimal1).add(bigDecimal2.multiply(bigDecimal3));
                    BigDecimal bigDecimal5 = ggxb3.c;
                    BigDecimal bigDecimal6 = ggxb0.c;
                    int v4 = bigDecimal4.add(bigDecimal5.multiply(bigDecimal6)).signum();
                    if(v4 != 0) {
                        return v1 * v4;
                    }
                    int v5 = bigDecimal5.signum();
                    if(v5 == 0) {
                        v5 = bigDecimal2.signum();
                        if(v5 == 0) {
                            v5 = bigDecimal0.signum();
                            if(v5 == 0) {
                                BigDecimal bigDecimal7 = ggxb2.a;
                                BigDecimal bigDecimal8 = ggxb2.b;
                                int v6 = bigDecimal7.multiply(bigDecimal3).subtract(bigDecimal8.multiply(bigDecimal1)).signum();
                                if(v6 == 0) {
                                    v6 = bigDecimal7.signum();
                                    if(v6 == 0) {
                                        int v7 = -bigDecimal8.signum();
                                        if(v7 != 0) {
                                            return v1 * v7;
                                        }
                                        BigDecimal bigDecimal9 = ggxb2.c;
                                        int v8 = bigDecimal9.multiply(bigDecimal1).subtract(bigDecimal7.multiply(bigDecimal6)).signum();
                                        if(v8 == 0) {
                                            v8 = bigDecimal9.signum();
                                            if(v8 == 0) {
                                                BigDecimal bigDecimal10 = ggxb1.b;
                                                BigDecimal bigDecimal11 = ggxb1.a;
                                                int v9 = bigDecimal1.multiply(bigDecimal10).subtract(bigDecimal3.multiply(bigDecimal11)).signum();
                                                if(v9 != 0) {
                                                    return v1 * v9;
                                                }
                                                int v10 = -bigDecimal11.signum();
                                                if(v10 == 0) {
                                                    v10 = bigDecimal10.signum();
                                                    if(v10 == 0) {
                                                        v10 = bigDecimal1.signum();
                                                        return v10 == 0 ? v1 : v1 * v10;
                                                    }
                                                }
                                                return v1 * v10;
                                            }
                                        }
                                        return v1 * v8;
                                    }
                                }
                                return v1 * v6;
                            }
                        }
                    }
                    return v1 * v5;
                }
                return -v1;
            }
        }
        return v;
    }
}

