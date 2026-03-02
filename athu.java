import java.util.Arrays;

public final class athu implements atld, Comparable {
    public final byte[] a;

    public athu(byte[] arr_b) {
        gftb.b(arr_b.length == 0x20, "Hash must bit 256 bits");
        this.a = arr_b;
    }

    @Override  // atld
    public final int a() {
        throw null;
    }

    @Override
    public final int compareTo(Object object0) {
        return glxi.b.compare(this.a, ((athu)object0).a);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == null || this.getClass() != object0.getClass() ? false : Arrays.equals(this.a, ((athu)object0).a);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override
    public final String toString() {
        return ghjc.d.o(this.a);
    }
}

