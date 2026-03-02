import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class cbyp extends cjtm {
    private final String a;
    private final cbxe b;

    public cbyp(cbxe cbxe0, String s, azug azug0) {
        super(0xA7, "DebugString", azug0);
        this.b = cbxe0;
        this.a = s;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s = this.a;
        if(s == null) {
            ApiMetadata apiMetadata0 = cckf.d(bbdp.cw);
            this.b.b(Status.b, "ULP not available.", apiMetadata0);
            return;
        }
        gqif gqif0 = cbyn.a().f(s);
        ApiMetadata apiMetadata1 = cckf.d(bbdp.cw);
        this.b.b(Status.b, ((ProtoLiteMessage)gqif0).toString(), apiMetadata1);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.b(status0, null, ApiMetadata.b);
    }
}

