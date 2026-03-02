import com.google.android.gms.wearable.MessageOptions;
import java.util.function.Supplier;

public final class fcke implements Supplier {
    public final fckl a;
    public final ffbq b;

    public fcke(fckl fckl0, ffbq ffbq0) {
        this.a = fckl0;
        this.b = ffbq0;
    }

    @Override
    public final Object get() {
        fckl fckl0 = this.a;
        ffbq ffbq0 = this.b;
        if(hzyp.f()) {
            byte[] arr_b = ffbq0.toBytesArray();
            MessageOptions messageOptions0 = new MessageOptions(1);
            return fckl0.b.j(fckl0.d, "/restore/start_restore", arr_b, messageOptions0);
        }
        byte[] arr_b1 = ffbq0.toBytesArray();
        return fckl0.b.i(fckl0.d, "/restore/start_restore", arr_b1);
    }
}

