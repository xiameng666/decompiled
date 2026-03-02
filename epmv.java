import android.net.Uri;
import android.provider.Settings.Secure;

public final class epmv extends clid {
    final epna a;
    final ichm b;

    public epmv(epna epna0, ichm ichm0) {
        this.a = epna0;
        this.b = ichm0;
        super("significantplaces", "MandatoryBiometrics", null);
    }

    @Override  // clid
    protected final void a(boolean z, Uri uri0) {
        boolean z1 = false;
        int v = Settings.Secure.getInt(this.a.a.getContentResolver(), "mandatory_biometrics", 0);
        ggtj ggtj0 = (ggtj)epnb.a.h();
        if(v == 1) {
            z1 = true;
        }
        Boolean boolean0 = Boolean.valueOf(z1);
        ggtj0.B("mandatory biometrics setting changed: %s", boolean0);
        Object object0 = ichd.a(this.b, boolean0);
        if(!(object0 instanceof icgy) && !icha.c(object0)) {
            throw new IllegalStateException("Check failed.");
        }
    }
}

