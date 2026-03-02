import android.content.Context;

public abstract class ebaw extends cjtm {
    public final String j;

    public ebaw(String s, String s1, azug azug0) {
        ibuq.f(s1, "callingPackage");
        super(0xC6, s, azug0);
        this.j = s1;
    }

    protected abstract void b(Context arg1);

    @Override  // cjtm
    public final void f(Context context0) {
        ibuq.f(context0, "context");
        cmct.a(this, this.j);
        this.b(context0);
    }
}

