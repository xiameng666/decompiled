import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class tra extends tgr {
    public static final tik d;

    static {
        tra.d = new tik("Issuer Application Data", "Contains proprietary application data for transmission to the Issuer in an online transaction.", tra.a, -1, 0x80000000, 0x20, 3, 1, 1, 5, 1, 3, 5);
    }

    public tra(thc thc0, tgy tgy0, tqx tqx0, tqv tqv0, tqw tqw0, tta tta0, ttb ttb0, tsz tsz0, tqz tqz0) {
        byte[] arr_b;
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byteArrayOutputStream0.write(21);
            byteArrayOutputStream0.write(thc0.k());
            byteArrayOutputStream0.write(tgy0.k());
            byteArrayOutputStream0.write(tqx0.k().length);
            byteArrayOutputStream0.write(tqx0.k());
            byteArrayOutputStream0.write(tqv0.k());
            byteArrayOutputStream0.write(tqw0.k());
            byteArrayOutputStream0.write(tta0.k());
            byteArrayOutputStream0.write(ttb0.k());
            byteArrayOutputStream0.write(tsz0.k());
            byteArrayOutputStream0.write(tqz0.k());
            byteArrayOutputStream0.write(new byte[]{0, 0});
            arr_b = byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
        super(arr_b, tra.d);
    }

    public tra(byte[] arr_b) {
        super(arr_b, tra.d);
    }
}

