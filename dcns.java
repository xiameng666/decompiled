import android.os.Bundle;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;

public final class dcns extends dbvl {
    public long a;
    public int b;
    public String c;
    public boolean d;
    private final String e;

    public dcns(String s) {
        this.b = 0;
        this.d = false;
        this.e = s;
    }

    public final WifiCredentialsAttachment a() {
        int v = this.b;
        Bundle bundle0 = new Bundle();
        return new WifiCredentialsAttachment(this.e, v, bundle0, this.c, this.d, this.a);
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

