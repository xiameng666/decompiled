import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class acbb {
    private final abnp a;

    static {
        bboh.b("AppInviteAnalytics", bbcu.aK);
    }

    public acbb(Context context0) {
        this.a = abnp.b(context0);
    }

    public final aboh a() {
        aboh aboh0 = this.a.c(null);
        aboh0.c("&sf", Double.toString(houq.a.b().a()));
        return aboh0;
    }

    public final void b(aboh aboh0, hikc hikc0) {
        if(hikc0 != null && (hikc0.b & 1) != 0) {
            hijv hijv0 = hikc0.c == null ? hijv.a : hikc0.c;
            if(!(hijv0.b == null ? hijx.a : hijv0.b).c.isEmpty()) {
                hijv hijv1 = hikc0.c == null ? hijv.a : hikc0.c;
                acbb.c(aboh0, (hijv1.b == null ? hijx.a : hijv1.b).c);
                hfuo hfuo0 = (hikc0.c == null ? hijv.a : hikc0.c).c;
                for(int v = 0; v < hfuo0.size(); ++v) {
                    String s = ((hijw)hfuo0.get(v)).c;
                    String s1 = ((hijw)hfuo0.get(v)).d;
                    String s2 = ((hijw)hfuo0.get(v)).e;
                    CharSequence charSequence0 = null;
                    Long long0 = (((hijw)hfuo0.get(v)).b & 8) == 0 ? null : ((long)((hijw)hfuo0.get(v)).f);
                    hfuo hfuo1 = ((hijw)hfuo0.get(v)).g;
                    aboh0.I();
                    if(!TextUtils.isEmpty("&tid")) {
                        Map map0 = aboh0.a;
                        if(map0.containsKey("&tid")) {
                            charSequence0 = (String)map0.get("&tid");
                        }
                    }
                    if(!TextUtils.isEmpty(charSequence0)) {
                        HashMap hashMap0 = new HashMap();
                        HashMap hashMap1 = new HashMap();
                        ArrayList arrayList0 = new ArrayList();
                        ArrayList arrayList1 = new ArrayList();
                        abnq.b("&t", "event", hashMap0);
                        if(!TextUtils.isEmpty(s)) {
                            abnq.d(s, hashMap0);
                        }
                        if(!TextUtils.isEmpty(s1)) {
                            abnq.c(s1, hashMap0);
                        }
                        if(!TextUtils.isEmpty(s2)) {
                            abnq.e(s2, hashMap0);
                        }
                        if(long0 != null) {
                            abnq.b("&ev", Long.toString(long0.longValue()), hashMap0);
                        }
                        int v1 = hfuo1 == null ? 0 : hfuo1.size();
                        for(int v2 = 0; v2 < v1; ++v2) {
                            int v3 = ((hiju)hfuo1.get(v2)).b;
                            String s3 = ((hiju)hfuo1.get(v2)).c;
                            abnq.b(abno.a("&cd", v3), s3, hashMap0);
                        }
                        aboh0.b(abnq.a(hashMap0, hashMap1, arrayList0, arrayList1));
                    }
                }
            }
        }
    }

    public static final void c(aboh aboh0, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        aboh0.c("&tid", s);
    }
}

