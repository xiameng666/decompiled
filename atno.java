import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class atno implements atnn {
    public static final atno a;

    static {
        atno.a = new atno();
    }

    @Override  // atnn
    public final atjy a(atjy atjy0) {
        byte[] arr_b1;
        if(!atjy0.c()) {
            atjv atjv0 = (atjv)atjy0.b;
            try(ghjn ghjn0 = new ghjn(null)) {
                ghjn0.setInput(atjv0.a);
                ghjn0.finish();
                try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
                    byte[] arr_b = new byte[0x400];
                    while(true) {
                        if(ghjn0.finished()) {
                            break;
                        }
                        byteArrayOutputStream0.write(arr_b, 0, ghjn0.deflate(arr_b));
                    }
                    arr_b1 = byteArrayOutputStream0.toByteArray();
                }
            }
            catch(IOException iOException0) {
                throw new atnt(iOException0);
            }
            atjv atjv1 = new atjv(arr_b1);
            return new atjy(atjy0.a, atjv1);
        }
        return atjy0;
    }
}

