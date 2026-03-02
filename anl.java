import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public final class anl {
    public final Intent a;
    public final Bundle b;

    public anl(Intent intent0, Bundle bundle0) {
        this.a = intent0;
        this.b = bundle0;
    }

    public final void a(Context context0, Uri uri0) {
        this.a.setData(uri0);
        context0.startActivity(this.a, this.b);
    }
}

