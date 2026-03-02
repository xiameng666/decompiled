import android.app.Notification;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;

final class ekhf implements ekbf {
    private final Context a;
    private final int b;
    private final juo c;
    private final bayo d;
    private final int e;
    private final int f;
    private int g;
    private boolean h;

    public ekhf(Context context0, int v) {
        this.a = context0;
        this.b = v;
        this.g = 0;
        this.d = bayo.a(context0.getApplicationContext());
        this.c = new juo(context0);
        this.e = ekhf.c(context0, 0x7F080CDF);
        this.f = ekhf.c(context0, 0x7F080CDC);
    }

    @Override  // ekbf
    public final void a() {
        this.h = true;
    }

    @Override  // ekbf
    public final void b(int v, int v1) {
        if(v > 0 && v1 >= 0 && v >= v1 && this.d.f()) {
            this.g = v;
            Resources resources0 = this.a.getResources();
            this.f(this.e, v, v1, "", resources0.getQuantityString(0x7F130073, v, new Object[]{v}), false, true);  // plurals:romanesco_restoring_contacts_count_notification
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

    final void d(boolean z, boolean z1) {
        if(this.d.f() && this.h) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if(z) {
                stringBuilder0.append(this.a.getResources().getQuantityString(0x7F130070, this.g, new Object[]{((int)this.g)}));  // plurals:romanesco_restored_contacts_count_notification
                if(z1) {
                    stringBuilder0.append("; ");
                    stringBuilder0.append("Some backups aren\'t loaded when restoring");
                }
            }
            else {
                stringBuilder0.append("Something went wrong");
            }
            this.f(this.f, 0, 0, stringBuilder0.toString(), "Finished restoring contacts", true, false);
        }
    }

    public final void e() {
        this.f(this.e, 500, 0, "", "Downloading contacts", false, true);
    }

    final void f(int v, int v1, int v2, String s, String s1, boolean z, boolean z1) {
        this.c.L(v1, v2, false);
        this.c.D(s1);
        this.c.k(s);
        this.c.s(v);
        this.c.h(z);
        this.c.K(z1);
        this.c.B = "progress";
        Notification notification0 = this.c.a();
        this.d.e("romanesco:batch_contacts_restore", this.b, notification0);
    }
}

