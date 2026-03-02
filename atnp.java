import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;

public final class atnp implements atnm {
    public static final atnp a;

    static {
        atnp.a = new atnp();
    }

    @Override  // atnm
    public final atjz a(atjz atjz0) {
        return atnp.b(((atjv)atjz0));
    }

    public static final atjv b(atjv atjv0) {
        try(ghjo ghjo0 = new ghjo(null)) {
            ghjo0.setInput(atjv0.a);
            ghjo0.finished();
            try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
                byte[] arr_b = new byte[0x400];
                while(true) {
                    if(ghjo0.finished()) {
                        break;
                    }
                    byteArrayOutputStream0.write(arr_b, 0, ghjo0.inflate(arr_b));
                }
                byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                return new atjv(arr_b1);
            }
        }
        catch(IOException | DataFormatException exception0) {
            throw new atnt(exception0);
        }
    }
}

