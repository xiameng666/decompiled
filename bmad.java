import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import java.util.List;

public final class bmad {
    public List a;
    public AuthenticationExtensions b;
    public boolean c;
    public boolean d;
    public byte[] e;
    private String f;
    private byte[] g;
    private Integer h;

    public bmad() {
        this.c = true;
        this.d = false;
    }

    public final bmae a() {
        boolean z = true;
        batl.l(this.f != null);
        if(this.g == null) {
            z = false;
        }
        batl.l(z);
        return new bmae(this.f, this.g, this.a, this.b, this.c, this.d, this.e, this.h);
    }

    public final void b(byte[] arr_b) {
        batl.b(arr_b != null);
        this.g = arr_b;
    }

    public final void c(int v) {
        Integer integer0 = v;
        batl.b(bmac.i.contains(integer0));
        this.h = integer0;
    }

    public final void d(String s) {
        this.f = s;
    }
}

