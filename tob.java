import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class tob extends ttz {
    public static final tvr a;

    static {
        tob.a = new tvr("Issuer Application Data", "Contains proprietary application data for transmission to the Issuer in an online transaction.", tob.b, -1, 0x80000000, 0x20, 3, 1, 1, 5, 1, 3, 5);
    }

    public tob(tuk tuk0, tug tug0, tny tny0, tnw tnw0, tnx tnx0, tpz tpz0, tqa tqa0, tpy tpy0, toa toa0) {
        byte[] arr_b;
        try {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byteArrayOutputStream0.write(21);
            byteArrayOutputStream0.write(tuk0.r());
            byteArrayOutputStream0.write(tug0.r());
            byteArrayOutputStream0.write(tny0.r().length);
            byteArrayOutputStream0.write(tny0.r());
            byteArrayOutputStream0.write(tnw0.r());
            byteArrayOutputStream0.write(tnx0.r());
            byteArrayOutputStream0.write(tpz0.r());
            byteArrayOutputStream0.write(tqa0.r());
            byteArrayOutputStream0.write(tpy0.r());
            byteArrayOutputStream0.write(toa0.r());
            byteArrayOutputStream0.write(new byte[]{0, 0});
            arr_b = byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
        super(arr_b, tob.a);
    }

    public tob(byte[] arr_b) {
        super(arr_b, tob.a);
    }
}

