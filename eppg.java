import android.content.Context;

public final class eppg implements ibts {
    public final Context a;

    public eppg(Context context0) {
        this.a = context0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        String s = (String)object0;
        ibuq.f(s, "accountName");
        cnoc cnoc0 = new cnoc();
        cnoc0.b = "significant_places";
        cnoc0.d = s;
        cnod cnod0 = new cnod(cnoc0);
        return cnnx.a(this.a, cnod0);
    }
}

