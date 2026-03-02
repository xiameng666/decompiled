public final class fuod {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fuod(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuod)) {
            return false;
        }
        if(this.a != ((fuod)object0).a) {
            return false;
        }
        if(this.b != ((fuod)object0).b) {
            return false;
        }
        return this.c == ((fuod)object0).c ? this.d == ((fuod)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "Params(containerHeightPx=" + this.a + ", minHeightPx=" + this.b + ", maxHeightPx=" + this.c + ", oversizeHeightPx=" + this.d + ")";
    }
}

