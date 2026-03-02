import android.content.Context;
import java.util.Objects;

public final class dmvu implements ibts {
    public final fryv a;
    public final dmwr b;
    public final String c;

    public dmvu(fryv fryv0, dmwr dmwr0, String s) {
        this.a = fryv0;
        this.b = dmwr0;
        this.c = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ivj ivj0 = (ivj)object0;
        ibuq.f(ivj0, "$this$semantics");
        Context context0 = this.b.requireContext();
        CharSequence charSequence0 = this.a.a(context0);
        String s = edkt.a(this.c);
        Objects.toString(charSequence0);
        ivf.j(ivj0, charSequence0 + String.valueOf(s));
        return ibom.a;
    }
}

