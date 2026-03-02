public final class bvga {
    public final float a;
    public final String b;
    public final bvgi c;

    public bvga(float f, String s, bvgi bvgi0) {
        this.a = f;
        this.b = s;
        this.c = bvgi0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvga)) {
            return false;
        }
        if(Float.compare(this.a, ((bvga)object0).a) != 0) {
            return false;
        }
        return ibuq.m(this.b, ((bvga)object0).b) ? ibuq.m(this.c, ((bvga)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "FeaturesEntryProgressUiModel(percent=" + this.a + ", label=" + this.b + ", color=" + this.c + ")";
    }
}

