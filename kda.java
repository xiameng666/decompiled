import j..util.Objects;
import java.security.SecureRandom;
import java.util.Arrays;

public final class kda {
    private final byte[] a;
    private final int b;

    private kda(int v, byte[] arr_b) {
        this.b = v;
        this.a = arr_b;
    }

    public static kda a(byte[] arr_b) {
        switch(arr_b.length) {
            case 2: {
                return new kda(1, arr_b);
            }
            case 8: {
                return new kda(2, arr_b);
            }
            default: {
                throw new IllegalArgumentException(String.format("the address length only can be 2 bytes (SHORT) or 8 bytes (EXTENDED), passed in %d bytes", ((int)arr_b.length)));
            }
        }
    }

    public static kda b() {
        SecureRandom secureRandom0 = new SecureRandom();
        byte[] arr_b = new byte[2];
        do {
            secureRandom0.nextBytes(arr_b);
        }
        while(kda.c(arr_b));
        return kda.a(arr_b);
    }

    public static boolean c(byte[] arr_b) {
        return arr_b.length == 2 ? Arrays.equals(arr_b, hjlz.c) : Arrays.equals(arr_b, hjlz.d);
    }

    public final byte[] d() {
        return (byte[])this.a.clone();
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof kda) && this.b == ((kda)object0).b) {
            byte[] arr_b = ((kda)object0).d();
            return Arrays.equals(this.a, arr_b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.a);
        return Objects.hash(new Object[]{((int)this.b), integer0});
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("0X");
        byte[] arr_b = this.a;
        for(int v = 0; v < arr_b.length; ++v) {
            stringBuilder0.append(String.format("%02X", ((byte)arr_b[v])));
        }
        return stringBuilder0.toString();
    }
}

