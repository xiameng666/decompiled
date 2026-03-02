import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class grcg {
    public static final grch a(String s, grdf grdf0) {
        ibuq.f(s, "canonicalizedUsername");
        ibuq.f(grdf0, "password");
        Charset charset0 = StandardCharsets.UTF_8;
        ibuq.e(charset0, "UTF_8");
        byte[] arr_b = s.getBytes(charset0);
        ibuq.e(arr_b, "getBytes(...)");
        Charset charset1 = StandardCharsets.UTF_8;
        ibuq.e(charset1, "UTF_8");
        byte[] arr_b1 = grdf0.a.getBytes(charset1);
        ibuq.e(arr_b1, "getBytes(...)");
        byte[] arr_b2 = glwl.d(new byte[][]{arr_b, arr_b1, grch.a});
        byte[] arr_b3 = ghgc.a.a(arr_b2).e();
        ibuq.e(arr_b3, "asBytes(...)");
        return new grch(hfxt.a(arr_b3));
    }
}

