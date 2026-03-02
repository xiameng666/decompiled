import java.util.Arrays;

public final class atjv extends atjz {
    public final byte[] a;

    public atjv() {
        throw null;
    }

    public atjv(byte[] arr_b) {
        if(arr_b == null) {
            throw new NullPointerException("Null data");
        }
        this.a = arr_b;
    }

    @Override  // atld
    public final int a() {
        return this.a.length + 36;
    }

    @Override  // atjz
    public final int b() {
        return this.a.length;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof atjv) ? Arrays.equals(this.a, ((atjv)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a) ^ 1000003;
    }

    @Override
    public final String toString() {
        return "ByteChunkContent{data=" + Arrays.toString(this.a) + "}";
    }
}

