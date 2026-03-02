import java.util.List;

public final class svc extends svj {
    @Override  // svj
    public final svi a(svs svs0, byte[] arr_b) {
        return svc.e(svs0, arr_b);
    }

    @Override  // svj
    public final boolean c(svs svs0) {
        return !svs0.c() || svs0.c != 4 ? false : svs0.b == -91 || svs0.b == 21;
    }

    public static final svd e(svs svs0, byte[] arr_b) {
        sxd sxd0;
        int v = svs0.d;
        boolean z = false;
        if(svs0.b != 21) {
            try {
                sxd0 = ssg.c(((byte)v)) ? sxd.a : new sxd(ssg.a(((byte)v)));
            }
            catch(EnumConstantNotPresentException | IllegalArgumentException unused_ex) {
                sxd0 = sxd.a;
            }
        }
        else if(v != 0) {
            sxd0 = sxd.a;
        }
        else {
            v = 0;
            sxd0 = ssg.c(((byte)v)) ? sxd.a : new sxd(ssg.a(((byte)v)));
        }
        List list0 = sxe.b(arr_b);
        if(svs0.b == 21) {
            z = true;
        }
        return new svd(sxd0, list0, z);
    }
}

