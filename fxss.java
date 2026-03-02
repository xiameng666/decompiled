import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.location.reporting.server.RemoteDevice;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.List;

public final class fxss extends wbx implements fxsu {
    public fxss(IBinder iBinder0) {
        super(iBinder0, "com.google.android.location.reporting.service.IPreferenceService");
    }

    @Override  // fxsu
    public final AccountConfig a(Account account0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, account0);
        Parcel parcel1 = this.hM(2, parcel0);
        AccountConfig accountConfig0 = (AccountConfig)wbz.a(parcel1, AccountConfig.CREATOR);
        parcel1.recycle();
        return accountConfig0;
    }

    @Override  // fxsu
    public final List b(Account account0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, account0);
        Parcel parcel1 = this.hM(5, parcel0);
        List list0 = parcel1.createTypedArrayList(RemoteDevice.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // fxsu
    public final List c(Account account0, int v, boolean z, String s) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, account0);
        parcel0.writeInt(v);
        parcel0.writeInt(((int)z));
        parcel0.writeString(s);
        Parcel parcel1 = this.hM(6, parcel0);
        List list0 = parcel1.createTypedArrayList(RemoteDevice.CREATOR);
        parcel1.recycle();
        return list0;
    }

    @Override  // fxsu
    public final void d(Account account0, String s, boolean z, String s1) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, account0);
        parcel0.writeString(s);
        parcel0.writeInt(((int)z));
        parcel0.writeString(s1);
        this.jp(4, parcel0);
    }

    @Override  // fxsu
    public final void e(Account account0, String s, boolean z, String s1) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, account0);
        parcel0.writeString(s);
        parcel0.writeInt(((int)z));
        parcel0.writeString(s1);
        this.jp(3, parcel0);
    }
}

