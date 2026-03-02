import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class tsr extends tgr {
    public static final tik d;

    static {
        tsr.d = new tik("Issuer Application Data", "Contains proprietary application data for transmission to the Issuer in an online transaction.", tsr.a, -1, 0x80000000, 0x20, 3, 1, 1, 5, 1, 3, 5);
    }

    public tsr(thc thc0, tsl tsl0, tqx tqx0, tqv tqv0, tqw tqw0, tqz tqz0, tqr tqr0) {
        byte[] arr_b;
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byteArrayOutputStream0.write(16);
            byteArrayOutputStream0.write(thc0.k());
            byteArrayOutputStream0.write(((int)tsl0.k()[0]));
            byteArrayOutputStream0.write(tqx0.k().length);
            byteArrayOutputStream0.write(tqx0.k());
            byteArrayOutputStream0.write(tqv0.k());
            byteArrayOutputStream0.write(tqw0.k());
            byteArrayOutputStream0.write(tqz0.k());
            byteArrayOutputStream0.write(tqr0.k());
            arr_b = byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
        super(arr_b, tsr.d);
    }

    public tsr(byte[] arr_b) {
        super(arr_b, tsr.d);
    }
}

