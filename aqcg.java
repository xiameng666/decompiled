import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

public final class aqcg {
    private final Resources a;

    private aqcg(Resources resources0) {
        this.a = resources0;
    }

    public final int a(int v) {
        return this.a.getDimensionPixelSize(v);
    }

    public final Configuration b() {
        return this.a.getConfiguration();
    }

    public static aqcg c(Context context0) {
        Resources resources0 = context0.getResources();
        context0.getTheme();
        return new aqcg(resources0);
    }

    public final CharSequence d(int v) {
        return this.a.getText(v);
    }

    public final CharSequence e(int v, CharSequence[] arr_charSequence) {
        return TextUtils.expandTemplate(this.d(v), arr_charSequence);
    }
}

