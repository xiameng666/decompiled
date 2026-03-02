import j..util.Objects;

public final class canj {
    public final Long a;
    public final Long b;

    public canj(Long long0, Long long1) {
        this.a = long0;
        this.b = long1;
    }

    public final boolean a() {
        return ((long)this.a) < ((long)this.b);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof canj) ? ((canj)object0) != null && ((canj)object0).a.equals(this.a) && ((canj)object0).b.equals(this.b) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        return String.format("%d %d", this.a, this.b);
    }
}

