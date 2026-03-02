import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;

public final class crcg {
    public final crkt a;

    public crcg(crkt crkt0) {
        this.a = crkt0;
    }

    final void a(String s, Bundle bundle0) {
        CharSequence charSequence0;
        crkt crkt0 = this.a;
        crkt0.s();
        if(!crkt0.v()) {
            if(bundle0.isEmpty()) {
                charSequence0 = null;
            }
            else {
                if(s.isEmpty()) {
                    s = "auto";
                }
                Uri.Builder uri$Builder0 = new Uri.Builder();
                uri$Builder0.path(s);
                for(Object object0: bundle0.keySet()) {
                    uri$Builder0.appendQueryParameter(((String)object0), bundle0.getString(((String)object0)));
                }
                charSequence0 = uri$Builder0.build().toString();
            }
            if(!TextUtils.isEmpty(charSequence0)) {
                crkt0.g().v.b(((String)charSequence0));
                crkt0.g().w.b(System.currentTimeMillis());
            }
        }
    }

    final boolean b() {
        return this.a.g().w.a() > 0L;
    }

    final boolean c() {
        if(!this.b()) {
            return false;
        }
        long v = this.a.d.j(null, crif.ac);
        return System.currentTimeMillis() - this.a.g().w.a() > v;
    }
}

