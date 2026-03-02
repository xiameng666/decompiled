import android.os.Build.VERSION;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;

public final class baar implements Runnable {
    @Override
    public final void run() {
        if(hryz.a.c().g()) {
            esaa.a = true;
        }
        if(hsub.a.b().l()) {
            PublicKeyCredentialDescriptor.a = true;
        }
        if(hris.a.b().f()) {
            cjok.a = true;
        }
        if(Build.VERSION.SDK_INT >= 35) {
            if(hrsa.d().b.size() > 0) {
                bbpq.b(hrsa.d().b);
            }
            if(hrsa.f().b.size() > 0) {
                bbpq.d(hrsa.f().b);
            }
            if(hrsa.e().b.size() > 0) {
                bbpq.c(hrsa.e().b);
            }
        }
    }
}

