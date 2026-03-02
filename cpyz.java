import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

final class cpyz {
    static bwnj a(Uri uri0, List list0) {
        for(Object object0: list0) {
            bwnj bwnj0 = (bwnj)object0;
            String s = uri0.getPath();
            String s1 = bwnj0.b;
            ArrayList arrayList0 = new ArrayList(Uri.parse(s1).getPathSegments());
            ArrayList arrayList1 = new ArrayList(uri0.getPathSegments());
            if(arrayList1.size() >= 3 && arrayList0.size() >= 3 && TextUtils.equals(((CharSequence)arrayList0.get(2)), "*")) {
                arrayList0.set(2, ((String)arrayList1.get(2)));
                s1 = File.separator + TextUtils.join(File.separator, arrayList0) + File.separator;
            }
            if(s.startsWith(s1)) {
                return bwnj0;
            }
        }
        return null;
    }
}

