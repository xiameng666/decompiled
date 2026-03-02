import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public final class hmkg {
    public BigDecimal a;
    public final int b;

    public hmkg(int v) {
        this.b = v;
    }

    public hmkg(BigDecimal bigDecimal0, int v) {
        this.a = bigDecimal0;
        this.b = v;
    }

    public static hmkg a(Object object0) {
        if((object0 instanceof Integer)) {
            return new hmkg(new BigDecimal(((int)(((Integer)object0)))), 3);
        }
        if((object0 instanceof Long)) {
            return new hmkg(new BigDecimal(((long)(((Long)object0)))), 6);
        }
        if((object0 instanceof Float)) {
            return new hmkg(BigDecimal.valueOf(((Float)object0).floatValue()), 4);
        }
        if((object0 instanceof Short)) {
            return new hmkg(new BigDecimal(((short)(((Short)object0)))), 2);
        }
        if((object0 instanceof Double)) {
            return new hmkg(BigDecimal.valueOf(((Double)object0).doubleValue()), 5);
        }
        if((object0 instanceof Byte)) {
            return new hmkg(new BigDecimal(((byte)(((Byte)object0)))), 1);
        }
        if((object0 instanceof BigInteger)) {
            return new hmkg(new BigDecimal(((BigInteger)object0)), 11);
        }
        return (object0 instanceof BigDecimal) ? new hmkg(((BigDecimal)object0), 10) : null;
    }

    public final ByteBuffer b() {
        int v = this.b - 1;
        if(v != 10) {
            switch(v) {
                case 0: {
                    return ByteBuffer.allocate(1).put(this.a.byteValue());
                }
                case 1: {
                    return ByteBuffer.allocate(2).putShort(this.a.shortValue());
                }
                case 2: {
                    return ByteBuffer.allocate(4).putInt(this.a.intValue());
                }
                case 3: {
                    return ByteBuffer.allocate(4).putFloat(this.a.floatValue());
                }
                case 4: {
                    return ByteBuffer.allocate(8).putDouble(this.a.doubleValue());
                }
                case 5: {
                    return ByteBuffer.allocate(8).putLong(this.a.longValue());
                }
                case 6: {
                    return ByteBuffer.wrap(this.a.toString().getBytes(StandardCharsets.US_ASCII));
                }
                default: {
                    throw new hmki("Data type not supported by DSLNum");
                }
            }
        }
        return ByteBuffer.wrap(this.a.toBigInteger().toByteArray());
    }

    @Override
    public final String toString() {
        return this.a == null ? "" : this.a.toString();
    }
}

