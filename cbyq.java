import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public final class cbyq extends cjtm {
    private final String a;
    private final String b;
    private final cbxe c;

    public cbyq(cbxe cbxe0, String s, String s1, azug azug0) {
        super(0xA7, "LanguageFluency", azug0);
        this.c = cbxe0;
        this.a = s;
        this.b = s1;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        String s = this.b;
        if(s == null) {
            this.c.c(Status.d, null, ApiMetadata.b);
            return;
        }
        cbwg.a(this.a, s);
        ArrayList arrayList0 = new ArrayList();
        ApiMetadata apiMetadata0 = cckf.d(bbdp.cw);
        this.c.c(Status.b, arrayList0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.c(status0, null, ApiMetadata.b);
    }
}

