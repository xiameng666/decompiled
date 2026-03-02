public final class ghdg {
    public static final void a(ghae ghae0, ghae ghae1, ghae ghae2, ghdl ghdl0) {
        double f8;
        double f = ghdl0.a;
        double f1 = (double)ghau.a(ghae0, ghae1, ghae2);
        double f2 = ggxv.b(ghae1, ghae2);
        double f3 = ggxv.b(ghae2, ghae0);
        double f4 = ggxv.b(ghae0, ghae1);
        double f5 = (f2 + f3 + f4) * 0.5;
        if(Double.compare(f5, 0.0003) >= 0) {
            double f6 = f5 * f5;
            double f7 = f5 - Math.max(f2, Math.max(f3, f4));
            if((f7 < 0.01 * f5 * f6 * f6)) {
                ghae ghae3 = ghbs.a(ghae0, ghae1);
                ghae ghae4 = ghbs.a(ghae1, ghae2);
                ghae ghae5 = ghbs.a(ghae0, ghae2);
                f8 = Math.max(0.0, ghae3.a(ghae5) - ghae3.a(ghae4) + ghae4.a(ghae5));
                if(f7 >= (5.000000E-15 + f8) * 0.1 * f5) {
                    f8 = Math.atan(Math.sqrt(Math.max(0.0, Math.tan(f5 * 0.5) * Math.tan((f5 - f2) * 0.5) * Math.tan((f5 - f3) * 0.5) * Math.tan((f5 - f4) * 0.5)))) * 4.0;
                }
            }
            else {
                f8 = Math.atan(Math.sqrt(Math.max(0.0, Math.tan(f5 * 0.5) * Math.tan((f5 - f2) * 0.5) * Math.tan((f5 - f3) * 0.5) * Math.tan((f5 - f4) * 0.5)))) * 4.0;
            }
        }
        else {
            f8 = Math.atan(Math.sqrt(Math.max(0.0, Math.tan(f5 * 0.5) * Math.tan((f5 - f2) * 0.5) * Math.tan((f5 - f3) * 0.5) * Math.tan((f5 - f4) * 0.5)))) * 4.0;
        }
        ghdl0.a = f + f1 * f8;
    }
}

