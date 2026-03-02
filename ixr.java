public final class ixr {
    public static final ixr a;
    public final boolean b;
    public final int c;

    static {
        ixr.a = new ixr(0, false);
    }

    public ixr() {
        this(0, false);
    }

    public ixr(int v, boolean z) {
        this.b = z;
        this.c = v;
    }

    public ixr(byte[] arr_b) {
        this.b = false;
        this.c = 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ixr)) {
            return false;
        }
        return this.b == ((ixr)object0).b ? iwu.b(this.c, ((ixr)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.b ? 0x9511 + this.c : 0x95CB + this.c;
    }

    @Override
    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.b + ", emojiSupportMatch=" + iwu.a(this.c) + ')';
    }
}

