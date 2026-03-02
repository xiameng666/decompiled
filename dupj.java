import android.net.Uri;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class dupj implements Consumer {
    public final duqg a;

    public dupj(duqg duqg0) {
        this.a = duqg0;
    }

    @Override
    public final void accept(Object object0) {
        hjzr hjzr0 = ((hkbc)object0).d;
        if(hjzr0 == null) {
            hjzr0 = hjzr.a;
        }
        String s = hjzr0.d;
        if(s.isEmpty()) {
            return;
        }
        Uri uri0 = Uri.parse(s);
        ((txx)((txx)this.a.am.f(uri0).W()).s(udf.a)).o();
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

