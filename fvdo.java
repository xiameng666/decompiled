public final class fvdo {
    public static final fvuf a(fvcj fvcj0, fvch fvch0, fvdm fvdm0, double[] arr_f) {
        int v2;
        fvcl fvcl0;
        fvdm fvdm1 = fvdm0;
        int v = 0;
        double f = 0.0;
        double f1 = 0.0;
        double f2 = 0.0;
        double f3 = 0.0;
        double f4 = 0.0;
        while(true) {
            fvcl0 = fvch0.a;
            if(!fvcj0.hasNext()) {
                break;
            }
            int v1 = fvcj0.a();
            double f5 = arr_f == null ? fvdm1.a(v1, fvdm1.a.a(v1)) : fvdm1.a(v1, Math.log(arr_f[v]));
            if(f5 == 0.0) {
                v2 = v;
            }
            else {
                int v3 = fvcl0.f(v1);
                int v4 = fvcl0.g(v1);
                f += f5;
                v2 = v;
                double f6 = ((double)v3) - f3;
                double f7 = f5 / f;
                f3 += f6 * f7;
                f1 += f6 * f5 * (((double)v3) - f3);
                double f8 = ((double)v4) - f4;
                f4 += f7 * f8;
                f2 += f5 * f8 * (((double)v4) - f4);
            }
            v = v2 + 1;
            fvdm1 = fvdm0;
        }
        return f == 0.0 ? fvdo.c(fvch0) : new fvuf(fvcl0.h(f3, f4), Math.min(Math.sqrt(Math.max(1.0, f1 / f) + Math.max(1.0, f2 / f)) * fvcl0.f, 150.0));
    }

    public static final fvuf b(ggzv ggzv0, fvir fvir0, fvdm fvdm0, fvcw fvcw0, fvdq fvdq0) {
        fvcj fvcj0;
        fvch fvch0 = fvch.e(fvir0.b(), ggzv0, ((fvcy)fvcw0).a);
        try {
            fvcj0 = fvch0.f();
        }
        catch(IndexOutOfBoundsException unused_ex) {
            fvdq0.h();
            return fvdo.c(fvch0);
        }
        double[] arr_f = fvcw0.b(fvcj0, fvir0);
        if(arr_f == null) {
            fvdq0.e();
            return fvdo.c(fvch0);
        }
        return fvdo.a(fvch0.f(), fvch0, fvdm0, arr_f);
    }

    private static final fvuf c(fvch fvch0) {
        double f = (double)((fvch0.c() + fvch0.d()) / 2);
        double f1 = (double)((fvch0.a() + fvch0.b()) / 2);
        return new fvuf(fvch0.a.h(f, f1), ((double)150.0));
    }
}

