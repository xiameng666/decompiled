public enum gjgi implements hfub {
    UNSPECIFIED(0),
    CONTACT(1),
    GROUP(2),
    PHOTO(3),
    CONTACT_FIELD(4),
    PHOTO_HIGH_RES(5),
    PHOTO_LOW_RES(6),
    GROUP_CONTACT_ORDER_CPG(7),
    DATA_WITH_LUNAR_DATES(8),
    CALLING_CARD_PHOTO(9);

    public final int k;

    private gjgi(int v1) {
        this.k = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.k;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.k);
    }
}

