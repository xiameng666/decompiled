import android.accounts.Account;
import com.google.android.gms.pay.UpdateClosedLoopBundleWithClientSettingsRequest;

public final class dooo implements azys {
    public final Account a;
    public final long b;
    public final byte[] c;

    public dooo(Account account0, long v, byte[] arr_b) {
        this.a = account0;
        this.b = v;
        this.c = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        dota dota0 = (dota)object0;
        donm donm0 = (donm)dota0.H();
        UpdateClosedLoopBundleWithClientSettingsRequest updateClosedLoopBundleWithClientSettingsRequest0 = new UpdateClosedLoopBundleWithClientSettingsRequest();
        updateClosedLoopBundleWithClientSettingsRequest0.a = this.a;
        updateClosedLoopBundleWithClientSettingsRequest0.b = this.b;
        updateClosedLoopBundleWithClientSettingsRequest0.c = this.c;
        donm0.aW(updateClosedLoopBundleWithClientSettingsRequest0, new dosn(((evqp)object1)), cclr.a(dota0.r));
    }
}

