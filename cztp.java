import java.util.Arrays;

public final class cztp {
    public final byte[] a;
    public final boolean b;

    public cztp() {
        throw null;
    }

    public cztp(byte[] arr_b, boolean z) {
        this.a = arr_b;
        this.b = z;
    }

    public static cztp a(byte[] arr_b, boolean z) {
        czto czto0 = new czto();
        czto0.a(true);
        czto0.a(z);
        if(arr_b == null) {
            throw new NullPointerException("Null serviceData");
        }
        czto0.a = arr_b;
        if(czto0.c == 1) {
            byte[] arr_b1 = czto0.a;
            if(arr_b1 != null) {
                return new cztp(arr_b1, czto0.b);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(czto0.a == null) {
            stringBuilder0.append(" serviceData");
        }
        if(czto0.c == 0) {
            stringBuilder0.append(" allowL2cap");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof cztp) && Arrays.equals(this.a, ((cztp)object0).a) && this.b == ((cztp)object0).b;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.a) ^ 1000003;
        return this.b ? 0x4CF ^ v * 1000003 : 0x4D5 ^ v * 1000003;
    }

    @Override
    public final String toString() {
        return "ServiceDataInfo{serviceData=" + Arrays.toString(this.a) + ", allowL2cap=" + this.b + "}";
    }
}

