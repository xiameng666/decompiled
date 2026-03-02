import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;

public final class bnbn extends wby implements bnbo, cjug {
    private final cjts a;
    private final String b;

    public bnbn() {
        super("com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
    }

    public bnbn(cjts cjts0, String s) {
        super("com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
        this.a = cjts0;
        this.b = s;
    }

    @Override  // bnbo
    public final void a(azxs azxs0, SourceStartDirectTransferOptions sourceStartDirectTransferOptions0, ParcelFileDescriptor parcelFileDescriptor0, ParcelFileDescriptor parcelFileDescriptor1) {
        blnd blnd0 = new blnd(azxs0, this.b, sourceStartDirectTransferOptions0, parcelFileDescriptor0, parcelFileDescriptor1);
        this.a.b(blnd0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bnbp bnbp0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.sourcedevice.internal.IStartDirectTransferCallbacks");
                    bnbp0 = (iInterface0 instanceof bnbp) ? ((bnbp)iInterface0) : new bnbp(iBinder0);
                }
                SourceStartDirectTransferOptions sourceStartDirectTransferOptions0 = (SourceStartDirectTransferOptions)wbz.a(parcel0, SourceStartDirectTransferOptions.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor1 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                bnbn.gr(parcel0);
                ccmq.a().a(bbdg.da);
                blmt blmt0 = new blmt(bnbp0, this.b, sourceStartDirectTransferOptions0, parcelFileDescriptor0, parcelFileDescriptor1);
                this.a.b(blmt0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    bnbp0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                SourceStartDirectTransferOptions sourceStartDirectTransferOptions1 = (SourceStartDirectTransferOptions)wbz.a(parcel0, SourceStartDirectTransferOptions.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor)wbz.a(parcel0, ParcelFileDescriptor.CREATOR);
                bnbn.gr(parcel0);
                this.a(((azxs)bnbp0), sourceStartDirectTransferOptions1, parcelFileDescriptor2, parcelFileDescriptor3);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

