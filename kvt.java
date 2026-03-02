import j..util.Objects;

public final class kvt {
    public final kuy a;
    public final kux b;
    public final boolean c;

    public kvt() {
        this(null, null);
    }

    public kvt(kux kux0) {
        this(null, kux0);
    }

    public kvt(kuy kuy0) {
        this(kuy0, null);
    }

    public kvt(kuy kuy0, kux kux0) {
        this.a = kuy0;
        this.b = kux0;
        this.c = kuy0 != null;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof kvt) && this.c == ((kvt)object0).c && ibuq.m(this.a, ((kvt)object0).a) && ibuq.m(this.b, ((kvt)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.c), this.a, this.b});
    }
}

