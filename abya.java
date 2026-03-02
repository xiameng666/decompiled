import java.util.Arrays;

public final class abya {
    public final String a;
    public final abyc[] b;

    public abya(abyc[] arr_abyc) {
        this.a = "com.google.android.gms.icing.proxy";
        abyc[] arr_abyc1 = new abyc[4];
        System.arraycopy(arr_abyc, 0, arr_abyc1, 0, 4);
        this.b = arr_abyc1;
    }

    private final Object[] a() {
        return new Object[]{this.a, this.b};
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof abya) ? Arrays.deepEquals(this.a(), ((abya)object0).a()) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.deepHashCode(this.a());
    }
}

