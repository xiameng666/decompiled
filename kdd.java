import j..util.Objects;

public final class kdd {
    public final kda a;

    private kdd(kda kda0) {
        this.a = kda0;
    }

    public static kdd a(byte[] arr_b) {
        return new kdd(kda.a(arr_b));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof kdd) ? Objects.equals(this.a, ((kdd)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @Override
    public final String toString() {
        return String.format("UwbDevice {%s}", this.a);
    }
}

