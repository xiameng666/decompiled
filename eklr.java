import android.content.Context;
import android.util.Log;

public final class eklr implements evqc {
    public final eklt a;
    public final Context b;

    public eklr(eklt eklt0, Context context0) {
        this.a = eklt0;
        this.b = context0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        Log.e("ContactsGmsRestore", "Getting contact counts failed : " + exception0.getMessage());
        this.a.c.o(4);
        ejyv.d(this.b).e = false;
        this.a.a.y();
    }
}

