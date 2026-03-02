import android.os.ParcelFileDescriptor;
import com.google.android.gms.backup.ParcelableBackupDataInput;
import com.google.android.gms.backup.ParcelableBackupDataOutput;
import com.google.android.gms.multidevice.service.MultideviceBackupAgentChimeraService;

public final class ctew extends aqgs {
    private final csyu a;

    public ctew(csyu csyu0) {
        ibuq.f(csyu0, "dataStoreSettingsRepository");
        super();
        this.a = csyu0;
    }

    @Override  // aqgt
    public final void a(ParcelFileDescriptor parcelFileDescriptor0, ParcelableBackupDataOutput parcelableBackupDataOutput0, ParcelFileDescriptor parcelFileDescriptor1) {
        if(parcelableBackupDataOutput0 != null) {
            try {
                byte[] arr_b = this.a.a().toBytesArray();
                parcelableBackupDataOutput0.a(aqen.a("com.google.android.gms.multidevice.protos.MultideviceEcosystem", arr_b.length, arr_b));
            }
            catch(Throwable throwable0) {
                ibsx.a(parcelableBackupDataOutput0, throwable0);
                throw throwable0;
            }
            ibsx.a(parcelableBackupDataOutput0, null);
        }
        if(parcelFileDescriptor0 != null) {
            parcelFileDescriptor0.close();
        }
        if(parcelFileDescriptor1 != null) {
            parcelFileDescriptor1.close();
        }
    }

    @Override  // aqgt
    public final void c(ParcelableBackupDataInput parcelableBackupDataInput0, int v, ParcelFileDescriptor parcelFileDescriptor0) {
        if(parcelableBackupDataInput0 != null) {
            try {
                for(Object object0: parcelableBackupDataInput0.a()) {
                    if(!ibuq.m(((aqen)object0).a, "com.google.android.gms.multidevice.protos.MultideviceEcosystem")) {
                        continue;
                    }
                    goto label_7;
                }
                object0 = null;
            label_7:
                aqen aqen0 = (aqen)object0;
                if(aqen0 != null) {
                    try {
                        byte[] arr_b = ibpo.aC(aqen0.c);
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ctef.a), arr_b, 0, arr_b.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        ibuq.e(((ctef)hftv0), "parseFrom(...)");
                        this.a.o(((ctef)hftv0));
                    }
                    catch(hfur hfur0) {
                        ((ggtj)((ggtj)MultideviceBackupAgentChimeraService.a.i()).s(hfur0)).x("InvalidProtocolBufferException in backup service.");
                    }
                }
            }
            catch(Throwable throwable0) {
                ibsx.a(parcelableBackupDataInput0, throwable0);
                throw throwable0;
            }
            ibsx.a(parcelableBackupDataInput0, null);
        }
        if(parcelFileDescriptor0 != null) {
            parcelFileDescriptor0.close();
        }
    }
}

