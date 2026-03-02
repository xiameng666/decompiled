public final class dcnz {
    public final dcny a;
    public final dcoa b;

    public dcnz(dcny dcny0) {
        this(dcny0, null);
    }

    public dcnz(dcny dcny0, dcoa dcoa0) {
        this.a = dcny0;
        this.b = dcoa0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dcnz)) {
            return false;
        }
        return ibuq.m(this.a, ((dcnz)object0).a) ? ibuq.m(this.b, ((dcnz)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? v : v + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "CommandResult(newState=" + this.a + ", effect=" + this.b + ")";
    }
}

