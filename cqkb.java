import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.backup.ParcelableBackupDataInput;
import com.google.android.gms.backup.ParcelableBackupDataOutput;
import com.google.android.gms.mdm.services.QrlBackupAgentService;
import j..util.Collection.-EL;
import java.io.IOException;

public final class cqkb extends aqgs {
    public final Context a;

    public cqkb(Context context0) {
        this.a = context0;
    }

    @Override  // aqgt
    public final void a(ParcelFileDescriptor parcelFileDescriptor0, ParcelableBackupDataOutput parcelableBackupDataOutput0, ParcelFileDescriptor parcelFileDescriptor1) {
        Boolean boolean0 = cqix.p.c();
        if(boolean0 == null) {
            ((ggtj)QrlBackupAgentService.a.h()).x("Nothing to backup");
            return;
        }
        try {
            parcelableBackupDataOutput0.a(aqen.a("qrl_enabled", 1, new byte[]{boolean0.booleanValue()}));
        }
        catch(IOException iOException0) {
            a.ae(QrlBackupAgentService.a.j(), "Failed to write boolean to backup data", iOException0);
        }
    }

    @Override  // aqgt
    public final void c(ParcelableBackupDataInput parcelableBackupDataInput0, int v, ParcelFileDescriptor parcelFileDescriptor0) {
        gged_interceptors gged0;
        try {
            gged0 = gged_interceptors.i(parcelableBackupDataInput0.a());
        }
        catch(IOException iOException0) {
            a.ae(QrlBackupAgentService.a.j(), "Failed to get key value restore data", iOException0);
            gged0 = ggna.a;
        }
        Collection.-EL.stream(gged0).filter(new cqjy()).findFirst().flatMap(new cqjz()).ifPresent(new cqka(this));
    }
}

