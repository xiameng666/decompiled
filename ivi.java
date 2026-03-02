public final class ivi {
    public final String a;
    public final ibtw b;
    public boolean c;

    public ivi(String s) {
        this(s, ivh.a);
    }

    public ivi(String s, ibtw ibtw0) {
        this.a = s;
        this.b = ibtw0;
    }

    public ivi(String s, boolean z, ibtw ibtw0) {
        this(s, ibtw0);
        this.c = z;
    }

    public ivi(String s, byte[] arr_b) {
        this(s);
        this.c = true;
    }

    public final void a(ivj ivj0, Object object0) {
        ivj0.a(this, object0);
    }

    @Override
    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }
}

