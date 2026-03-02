import j..util.Objects;

final class gblk extends okn {
    public gblk(gbll gbll0) {
        Objects.requireNonNull(gbll0);
        super();
    }

    @Override  // okn
    public final String a() {
        return "DELETE FROM `savedInstanceTable` WHERE `sessionId` = ? AND `savedInstanceSource` = ?";
    }

    @Override  // okn
    public final void b(owg owg0, Object object0) {
        gblm gblm0 = (gblm)object0;
        owg0.h(1, gblm0.a);
        owg0.h(2, gblm0.b);
    }
}

