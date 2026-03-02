public final class eysz {
    public final int a;
    public final eysy b;

    public eysz(int v) {
        this(v, null);
    }

    public eysz(int v, eysy eysy0) {
        this.a = v;
        this.b = eysy0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof eysz)) {
            return false;
        }
        return this.a == ((eysz)object0).a ? ibuq.m(this.b, ((eysz)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? this.a * 0x1F : this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "WarningMessageUiState(messageId=" + this.a + ", buttonState=" + this.b + ")";
    }
}

