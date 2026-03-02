public final class sws {
    public static swr a(srb srb0, ssg ssg0, boolean z, swt swt0, ssj ssj0) {
        svt svt0 = srb0.b();
        if(!(svt0 instanceof sre) && z) {
            svt0 = srb0.a();
        }
        sxd sxd0 = (sxd)swt0.a(svt0, ssg0);
        if(sws.c(sxd0) && sxd0.d()) {
            ssi ssi0 = ((ssj)sxd0.b()).m;
            if(!(ssi0 instanceof ssc) || !((ssc)ssi0).e() || ((ssc)ssi0).b() != -1) {
                ssj0 = (ssj)sxd0.b();
            }
        }
        return new swr(svt0, ssj0);
    }

    public static void b(srb srb0, swh swh0, svt svt0, ssj ssj0, boolean z, boolean z1) {
        if(!srb0.f(svt0) && !z && !((ssc)ssj0.m).l(0)) {
            swe swe0 = srb0.b.c;
            sxd sxd0 = ((int)z1) == 0 ? swe0.b : new sxd(svt0.e());
            swh0.c(new swe(swe0.a, sxd0, ((int)(((short)(swe0.c + ((int)z1)))))));
        }
    }

    public static boolean c(sxd sxd0) {
        if(!sxd0.d()) {
            return false;
        }
        ssi ssi0 = ((ssj)sxd0.b()).m;
        return !stn.e(ssi0.a[0], ((byte)6)) && ssi0.k();
    }
}

