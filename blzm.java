import j..util.Objects;

public final class blzm implements blzl {
    private final blzo a;
    private final byte[] b;

    private blzm(blzo blzo0, byte[] arr_b) {
        gftb.check(blzo0);
        this.a = blzo0;
        gftb.check(arr_b);
        this.b = arr_b;
    }

    @Override  // blzl
    public final blzo a() {
        return this.a;
    }

    @Override  // blzl
    public final String b() {
        return ghjc.e.g().o(this.b);
    }

    public static blzm c(blzp blzp0) {
        return new blzm(blzp0.a(), blzp0.d());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof blzm) ? this.b().equals(((blzl)object0).b()) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.b()});
    }

    @Override
    public final String toString() {
        return this.b();
    }
}

