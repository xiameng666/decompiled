import android.os.LocaleList;
import java.util.Locale;

public final class jzd {
    public static final jzd a;
    private final jze b;

    static {
        jzd.a = jzd.b(new Locale[0]);
    }

    private jzd(jze jze0) {
        this.b = jze0;
    }

    public final int a() {
        return this.b.a.size();
    }

    public static jzd b(Locale[] arr_locale) {
        return jzd.e(new LocaleList(arr_locale));
    }

    public static jzd c(String s) {
        if(s != null && !s.isEmpty()) {
            String[] arr_s = s.split(",", -1);
            Locale[] arr_locale = new Locale[arr_s.length];
            for(int v = 0; v < arr_s.length; ++v) {
                arr_locale[v] = Locale.forLanguageTag(arr_s[v]);
            }
            return jzd.b(arr_locale);
        }
        return jzd.a;
    }

    public static jzd d() {
        return jzd.e(LocaleList.getAdjustedDefault());
    }

    public static jzd e(LocaleList localeList0) {
        return new jzd(new jze(localeList0));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof jzd) && this.b.equals(((jzd)object0).b);
    }

    public final String f() {
        return this.b.a.toLanguageTags();
    }

    public final Locale g(int v) {
        return this.b.a.get(v);
    }

    public final boolean h() {
        return this.b.a.isEmpty();
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final String toString() {
        return this.b.toString();
    }
}

