import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.data.DataHolder;

final class ejvn implements ejvp {
    @Override  // ejvp
    public final void a(ejtq ejtq0, DataHolder dataHolder0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.ex);
        Parcel parcel0 = ejtq0.jo();
        wbz.f(parcel0, dataHolder0);
        wbz.f(parcel0, apiMetadata0);
        ejtq0.jp(8, parcel0);
    }
}

