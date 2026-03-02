import android.app.PendingIntent;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import java.nio.ByteBuffer;

public final class blmt extends cjtm {
    private final String a;
    private final SourceStartDirectTransferOptions b;
    private final ParcelFileDescriptor c;
    private final ParcelFileDescriptor d;
    private final bnbp e;

    public blmt(bnbp bnbp0, String s, SourceStartDirectTransferOptions sourceStartDirectTransferOptions0, ParcelFileDescriptor parcelFileDescriptor0, ParcelFileDescriptor parcelFileDescriptor1) {
        super(0x106, "startDirectTransfer");
        gftb.z(sourceStartDirectTransferOptions0, "options cannot be null");
        gftb.z(parcelFileDescriptor0, "input cannot be null");
        gftb.z(parcelFileDescriptor1, "output cannot be null");
        this.e = bnbp0;
        this.a = s;
        this.b = sourceStartDirectTransferOptions0;
        this.c = parcelFileDescriptor0;
        this.d = parcelFileDescriptor1;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        SourceStartDirectTransferOptions sourceStartDirectTransferOptions0 = this.b;
        int v = sourceStartDirectTransferOptions0.a;
        if(v != 1) {
            if(v == 2) {
                gfsx gfsx0 = blob.c(this.a);
                if(gfsx0.i()) {
                    for(Object object0: gfud.e(',').l(hsuq.c())) {
                        if(!ByteBuffer.wrap(ghjc.f.q(((String)object0))).equals(gfsx0.d())) {
                            continue;
                        }
                    label_12:
                        gftb.z(context0, "context cannot be null");
                        gftb.z(sourceStartDirectTransferOptions0, "options cannot be null");
                        gftb.z(this.c, "input cannot be null");
                        gftb.z(this.d, "output cannot be null");
                        bluf bluf0 = new bluf();
                        bluf0.b = sourceStartDirectTransferOptions0;
                        bluf0.b(this.c, this.d);
                        bluf0.c(6);
                        PendingIntent pendingIntent0 = bbmq.g(context0, bluf0.a(), 0xA000000);
                        ApiMetadata apiMetadata0 = cckf.d(bbdp.bv);
                        this.e.a(Status.b, pendingIntent0, apiMetadata0);
                        return;
                    }
                }
            }
        }
        else if((this.a.equals("com.google.android.gms") || this.a.equals("com.google.android.fido.testapps.directtransfer")) && azql.c(context0).g(this.a)) {
            goto label_12;
        }
        this.e.a(Status.d, null, ApiMetadata.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.e.a(status0, null, ApiMetadata.b);
    }
}

