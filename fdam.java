import com.google.android.gms.wearable.AppTheme;

public final class fdam {
    public String a;
    public String b;
    private AppTheme c;
    private boolean d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private byte j;

    public final fdan a() {
        if(this.j == 0x3F) {
            AppTheme appTheme0 = this.c;
            if(appTheme0 != null) {
                return new fdan(appTheme0, this.d, this.e, this.a, this.b, this.f, this.g, this.h, this.i);
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.c == null) {
            stringBuilder0.append(" appTheme");
        }
        if((this.j & 1) == 0) {
            stringBuilder0.append(" isLeDevice");
        }
        if((this.j & 2) == 0) {
            stringBuilder0.append(" termsContext");
        }
        if((this.j & 4) == 0) {
            stringBuilder0.append(" showBackupConsent");
        }
        if((this.j & 8) == 0) {
            stringBuilder0.append(" useConsentPerWatch");
        }
        if((this.j & 16) == 0) {
            stringBuilder0.append(" isWatchConnected");
        }
        if((this.j & 0x20) == 0) {
            stringBuilder0.append(" isWatchSupervised");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(AppTheme appTheme0) {
        if(appTheme0 == null) {
            throw new NullPointerException("Null appTheme");
        }
        this.c = appTheme0;
    }

    public final void c(boolean z) {
        this.d = z;
        this.j = (byte)(this.j | 1);
    }

    public final void d(boolean z) {
        this.h = z;
        this.j = (byte)(this.j | 16);
    }

    public final void e(boolean z) {
        this.i = z;
        this.j = (byte)(this.j | 0x20);
    }

    public final void f(boolean z) {
        this.f = z;
        this.j = (byte)(this.j | 4);
    }

    public final void g(int v) {
        this.e = v;
        this.j = (byte)(this.j | 2);
    }

    public final void h(boolean z) {
        this.g = z;
        this.j = (byte)(this.j | 8);
    }
}

