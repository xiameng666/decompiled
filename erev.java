import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.DeviceRiskSignals;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.ScreenlockState;
import com.google.android.gms.smartdevice.setup.accounts.SessionCheckpoint;
import com.google.android.gms.smartdevice.setup.accounts.StarguardData;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import jeb.synthetic.FIN;

final class erev implements Runnable {
    final ExchangeSessionCheckpointsForUserCredentialsRequest a;
    final erhb b;
    final erew c;

    public erev(erew erew0, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest0, erhb erhb0) {
        this.a = exchangeSessionCheckpointsForUserCredentialsRequest0;
        this.b = erhb0;
        Objects.requireNonNull(erew0);
        this.c = erew0;
        super();
    }

    @Override
    public final void run() {
        Status status3;
        UserCredential[] arr_userCredential1;
        Throwable throwable2;
        Status status2;
        UserCredential[] arr_userCredential;
        hkwu hkwu0;
        hhsh hhsh3;
        erew erew0;
        long v6;
        long v5;
        ajpf ajpf0;
        Intent intent0;
        bbic bbic0;
        int v3;
        azox azox0;
        Status status1;
        boolean z;
        long v2;
        String s1;
        String s;
        long v1;
        HashMap hashMap0;
        bhnd bhnd0;
        Context context0;
        long v;
        Status status0 = new Status(13);
        try {
            v = -1L;
            context0 = this.c.b;
            bhnd0 = this.c.a();
            hashMap0 = new HashMap();
            gftb.z(context0, "context cannot be null.");
            gftb.z(bhnd0, "droidGuardHandle cannot be null");
            v1 = bbmq.d(context0);
            s = Build.MODEL;
            s1 = Build.MANUFACTURER;
            v2 = (long)Build.VERSION.SDK_INT;
            z = erpk.a(context0);
        }
        catch(Throwable throwable0) {
            status1 = status0;
            goto label_265;
        }
        if(z) {
            try {
                azox0 = new azox();
                goto label_22;
            }
            catch(Throwable throwable0) {
                try {
                    status1 = status0;
                    goto label_265;
                    try {
                    label_22:
                        v3 = FIN.finallyOpen$NT();
                        bbic0 = bbic.a();
                        status1 = status0;
                        intent0 = new Intent();
                        status1 = status0;
                        goto label_31;
                    }
                    catch(InterruptedException | RemoteException exception0) {
                    }
                }
                catch(Throwable throwable0) {
                    goto label_265;
                }
            }
            status1 = status0;
            goto label_46;
            try {
            label_31:
                bbic0.d(context0, intent0.setClassName(context0, "com.google.android.gms.auth.setup.devicesignals.DeviceSignalsService"), azox0, 1);
                IBinder iBinder0 = azox0.a();
                if(iBinder0 == null) {
                    ajpf0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
                    ajpf0 = (iInterface0 instanceof ajpf) ? ((ajpf)iInterface0) : new ajpd(iBinder0);
                }
                long v4 = ajpf0.a();
                v5 = ajpf0.b();
                v6 = v4 == -1L ? -1L : SystemClock.elapsedRealtime() - v4;
                goto label_51;
            }
            catch(InterruptedException | RemoteException exception0) {
            }
            catch(Throwable throwable0) {
                goto label_265;
            }
            try {
            label_46:
                boolean z1 = z;
                long v7 = v1;
                erhi.a.n("Could not get device signals. Setting to insecure.", exception0, new Object[0]);
                FIN.finallyExec$NT(v3);
                goto label_64;
            label_51:
                if(v5 != -1L) {
                    v = v5;
                }
                FIN.finallyCodeBegin$NT(v3);
                bbic.a().b(context0, azox0);
                FIN.finallyCodeEnd$NT(v3);
                z1 = z;
                v7 = v1;
                long v8 = v;
                long v9 = v6;
                goto label_66;
            label_61:
                status1 = status0;
                z1 = z;
                v7 = v1;
            label_64:
                v9 = -1L;
                v8 = -1L;
            label_66:
                erhi.a.d(a.u(v9, "elapsedTimeSinceUnlockMillis: "), new Object[0]);
                erhi.a.d(a.u(v8, "screenlockSettingsAgeMillis: "), new Object[0]);
                DeviceRiskSignals deviceRiskSignals0 = new DeviceRiskSignals(v7, s, s1, v2, new ScreenlockState(z1, (z ? 10 : 1), v8, v9), new StarguardData(bhnd0.a(hashMap0)));
                ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest0 = this.a;
                exchangeSessionCheckpointsForUserCredentialsRequest0.c = deviceRiskSignals0;
                exchangeSessionCheckpointsForUserCredentialsRequest0.a.add(Integer.valueOf(3));
                erew0 = this.c;
                epxw epxw0 = erew0.d;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkwt.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gpov.a).v_newBuilder();
                ArrayList arrayList0 = exchangeSessionCheckpointsForUserCredentialsRequest0.b;
                gpoi[] arr_gpoi = new gpoi[arrayList0.size()];
                for(int v10 = 0; v10 < arrayList0.size(); ++v10) {
                    SessionCheckpoint sessionCheckpoint0 = (SessionCheckpoint)arrayList0.get(v10);
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gpoi.a).v_newBuilder();
                    String s2 = sessionCheckpoint0.b;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp2.b_message;
                    s2.getClass();
                    ((gpoi)hftv0).b |= 1;
                    ((gpoi)hftv0).c = s2;
                    String s3 = sessionCheckpoint0.c;
                    if(!hftv0.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gpoi gpoi0 = (gpoi)hftp2.b_message;
                    s3.getClass();
                    gpoi0.b |= 2;
                    gpoi0.d = s3;
                    arr_gpoi[v10] = (gpoi)hftp2.N_build();
                }
                List list0 = Arrays.asList(arr_gpoi);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpov gpov0 = (gpov)hftp1.b_message;
                hfuo hfuo0 = gpov0.c;
                if(!hfuo0.c()) {
                    gpov0.c = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(list0, gpov0.c);
                int v11 = erew0.f;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpov gpov1 = (gpov)hftp1.b_message;
                if(v11 == 0) {
                    throw null;
                }
                gpov1.d = v11;
                gpov1.b |= 1;
                gppa gppa0 = gppa.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpov gpov2 = (gpov)hftp1.b_message;
                gppa0.getClass();
                gpov2.e = gppa0;
                gpov2.b |= 2;
                DeviceRiskSignals deviceRiskSignals1 = exchangeSessionCheckpointsForUserCredentialsRequest0.c;
                if(deviceRiskSignals1 == null) {
                    hhsh3 = null;
                }
                else {
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hhsh.a).v_newBuilder();
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hhsg.a).v_newBuilder();
                    long v12 = deviceRiskSignals1.c;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp4.b_message;
                    ((hhsg)hftv1).b |= 2;
                    ((hhsg)hftv1).d = v12;
                    String s4 = deviceRiskSignals1.e;
                    if(!hftv1.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp4.b_message;
                    s4.getClass();
                    ((hhsg)hftv2).b |= 16;
                    ((hhsg)hftv2).f = s4;
                    String s5 = deviceRiskSignals1.d;
                    if(!hftv2.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp4.b_message;
                    s5.getClass();
                    ((hhsg)hftv3).b |= 8;
                    ((hhsg)hftv3).e = s5;
                    int v13 = hhsj.a(deviceRiskSignals1.b);
                    if(!hftv3.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp4.b_message;
                    if(v13 == 0) {
                        throw null;
                    }
                    ((hhsg)hftv4).c = v13 - 1;
                    ((hhsg)hftv4).b |= 1;
                    long v14 = deviceRiskSignals1.f;
                    if(!hftv4.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp4.b_message;
                    ((hhsg)hftv5).b |= 0x20;
                    ((hhsg)hftv5).g = v14;
                    long v15 = deviceRiskSignals1.g;
                    if(!hftv5.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    hhsg hhsg0 = (hhsg)hftp4.b_message;
                    hhsg0.b |= 0x40;
                    hhsg0.h = v15;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    hhsh hhsh0 = (hhsh)hftp3.b_message;
                    hhsg hhsg1 = (hhsg)hftp4.N_build();
                    hhsg1.getClass();
                    hhsh0.c = hhsg1;
                    hhsh0.b |= 1;
                    ScreenlockState screenlockState0 = deviceRiskSignals1.h;
                    if(screenlockState0 != null) {
                        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hhsk.a).v_newBuilder();
                        long v16 = screenlockState0.e;
                        if(!hftp5.b_message.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ProtoLiteMessage hftv6 = hftp5.b_message;
                        ((hhsk)hftv6).b |= 0x20;
                        ((hhsk)hftv6).h = v16;
                        boolean z2 = screenlockState0.f;
                        if(!hftv6.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ProtoLiteMessage hftv7 = hftp5.b_message;
                        ((hhsk)hftv7).b |= 0x40;
                        ((hhsk)hftv7).i = z2;
                        long v17 = screenlockState0.d;
                        if(!hftv7.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ProtoLiteMessage hftv8 = hftp5.b_message;
                        ((hhsk)hftv8).b |= 4;
                        ((hhsk)hftv8).e = v17;
                        int v18 = hhsm.a(screenlockState0.c);
                        if(!hftv8.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        ProtoLiteMessage hftv9 = hftp5.b_message;
                        if(v18 == 0) {
                            throw null;
                        }
                        ((hhsk)hftv9).d = v18 - 1;
                        ((hhsk)hftv9).b |= 2;
                        boolean z3 = screenlockState0.b;
                        if(!hftv9.isImmutable()) {
                            hftp5.ensureMutable();
                        }
                        hhsk hhsk0 = (hhsk)hftp5.b_message;
                        hhsk0.b |= 1;
                        hhsk0.c = z3;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        hhsh hhsh1 = (hhsh)hftp3.b_message;
                        hhsk hhsk1 = (hhsk)hftp5.N_build();
                        hhsk1.getClass();
                        hhsh1.d = hhsk1;
                        hhsh1.b |= 2;
                    }
                    StarguardData starguardData0 = deviceRiskSignals1.i;
                    if(starguardData0 != null) {
                        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)hhsn.a).v_newBuilder();
                        String s6 = gfta.b(starguardData0.b);
                        if(!hftp6.b_message.isImmutable()) {
                            hftp6.ensureMutable();
                        }
                        hhsn hhsn0 = (hhsn)hftp6.b_message;
                        hhsn0.b |= 1;
                        hhsn0.c = s6;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        hhsh hhsh2 = (hhsh)hftp3.b_message;
                        hhsn hhsn1 = (hhsn)hftp6.N_build();
                        hhsn1.getClass();
                        hhsh2.e = hhsn1;
                        hhsh2.b |= 4;
                    }
                    hhsh3 = (hhsh)hftp3.N_build();
                }
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpov gpov3 = (gpov)hftp1.b_message;
                hhsh3.getClass();
                gpov3.f = hhsh3;
                gpov3.b |= 4;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hkwt hkwt0 = (hkwt)hftp0.b_message;
                gpov gpov4 = (gpov)hftp1.N_build();
                gpov4.getClass();
                hkwt0.c = gpov4;
                hkwt0.b |= 1;
                hkwt hkwt1 = (hkwt)hftp0.N_build();
                if(hyjq.c()) {
                    epyf.b.d("New Gms Core network library", new Object[0]);
                    clcf clcf0 = clcg.c("https://android.clients.google.com/auth/tapngo/exchange_session_checkpoints?rt=b", ckvs.b);
                    hkwu0 = (hkwu)new epyb(((epyf)epxw0), ((epyf)epxw0).d, ((epyf)epxw0).e, ((epyf)epxw0).f, clcf0, hkwt1).c();
                }
                else {
                    hkwu0 = (hkwu)new epyc(((epyf)epxw0), ((epyf)epxw0).d, ((epyf)epxw0).e, ((epyf)epxw0).f, hkwt1).c();
                }
                if(hkwu0 != null && ((hkwu0.b & 2) == 0 && (hkwu0.b & 1) != 0)) {
                    arr_userCredential = erew0.q((hkwu0.c == null ? gpow.a : hkwu0.c).b, ((hkwv[])hkwu0.e.toArray(new hkwv[0])));
                    goto label_256;
                }
                else {
                    goto label_262;
                }
                goto label_281;
            }
            catch(Throwable throwable0) {
                goto label_265;
            }
        }
        else {
            goto label_61;
        }
        goto label_66;
        try {
        label_256:
            status2 = new Status(0);
            goto label_281;
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            arr_userCredential1 = arr_userCredential;
            goto label_267;
        }
        try {
        label_262:
            status3 = new Status(10652);
            goto label_269;
        }
        catch(Throwable throwable0) {
        }
    label_265:
        throwable2 = throwable0;
        arr_userCredential1 = null;
    label_267:
        status3 = status1;
        goto label_276;
        try {
        label_269:
            erew0.e.a(status3.i);
            status2 = status3;
            arr_userCredential = null;
            goto label_281;
        }
        catch(Throwable throwable3) {
            throwable2 = throwable3;
            arr_userCredential1 = null;
        }
        try {
        label_276:
            this.b.d(status3, arr_userCredential1);
        }
        catch(RemoteException remoteException0) {
            erew.a.g("Error executing callback", remoteException0, new Object[0]);
        }
        throw throwable2;
        try {
        label_281:
            this.b.d(status2, arr_userCredential);
        }
        catch(RemoteException remoteException1) {
            erew.a.g("Error executing callback", remoteException1, new Object[0]);
        }
    }
}

