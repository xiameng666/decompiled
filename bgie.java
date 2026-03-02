import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class bgie {
    public static final bgif a(grdf grdf0) {
        ibuq.f(grdf0, "password");
        Charset charset0 = StandardCharsets.UTF_8;
        ibuq.e(charset0, "UTF_8");
        byte[] arr_b = grdf0.a.getBytes(charset0);
        ibuq.e(arr_b, "getBytes(...)");
        byte[] arr_b1 = glwl.d(new byte[][]{arr_b, bgif.a});
        byte[] arr_b2 = ghgc.a.a(arr_b1).e();
        ibuq.e(arr_b2, "asBytes(...)");
        return new bgif(hfxt.a(arr_b2));
    }
}

