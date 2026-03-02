import j..util.Objects;

public final class aanz {
    public final grxw a;
    public final grxw b;
    public final aanw c;
    public final aape d;

    public aanz(grxw grxw0, grxw grxw1, aanw aanw0, aape aape0) {
        this.a = grxw0;
        this.b = grxw1;
        this.c = aanw0;
        this.d = aape0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof aanz)) {
            return false;
        }
        return object0 == this ? true : Objects.equals(this.a, ((aanz)object0).a) && Objects.equals(this.b, ((aanz)object0).b) && Objects.equals(this.c, ((aanz)object0).c) && Objects.equals(this.d, ((aanz)object0).d);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
    }
}

