import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;

public final class bnbs extends azts implements bnbj {
    private static final azta_api a;
    private static final azss b;

    static {
        azss azss0 = new azss();
        bnbs.b = azss0;
        bnbs.a = new azta_api("Fido.FIDO_SOURCE_DIRECT_TRANSFER_API", new bnbt(), azss0);
    }

    public bnbs(Context context0) {
        super(context0, bnbs.a, azsx.s, aztr_settings.a);
    }

    @Override  // bnbj
    public final evql b(SourceStartDirectTransferOptions sourceStartDirectTransferOptions0, ParcelFileDescriptor parcelFileDescriptor0, ParcelFileDescriptor parcelFileDescriptor1) {
        azzc azzc0 = new azzc();
        azzc0.a = new bnbq(this, sourceStartDirectTransferOptions0, parcelFileDescriptor0, parcelFileDescriptor1);
        azzc0.d = 0x153F;
        return this.iG(azzc0.a());
    }
}

