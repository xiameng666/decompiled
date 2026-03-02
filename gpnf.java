public final class gpnf {
    public final boolean a;

    public gpnf() {
        throw null;
    }

    public gpnf(boolean z) {
        this.a = z;
    }

    public static gpne a() {
        gpne gpne0 = new gpne();
        gpne0.a = (byte)(gpne0.a | 1);
        gpne0.b(false);
        gpne0.a = (byte)(gpne0.a | 4);
        return gpne0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof gpnf) && this.a == ((gpnf)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a ? -68803278 : -58803120;
    }

    @Override
    public final String toString() {
        return "EncoderOptions{enableCelLogsiteMetadata=false, enableSafeFormatArgs=" + this.a + ", includeSuppressedExceptions=false}";
    }
}

