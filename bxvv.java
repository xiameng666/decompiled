import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;

public class bxvv {
    public final IBinder b;
    public final String c;
    public final List d;

    protected bxvv(Bundle bundle0) {
        IBinder iBinder0 = bundle0.getBinder("EXTRA_TOKEN");
        batl.s(iBinder0);
        this.b = iBinder0;
        String s = bundle0.getString("EXTRA_APP_PACKAGE_NAME");
        batl.s(s);
        this.c = s;
        this.d = new ArrayList();
        int v = bundle0.getInt("EXTRA_APP_SIGNATURES_SIZE");
        for(int v1 = 0; v1 < v; ++v1) {
            byte[] arr_b = bundle0.getByteArray("EXTRA_APP_SIGNATURES_PREFIX_" + v1);
            batl.s(arr_b);
            this.d.add(arr_b);
        }
        batl.s(this.d);
    }

    public bxvv(IBinder iBinder0, String s, List list0) {
        this.b = iBinder0;
        this.c = s;
        this.d = list0;
    }

    protected void a(Bundle bundle0) {
        bundle0.putBinder("EXTRA_TOKEN", this.b);
        bundle0.putString("EXTRA_APP_PACKAGE_NAME", this.c);
        List list0 = this.d;
        bundle0.putInt("EXTRA_APP_SIGNATURES_SIZE", list0.size());
        for(int v = 0; v < list0.size(); ++v) {
            bundle0.putByteArray(a.h(v, "EXTRA_APP_SIGNATURES_PREFIX_"), ((byte[])list0.get(v)));
        }
    }

    public final Bundle b() {
        Bundle bundle0 = new Bundle();
        this.a(bundle0);
        return bundle0;
    }
}

