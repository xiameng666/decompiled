import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class bgfz extends cjtm {
    private final azxs a;
    private final String b;
    private final byte[] c;
    private final bdyr d;

    public bgfz(bdyr bdyr0, azxs azxs0, String s, byte[] arr_b, azug azug0) {
        super(0xC4, "SetSettingOperation", azug0);
        this.a = azxs0;
        this.b = s;
        this.c = arr_b;
        this.d = bdyr0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            ((bdty)this.d.a.mr()).b(new bdud(this.b, this.c));
            this.a.a(Status.b);
        }
        catch(RuntimeException runtimeException0) {
            throw new cjuh(0xA9F6, "Error while saving settings value in storage", null, runtimeException0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

