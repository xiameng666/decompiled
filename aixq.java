import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public final class aixq extends cjtm {
    public static final bboh a;
    private final aink b;
    private final aiow c;
    private final RetrieveBytesRequest d;

    static {
        aixq.a = aiqz.b("RetrieveBytesWithOptionsOperation");
    }

    public aixq(aink aink0, aiow aiow0, RetrieveBytesRequest retrieveBytesRequest0) {
        super(0x102, "RetrieveBytesWithOptions");
        this.b = aink0;
        this.c = aiow0;
        this.d = retrieveBytesRequest0;
    }

    public final void b(Status status0, RetrieveBytesResponse retrieveBytesResponse0) {
        try {
            this.c.b(status0, retrieveBytesResponse0);
        }
        catch(RemoteException remoteException0) {
            a.ae(aixq.a.j(), "Client died during etrieveBytes(RetrieveBytesRequest)", remoteException0);
        }
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        gmcd gmcd0 = glzd.g(gmbt.h(this.b.c(this.d)), new aixo(this), gmap.a);
        aixp aixp0 = new aixp(this);
        aixk.b(glyi.f(gmcd0, Throwable.class, aixp0, gmap.a), aixq.a, "Uncaught exception during etrieveBytes(RetrieveBytesRequest)", new Object[0]);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        RetrieveBytesResponse retrieveBytesResponse0 = new RetrieveBytesResponse(new Bundle(), new ArrayList());
        this.c.b(status0, retrieveBytesResponse0);
    }
}

