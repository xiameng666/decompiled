import java.util.ArrayList;
import java.util.List;

public final class gpwc {
    public static gpvs a(fvir fvir0, ggzv ggzv0, double f, fvcw fvcw0, boolean z, fvdq fvdq0) {
        fvcj fvcj0;
        if(fvcw0 == null) {
            return z ? null : gpwc.b(fvir0, ggzv0, f, true, fvdq0);
        }
        fvcl fvcl0 = fvir0.b();
        fvch fvch0 = fvch.e(fvcl0, ggzv0, ((fvcy)fvcw0).a);
        try {
            fvcj0 = fvch0.f();
        }
        catch(IndexOutOfBoundsException unused_ex) {
            fvdq0.h();
            return null;
        }
        double[] arr_f = fvcw0.b(fvcj0, fvir0);
        if(arr_f == null) {
            fvdq0.g();
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        gpwc.d(fvcl0, fvch0.f(), arrayList0, arrayList1);
        gpvs gpvs0 = new gpvs(glwy.n(arrayList0), arr_f, glwl.e(arrayList1), gpwc.c(fvcl0));
        fvdq0.f();
        return gpvs0;
    }

    public static gpvs b(fvir fvir0, ggzv ggzv0, double f, boolean z, fvdq fvdq0) {
        fvcl fvcl0 = fvir0.b();
        fvch fvch0 = fvch.e(fvcl0, ggzv0, f);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        gpwc.d(fvcl0, new fvcf(fvch0), arrayList0, arrayList1);
        if(arrayList0.isEmpty()) {
            return null;
        }
        int[] arr_v = glwy.n(arrayList0);
        byte[] arr_b = glwl.e(arrayList1);
        double[] arr_f = new double[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_f[v] = fvir0.a(arr_v[v]);
        }
        MagnetometerProcessor.b(arr_f);
        gpvs gpvs0 = new gpvs(arr_v, arr_f, arr_b, gpwc.c(fvcl0));
        if(z) {
            fvdq0.l();
        }
        return gpvs0;
    }

    private static gpvr c(fvcl fvcl0) {
        return new gpvr(fvcl0.g, fvcl0.b, fvcl0.c, fvcl0.d, fvcl0.e, fvcl0.f);
    }

    private static void d(fvcl fvcl0, fvcj fvcj0, List list0, List list1) {
        int v1;
        fvcb fvcb0 = fvcl0.o(fvcj0);
        fvcd fvcd0 = new fvcd();
        while(fvcb0.a(fvcd0)) {
            list0.add(Integer.valueOf(fvcd0.b));
            if(fvcd0.c == 3) {
                int v = Math.round(fvcd0.a);
                v1 = gpvs.b(v) ? glxj.a(v) : gpvs.a;
            }
            else {
                v1 = gpvs.a;
            }
            list1.add(Byte.valueOf(((byte)v1)));
        }
    }
}

