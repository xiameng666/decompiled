import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class tpq extends ttz {
    public static final tvr a;

    static {
        tpq.a = new tvr("Issuer Application Data", "Contains proprietary application data for transmission to the Issuer in an online transaction.", tpq.b, -1, 0x80000000, 0x20, 3, 1, 1, 5, 1, 3, 5);
    }

    public tpq(tuk tuk0, tpk tpk0, tny tny0, tnw tnw0, tnx tnx0, toa toa0, tns tns0) {
        byte[] arr_b;
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byteArrayOutputStream0.write(16);
            byteArrayOutputStream0.write(tuk0.r());
            byteArrayOutputStream0.write(((int)tpk0.r()[0]));
            byteArrayOutputStream0.write(tny0.r().length);
            byteArrayOutputStream0.write(tny0.r());
            byteArrayOutputStream0.write(tnw0.r());
            byteArrayOutputStream0.write(tnx0.r());
            byteArrayOutputStream0.write(toa0.r());
            byteArrayOutputStream0.write(tns0.r());
            arr_b = byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
        super(arr_b, tpq.a);
    }

    public tpq(byte[] arr_b) {
        super(arr_b, tpq.a);
    }
}

