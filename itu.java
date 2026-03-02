public final class itu {
    public final ibth a;
    public final ibth b;
    public final boolean c;

    public itu(ibth ibth0, ibth ibth1, boolean z) {
        this.a = ibth0;
        this.b = ibth1;
        this.c = z;
    }

    @Override
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number)this.a.a()).floatValue() + ", maxValue=" + ((Number)this.b.a()).floatValue() + ", reverseScrolling=" + this.c + ')';
    }
}

