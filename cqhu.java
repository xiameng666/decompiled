import android.content.Context;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;

public final class cqhu implements evpo {
    public final Context a;
    public final bosa b;

    public cqhu(bosa bosa0, Context context0) {
        this.b = bosa0;
        this.a = context0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        evql0.j();
        ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest0 = new ChangeFindMyDeviceSettingsRequest();
        changeFindMyDeviceSettingsRequest0.a = Boolean.valueOf(cqnf.c(this.a));
        return this.b.e(changeFindMyDeviceSettingsRequest0);
    }
}

