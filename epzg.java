import android.app.Application;
import android.content.Context;
import android.os.Handler;

public final class epzg {
    public final Context a;
    public final Handler b;
    public final Object c;
    public final eqfv d;
    public final String e;
    public final epwe f;

    public epzg(Context context0, Handler handler0, Object object0, eqfv eqfv0) {
        this(context0, handler0, object0, eqfv0, null);
    }

    public epzg(Context context0, Handler handler0, Object object0, eqfv eqfv0, String s) {
        this.a = context0;
        this.b = handler0;
        this.c = object0;
        this.d = eqfv0;
        this.e = s;
        this.f = epzg.a(context0);
    }

    public static epwe a(Context context0) {
        Context context1 = context0.getApplicationContext();
        return (context1 instanceof Application) ? new epwe(new bbll(1, 10), new froz(context1, "STREAMZ_SMARTDEVICE"), ((Application)context1)) : new epwe(new bbll(1, 10), new froz(context1, "STREAMZ_SMARTDEVICE"), null);
    }
}

