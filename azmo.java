import java.security.SecureRandom;

public final class azmo {
    private final SecureRandom a;

    public azmo(SecureRandom secureRandom0) {
        this.a = secureRandom0;
    }

    final ByteString a() {
        byte[] arr_b = new byte[8];
        this.a.nextBytes(arr_b);
        return ByteString.copyFrom(arr_b);
    }
}

