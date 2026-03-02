public enum azbl implements aywt {
    INCREMENTS_DROPPED_BY_INVALID_SOURCE,
    INCREMENTS_DROPPED_BY_SOURCE_CAPACITY,
    INVALID_INCREMENTS,
    RESERVED_1,
    RESERVED_2,
    RESERVED_3,
    RESERVED_4,
    RESERVED_5,
    RESERVED_6,
    RESERVED_7,
    RESERVED_8;

    public final int l;

    private azbl() {
        this.l = this.ordinal() * 4;
    }

    @Override  // aywt
    public final int a() {
        return this.l;
    }
}

