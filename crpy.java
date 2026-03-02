import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;

public class crpy extends crlu implements crlw {
    protected final crqq m;

    public crpy(crqq crqq0) {
        super(crqq0.i);
        this.m = crqq0;
    }

    public final crdg at() {
        return this.m.o();
    }

    public final crkk au() {
        return this.m.v();
    }

    public final crpb av() {
        return this.m.g;
    }

    public final crqt aw() {
        return this.m.z();
    }

    public final String ax(String s) {
        String s1 = this.au().f(s);
        if(!TextUtils.isEmpty(s1)) {
            Uri uri0 = Uri.parse(((String)crif.r.a()));
            Uri.Builder uri$Builder0 = uri0.buildUpon();
            uri$Builder0.authority(s1 + "." + uri0.getAuthority());
            return uri$Builder0.build().toString();
        }
        return (String)crif.r.a();
    }

    public final crpy ay() {
        return this.m.u;
    }

    public static boolean az(String s) {
        String s1 = (String)crif.t.a();
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        String[] arr_s = s1.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            if(s.equalsIgnoreCase(arr_s[v].trim())) {
                return true;
            }
        }
        return false;
    }
}

