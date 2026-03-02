import android.net.Uri;
import com.google.android.chimera.android.Activity;
import java.util.ArrayList;
import java.util.List;

public final class dcos {
    public static final String a(Activity activity0) {
        String s = null;
        if(!hvqz.m()) {
            return null;
        }
        Uri uri0 = activity0.getReferrer();
        String s1 = uri0 == null ? null : uri0.getHost();
        Uri uri1 = activity0.getIntent().getData();
        String s2 = uri1 == null ? null : uri1.getAuthority();
        if(ibuq.m(s2, hvqs.bc())) {
            Uri uri2 = activity0.getIntent().getData();
            if(uri2 != null) {
                String s3 = uri2.buildUpon().fragment(null).build().toString();
                ibuq.e(s3, "toString(...)");
                s = ibzk.w(s3, "//", s3);
            }
        }
        else if(hvqs.aR().b.contains(s2)) {
            Uri uri3 = activity0.getIntent().getData();
            if(uri3 != null) {
                s = uri3.getAuthority();
            }
        }
        List list0 = ibpo.g(new String[]{s1, s});
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            String s4 = (String)object0;
            if(s4 != null && s4.length() != 0) {
                arrayList0.add(object0);
            }
        }
        return ibpo.aK(arrayList0, ":", null, null, null, 62);
    }
}

