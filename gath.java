import android.text.TextUtils;
import j..util.Objects;

public final class gath {
    public boolean a;
    public String b;
    public boolean c;
    public boolean d;

    public gath() {
        this(true, "", false, false);
    }

    public gath(boolean z, String s, boolean z1, boolean z2) {
        this.a = z;
        this.b = s;
        this.c = z1;
        this.d = z2;
    }

    final void a(gath gath0) {
        if(!this.equals(gath0)) {
            this.a = gath0.a;
            this.c = gath0.c;
            this.b = gath0.b;
            this.d = gath0.d;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof gath) && this.a == ((gath)object0).a && this.c == ((gath)object0).c && TextUtils.equals(this.b, ((gath)object0).b) && this.d == ((gath)object0).d;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }
}

