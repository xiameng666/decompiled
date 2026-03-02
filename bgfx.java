import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class bgfx extends cjtm {
    private final bdif a;
    private final String b;
    private final bdyr c;

    public bgfx(bdyr bdyr0, bdif bdif0, String s, azug azug0) {
        super(0xC4, "GetSettingOperation", azug0);
        this.a = bdif0;
        this.b = s;
        this.c = bdyr0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            bdud bdud0 = ((bdty)this.c.a.mr()).a(this.b);
            gfsx gfsx0 = bdud0 == null ? gfqx.a : gfsx.m(bdud0.b);
            byte[] arr_b = (byte[])gfsx0.g();
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aX);
            this.a.a(Status.b, arr_b, apiMetadata0);
        }
        catch(RuntimeException runtimeException0) {
            throw new cjuh(0xA9F6, "Error while getting settings value from storage", null, runtimeException0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, null, ApiMetadata.b);
    }
}

