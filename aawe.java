public final class aawe {
    public static final znw a(grwg grwg0) {
        grwe grwe0 = grwg0.b == null ? grwe.a : grwg0.b;
        ibuq.e(grwe0, "getImage(...)");
        return new znw(zhy.a(grwe0));
    }

    public static final zod b(grzo grzo0) {
        String s = grzo0.b;
        ibuq.e(s, "getLabel(...)");
        grwe grwe0 = grzo0.c == null ? grwe.a : grzo0.c;
        ibuq.e(grwe0, "getIcon(...)");
        zhr zhr0 = zhy.a(grwe0);
        gsad gsad0 = grzo0.d == null ? gsad.a : grzo0.d;
        ibuq.e(gsad0, "getLabelColor(...)");
        zhx zhx0 = zib.a(gsad0);
        gsad gsad1 = grzo0.e == null ? gsad.a : grzo0.e;
        ibuq.e(gsad1, "getBackgroundColor(...)");
        return new zod(s, zhr0, zhx0, zib.a(gsad1));
    }
}

