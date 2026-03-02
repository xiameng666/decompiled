import android.content.Intent;
import android.os.SystemClock;
import j..util.Objects;

final class crqi extends crdj {
    final crqq b;

    public crqi(crqq crqq0, crlw crlw0) {
        Objects.requireNonNull(crqq0);
        this.b = crqq0;
        super(crlw0);
    }

    @Override  // crdj
    public final void b() {
        crqq crqq0 = this.b;
        crqq0.E();
        String s = (String)crqq0.m.pollFirst();
        if(s != null) {
            crqq0.av();
            crqq0.t = SystemClock.elapsedRealtime();
            crqq0.aJ().k.b("Sending trigger URI notification to app", s);
            Intent intent0 = new Intent();
            intent0.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent0.setPackage(s);
            crqq.Y(crqq0.e(), intent0);
        }
        crqq0.X();
    }
}

