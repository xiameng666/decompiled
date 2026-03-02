public final class fuos {
    public final fuor a;
    public final fuor b;
    public final fuor c;
    public final int d;

    public fuos(fuor fuor0, fuor fuor1, fuor fuor2, int v) {
        ibuq.f(fuor0, "widthClass");
        ibuq.f(fuor1, "heightClass");
        ibuq.f(fuor2, "minimumSizeClass");
        super();
        this.a = fuor0;
        this.b = fuor1;
        this.c = fuor2;
        this.d = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuos)) {
            return false;
        }
        if(this.a != ((fuos)object0).a) {
            return false;
        }
        if(this.b != ((fuos)object0).b) {
            return false;
        }
        return this.c == ((fuos)object0).c ? this.d == ((fuos)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "WindowState(widthClass=" + this.a + ", heightClass=" + this.b + ", minimumSizeClass=" + this.c + ", orientation=" + this.d + ")";
    }
}

