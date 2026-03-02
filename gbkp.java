import j..util.Objects;

final class gbkp extends oko {
    public gbkp(gbkr gbkr0) {
        Objects.requireNonNull(gbkr0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR REPLACE INTO `actionTable` (`sessionId`,`actionId`,`actionName`,`actionState`,`actionRequest`,`actionResponse`,`actionCreatedTime`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        gbks gbks0 = (gbks)object0;
        owg0.h(1, gbks0.a);
        owg0.h(2, gbks0.b);
        owg0.h(3, gbks0.c);
        owg0.f(4, ((long)gbks0.d));
        owg0.e(5, gbks0.e);
        owg0.e(6, gbks0.f);
        owg0.f(7, gbks0.g);
    }
}

