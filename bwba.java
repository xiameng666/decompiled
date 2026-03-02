import android.net.Uri.Builder;
import android.net.Uri;
import android.view.View;
import java.util.Set;

final class bwba {
    public static final String a(View view0) {
        return view0.getResources().getConfiguration().isNightModeActive() ? "1" : "0";
    }

    public static final Uri b(View view0, Uri uri0) {
        Uri.Builder uri$Builder0 = uri0.buildUpon();
        uri$Builder0.clearQuery();
        Set set0 = uri0.getQueryParameterNames();
        ibuq.e(set0, "getQueryParameterNames(...)");
        for(Object object0: set0) {
            String s = (String)object0;
            if(!ibuq.m(s, "dark")) {
                uri$Builder0.appendQueryParameter(s, uri0.getQueryParameter(s));
            }
        }
        uri$Builder0.appendQueryParameter("dark", bwba.a(view0));
        Uri uri1 = uri$Builder0.build();
        ibuq.e(uri1, "with(...)");
        return uri1;
    }
}

