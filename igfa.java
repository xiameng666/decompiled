import j..util.Objects;

final class igfa extends IllegalArgumentException {
    final igfb a;
    private final boolean b;
    private static final long serialVersionUID = 0xADC745D6DF8120ABL;

    public igfa(igfb igfb0, String s, boolean z) {
        Objects.requireNonNull(igfb0);
        this.a = igfb0;
        super(s);
        this.b = z;
    }

    @Override
    public final String getMessage() {
        StringBuffer stringBuffer0 = new StringBuffer(85);
        stringBuffer0.append("The");
        String s = super.getMessage();
        if(s != null) {
            stringBuffer0.append(' ');
            stringBuffer0.append(s);
        }
        stringBuffer0.append(" instant is ");
        igfb igfb0 = this.a;
        igcm igcm0 = igfb0.a;
        iggt iggt0 = igho.b.d(igcm0);
        if(this.b) {
            stringBuffer0.append("below the supported minimum of ");
            iggt0.f(stringBuffer0, igfb0.F.a);
        }
        else {
            stringBuffer0.append("above the supported maximum of ");
            iggt0.f(stringBuffer0, igfb0.G.a);
        }
        stringBuffer0.append(" (");
        stringBuffer0.append(igcm0);
        stringBuffer0.append(')');
        return stringBuffer0.toString();
    }

    @Override
    public final String toString() {
        return "IllegalArgumentException: " + this.getMessage();
    }
}

