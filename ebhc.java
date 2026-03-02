import com.google.android.gms.common.api.Status;
import java.nio.charset.StandardCharsets;

public final class ebhc {
    private final donp a;

    public ebhc(donp donp0) {
        this.a = donp0;
    }

    public final void a(String s) {
        this.a.b(Status.d, s.getBytes(StandardCharsets.UTF_8));
    }

    public final void b(ftcg ftcg0) {
        byte[] arr_b = ftcg0.toBytesArray();
        this.a.b(Status.b, arr_b);
    }
}

