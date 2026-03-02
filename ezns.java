import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import java.io.IOException;

public final class ezns extends eznd {
    private final UdcSettingsListActivityRequest a;

    public ezns(Context context0, ezpn ezpn0, baqr baqr0, String s, UdcSettingsListActivityRequest udcSettingsListActivityRequest0) {
        super(context0, ezpn0, baqr0, s, "GetSettingsListActivityIntentOperation");
        this.a = udcSettingsListActivityRequest0;
    }

    @Override  // eznd
    public final void f(Context context0) {
        Intent intent0;
        String s;
        super.f(context0);
        if(hzdo.c()) {
            ezqh.a().a();
        }
        this.h();
        if(TextUtils.isEmpty(this.f)) {
            throw new cjuh(5, null);
        }
        UdcSettingsListActivityRequest udcSettingsListActivityRequest0 = this.a;
        if(udcSettingsListActivityRequest0.a()) {
            try {
                s = this.k();
            }
            catch(acse unused_ex) {
                throw new cjuh(4504, null);
            }
            catch(IOException unused_ex) {
                throw new cjuh(4505, null);
            }
            intent0 = eztd.a(udcSettingsListActivityRequest0.a, s) ? eztr.c(this.c, this.f, this.a.a) : eztr.b(this.f);
        }
        else {
            intent0 = eztr.b(this.f);
        }
        PendingIntent pendingIntent0 = bbmq.g(this.c, intent0, 0xA000000);
        this.i(0);
        this.d.f(Status.b, pendingIntent0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.i(status0.i);
        this.d.f(status0, null);
    }
}

