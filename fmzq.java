import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;

public final class fmzq implements fmoz {
    public final fmpa a;
    public final gfsx b;
    public fmzn c;
    public fmeo d;
    public final fmoz e;
    private static final fmzn f;
    private final boolean g;
    private fmev h;
    private final fmzs i;

    static {
        fmzq.f = new fmzo();
    }

    public fmzq(fmzs fmzs0, fmpa fmpa0, gfsx gfsx0, boolean z) {
        this.c = fmzq.f;
        this.e = new fmzp(this);
        this.i = fmzs0;
        this.a = fmpa0;
        this.b = gfsx0;
        this.g = z;
        fmzr fmzr0 = new fmzr(this);
        fmzs0.a.setOnClickListener(fmzr0);
    }

    @Override  // fmoz
    public final void a(Object object0) {
        this.h = (fmev)object0;
        this.c();
    }

    public final void b() {
        this.a.j(this);
        gfsx gfsx0 = this.b;
        if(gfsx0.i()) {
            ((fmpa)gfsx0.d()).j(this.e);
        }
    }

    public final void c() {
        fmev fmev0 = this.h;
        if(fmev0 != null) {
            if(fmev0.a.e() == ConversationId.IdType.b) {
                String s = (String)this.h.b.f("");
                this.i.a(s, this.g);
                return;
            }
            fmeo fmeo0 = this.d;
            if(fmeo0 != null) {
                String s1 = (String)fmeo0.b.f("");
                this.i.a(s1, this.g);
            }
        }
    }
}

