public enum ttw {
    IN_PROGRESS(false),
    APPROVED(true),
    DECLINED(true);

    final boolean d;

    private ttw(boolean z) {
        this.d = z;
    }
}

