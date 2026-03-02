import android.util.Size;

public final class bml {
    public static final bmp a(bmo bmo0, bmm bmm0, bmj bmj0) {
        ibuq.f(bmo0, "type");
        ibuq.f(bmm0, "size");
        ibuq.f(bmj0, "streamUseCase");
        return new bmp(bmo0, bmm0, bmj0);
    }

    public static final bmo b(int v) {
        bmo bmo0 = (bmo)bmp.c.get(Integer.valueOf(v));
        return bmo0 == null ? bmo.a : bmo0;
    }

    public static final bmp c(int v, Size size0, bmq bmq0, bmn bmn0, bmj bmj0) {
        ibuq.f(size0, "size");
        ibuq.f(bmq0, "surfaceSizeDefinition");
        ibuq.f(bmn0, "configSource");
        ibuq.f(bmj0, "streamUseCase");
        bmo bmo0 = bml.b(v);
        bmm bmm0 = bmm.o;
        int v1 = bri.a(size0);
        if(bmn0 == bmn.a) {
            Size size1 = bmq0.a(v);
            bmm[] arr_bmm = bmp.b;
            for(int v2 = 0; v2 < 6; ++v2) {
                bmm bmm1 = arr_bmm[v2];
                if(ibuq.m(size0, bmm1.q)) {
                    return bmm1 != bmm0 || !ibuq.m(size0, size1) ? bml.a(bmo0, bmm1, bmj0) : bml.a(bmo0, bmm.k, bmj0);
                }
            }
            return bmm0 != bmm0 || !ibuq.m(size0, size1) ? bml.a(bmo0, bmm0, bmj0) : bml.a(bmo0, bmm.k, bmj0);
        }
        if(v1 <= bri.a(bmq0.a)) {
            return bml.a(bmo0, bmm.a, bmj0);
        }
        if(v1 <= bri.a(bmq0.c)) {
            return bml.a(bmo0, bmm.d, bmj0);
        }
        if(v1 <= bri.a(bmq0.e)) {
            return bml.a(bmo0, bmm.j, bmj0);
        }
        Size size2 = bmq0.a(v);
        Size size3 = bmq0.b(v);
        if(size2 != null && v1 > bri.a(size2)) {
            return size3 == null || v1 > bri.a(size3) ? bml.a(bmo0, bmm0, bmj0) : bml.a(bmo0, bmm.n, bmj0);
        }
        return bml.a(bmo0, bmm.k, bmj0);
    }
}

