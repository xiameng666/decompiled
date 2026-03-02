import j..util.Objects;

final class gblj extends oko {
    public gblj(gbll gbll0) {
        Objects.requireNonNull(gbll0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR REPLACE INTO `savedInstanceTable` (`sessionId`,`savedInstanceSource`,`savedInstance`) VALUES (?,?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        gblm gblm0 = (gblm)object0;
        owg0.h(1, gblm0.a);
        owg0.h(2, gblm0.b);
        owg0.e(3, gblm0.c);
    }
}

