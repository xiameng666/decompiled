import android.os.Bundle;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public final class aixp implements gfsi {
    public final aixq a;

    public aixp(aixq aixq0) {
        this.a = aixq0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        a.ae(aixq.a.j(), "Exception during retrieveBytes(RetrieveBytesRequest)", ((Throwable)object0));
        aixq aixq0 = this.a;
        if((((Throwable)object0) instanceof aiml)) {
            RetrieveBytesResponse retrieveBytesResponse0 = new RetrieveBytesResponse(new Bundle(), new ArrayList());
            aixq0.b(((aiml)(((Throwable)object0))).a, retrieveBytesResponse0);
            return null;
        }
        RetrieveBytesResponse retrieveBytesResponse1 = new RetrieveBytesResponse(new Bundle(), new ArrayList());
        aixq0.b(Status.d, retrieveBytesResponse1);
        return null;
    }
}

