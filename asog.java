import android.content.Context;
import java.util.Arrays;
import java.util.Formatter;

public final class asog {
    public final Context a;
    private final ibnn b;

    public asog(Context context0) {
        this.a = context0;
        this.b = new ibnz(new asof());
    }

    public final String a(int v, Integer integer0) {
        return integer0 == null ? ibzk.s(this.b(v, new Object[]{"", ""})).toString() : ibzk.s(this.b(v, new Object[]{".", this.a.getString(integer0.intValue())})).toString();
    }

    private final String b(int v, Object[] arr_object) {
        String s = ((Formatter)this.b.a()).format(this.a.getString(v), Arrays.copyOf(arr_object, 2)).toString();
        ibuq.e(s, "toString(...)");
        return s;
    }
}

