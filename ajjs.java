import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ajjs extends cjtm {
    public final ajhs a;
    public final byte[] b;
    public static final baun c;
    private final foeg d;

    static {
        ajjs.c = new baun(new String[]{"GetKeyInfoOperation"}, null);
    }

    public ajjs(ajhs ajhs0, byte[] arr_b, foeg foeg0, azug azug0) {
        super(0x81, "GetKeyInfoOperation", azug0);
        this.a = ajhs0;
        this.b = arr_b;
        this.d = foeg0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        ajjs.c.h("Get key info operation is called.", new Object[0]);
        try {
            ajiz ajiz0 = new ajfn(context0).g(this.b);
            ajjs.c.h("Looking Up GoogleOwner.", new Object[0]);
            gmcd gmcd0 = this.d.b(ajiz0.f);
            gmcd0.hB(new ajjr(this, gmcd0, ajiz0), gmap.a);
        }
        catch(ajiv ajiv0) {
            ajjs.c.g("Error Getting KeyInfo.", ajiv0, new Object[0]);
            this.j(new Status(25508));
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, ApiMetadata.b);
    }
}

