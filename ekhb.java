import android.app.Notification;
import android.content.Context;
import android.content.res.Resources.NotFoundException;

final class ekhb implements ekbf {
    public final Context a;
    private final juo b;
    private final bayo c;
    private final int d;
    private final int e;
    private final int f;

    public ekhb(Context context0, int v) {
        this.a = context0;
        this.d = v;
        this.c = bayo.a(context0.getApplicationContext());
        this.b = new juo(context0);
        this.e = ekhb.c(context0, 0x7F080CDF);
        this.f = ekhb.c(context0, 0x7F080CDC);
    }

    @Override  // ekbf
    public final void a() {
        this.g(true);
    }

    @Override  // ekbf
    public final void b(int v, int v1) {
        if(v > 0 && v1 >= 0 && v >= v1) {
            this.f(((int)(((float)v1) / ((float)v) * 325.0f)) + 0xAF, String.format("Restoring contacts: %1$d/%2$d", v1, v));
        }
    }

    static int c(Context context0, int v) {
        try {
            return avyq.a(context0, v);
        }
        catch(Resources.NotFoundException unused_ex) {
            ejze.a().d("Cannot find resource id for notification icon");
            return 0x108007C;
        }
    }

    final void d() {
        this.g(false);
    }

    final void e(int v, int v1, int v2, String s, boolean z, boolean z1) {
        this.b.L(v1, v2, false);
        this.b.D("Restore contacts");
        this.b.k(s);
        this.b.s(v);
        this.b.h(z);
        this.b.K(z1);
        this.b.B = "progress";
        Notification notification0 = this.b.a();
        this.c.e("romanesco:contacts_restore", this.d, notification0);
    }

    public final void f(int v, String s) {
        this.e(this.e, 500, v, s, false, true);
    }

    private final void g(boolean z) {
        this.e((z ? this.f : this.e), 0, 0, (z ? "Contacts restored" : "Something went wrong"), true, false);
    }
}

