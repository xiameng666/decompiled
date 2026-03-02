import java.io.IOException;

public final class dxdq {
    public static gfsx a(String s) {
        if(s != null) {
            try {
                dxdp dxdp0 = new dxdp(s);
                if(!dxdp0.b(1).equals("M")) {
                    return gfqx.a;
                }
                int v = dxdp0.a(1, 10);
                if(v <= 0 || v > 4) {
                    return gfqx.a;
                }
                String s1 = dxdp0.c(20);
                if(s1 == null) {
                    throw new NullPointerException("Null passengerName");
                }
                dxdp0.d(1);
                ggdy ggdy0 = new ggdy();
                int v1 = 0;
                while(true) {
                    if(v1 >= v) {
                        if(dxdp0.a) {
                            return gfqx.a;
                        }
                        gged_interceptors gged0 = ggdy0.h();
                        if(gged0 != null) {
                            return gfsx.m(new dxdo(s1, gged0));
                        }
                        throw new NullPointerException("Null flightSegments");
                    }
                    gfsx gfsx0 = gfqx.a;
                    String s2 = dxdp0.c(7);
                    if(s2 == null) {
                        throw new NullPointerException("Null pnrCode");
                    }
                    String s3 = dxdp0.c(3);
                    if(s3 == null) {
                        throw new NullPointerException("Null origin");
                    }
                    String s4 = dxdp0.c(3);
                    if(s4 == null) {
                        throw new NullPointerException("Null destination");
                    }
                    String s5 = dxdp0.c(3);
                    if(s5 == null) {
                        throw new NullPointerException("Null carrier");
                    }
                    String s6 = dxdp0.c(5);
                    if(s6 == null) {
                        throw new NullPointerException("Null flightNumber");
                    }
                    String s7 = dxdp0.c(3);
                    if(s7 == null) {
                        throw new NullPointerException("Null dateOfFlightJulian");
                    }
                    String s8 = dxdp0.c(1);
                    if(s8 == null) {
                        throw new NullPointerException("Null compartmentCode");
                    }
                    String s9 = dxdp0.c(4);
                    if(s9 == null) {
                        throw new NullPointerException("Null seatNumber");
                    }
                    dxdp0.d(5);
                    dxdp0.d(1);
                    int v2 = dxdp0.a(2, 16);
                    if(v2 > 0) {
                        dxdp dxdp1 = new dxdp(dxdp0.b(v2));
                        if(v1 == 0) {
                            if(dxdp1.b(1).equals(">")) {
                                dxdp1.d(1);
                                dxdp1.d(dxdp1.a(2, 16));
                                if(dxdp1.a) {
                                    return gfsx0;
                                }
                                v1 = 0;
                            }
                            else {
                                ggdy0.i(new dxdn(s2, s3, s4, s5, s6, s7, s8, s9, gfsx0));
                                v1 = 1;
                                continue;
                            }
                        }
                        int v3 = dxdp1.a(2, 16);
                        if(v3 > 0) {
                            dxdp dxdp2 = new dxdp(dxdp1.b(v3));
                            if(dxdp1.a) {
                                return gfsx0;
                            }
                            dxdp2.d(3);
                            dxdp2.d(10);
                            if(dxdp2.c.length() > dxdp2.b) {
                                gfsx0 = gfsx.m(dxdp2.c(1));
                            }
                        }
                        else if(v3 < 0) {
                            return gfsx0;
                        }
                    }
                    else if(v2 < 0) {
                        return gfsx0;
                    }
                    ggdy0.i(new dxdn(s2, s3, s4, s5, s6, s7, s8, s9, gfsx0));
                    ++v1;
                }
            }
            catch(IOException unused_ex) {
            }
        }
        return gfqx.a;
    }
}

