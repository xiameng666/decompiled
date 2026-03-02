public enum sqw {
    NONE(true),
    GENERAL_AUTHENTICATE_STEP_1(false),
    TERMINAL_PRIVACY_AKE_STEP_1(true),
    REVERSE_AKE_STEP_1(false),
    REVERSE_AKE_STEP_2(true);

    public final boolean f;

    private sqw(boolean z) {
        this.f = z;
    }
}

