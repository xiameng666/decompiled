import android.content.Context;
import java.io.InputStream;
import javax.crypto.SecretKey;

public final class atin implements athz {
    private final int a;
    private final Context b;
    private final String c;
    private final InputStream d;

    public atin(Context context0, String s, InputStream inputStream0) {
        this.a = (int)glxd.b(hqiu.a.b().a(), 0L, 50000000L);
        this.b = context0;
        this.c = s;
        this.d = inputStream0;
    }

    @Override  // athz
    public final athy a(SecretKey secretKey0, byte[] arr_b, arad arad0, gged_interceptors gged0) {
        gftb.check(arr_b);
        atim atim0 = new atim(new atgl(new atgm(secretKey0, new atgq(), new atgn(secretKey0, arr_b), new atgp()), this.d));
        try(atgj atgj0 = new atgj(atim0, gged0); atkj atkj0 = new atkj(this.a, this.b, this.c, arad0)) {
            long v;
            for(v = 0L; true; v += (long)atjy0.b.b()) {
                if(!atgj0.c()) {
                    break;
                }
                atjy atjy0 = atgj0.a();
                atkj0.d(atjy0);
            }
            atke atke0 = atkj0.b();
            return new athy(atke0, ByteString.copyFrom(atim0.a.digest()), v);
        }
    }
}

