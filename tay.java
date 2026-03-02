public enum tay {
    IN_PROGRESS(false),
    APPROVED(true),
    DECLINED(true);

    public final boolean d;

    private tay(boolean z) {
        this.d = z;
    }
}

