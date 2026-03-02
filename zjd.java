import j..util.Objects;

final class zjd extends oko {
    public zjd(zjf zjf0) {
        Objects.requireNonNull(zjf0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR REPLACE INTO `per_device_dismissed_onboarding_flow` (`dismissalId`) VALUES (?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        owg0.f(1, ((zjg)object0).a.longValue());
    }
}

