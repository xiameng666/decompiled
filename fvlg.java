public enum fvlg {
    NO_LIMIT(0L),
    FOR_150HZ(0x65B9ABL),
    FOR_100HZ(10000000L);

    final long d;

    private fvlg(long v1) {
        this.d = v1;
    }
}

