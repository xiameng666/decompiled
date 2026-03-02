import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

public final class ajvv extends cjtm {
    private final ajtf a;
    private final String b;
    private final String c;
    private final String d;

    public ajvv(ajtf ajtf0, String s, String s1, String s2, azug azug0) {
        super(0xAC, "GetConsent", azug0);
        this.a = ajtf0;
        batl.q(s);
        this.b = s;
        batl.q(s1);
        this.c = s1;
        this.d = s2;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        try {
            boolean z = ((akeh)akeh.a.b()).b(this.c, this.b, this.d);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
            this.a.a(Status.b, z, apiMetadata0);
        }
        catch(acse | IOException unused_ex) {
            Status status0 = new Status(8);
            ApiMetadata apiMetadata1 = cckf.d(bbdp.T);
            this.a.a(status0, false, apiMetadata1);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.T);
        this.a.a(status0, false, apiMetadata0);
    }
}

