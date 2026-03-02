import com.google.android.gms.auth.aang.AppRestrictionState;

public final class acth {
    private boolean a;
    private boolean b;
    private byte c;

    public final AppRestrictionState a() {
        if(this.c != 3) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.c & 1) == 0) {
                stringBuilder0.append(" isAccountRestricted");
            }
            if((this.c & 2) == 0) {
                stringBuilder0.append(" isAccountHidden");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
        }
        return new AppRestrictionState(this.a, this.b);
    }

    public final void b(boolean z) {
        this.b = z;
        this.c = (byte)(this.c | 2);
    }

    public final void c(boolean z) {
        this.a = z;
        this.c = (byte)(this.c | 1);
    }
}

