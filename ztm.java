import j..util.Objects;

final class ztm extends aaex {
    public final grvx a;

    public ztm(grxw grxw0, grvx grvx0) {
        super(grxw0);
        this.a = grvx0;
    }

    @Override  // aaem
    public final int a() {
        return 6;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ztm) ? Objects.equals(this.a, ((ztm)object0).a) && Objects.equals(this.h, ((ztm)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.h});
    }
}

