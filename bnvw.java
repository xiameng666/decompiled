public enum bnvw {
    PREFER_LOCK_SCREEN_DOMAIN_IF_LSKF_IS_SET_UP(false),
    PREFER_LOCK_SCREEN_DOMAIN_ASK_TO_SET_UP_LSKF(true),
    REQUIRE_LOCK_SCREEN_DOMAIN(true),
    REQUIRE_DEFAULT_LOCK_SCREEN_DOMAIN_WITHOUT_CHECKING(true),
    REQUIRE_DEFAULT_GAIA_PASSWORD_DOMAIN(false);

    public final boolean f;

    private bnvw(boolean z) {
        this.f = z;
    }
}

