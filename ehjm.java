import android.content.Context;
import android.text.TextUtils;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ehjm {
    public static final ggeo a;
    public static final String[] b;
    public static final String[] c;
    private static final ggeo d;
    private static final Pattern e;

    static {
        ggek ggek0 = new ggek();
        ggek0.i("lh3.googleusercontent.com", "~3");
        ggek0.i("lh4.googleusercontent.com", "~4");
        ggek0.i("lh5.googleusercontent.com", "~5");
        ggek0.i("lh6.googleusercontent.com", "~6");
        ehjm.d = ggek0.b();
        ggek ggek1 = new ggek();
        ggek1.i("~3", "lh3.googleusercontent.com");
        ggek1.i("~4", "lh4.googleusercontent.com");
        ggek1.i("~5", "lh5.googleusercontent.com");
        ggek1.i("~6", "lh6.googleusercontent.com");
        ehjm.a = ggek1.b();
        ehjm.b = new String[]{"^~([3-6])", "^", "/$"};
        ehjm.c = new String[]{"lh$1.googleusercontent.com", "https://", "/photo.jpg"};
        ehjm.e = Pattern.compile("\\/photo\\.jpg\\?sz\\=\\d*$");
    }

    public static int a(Context context0, int v) {
        switch(v) {
            case 0: {
                return (int)context0.getResources().getDimension(0x7F070E76);  // dimen:people_avatar_size_tiny
            }
            case 1: {
                return (int)context0.getResources().getDimension(0x7F070E75);  // dimen:people_avatar_size_small
            }
            case 2: {
                return (int)context0.getResources().getDimension(0x7F070E74);  // dimen:people_avatar_size_medium
            }
            case 3: {
                return (int)context0.getResources().getDimension(0x7F070E73);  // dimen:people_avatar_size_large
            }
            case 4: {
                return 0x60;
            }
            default: {
                throw new IllegalArgumentException("Invalid avatar size: " + v);
            }
        }
    }

    public static int b(String s) {
        if(s.startsWith("https://")) {
            return 8;
        }
        if(s.startsWith("http://")) {
            return 7;
        }
        return s.startsWith("//") ? 2 : 0;
    }

    public static String c(String s) {
        String s1 = null;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        int v = ehjm.b(s);
        int v1 = s.length();
        if(s.endsWith("/photo.jpg")) {
            v1 += -9;
        }
        else if(s.endsWith("/photo.jpg?sz=50")) {
            v1 += -15;
        }
        else {
            Matcher matcher0 = ehjm.e.matcher(s);
            if(matcher0.find()) {
                v1 -= matcher0.end() - matcher0.start() - 1;
            }
        }
        int v2 = s.indexOf(0x2F, v);
        if(v2 != -1) {
            s1 = (String)ehjm.d.get(s.substring(v, v2));
        }
        return s1 == null ? s.substring(v, v1) : s1 + s.substring(v2, v1);
    }

    public static boolean d(Throwable throwable0) {
        if((throwable0 instanceof VolleyError)) {
            NetworkResponse networkResponse0 = ((VolleyError)throwable0).networkResponse;
            if(networkResponse0 != null) {
                return networkResponse0.statusCode == 403 || networkResponse0.statusCode == 429 ? true : networkResponse0.statusCode >= 500 && networkResponse0.statusCode < 600;
            }
        }
        Throwable throwable1 = throwable0.getCause();
        return throwable1 != null && throwable1 != throwable0 && ehjm.d(throwable1);
    }

    public static boolean e(Throwable throwable0) {
        if((throwable0 instanceof VolleyError)) {
            NetworkResponse networkResponse0 = ((VolleyError)throwable0).networkResponse;
            if(networkResponse0 != null) {
                return networkResponse0.statusCode == 404;
            }
        }
        Throwable throwable1 = throwable0.getCause();
        return throwable1 != null && throwable1 != throwable0 && ehjm.e(throwable1);
    }
}

