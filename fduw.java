import android.net.Uri;
import java.util.List;

final class fduw {
    static final void a(String s, feyu feyu0, StringBuilder stringBuilder0, List list0, fdvl fdvl0) {
        if(stringBuilder0.length() > 0) {
            stringBuilder0.append(" OR ");
        }
        stringBuilder0.append("( packageName=?");
        list0.add(s);
        if(feyu0 != null) {
            Uri uri0 = Uri.parse(feyu0.d);
            boolean z = feyw.a(feyu0.c) == 3;
            String s1 = fdvl0.t(uri0);
            if(s1 != null) {
                stringBuilder0.append(" AND host=?");
                list0.add(s1);
            }
            String s2 = uri0.getPath();
            if(z) {
                s2 = fdvl.w(s2);
            }
            if(s2 != null) {
                stringBuilder0.append(fdvl.r("", z));
                list0.add(s2);
            }
        }
        stringBuilder0.append(" )");
    }
}

