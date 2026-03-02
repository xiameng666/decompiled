import android.os.Bundle;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.TextAttachment;

public final class dcnj extends dbvl {
    public long a;
    public String b;
    public int c;
    public long d;
    public String e;
    public boolean f;

    public dcnj(String s) {
        this.c = 0;
        this.f = false;
        this.b = s;
        this.e = s;
    }

    public final TextAttachment a() {
        batl.c(this.d > 0L, "Attachment size must be a positive value.");
        return new TextAttachment(this.b, this.c, this.d, new Bundle(), this.e, this.a, this.f);
    }

    @Override  // dbvl
    public final Attachment b() {
        return this.a();
    }

    @Override  // dbvl
    public final void d(long v) {
        this.a = v;
    }
}

