import android.content.Context;
import java.util.Arrays;

public final class busd {
    private final Context a;
    private final iakw[] b;

    public busd(Context context0, iakw[] arr_iakw) {
        this.a = context0;
        this.b = arr_iakw;
    }

    public final hixg a() {
        fhad fhad0 = fhae.a();
        fhad0.b(this.a);
        iakr iakr0 = cmma.g(0x11101, -1, fhad0.a(), new fhbw()).a(hizx.ao);
        ibuq.e(iakr0, "get(...)");
        return (hixg)new hixg(iakr0, iakq.a).p(((iakw[])Arrays.copyOf(this.b, 1)));
    }
}

