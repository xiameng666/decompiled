import com.google.android.gms.auth.api.identity.ChromeOptions;

public final class ahpq {
    public String a;
    public String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private byte g;

    public final ChromeOptions a() {
        if(this.g == 15 && this.a != null) {
            return new ChromeOptions(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" channel");
        }
        if((this.g & 1) == 0) {
            stringBuilder0.append(" showPasswordsOnlyForTheChannel");
        }
        if((this.g & 2) == 0) {
            stringBuilder0.append(" allowEmptyUsername");
        }
        if((this.g & 4) == 0) {
            stringBuilder0.append(" ignoreRequest");
        }
        if((this.g & 8) == 0) {
            stringBuilder0.append(" incognito");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(boolean z) {
        this.d = z;
        this.g = (byte)(this.g | 2);
    }

    public final void c(boolean z) {
        this.e = z;
        this.g = (byte)(this.g | 4);
    }

    public final void d(boolean z) {
        this.f = z;
        this.g = (byte)(this.g | 8);
    }

    public final void e(boolean z) {
        this.c = z;
        this.g = (byte)(this.g | 1);
    }
}

