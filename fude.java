public final class fude {
    public final fryv a;
    public final fuci b;
    public final fuch c;

    public fude() {
        this(null, 7);
    }

    public fude(fryv fryv0, fuci fuci0, fuch fuch0) {
        this.a = fryv0;
        this.b = fuci0;
        this.c = fuch0;
    }

    public fude(fuci fuci0, int v) {
        if((v & 2) != 0) {
            fuci0 = null;
        }
        this(null, fuci0, null);
    }

    public static fude a(fude fude0, fryv fryv0, fuci fuci0, fuch fuch0, int v) {
        if((v & 1) != 0) {
            fryv0 = fude0.a;
        }
        if((v & 2) != 0) {
            fuci0 = fude0.b;
        }
        if((v & 4) != 0) {
            fuch0 = fude0.c;
        }
        return new fude(fryv0, fuci0, fuch0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fude)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fude)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((fude)object0).b) ? ibuq.m(this.c, ((fude)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        fuch fuch0 = this.c;
        if(fuch0 != null) {
            v = fuch0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "TileListState(title=" + this.a + ", tileListContent=" + this.b + ", emptyTileListState=" + this.c + ")";
    }
}

