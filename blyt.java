import android.nfc.Tag;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public abstract class blyt extends wby implements blyu {
    public blyt() {
        super("com.google.android.gms.fido.common.nfc.INfcReaderCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Tag tag0 = (Tag)wbz.a(parcel0, Tag.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            blyt.gr(parcel0);
            this.a(tag0, apiMetadata0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

