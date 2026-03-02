import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class ezec extends ezdk {
    final evqp a;

    public ezec(azts azts0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(azts0);
        super();
    }

    @Override  // ezdk
    public final void a(Bundle bundle0, ApiMetadata apiMetadata0) {
        bundle0.setClassLoader(ezco.class.getClassLoader());
        Status status0 = (Status)bundle0.getParcelable("status");
        if(status0 == null) {
            status0 = Status.d;
        }
        ezco ezco0 = new ezco(status0, bundle0.getBoolean("configured", false), bundle0.getBoolean("in_trusted_state", false), bundle0.getLong("time_since_manual_unlock", -1L));
        azzf.b(ezco0.a, ezco0, this.a);
    }
}

