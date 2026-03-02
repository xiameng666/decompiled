import android.os.UserManager;

public final class beus implements ibth {
    public final beuv a;

    public beus(beuv beuv0) {
        this.a = beuv0;
    }

    @Override  // ibth
    public final Object a() {
        Object object0 = this.a.a.getSystemService("user");
        ibuq.d(object0, "null cannot be cast to non-null type android.os.UserManager");
        return (UserManager)object0;
    }
}

