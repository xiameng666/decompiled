import android.content.Context;

public abstract class audq extends auqv {
    private final audp a;
    public final avjh d;
    public final atum e;

    public audq(Context context0, String s, String s1) {
        super(avjg.e, "SetupControlChannel", s);
        this.d = new avjh("SetupControlChannel");
        audp audp0 = new audp(this);
        this.a = audp0;
        this.e = new atum(context0, audp0, s, s1);
    }

    public abstract void a();

    public void b() {
        throw null;
    }

    protected abstract void c();
}

