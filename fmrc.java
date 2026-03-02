import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;

public final class fmrc implements fmoz {
    public final fmpa a;
    public final gfsx b;
    public fmqu c;
    public boolean d;
    public final fmoz e;
    public fmeo f;
    private static final fmqu g;
    private fmev h;
    private final fmqz i;

    static {
        fmrc.g = new fmrb();
    }

    public fmrc(fmqz fmqz0, fmpa fmpa0, gfsx gfsx0) {
        this.c = fmrc.g;
        this.d = false;
        this.e = new fmra(this);
        this.i = fmqz0;
        this.a = fmpa0;
        this.b = gfsx0;
        fmqz0.c = this;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        this.h = (fmev)object0;
        this.c();
    }

    public final void b() {
        fmpa fmpa0 = this.a;
        fmpa0.j(this);
        gfsx gfsx0 = this.b;
        if(gfsx0.i()) {
            ((fmpa)gfsx0.d()).j(this.e);
        }
        gfsx gfsx1 = fmpa0.e();
        if(gfsx1 != null) {
            if(gfsx1.i() && ((fmev)gfsx1.d()).a.e() == ConversationId.IdType.b) {
                String s = (String)((fmev)gfsx1.d()).b.f("");
                this.i.a(s);
                return;
            }
            if(gfsx0.i()) {
                gfsx gfsx2 = ((fmpa)gfsx0.d()).e();
                if(gfsx2.i()) {
                    String s1 = (String)((fmeo)gfsx2.d()).b.f("");
                    this.i.a(s1);
                }
            }
        }
    }

    public final void c() {
        fmev fmev0 = this.h;
        if(fmev0 != null) {
            if(fmev0.a.e() == ConversationId.IdType.b) {
                String s = (String)this.h.b.f("");
                this.i.a(s);
                return;
            }
            fmeo fmeo0 = this.f;
            if(fmeo0 != null) {
                String s1 = (String)fmeo0.b.f("");
                this.i.a(s1);
            }
        }
    }
}

