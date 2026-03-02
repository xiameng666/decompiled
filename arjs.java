import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import j..util.Collection.-EL;
import j..util.Comparator.-CC;
import j..util.DesugarCollections;
import j..util.Map.Entry.-CC;
import java.util.Map.Entry;

public final class arjs {
    public static final baun a;
    private final Context b;
    private arbb c;
    private ianj_grpcChannel d;

    static {
        arjs.a = aqql.a("MessagesCustomD2DApiClient");
    }

    public arjs(Context context0) {
        this.b = context0;
    }

    public final arbb a() {
        String s;
        if(this.c == null) {
            if(this.d == null) {
                try {
                    int v = this.b.getPackageManager().getPackageInfo("com.google.android.apps.messaging", 0).versionCode;
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    arjs.a.n("Unable to connect to Messages Custom D2D API because Messages app is not found.", packageManager$NameNotFoundException0, new Object[0]);
                    s = "MESSAGES_NOT_FOUND";
                    goto label_17;
                }
                ggqj ggqj0 = ((ggeo)Collection.-EL.stream(DesugarCollections.unmodifiableMap(hqhq.a.j().M().b).entrySet()).sorted(Map.Entry.-CC.comparingByKey(Comparator.-CC.reverseOrder())).collect(ggaf.b(new arjn(), new arjo()))).v().om();
                while(ggqj0.hasNext()) {
                    Object object0 = ggqj0.next();
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    if(v < ((int)(((Integer)map$Entry0.getKey())))) {
                        continue;
                    }
                    s = (String)map$Entry0.getValue();
                    goto label_17;
                }
                arjs.a.m("Unable to connect to Messages Custom D2D API because Messages app doesn\'t support it.", new Object[0]);
                s = "API_NOT_SUPPORTED";
            label_17:
                iaqq iaqq0 = iaqq.m(iaql.b("com.google.android.apps.messaging", s), this.b);
                ggoh ggoh0 = new ggoh("com.google.android.apps.messaging");
                iaqq0.p(gpjc.b(this.b, ggoh0));
                iaqr iaqr0 = new iaqr();
                iaqr0.b();
                iaqq0.o(iaqr0.a());
                this.d = iaqq0.a();
            }
            this.c = arbc.a(this.d);
        }
        return this.c;
    }
}

