import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ezed extends ezdk {
    final evqp a;

    public ezed(azts azts0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // ezdk
    public final void b(Bundle bundle0, ApiMetadata apiMetadata0) {
        ezcp ezcp0 = new ezcp(Status.b, bundle0);
        azzf.b(Status.b, ezcp0, this.a);
    }
}

