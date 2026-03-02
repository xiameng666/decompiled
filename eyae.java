import j..util.Objects;

final class eyae extends okn {
    public eyae(eyaf eyaf0) {
        Objects.requireNonNull(eyaf0);
        super();
    }

    @Override  // okn
    public final String a() {
        return "DELETE FROM `EnrolledDevice` WHERE `id` = ?";
    }

    @Override  // okn
    public final void b(owg owg0, Object object0) {
        owg0.f(1, ((exzk)object0).a);
    }
}

