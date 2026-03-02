public enum azgb implements azgc {
    OVERFLOW("Overflow", azbc.D),
    OVERSIZE("Oversize", azbc.M),
    SINGLE_LOG_TOO_BIG("SingleLogTooBig", azbc.F),
    EXCEED_LOG_SOURCE_LOG_CAP("ExceedLogSourceLogCap", azbc.B);

    private final String f;
    private final azbc g;

    private azgb(String s1, azbc azbc0) {
        this.f = s1;
        this.g = azbc0;
    }

    @Override  // azgc
    public final azbc a() {
        return this.g;
    }

    @Override
    public final String toString() {
        return this.f;
    }
}

