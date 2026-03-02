import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import j..util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class fkvs {
    public final fkqa a;
    public final frhi b;
    private final Object c;
    private final Map d;
    private final Context e;
    private final Executor f;
    private final frbx g;
    private final frii h;
    private final fkuh i;
    private final fgvt j;
    private final String k;
    private final azts l;

    public fkvs(Context context0, Executor executor0, String s, frbx frbx0, frii frii0, fkqa fkqa0, fkuh fkuh0, fgvt fgvt0, frhi frhi0, azts azts0) {
        this.c = new Object();
        this.d = new HashMap();
        this.e = context0;
        this.f = executor0;
        this.g = frbx0;
        this.h = frii0;
        this.a = fkqa0;
        this.i = fkuh0;
        this.j = fgvt0;
        this.k = s;
        this.b = frhi0;
        this.l = azts0;
    }

    public final fkvi a(Account account0) {
        Map map0;
        AtomicReference atomicReference2;
        Context context1;
        fkzg fkzg1;
        synchronized(this.c) {
            map0 = this.d;
            if(!map0.containsKey(account0)) {
                Context context0 = this.e;
                frce frce0 = new frce(context0);
                frce0.a = "com.google.android.gms";
                frce0.j();
                frce0.d("mdisync");
                frce0.c(account0);
                frce0.e("profilesync/public/profile_info.pb");
                Uri uri0 = frce0.a();
                frie frie0 = frif.a();
                frie0.h(new frjp(this.b));
                frie0.e(((MessageLite)fkvu.a));
                frie0.f(uri0);
                frif frif0 = frie0.a();
                fkrk fkrk0 = new fkrk(this.h.a(frif0));
                fkyz fkyz0 = new fkyz(this.f, this.g);
                AtomicReference atomicReference0 = new AtomicReference(new fkvm());
                AtomicReference atomicReference1 = new AtomicReference(new fkvn());
                Objects.requireNonNull(atomicReference0);
                fkvo fkvo0 = new fkvo(atomicReference0);
                Objects.requireNonNull(atomicReference1);
                fkvp fkvp0 = new fkvp(atomicReference1);
                cqee cqee0 = new cqee(context0, new cpzo(account0, glxu.a));
                String s = this.k;
                fkzg fkzg0 = new fkzg(context0, cqee0, s, account0, ((gful_cronetEngineProvider)fkvo0), ((gful_cronetEngineProvider)fkvp0));
                if(this.i.a(context0)) {
                    fkqb fkqb0 = fkqb.a(context0.getApplicationContext(), null, s);
                    fkzg1 = fkzg0;
                    context1 = context0;
                    gmcd gmcd0 = glzd.f(fhra.b(this.l.bJ()), new fkvl(), gmap.a);
                    gmcd gmcd1 = fiyq.b(this.j, gmcd0, 0);
                    Objects.requireNonNull(this.a);
                    fkvk fkvk0 = new fkvk(this.a);
                    new fkqi(fkqb0, gmcd1, fkpq.j, ((gful_cronetEngineProvider)fkvk0));
                    atomicReference2 = atomicReference0;
                }
                else {
                    fkzg1 = fkzg0;
                    context1 = context0;
                    fkqb fkqb1 = fkqb.a(context1.getApplicationContext(), null, s);
                    atomicReference2 = atomicReference0;
                    fkvj fkvj0 = new fkvj(this, account0);
                    new fkqi(fkqb1, new fiyn(this.j, account0.toString(), 0, 2), fkpq.i, ((gful_cronetEngineProvider)fkvj0));
                }
                Objects.requireNonNull(this.a);
                fkvi fkvi0 = new fkvi(fkzg1, context1, fkyz0, fkrk0, new fkyx(((gful_cronetEngineProvider)new fkvk(this.a)), new fiym(), fkqb.a(context1.getApplicationContext(), null, s)), new fkvq(this, uri0));
                fkvi0.g(new fkvr(this, ((Uri)fkvi0)), gmap.a);
                atomicReference2.set(fkvi0);
                atomicReference1.set(fkvi0);
                map0.put(account0, fkvi0);
            }
        }
        return (fkvi)map0.get(account0);
    }
}

