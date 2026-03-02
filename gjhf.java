public enum gjhf implements hfub {
    UNKNOWN(0),
    ONLY_EXIST_IN_SERVER(1),
    ONLY_EXIST_IN_LOCAL(2),
    DATA1(3),
    DATA2(4),
    DATA3(5),
    DATA4(6),
    DATA5(7),
    DATA6(8),
    DATA7(9),
    DATA8(10),
    DATA9(11),
    DATA10(12),
    DATA11(13),
    DATA12(14),
    DATA13(15),
    DATA14(16),
    DATA15(17),
    IS_PRIMARY(18),
    GROUP_SOURCE_ID(19),
    SYNC1(20),
    SYNC2(21),
    SYNC3(22);

    public final int x;

    private gjhf(int v1) {
        this.x = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.x;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.x);
    }
}

