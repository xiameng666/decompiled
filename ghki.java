public final class ghki extends ghkh implements CharSequence {
    public final String a;

    public ghki() {
        this.a = "/mcu/";
    }

    @Override
    public final char charAt(int v) {
        return this.a.charAt(v);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghki) && this.a.equals(((ghki)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final int length() {
        return this.a.length();
    }

    @Override
    public final CharSequence subSequence(int v, int v1) {
        return this.a.substring(v, v1);
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

