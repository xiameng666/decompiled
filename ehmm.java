import android.content.Intent;

final class ehmm extends ibuo implements ibts {
    public ehmm(Object object0) {
        super(1, object0, ehmo.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Intent intent0 = (Intent)object0;
        ibuq.f(intent0, "p0");
        ((ehmo)this.e).startActivity(intent0);
        return ibom.a;
    }
}

