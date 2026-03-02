import android.util.Log;
import j..util.DesugarCollections;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jeb.synthetic.FIN;

public final class fnba implements hnah {
    private static final String b = "fnba";
    private final fnbd c;
    private final fnbe d;

    static {
    }

    public fnba() {
        this(new fnbc(), new fnaz());
    }

    public fnba(fnbe fnbe0, fnbd fnbd0) {
        this.d = fnbe0;
        this.c = fnbd0;
    }

    @Override  // hnah
    public final List a(String s) {
        return this.c(s);
    }

    public final void b(String s) {
        try {
            this.c(s);
        }
        catch(UnknownHostException unused_ex) {
            Log.i(fnba.b, String.format("Hinting triggered for %s: No usable result.", s));
        }
    }

    public final List c(String s) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(s != null) {
            ArrayList arrayList0 = new ArrayList();
            try {
                for(Object object0: Arrays.asList(InetAddress.getAllByName(s))) {
                    InetAddress inetAddress0 = (InetAddress)object0;
                    if(!this.c.a(s, inetAddress0)) {
                        continue;
                    }
                    arrayList0.add(inetAddress0);
                }
            }
            catch(UnknownHostException unused_ex) {
            }
            if(arrayList0.isEmpty()) {
                if(arrayList0.addAll(this.d.a(s))) {
                    new gfss(",").b(arrayList0);
                    goto label_19;
                }
                Log.w(fnba.b, String.format("No verified mapping and No cache for %s.", s));
                throw new UnknownHostException(s + " cannot be resolved, or poisoned but cannot fixed");
            }
            else {
                new gfss(",").b(arrayList0);
                this.d.b(s, arrayList0);
            }
        label_19:
            List list0 = DesugarCollections.unmodifiableList(arrayList0);
            FIN.finallyCodeBegin$NT(v);
            return list0;
        }
        throw new UnknownHostException("null == hostname");
    }
}

