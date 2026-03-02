public enum hboa implements gpdm {
    TYPE_UNKNOWN(0),
    LATIN(1),
    LATIN_AND_CHINESE(2),
    LATIN_AND_DEVANAGARI(3),
    LATIN_AND_JAPANESE(4),
    LATIN_AND_KOREAN(5),
    CREDIT_CARD(6),
    DOCUMENT(7),
    PIXEL_AI(8),
    WALLET_PASSES(9);

    private final int l;

    private hboa(int v1) {
        this.l = v1;
    }

    @Override  // gpdm
    public final int a() {
        return this.l;
    }
}

