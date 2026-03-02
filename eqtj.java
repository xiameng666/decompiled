import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferOptions;

public abstract class eqtj extends wby implements eqtk {
    public eqtj() {
        super("com.google.android.gms.smartdevice.directtransfer.internal.ITargetDirectTransferService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        eqtg eqtg1;
        eqtg eqtg0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    eqtg1 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback");
                    eqtg1 = (iInterface0 instanceof eqtg) ? ((eqtg)iInterface0) : new eqtg(iBinder0);
                }
                DirectTransferOptions directTransferOptions0 = (DirectTransferOptions)wbz.a(parcel0, DirectTransferOptions.CREATOR);
                ParcelFileDescriptor[] arr_parcelFileDescriptor = (ParcelFileDescriptor[])parcel0.createTypedArray(ParcelFileDescriptor.CREATOR);
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.IDirectTransferListener");
                    eqtg0 = (iInterface1 instanceof eqib) ? ((eqib)iInterface1) : new eqhy(iBinder1);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqtj.gr(parcel0);
                this.d(eqtg1, directTransferOptions0, arr_parcelFileDescriptor, ((eqib)eqtg0), apiMetadata0);
                return true;
            }
            case 2: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback");
                    eqtg0 = (iInterface2 instanceof eqtg) ? ((eqtg)iInterface2) : new eqtg(iBinder2);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                eqtj.gr(parcel0);
                this.c(eqtg0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

