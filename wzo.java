import j..util.Objects;

abstract class wzo {
    protected abstract String a();

    protected abstract String b();

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof wzo) ? Objects.equals(this.a(), ((wzo)object0).a()) && Objects.equals(this.b(), ((wzo)object0).b()) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a(), this.b()});
    }

    @Override
    public final String toString() {
        return "[" + this.a() + ":" + this.b() + "]";
    }
}

