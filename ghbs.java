import j..util.Optional;
import java.math.BigDecimal;

public final class ghbs {
    public static ghae a(ghae ghae0, ghae ghae1) {
        ghae ghae2 = ghae.n(ghae.l(ghae1, ghae0), ghae.r(ghae1, ghae0));
        Optional optional0 = ghae2.g() < ggxv.d * ggxv.d ? Optional.empty() : Optional.of(ghae2);
        if(!optional0.isPresent()) {
            if(ghae0.t(ghae1)) {
                return ggxv.f(ghae0);
            }
            Optional optional1 = ghbs.c(ghae0, ghae1);
            if(optional1.isPresent()) {
                return (ghae)optional1.get();
            }
            ggxb ggxb0 = new ggxb(ghae0).a(new ggxb(ghae1));
            BigDecimal bigDecimal0 = ggxb0.a;
            BigDecimal bigDecimal1 = ggxb0.b;
            BigDecimal bigDecimal2 = ggxb0.c;
            ghae ghae3 = new ghae(bigDecimal0.doubleValue(), bigDecimal1.doubleValue(), bigDecimal2.doubleValue());
            if(!ghbs.e(ghae3)) {
                int v = -ghbr.a(bigDecimal0).scale();
                int v1 = ghbr.a(bigDecimal0).precision() - 1;
                int v2 = -ghbr.a(bigDecimal1).scale();
                int v3 = ghbr.a(bigDecimal1).precision() - 1;
                int v4 = -ghbr.a(bigDecimal2).scale();
                int v5 = ghbr.a(bigDecimal2).precision() - 1;
                int v6 = bigDecimal0.signum() == 0 ? 0x80000000 : Math.max(0x80000000, v + v1);
                if(bigDecimal1.signum() != 0) {
                    v6 = Math.max(v6, v2 + v3);
                }
                if(bigDecimal2.signum() != 0) {
                    v6 = Math.max(v6, v4 + v5);
                }
                ghae3 = v6 == 0x80000000 ? ghae.a : new ghae(bigDecimal0.scaleByPowerOfTen(-v6 - 1).doubleValue(), bigDecimal1.scaleByPowerOfTen(-v6 - 1).doubleValue(), bigDecimal2.scaleByPowerOfTen(-v6 - 1).doubleValue());
            }
            Optional optional2 = ghae3.t(ghae.a) ? Optional.empty() : Optional.of(ghae3);
            if(optional2.isPresent()) {
                return (ghae)optional2.get();
            }
            return ghae0.v(ghae1) ? ghbs.d(ghbs.b(ghae0, ghae1)) : ghae.p(ghbs.d(ghbs.b(ghae1, ghae0)));
        }
        return (ghae)optional0.get();
    }

    static ghae b(ghae ghae0, ghae ghae1) {
        double f = ghae1.h;
        if(f == 0.0) {
            if(ghae1.i != 0.0) {
                return new ghae(-ghae1.i, 0.0, 0.0);
            }
            double f1 = ghae1.j;
            if(f1 != 0.0) {
                return new ghae(f1, 0.0, 0.0);
            }
            return ghae0.h != 0.0 || ghae0.i != 0.0 ? new ghae(ghae0.i, -ghae0.h, 0.0) : new ghae(1.0, 0.0, 0.0);
        }
        return new ghae(-ghae1.i, f, 0.0);
    }

    static Optional c(ghae ghae0, ghae ghae1) {
        try {
            ghae ghae2 = ghae.l(ghae0, ghae1);
            ghae ghae3 = ghae.r(ghae1, ghae0);
            ghae ghae4 = new ghae(ggxo.c(ghae2.i, ghae3.j).d(ggxo.c(ghae2.j, ghae3.i)).doubleValue(), ggxo.c(ghae2.j, ghae3.h).d(ggxo.c(ghae2.h, ghae3.j)).doubleValue(), ggxo.c(ghae2.h, ghae3.i).d(ggxo.c(ghae2.i, ghae3.h)).doubleValue());
            if(!ghbs.e(ghae4)) {
                double f = glwp.b(new double[]{Math.abs(ghae4.h), Math.abs(ghae4.i), Math.abs(ghae4.j)});
                ghae4 = new ghae(ghae4.h / f, ghae4.i / f, ghae4.j / f);
            }
            return ghae4.t(ghae.a) || !ghbs.e(ghae4) ? Optional.empty() : Optional.of(ghae4);
        }
        catch(ArithmeticException unused_ex) {
            return Optional.empty();
        }
    }

    private static ghae d(ghae ghae0) {
        return ghbs.e(ghae0) ? ghae0 : ghae.o(ghae0, Math.pow(2.0, -1 - Math.getExponent(glwp.b(new double[]{Math.abs(ghae0.h), Math.abs(ghae0.i), Math.abs(ghae0.j)}))));
    }

    private static boolean e(ghae ghae0) {
        return glwp.b(new double[]{Math.abs(ghae0.h), Math.abs(ghae0.i), Math.abs(ghae0.j)}) >= Math.pow(2.0, -242.0);
    }
}

