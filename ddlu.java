import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.nearby.sharing.DeviceVisibility;
import j..util.Objects;
import java.util.concurrent.Callable;

public final class ddlu implements Callable {
    public final ddlw a;

    public ddlu(ddlw ddlw0) {
        this.a = ddlw0;
    }

    @Override
    public final Object call() {
        ddlw ddlw0 = this.a;
        DeviceVisibility deviceVisibility0 = (DeviceVisibility)gmbu.r(ddlw0.b);
        Account account0 = (Account)gmbu.r(ddlw0.c);
        Objects.requireNonNull(ddlw0);
        switch(deviceVisibility0.f) {
            case 0: {
                Intent intent0 = new Intent();
                String s = hvod.c() ? "com.google.android.gms.nearby.sharing.main.MainActivity" : "com.google.android.gms.nearby.sharing.settings.SettingsActivity";
                Intent intent1 = intent0.setClassName(ddlw0.d.a, s).setPackage("com.google.android.gms").addFlags(0x10000000).addFlags(0x8000);
                if(hvpy.c()) {
                    intent1.putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SOURCE", cmfd.c.f).putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SESSION_ID", cjan.a());
                }
                if(hvod.c()) {
                    intent1.setAction("com.google.android.gms.settings.SHARING");
                }
                return gfsx.m(ddlv.b(0x7F152BE7, intent1, cmeu.q, ccow.m, ddlw0));  // string:sharing_contextual_card_body_sharing_disabled "To let others share with you, 
                                                                                    // turn on device visibility"
            }
            case 1: 
            case 2: 
            case 3: {
                return gfsx.m(ddlv.b(0x7F152BE9, ddlv.a(ddlw0), cmeu.r, ccow.o, ddlw0));  // string:sharing_contextual_card_body_sharing_visible "Your contacts can share with 
                                                                                          // you when they\'re nearby"
            }
            case 4: {
                return gfsx.m(ddlv.b(0x7F152BE8, ddlv.a(ddlw0), cmeu.r, ccow.n, ddlw0));  // string:sharing_contextual_card_body_sharing_invisible "To help your contacts find 
                                                                                          // you, update who can share with you"
            }
            default: {
                return gfqx.a;
            }
        }
    }
}

