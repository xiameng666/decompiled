import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public abstract class ezap extends cjtm {
    public final ezdf a;
    public final basb b;
    private final Bundle c;

    public ezap(ezdf ezdf0, Bundle bundle0, azug azug0) {
        super(89, "BaseOperation", azug0);
        batl.s(ezdf0);
        this.a = ezdf0;
        this.b = new ezao(this);
        this.c = bundle0;
    }

    protected abstract Bundle b(Bundle arg1);

    @Override  // cjtm
    protected final void f(Context context0) {
        Bundle bundle0 = this.b(this.c);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.fn);
        this.a.a(Status.b, bundle0, apiMetadata0);
    }

    @Override  // cjtm
    public void j(Status status0) {
        this.a.a(status0, null, ApiMetadata.b);
    }
}

