public final class fuio {
    public final fuij a;
    public final fryv b;

    public fuio(fuij fuij0, fryv fryv0) {
        this.a = fuij0;
        this.b = fryv0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuio)) {
            return false;
        }
        return ibuq.m(this.a, ((fuio)object0).a) ? ibuq.m(this.b, ((fuio)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "CardMetadataState(content=" + this.a + ", text=" + this.b + ")";
    }
}

