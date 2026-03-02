import j..util.Objects;

final class gbkq extends okn {
    public gbkq(gbkr gbkr0) {
        Objects.requireNonNull(gbkr0);
        super();
    }

    @Override  // okn
    public final String a() {
        return "DELETE FROM `actionTable` WHERE `sessionId` = ? AND `actionId` = ?";
    }

    @Override  // okn
    public final void b(owg owg0, Object object0) {
        gbks gbks0 = (gbks)object0;
        owg0.h(1, gbks0.a);
        owg0.h(2, gbks0.b);
    }
}

