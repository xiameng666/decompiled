public final class sww {
    public static void a(srb srb0, int v) {
        if((srb0.c.e() || srb0.f(srb0.b())) && stu.a(srb0, srb0.a(), new ssy(v), srs.b)) {
            return;
        }
        throw sxf.f(("Core administration command requires authentication with global key matching tag " + Integer.toHexString(v) + " permission"));
    }
}

