import j..util.Objects;

final class zun extends aaex {
    public final grvb a;
    public final aatc b;

    public zun(grxw grxw0, grvb grvb0, aatc aatc0) {
        super(grxw0);
        this.a = grvb0;
        this.b = aatc0;
    }

    @Override  // aaem
    public final int a() {
        return 3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof zun) ? Objects.equals(this.a, ((zun)object0).a) && Objects.equals(this.b, ((zun)object0).b) && Objects.equals(this.h, ((zun)object0).h) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.h});
    }
}

