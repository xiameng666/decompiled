public final class zib {
    public static final zhx a(gsad gsad0) {
        ibuq.f(gsad0, "color");
        if((gsad0.b & 1) != 0 && (gsad0.b & 2) != 0) {
            hjie hjie0 = gsad0.c == null ? hjie.a : gsad0.c;
            ibuq.e(hjie0, "getLight(...)");
            zhw zhw0 = zib.b(hjie0);
            hjie hjie1 = gsad0.d == null ? hjie.a : gsad0.d;
            ibuq.e(hjie1, "getDark(...)");
            return new zhx(zhw0, zib.b(hjie1));
        }
        return null;
    }

    private static final zhw b(hjie hjie0) {
        hftk hftk0;
        ibuq.f(hjie0, "<this>");
        if((hjie0.b & 1) == 0) {
            hftk0 = null;
        }
        else {
            hftk0 = hjie0.f;
            if(hftk0 == null) {
                return hftk.a == null ? new zhw(1.0f, hjie0.c, hjie0.d, hjie0.e) : new zhw(hftk.a.b, hjie0.c, hjie0.d, hjie0.e);
            }
        }
        return hftk0 == null ? new zhw(1.0f, hjie0.c, hjie0.d, hjie0.e) : new zhw(hftk0.b, hjie0.c, hjie0.d, hjie0.e);
    }
}

