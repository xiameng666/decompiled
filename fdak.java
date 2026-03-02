import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.wearable.AppTheme;

public abstract class fdak extends xni {
    protected abstract du g(fdan arg1);

    protected abstract String l();

    public final void m(AppTheme appTheme0, Intent intent0) {
        boolean z = intent0.getBooleanExtra("is_le_device", false);
        int v = intent0.getIntExtra("terms_context", 0);
        String s = intent0.getStringExtra("watch_peer_id");
        boolean z1 = intent0.getBooleanExtra("use_consent_per_watch", false);
        boolean z2 = intent0.getBooleanExtra("is_watch_connected", false);
        boolean z3 = intent0.getBooleanExtra("is_watch_supervised", false);
        String s1 = intent0.getStringExtra("account_name");
        boolean z4 = intent0.getBooleanExtra("show_backup_consent", false);
        fczo.g(appTheme0, intent0, this);
        this.setContentView(0x7F0E0EB4);  // layout:wearable_consent_activity
        fdam fdam0 = fdan.a();
        fdam0.b(appTheme0);
        fdam0.c(z);
        fdam0.g(v);
        fdam0.a = s;
        fdam0.b = s1;
        fdam0.f(z4);
        fdam0.h(z1);
        fdam0.d(z2);
        fdam0.e(z3);
        fdan fdan0 = fdam0.a();
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.z(0x7F0B14C5, this.g(fdan0), this.l());  // id:fragment_container
        ca0.a();
    }

    @Override  // xoi
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        if(Log.isLoggable("wearable.Consents", 4)) {
            Log.i("wearable.Consents", "[Consent Activity] Starting consent activity for " + this.l());
            if(Log.isLoggable("wearable.Consents", 3)) {
                Bundle bundle1 = intent0.getExtras();
                if(bundle1 == null) {
                    Log.d("wearable.Consents", "[Consent Activity] Extras: null\n");
                }
                else {
                    Log.d("wearable.Consents", "[Consent Activity] Extras:\n");
                    for(Object object0: bundle1.keySet()) {
                        Log.d("wearable.Consents", String.format("    %s: %s", ((String)object0), bundle1.get(((String)object0))));
                    }
                }
            }
        }
        if(intent0.getBooleanExtra("is_le_device", false)) {
            this.m(fczo.d(), intent0);
            return;
        }
        azts azts0 = fcfo.f(this);
        if(this.getCallingPackage() == null) {
            this.m(fczo.d(), intent0);
            return;
        }
        String s = this.getCallingPackage();
        batl.s(s);
        evql evql0 = azts0.cl(s);
        evql0.b(new fdah(this, intent0));
        evql0.A(new fdai(this, intent0));
        evql0.a(new fdaj(this, intent0));
    }
}

