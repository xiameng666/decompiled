public final class byam {
    public final int a;
    public final CharSequence b;

    public byam(int v, CharSequence charSequence0) {
        this.a = v;
        this.b = charSequence0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byam)) {
            return false;
        }
        return this.a == ((byam)object0).a ? ibuq.m(this.b, ((byam)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? this.a * 0x1F : this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "BiometricError(errorCode=" + this.a + ", errorMessage=" + this.b + ")";
    }
}

