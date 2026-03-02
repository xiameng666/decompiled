import j..util.Objects;

public final class zuc extends aaex {
    public final grvb a;

    public zuc(grxw grxw0, grvb grvb0) {
        super(grxw0);
        this.a = grvb0;
    }

    @Override  // aaem
    public final int a() {
        return 7;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof zuc) ? Objects.equals(this.a, ((zuc)object0).a) && Objects.equals(this.h, ((zuc)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.h});
    }
}

