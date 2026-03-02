public enum bim {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);

    public final boolean i;

    private bim(boolean z) {
        this.i = z;
    }
}

