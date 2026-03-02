import androidx.compose.runtime.snapshots.SnapshotStateList;

public final class cgk {
    public static final hka a(cgv cgv0) {
        return hkb.b(hjz.d(cgv0.b(), cgv0.d()), cgv0.c());
    }

    public static final void b(cgv cgv0, long v, long v1, long v2, boolean z) {
        if(!hjz.g(cgv0.d(), v2) || !hkf.g(cgv0.c(), v)) {
        label_3:
            hkf hkf0 = new hkf(v);
            cgv0.a.b(hkf0);
            hjz hjz0 = new hjz(v2);
            cgv0.c.b(hjz0);
            if(z) {
                long v3 = cgv0.a();
                cgv0.b.b(new hjz(hjz.c(hjz.c(v1, v2), hjz.c(v3, cgv0.b()))));
            }
        }
        else if(z) {
            z = true;
            goto label_3;
        }
        cgv0.d.b(new hjz(hjz.c(v1, v2)));
    }

    public static final hka c(cfj cfj0, cfe cfe0) {
        if(cfe0 != null) {
            SnapshotStateList snapshotStateList0 = cfj0.d;
            int v = snapshotStateList0.a();
            for(int v1 = 0; v1 < v; ++v1) {
                if(ibuq.m(((cfk)snapshotStateList0.get(v1)).k, cfe0)) {
                    if(cfe0.B) {
                        return cfe0.a ? hkb.b(hzj.b(cfe0.j(), ien.b(cfe0), 6), jll.b(ien.b(cfe0).g())) : null;
                    }
                    return null;
                }
            }
        }
        return null;
    }
}

