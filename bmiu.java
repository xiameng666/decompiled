public enum bmiu implements bmgm {
    RS256(0xFFFFFEFF),
    RS384(0xFFFFFEFE),
    RS512(0xFFFFFEFD),
    @Deprecated
    LEGACY_RS1(0xFFFFFEFA),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(0xFFFF0001);

    public final int i;

    private bmiu(int v1) {
        this.i = v1;
    }

    @Override  // bmgm
    public final int a() {
        return this.i;
    }
}

