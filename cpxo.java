import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class cpxo extends cjtm {
    public final cpuo a;
    public static final int b;
    private final fjtv c;

    public cpxo(fjtv fjtv0, cpuo cpuo0, azug azug0) {
        super(0x98, "FileGroupListForDebugUIOperation", azug0);
        this.c = fjtv0;
        this.a = cpuo0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        gmbu.t(glzd.f(gmbt.h(this.c.i()), new cpxm(), gmap.a), new cpxn(this), gmap.a);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, null, ApiMetadata.b);
    }
}

