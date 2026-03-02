import java.util.concurrent.atomic.AtomicInteger;

public final class gyu extends AtomicInteger {
    public gyu() {
        super(0);
    }

    @Override
    public final byte byteValue() {
        return (byte)super.intValue();
    }

    @Override
    public final short shortValue() {
        return (short)super.intValue();
    }
}

