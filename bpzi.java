import java.util.Arrays;

public final class bpzi implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        Object object1 = String.format("%02x", Arrays.copyOf(new Object[]{((Byte)object0)}, 1));
        ibuq.e(object1, "format(...)");
        return object1;
    }
}

