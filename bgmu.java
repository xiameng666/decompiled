import android.content.Context;
import android.content.res.Resources;

public final class bgmu {
    public final Context a;
    public final Resources b;
    public final bayn c;

    public bgmu(Context context0, bayn bayn0) {
        this.a = context0;
        this.b = context0.getResources();
        this.c = bayn0;
    }

    public static final int a(String s) {
        return s.hashCode() + 0x18928AAE;
    }
}

