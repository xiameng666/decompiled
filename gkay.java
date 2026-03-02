public enum gkay implements hfub {
    REDIRECT_TARGET_UNKNOWN(0),
    REDIRECT_TARGET_ENTER_USER_CREATED_PASS(1),
    REDIRECT_TARGET_BOARDING_PASS(2),
    REDIRECT_TARGET_HEALTH_CARD(3),
    REDIRECT_TARGET_UNRETRYABLE_ERROR(4),
    REDIRECT_TARGET_SELECT_CATEGORY(5);

    public final int g;

    private gkay(int v1) {
        this.g = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.g;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.g);
    }
}

