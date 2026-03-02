import j..util.Objects;

final class zje extends okn {
    public zje(zjf zjf0) {
        Objects.requireNonNull(zjf0);
        super();
    }

    @Override  // okn
    public final String a() {
        return "DELETE FROM `per_device_dismissed_onboarding_flow` WHERE `dismissalId` = ?";
    }

    @Override  // okn
    public final void b(owg owg0, Object object0) {
        owg0.f(1, ((zjg)object0).a.longValue());
    }
}

