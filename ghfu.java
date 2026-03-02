import java.io.Serializable;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class ghfu extends Enum implements Serializable {
    public static final enum ghfu a;
    private static final ghfu[] b;

    static {
        ghfu.a = new ghfu();
        ghfu.b = new ghfu[]{ghfu.a};
    }

    private ghfu() {
        super("INSTANCE", 0);
    }

    @Override
    public final String toString() {
        return "Funnels.longFunnel()";
    }

    public static ghfu[] values() {
        return (ghfu[])ghfu.b.clone();
    }
}

