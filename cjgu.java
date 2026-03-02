import com.google.android.gms.libs.identity.ImmutableWorkSource;

public final class cjgu {
    public static final cjgv a(cjhs cjhs0, long v, long v1, long v2, boolean z, boolean z1, ImmutableWorkSource immutableWorkSource0) {
        ibuq.f(cjhs0, "quality");
        ibuq.f(immutableWorkSource0, "workSource");
        return cjgu.b(cjhs0, v, v1, ibzw.a, 0x7FFFFFFF, v2, z, z1, immutableWorkSource0);
    }

    public static final cjgv b(cjhs cjhs0, long v, long v1, long v2, int v3, long v4, boolean z, boolean z1, ImmutableWorkSource immutableWorkSource0) {
        boolean z2;
        ibuq.f(cjhs0, "quality");
        ibuq.f(immutableWorkSource0, "workSource");
        jyo jyo0 = new jyo(ibzw.h(v));
        int v5 = cjhs0.d;
        switch(v5) {
            case 100: {
                v5 = 100;
                z2 = true;
                break;
            }
            case 102: 
            case 104: {
                z2 = true;
                break;
            }
            default: {
                z2 = false;
            }
        }
        Object[] arr_object = {v5};
        if(!z2) {
            throw new IllegalArgumentException(String.format("quality must be a defined QUALITY constant, not %d", arr_object));
        }
        jyo0.a = v5;
        if(!ibzw.r(v1, cjgv.b)) {
            jyo0.b(ibzw.h(v1));
        }
        long v6 = ibzw.h(v2);
        kay.g(v6, 1L, "durationMillis");
        jyo0.b = v6;
        kay.f(v3, 1, 0x7FFFFFFF, "maxUpdates");
        jyo0.c = v3;
        long v7 = Math.max(ibzw.h(v), ibzw.h(v4));
        jyo0.d = v7;
        kay.g(v7, 0L, "maxUpdateDelayMillis");
        jyo0.d = v7;
        return new cjgv(jyo0.a(), z, z1, immutableWorkSource0);
    }

    public static cjgv c(cjhs cjhs0, long v, long v1, boolean z, boolean z1, int v2) {
        return cjgu.a(cjhs0, v, ((v2 & 4) == 0 ? 0L : cjgv.b), ((v2 & 8) == 0 ? v1 : 0L), ((boolean)(((v2 & 16) == 0 ? 1 : 0) & ((int)z))), ((boolean)(((v2 & 0x20) == 0 ? 1 : 0) & ((int)z1))), ImmutableWorkSource.a);
    }
}

