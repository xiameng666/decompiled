import java.io.ByteArrayOutputStream;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class tlb extends Enum {
    public static final enum tlb a;
    private static final tlb[] b;
    private final byte c;

    static {
        tlb.a = new tlb();
        tlb.b = new tlb[]{tlb.a};
    }

    private tlb() {
        super("VERSION_05", 0);
        this.c = 5;
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream0) {
        if(this != tlb.a) {
            while(byteArrayOutputStream0.size() % 8 != 0) {
                byteArrayOutputStream0.write(0);
            }
            return;
        }
        byteArrayOutputStream0.write(0x80);
        while(byteArrayOutputStream0.size() % 8 != 0) {
            byteArrayOutputStream0.write(0);
        }
    }

    @Override
    public final String toString() {
        return tek.a(this.c);
    }

    public static tlb[] values() {
        return (tlb[])tlb.b.clone();
    }
}

