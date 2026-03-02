public enum tgo {
    IN_PROGRESS(false),
    APPROVED(true),
    DECLINED(true);

    final boolean d;

    private tgo(boolean z) {
        this.d = z;
    }
}

