import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import com.google.android.gms.identitycredentials.ImportCredentialsRequest;
import java.util.List;

public final class bxvt extends bxvv {
    public final ImportCredentialsRequest a;

    public bxvt(Bundle bundle0) {
        super(bundle0);
        Bundle bundle1 = bundle0.getBundle("EXTRA_REQUEST");
        batl.s(bundle1);
        String s = bundle1.getString("requestJson");
        if(s == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Parcelable parcelable0 = bundle1.getParcelable("uri");
        if(parcelable0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ImportCredentialsRequest importCredentialsRequest0 = new ImportCredentialsRequest(s, ((Uri)parcelable0));
        this.a = importCredentialsRequest0;
        batl.s(importCredentialsRequest0);
    }

    public bxvt(IBinder iBinder0, String s, ImportCredentialsRequest importCredentialsRequest0, List list0) {
        super(iBinder0, s, list0);
        this.a = importCredentialsRequest0;
    }

    @Override  // bxvv
    protected final void a(Bundle bundle0) {
        super.a(bundle0);
        Bundle bundle1 = new Bundle();
        bundle1.putString("requestJson", this.a.a);
        bundle1.putParcelable("uri", this.a.b);
        bundle0.putBundle("EXTRA_REQUEST", bundle1);
    }
}

