import android.content.Intent;

final class bdkj extends ibuo implements ibts {
    public bdkj(Object object0) {
        super(1, object0, bdku.class, "reportBackResult", "reportBackResult(Landroid/content/Intent;)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Intent intent0 = (Intent)object0;
        ibuq.f(intent0, "p0");
        xni xni0 = (xni)((bdku)this.e).requireContext();
        xni0.setResult(-1, intent0);
        xni0.finish();
        return ibom.a;
    }
}

