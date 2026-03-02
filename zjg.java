import j..util.Objects;

public final class zjg {
    public final Long a;

    public zjg(Long long0) {
        this.a = long0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof zjg) ? Objects.equals(this.a, ((zjg)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }
}

