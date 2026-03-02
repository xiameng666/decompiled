import com.google.android.gms.nearby.connection.SettingOptions;
import com.google.android.gms.nearby.internal.connection.UpdateConnectionSettingParams;

public final class czcg implements azys {
    public final czdu a;
    public final SettingOptions b;

    public czcg(czdu czdu0, SettingOptions settingOptions0) {
        this.a = czdu0;
        this.b = settingOptions0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        czds czds0 = new czds(this.a, ((evqp)object1));
        czft czft0 = (czft)((czbf)object0).H();
        UpdateConnectionSettingParams updateConnectionSettingParams0 = new UpdateConnectionSettingParams();
        updateConnectionSettingParams0.a = new czbc(czds0);
        updateConnectionSettingParams0.b = this.b;
        czft0.L(updateConnectionSettingParams0);
    }
}

