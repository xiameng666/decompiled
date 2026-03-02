import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import j..util.Collection.-EL;
import j..util.Objects;
import j..util.stream.Stream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class aiff extends bxoi {
    public static final baun a;
    public final aier b;
    private final GoogleSignInOptions c;
    private final String d;
    private final ayud f;

    static {
        aiff.a = new baun("GoogleSilentSignIn", new String[0]);
    }

    public aiff(aier aier0, Context context0, GoogleSignInOptions googleSignInOptions0, String s) {
        super(91, "GoogleSilentSignIn");
        this.b = aier0;
        this.d = s;
        this.c = googleSignInOptions0;
        aifb aifb0 = new aifb();
        aytt aytt0 = new aytt(context0, "ANDROID_AUTH");
        aytt0.g = aifb0;
        this.f = aytt0.a();
    }

    public final void b(int v) {
        if(!hyel.c()) {
            return;
        }
        ghon ghon0 = aifp.c(this.d, 2, Integer.valueOf(v), this.c);
        if(hyfj.e()) {
            cdrl.v().j(((ProtoLiteMessage)ghon0));
            return;
        }
        this.f.i(((MessageLite)ghon0)).d();
    }

    @Override  // cjtm
    public final void f(Context context0) {
        if(hyex.i()) {
            ggfp ggfp0 = ggfp.F(gfud.e(',').i().d().l(hyex.c()));
            Stream stream0 = Collection.-EL.stream(ggfp.G(this.c.a())).map(new aifc());
            Objects.requireNonNull(ggfp0);
            ggfp ggfp1 = (ggfp)stream0.filter(new aifd(ggfp0)).collect(ggaf.b);
            if(!ggfp1.isEmpty()) {
                StringBuilder stringBuilder0 = new StringBuilder();
                Iterator iterator0 = ggfp1.iterator();
                if(iterator0.hasNext()) {
                    while(true) {
                        Object object0 = iterator0.next();
                        stringBuilder0.append(((CharSequence)object0));
                        if(!iterator0.hasNext()) {
                            break;
                        }
                        stringBuilder0.append(", ");
                    }
                }
                this.j(new Status(10, String.format("The following scope(s) are not supported: %s.", stringBuilder0.toString())));
                return;
            }
        }
        gmbu.t(gmbu.q(new aifv(context0, this.c, this.d, gfqx.a).a(), hyeo.a.b().a(), TimeUnit.SECONDS, new bbll(1, 9)), new aife(this), gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.d(null, status0);
    }
}

