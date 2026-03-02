import android.content.Context;

public final class bdzr {
    public final Context a;

    public bdzr(Context context0) {
        this.a = context0;
    }

    public final azts a(String s, String s1) {
        ajqo ajqo0 = new ajqo();
        ajqo0.a = s;
        ajqo0.b = "credential_manager";
        ajqo0.c = "android";
        ajqo0.d = s1;
        ajqp ajqp0 = ajqo0.a();
        return new azts(this.a, ajqp0);
    }
}

