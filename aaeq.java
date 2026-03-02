import j..util.Objects;

public final class aaeq extends aaem {
    aaby a;
    final aacg b;

    public aaeq(aaby aaby0, aacg aacg0) {
        this.a = aaby0;
        this.b = aacg0;
    }

    @Override  // aaem
    public final int a() {
        return 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof aaeq) ? Objects.equals(this.a, ((aaeq)object0).a) && Objects.equals(this.b, ((aaeq)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }
}

