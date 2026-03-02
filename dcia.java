import android.os.ParcelFileDescriptor;
import com.google.android.gms.backup.ParcelableBackupDataInput;
import com.google.android.gms.backup.ParcelableBackupDataOutput;
import com.google.android.gms.nearby.sharing.DeviceVisibility;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dcia extends aqgs {
    private final dcmf a;
    private final ibnn b;
    private final frli c;

    public dcia(dcmf dcmf0, frli frli0) {
        ibuq.f(dcmf0, "sharingClient");
        ibuq.f(frli0, "deviceConfig");
        super();
        this.a = dcmf0;
        this.c = frli0;
        this.b = new ibnz(new dchx());
    }

    @Override  // aqgt
    public final void a(ParcelFileDescriptor parcelFileDescriptor0, ParcelableBackupDataOutput parcelableBackupDataOutput0, ParcelFileDescriptor parcelFileDescriptor1) {
        long v;
        byte[] arr_b;
        cunf cunf0 = dcvz.a;
        cunf0.b().p("Backing up Quick Share settings.", new Object[0]);
        if(parcelFileDescriptor0 != null) {
            parcelFileDescriptor0.close();
        }
        if(parcelFileDescriptor1 != null) {
            parcelFileDescriptor1.close();
        }
        try {
            gyyy gyyy0 = this.d();
            if(gyyy0 != null) {
                arr_b = gyyy0.toBytesArray();
                v = hvqs.a.aT().aV();
                if(((long)arr_b.length) <= v) {
                    if(parcelableBackupDataOutput0 != null) {
                        parcelableBackupDataOutput0.a(aqen.a("backup_data", arr_b.length, arr_b));
                    }
                    cunf0.b().p("Successfully backed up Quick Share settings.", new Object[0]);
                    goto label_14;
                }
                goto label_16;
            }
            goto label_19;
        }
        catch(Throwable throwable0) {
            ibsx.a(parcelableBackupDataOutput0, throwable0);
            throw throwable0;
        }
    label_14:
        ibsx.a(parcelableBackupDataOutput0, null);
        return;
        try {
        label_16:
            cunf0.c().i("Failed to back up Quick Share settings because the backup data is too large. Expected less than %d bytes, but received %d bytes.", Long.valueOf(v), Integer.valueOf(arr_b.length));
        }
        catch(Throwable throwable0) {
            ibsx.a(parcelableBackupDataOutput0, throwable0);
            throw throwable0;
        }
        ibsx.a(parcelableBackupDataOutput0, null);
        return;
        try {
        label_19:
            cunf0.e().p("Skipping backup because there is no data to back up.", new Object[0]);
        }
        catch(Throwable throwable0) {
            ibsx.a(parcelableBackupDataOutput0, throwable0);
            throw throwable0;
        }
        ibsx.a(parcelableBackupDataOutput0, null);
    }

    @Override  // aqgt
    public final void c(ParcelableBackupDataInput parcelableBackupDataInput0, int v, ParcelFileDescriptor parcelFileDescriptor0) {
        Object object1;
        dcmf dcmf0;
        cunf cunf0 = dcvz.a;
        cunf0.b().p("Restoring Quick Share settings.", new Object[0]);
        if(parcelFileDescriptor0 != null) {
            parcelFileDescriptor0.close();
        }
        if(parcelableBackupDataInput0 != null) {
            try {
                for(Object object0: parcelableBackupDataInput0.a()) {
                    if(!ibuq.m(((aqen)object0).a, "backup_data")) {
                        continue;
                    }
                    goto label_11;
                }
                object0 = null;
            label_11:
                aqen aqen0 = (aqen)object0;
                if(aqen0 != null) {
                    try {
                        byte[] arr_b = ibpo.aC(aqen0.c);
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gyyy.a), arr_b, 0, arr_b.length, hftc.a);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        ibuq.e(((gyyy)hftv0), "parseFrom(...)");
                        try {
                            dcmf0 = this.a;
                            if(((Boolean)evrg.n(dcmf0.o())).booleanValue()) {
                                cunf0.b().p("Skipping Quick Share settings restore because user is already opted in.", new Object[0]);
                            }
                            else {
                                goto label_28;
                            }
                        }
                        catch(ExecutionException executionException0) {
                            dcvz.a.c().f(executionException0).p("Failed to restore Quick Share settings.", new Object[0]);
                        }
                        catch(InterruptedException interruptedException0) {
                            Thread.currentThread().interrupt();
                            dcvz.a.c().f(interruptedException0).p("Interrupted when trying to restore Quick Share settings.", new Object[0]);
                        }
                        goto label_70;
                    label_28:
                        gzax gzax0 = gzax.b(((gyyy)hftv0).c);
                        if(gzax0 == null) {
                            gzax0 = gzax.a;
                        }
                        int v1 = 4;
                        int v2 = 3;
                        switch(gzax0.ordinal()) {
                            case 1: {
                                v1 = 1;
                                break;
                            }
                            case 2: {
                                v1 = 3;
                                break;
                            }
                            case 4: {
                                v1 = 0;
                                break;
                            }
                            case 5: {
                                break;
                            }
                            default: {
                                v1 = -1;
                            }
                        }
                        Throwable throwable1 = ibnw.a(dcib.a(dcmf0.D(v1)));
                        if(throwable1 != null) {
                            dcvz.a.c().f(throwable1).p("Failed to restore Quick Share visibility setting.", new Object[0]);
                        }
                        else if(((gyyy)hftv0).d) {
                            Throwable throwable2 = ibnw.a(dcib.a(dcmf0.d()));
                            if(throwable2 != null) {
                                dcvz.a.c().f(throwable2).p("Failed to restore Quick Share contacts upload consent.", new Object[0]);
                                goto label_70;
                            }
                            goto label_48;
                        }
                        else {
                        label_48:
                            if(((gyyy)hftv0).e) {
                                v2 = 2;
                            }
                            Throwable throwable3 = ibnw.a(dcib.a(dcmf0.y(v2)));
                            if(throwable3 != null) {
                                cunf0.c().f(throwable3).p("Failed to restore Quick Share data usage setting.", new Object[0]);
                            }
                            try {
                                dchz dchz0 = new dchz(new dchy());
                                object1 = (Void)((glyq)this.c.b(dchz0, gmap.a)).v(((Number)this.b.a()).longValue(), TimeUnit.MILLISECONDS);
                            }
                            catch(Throwable throwable4) {
                                object1 = ibnx.a(throwable4);
                            }
                            Throwable throwable5 = ibnw.a(object1);
                            if(throwable5 != null) {
                                dcvz.a.e().f(throwable5).p("Failed to update Quick Share restore status.", new Object[0]);
                            }
                            dcmf dcmf1 = this.a;
                            Throwable throwable6 = ibnw.a(dcib.a(dcmf1.q()));
                            if(throwable6 != null) {
                                dcvz.a.e().f(throwable6).p("Failed to opt in Quick Share.", new Object[0]);
                            }
                            Throwable throwable7 = ibnw.a(dcib.a(dcmf1.B(true)));
                            if(throwable7 != null) {
                                dcvz.a.e().f(throwable7).p("Failed to enable Quick Share.", new Object[0]);
                            }
                        }
                    label_70:
                        dcvz.a.b().p("Successfully restored Quick Share settings.", new Object[0]);
                    }
                    catch(hfur hfur0) {
                        dcvz.a.c().f(hfur0).p("Failed to restore Quick Share settings.", new Object[0]);
                    }
                }
            }
            catch(Throwable throwable0) {
                ibsx.a(parcelableBackupDataInput0, throwable0);
                throw throwable0;
            }
        }
        ibsx.a(parcelableBackupDataInput0, null);
    }

    private final gyyy d() {
        gzax gzax0;
        try {
            if(!((dbyi)this.c.a().get(((Number)this.b.a()).longValue(), TimeUnit.MILLISECONDS)).d) {
                dcvz.a.b().p("Skipping Quick Share settings backup because user is not in a restorable state.", new Object[0]);
                return null;
            }
            dcmf dcmf0 = this.a;
            int v = ((DeviceVisibility)evrg.n(dcmf0.j())).f;
            boolean z = true;
            switch(v) {
                case 0: {
                    gzax0 = gzax.e;
                    break;
                }
                case 1: {
                    gzax0 = gzax.b;
                    break;
                }
                case 3: {
                    gzax0 = gzax.c;
                    break;
                }
                case 4: {
                    gzax0 = gzax.f;
                    break;
                }
                default: {
                    gzax0 = gzax.a;
                }
            }
            if(gzax0 == gzax.a) {
                dcvz.a.c().h("Skipping Quick Share settings backup because visibility is unknown(%d).", Integer.valueOf(v));
                return null;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyyy.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            ibuq.f(gzax0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gyyy)hftp0.b_message).c = gzax0.g;
            ((gyyy)hftp0.b_message).b |= 1;
            Object object0 = evrg.n(dcmf0.l());
            ibuq.e(object0, "await(...)");
            boolean z1 = ((Boolean)object0).booleanValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gyyy gyyy0 = (gyyy)hftp0.b_message;
            gyyy0.b |= 2;
            gyyy0.d = z1;
            Integer integer0 = (Integer)evrg.n(dcmf0.h());
            if(integer0 == null) {
                z = false;
            }
            else if(((int)integer0) != 2) {
                z = false;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gyyy gyyy1 = (gyyy)hftp0.b_message;
            gyyy1.b |= 4;
            gyyy1.e = z;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            return (gyyy)hftv0;
        }
        catch(ExecutionException executionException0) {
            dcvz.a.e().f(executionException0).p("Failed to get data for Quick Share settings backup.", new Object[0]);
            return null;
        }
        catch(TimeoutException unused_ex) {
            dcvz.a.e().p("Timed out getting data for Quick Share settings backup.", new Object[0]);
            return null;
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            dcvz.a.e().f(interruptedException0).p("Interrupted when trying to get data for Quick Share settings backup.", new Object[0]);
            return null;
        }
    }
}

