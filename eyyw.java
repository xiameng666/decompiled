public final class eyyw {
    public final boolean a;
    public final int b;

    public eyyw(boolean z, int v) {
        this.a = z;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eyyw)) {
            return false;
        }
        return this.a == ((eyyw)object0).a ? this.b == ((eyyw)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a ? 0x9511 + this.b : 0x95CB + this.b;
    }

    @Override
    public final String toString() {
        return "PrimaryButtonUiState(isEnabled=" + this.a + ", labelId=" + this.b + ")";
    }
}

