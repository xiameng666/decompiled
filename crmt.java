import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import j..util.Objects;

final class crmt implements Runnable {
    final crni a;

    public crmt(crni crni0) {
        Objects.requireNonNull(crni0);
        this.a = crni0;
        super();
    }

    @Override
    public final void run() {
        crcg crcg0 = this.a.g;
        crkt crkt0 = crcg0.a;
        crkt0.s();
        if(!crcg0.b()) {
            return;
        }
        if(crcg0.c()) {
            crkt0.g().v.b(null);
            Bundle bundle0 = new Bundle();
            bundle0.putString("source", "(not set)");
            bundle0.putString("medium", "(not set)");
            bundle0.putString("_cis", "intent");
            bundle0.putLong("_cc", 1L);
            crkt0.j().w("auto", "_cmpx", bundle0);
        }
        else {
            String s = crkt0.g().v.a();
            if(TextUtils.isEmpty(s)) {
                crkt0.aJ().d.a("Cache still valid but referrer not found");
            }
            else {
                long v = crkt0.g().w.a() / 3600000L;
                Uri uri0 = Uri.parse(s);
                Bundle bundle1 = new Bundle();
                Pair pair0 = new Pair(uri0.getPath(), bundle1);
                for(Object object0: uri0.getQueryParameterNames()) {
                    bundle1.putString(((String)object0), uri0.getQueryParameter(((String)object0)));
                }
                ((Bundle)pair0.second).putLong("_cc", (v - 1L) * 3600000L);
                String s1 = pair0.first == null ? "app" : ((String)pair0.first);
                crkt0.j().w(s1, "_cmp", ((Bundle)pair0.second));
            }
            crkt0.g().v.b(null);
        }
        crkt0.g().w.b(0L);
    }
}

