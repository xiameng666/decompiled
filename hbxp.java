import android.content.Context;

public final class hbxp extends havy {
    private final hawd a;

    public hbxp(hawd hawd0) {
        this.a = hawd0;
    }

    @Override  // havy
    protected final Object a(Object object0) {
        hbqy hbqy0 = hbri.b(((hbwm)object0).e());
        Context context0 = this.a.a();
        return azqk.a(context0) >= 204700000 || ((hbwm)object0).h() ? new hbxs(hbqy0, new hbxa(context0, ((hbwm)object0), hbqy0), ((hbwm)object0)) : new hbxs(hbqy0, new hbxb(context0), ((hbwm)object0));
    }
}

