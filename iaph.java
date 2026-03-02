import java.nio.charset.StandardCharsets;

public enum iaph {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);

    public final int r;
    public final byte[] s;

    private iaph(int v1) {
        this.r = v1;
        this.s = Integer.toString(v1).getBytes(StandardCharsets.US_ASCII);
    }

    public final iapk a() {
        return (iapk)iapk.a.get(this.r);
    }
}

