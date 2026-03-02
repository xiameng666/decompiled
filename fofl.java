import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class fofl implements foeg {
    private final fodv a;
    private final fkue b;
    private final List c;
    private final fofy d;
    private final foft e;
    private final fkvs f;
    private final fofc g;

    public fofl(Context context0, fkvs fkvs0, fodv fodv0, gfsx gfsx0) {
        this.b = new fofj(this);
        this.c = new ArrayList();
        gftb.check(context0);
        gftb.check(fkvs0);
        this.f = fkvs0;
        this.a = fodv0;
        this.g = new fofc(context0, fodv0, new fofd(this));
        this.d = new fofy(context0, fkvs0, fodv0, gfsx0);
        this.e = new foft(fkvs0, context0);
    }

    @Override  // foeg
    public final gmcd a() {
        fofg fofg0 = new fofg();
        return this.d.a(fofg0);
    }

    @Override  // foeg
    public final gmcd b(String s) {
        return gdtf.k(this.d.a.a(), new fofu(this.d, s), gmap.a);
    }

    @Override  // foeg
    public final gmcd c() {
        fofh fofh0 = new fofh();
        return this.d.a(fofh0);
    }

    @Override  // foeg
    public final void d(foef foef0) {
        List list0 = this.c;
        synchronized(list0) {
            if(list0.isEmpty()) {
                fofc fofc0 = this.g;
                synchronized(fofc0) {
                    if(!fofc0.a) {
                        fofc0.c.addOnAccountsUpdatedListener(fofc0.b, null, false, new String[]{"com.google"});
                        fofc0.a = true;
                    }
                }
                gdtf.l(this.a.a(), new fofk(this), gmap.a);
            }
            list0.add(foef0);
        }
    }

    @Override  // foeg
    public final void e(foef foef0) {
        List list0 = this.c;
        synchronized(list0) {
            if(list0.isEmpty()) {
                return;
            }
            list0.remove(foef0);
            if(list0.isEmpty()) {
                fofc fofc0 = this.g;
                synchronized(fofc0) {
                    if(fofc0.a) {
                        try {
                            fofc0.c.removeOnAccountsUpdatedListener(fofc0.b);
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            Log.w("OneGoogle", "Failed to remove an OnAccountsUpdatedListener", illegalArgumentException0);
                        }
                        fofc0.a = false;
                    }
                }
            }
        }
    }

    @Override  // foeg
    public final gmcd f(String s, int v) {
        foff foff0 = new foff();
        return this.e.a(foff0, s, v);
    }

    @Override  // foeg
    public final gmcd g(String s, int v) {
        fofi fofi0 = new fofi();
        return this.e.a(fofi0, s, v);
    }

    public static gmcd h(gmcd gmcd0) {
        return gdtf.j(gmcd0, new fofe(), gmap.a);
    }

    public final void i(Account account0) {
        fkvi fkvi0 = this.f.a(account0);
        synchronized(fkvi0.b) {
            fkvi0.a.remove(this.b);
        }
        fkvi0.g(this.b, gmap.a);
    }

    public final void j() {
        List list0 = this.c;
        synchronized(list0) {
            for(Object object0: list0) {
                ((foef)object0).c();
            }
        }
    }
}

