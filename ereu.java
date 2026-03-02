import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.DeviceSignals;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

final class ereu implements Runnable {
    final ExchangeAssertionsForUserCredentialsRequest a;
    final erhb b;
    final erew c;

    public ereu(erew erew0, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0, erhb erhb0) {
        this.a = exchangeAssertionsForUserCredentialsRequest0;
        this.b = erhb0;
        Objects.requireNonNull(erew0);
        this.c = erew0;
        super();
    }

    @Override
    public final void run() {
        Status status3;
        Throwable throwable5;
        String s12;
        Status status2;
        Throwable throwable3;
        String s11;
        UserCredential[] arr_userCredential;
        hkws hkws0;
        gpoc gpoc0;
        ByteString hfsf0;
        Status status1;
        Throwable throwable2;
        ProtoLiteBuilder hftp1;
        Assertion assertion0;
        ArrayList arrayList1;
        gpos gpos0;
        int v;
        ProtoLiteBuilder hftp0;
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest0;
        epxw epxw0;
        erew erew0;
        Status status0 = new Status(13);
        Throwable throwable0 = null;
        if(this.a.b == null) {
            try {
                this.b.c(status0, null, null, null);
            }
            catch(RemoteException remoteException0) {
                erew.a.l(remoteException0);
            }
            return;
        }
        try {
            erew0 = this.c;
            epxw0 = erew0.d;
            exchangeAssertionsForUserCredentialsRequest0 = this.a;
            hftp0 = ((ProtoLiteMessage)hkwr.a).v_newBuilder();
            v = gpoq.a(exchangeAssertionsForUserCredentialsRequest0.d);
            gpos0 = (gpos)((ProtoLiteMessage)gpot.a).v_newBuilder();
            ArrayList arrayList0 = exchangeAssertionsForUserCredentialsRequest0.b;
            arrayList1 = new ArrayList(arrayList0.size());
            Iterator iterator0 = arrayList0.iterator();
            while(true) {
            label_17:
                if(!iterator0.hasNext()) {
                    goto label_80;
                }
                Object object0 = iterator0.next();
                assertion0 = (Assertion)object0;
                hftp1 = ((ProtoLiteMessage)gpoc.a).v_newBuilder();
                throwable2 = throwable0;
                break;
            }
        }
        catch(Throwable throwable1) {
            status1 = status0;
            throwable2 = throwable0;
            goto label_222;
        }
        try {
            hfsf0 = ByteString.b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            gpoc0 = (gpoc)hftv0;
            hfsf0.getClass();
            status1 = status0;
            goto label_38;
        }
        catch(Throwable throwable1) {
            try {
                status1 = status0;
                goto label_222;
            label_38:
                gpoc0.b |= 4;
                gpoc0.e = hfsf0;
                String s = assertion0.b;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                s.getClass();
                ((gpoc)hftv1).b |= 1;
                ((gpoc)hftv1).c = s;
                int v1 = gpoe.a(assertion0.g);
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gpoc)hftp1.b_message).h = (v1 == 0 ? 1 : v1) - 1;
                ((gpoc)hftp1.b_message).b |= 0x20;
                ByteString hfsf1 = ByteString.copyFrom(assertion0.f);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpoc gpoc1 = (gpoc)hftp1.b_message;
                gpoc1.b |= 16;
                gpoc1.g = hfsf1;
                ByteString hfsf2 = ByteString.copyFrom(assertion0.e);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpoc gpoc2 = (gpoc)hftp1.b_message;
                gpoc2.b |= 8;
                gpoc2.f = hfsf2;
                ByteString hfsf3 = ByteString.copyFrom(assertion0.c);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpoc gpoc3 = (gpoc)hftp1.b_message;
                gpoc3.b |= 2;
                gpoc3.d = hfsf3;
                ByteString hfsf4 = ByteString.copyFrom(assertion0.d);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gpoc gpoc4 = (gpoc)hftp1.b_message;
                gpoc4.b |= 4;
                gpoc4.e = hfsf4;
                arrayList1.add(((gpoc)hftp1.N_build()));
                throwable0 = throwable2;
                status0 = status1;
                goto label_17;
            label_80:
                status1 = status0;
                throwable2 = throwable0;
                gpos0.a(arrayList1);
                String s1 = exchangeAssertionsForUserCredentialsRequest0.e;
                if(!gpos0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gpos0).ensureMutable();
                }
                gpot gpot0 = (gpot)gpos0.b_message;
                s1.getClass();
                gpot0.b |= 0x20;
                gpot0.h = s1;
                int v2 = erew0.f;
                if(!gpos0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gpos0).ensureMutable();
                }
                gpot gpot1 = (gpot)gpos0.b_message;
                if(v2 == 0) {
                    throw throwable2;
                }
                gpot1.d = v2;
                gpot1.b |= 1;
                gppa gppa0 = gppa.a;
                if(!gpos0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gpos0).ensureMutable();
                }
                gpot gpot2 = (gpot)gpos0.b_message;
                gppa0.getClass();
                gpot2.e = gppa0;
                gpot2.b |= 2;
                String s2 = exchangeAssertionsForUserCredentialsRequest0.f;
                if(!gpos0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gpos0).ensureMutable();
                }
                gpot gpot3 = (gpot)gpos0.b_message;
                s2.getClass();
                gpot3.b |= 0x80;
                gpot3.j = s2;
                DeviceSignals deviceSignals0 = exchangeAssertionsForUserCredentialsRequest0.c;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gpor.a).v_newBuilder();
                String s3 = deviceSignals0.b;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp2.b_message;
                s3.getClass();
                ((gpor)hftv2).b |= 1;
                ((gpor)hftv2).c = s3;
                String s4 = deviceSignals0.d;
                if(!hftv2.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp2.b_message;
                s4.getClass();
                ((gpor)hftv3).b |= 4;
                ((gpor)hftv3).e = s4;
                String s5 = deviceSignals0.c;
                if(!hftv3.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp2.b_message;
                s5.getClass();
                ((gpor)hftv4).b |= 2;
                ((gpor)hftv4).d = s5;
                String s6 = deviceSignals0.g;
                if(!hftv4.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp2.b_message;
                s6.getClass();
                ((gpor)hftv5).b |= 0x20;
                ((gpor)hftv5).h = s6;
                String s7 = deviceSignals0.f;
                if(!hftv5.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp2.b_message;
                s7.getClass();
                ((gpor)hftv6).b |= 16;
                ((gpor)hftv6).g = s7;
                String s8 = deviceSignals0.e;
                if(!hftv6.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gpor gpor0 = (gpor)hftp2.b_message;
                s8.getClass();
                gpor0.b |= 8;
                gpor0.f = s8;
                gpor gpor1 = (gpor)hftp2.N_build();
                if(!gpos0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gpos0).ensureMutable();
                }
                gpot gpot4 = (gpot)gpos0.b_message;
                gpor1.getClass();
                gpot4.f = gpor1;
                gpot4.b |= 4;
                boolean z = exchangeAssertionsForUserCredentialsRequest0.i;
                if(!gpos0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gpos0).ensureMutable();
                }
                gpot gpot5 = (gpot)gpos0.b_message;
                gpot5.b |= 0x40;
                gpot5.i = z;
                if(v != 0) {
                    if(!gpos0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gpos0).ensureMutable();
                    }
                    ((gpot)gpos0.b_message).g = v;
                    ((gpot)gpos0.b_message).b |= 16;
                }
                if(bafi.b(exchangeAssertionsForUserCredentialsRequest0.j, erew0.b) && bafi.c()) {
                    int v3 = exchangeAssertionsForUserCredentialsRequest0.j;
                    if(!gpos0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gpos0).ensureMutable();
                    }
                    gpot gpot6 = (gpot)gpos0.b_message;
                    gpot6.b |= 0x100;
                    gpot6.k = v3;
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hkwr hkwr0 = (hkwr)hftp0.b_message;
                gpot gpot7 = (gpot)((ProtoLiteBuilder)gpos0).N_build();
                gpot7.getClass();
                hkwr0.c = gpot7;
                hkwr0.b |= 1;
                String s9 = exchangeAssertionsForUserCredentialsRequest0.h;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv7 = hftp0.b_message;
                s9.getClass();
                ((hkwr)hftv7).b |= 4;
                ((hkwr)hftv7).e = s9;
                String s10 = exchangeAssertionsForUserCredentialsRequest0.g;
                if(!hftv7.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hkwr hkwr1 = (hkwr)hftp0.b_message;
                s10.getClass();
                hkwr1.b |= 2;
                hkwr1.d = s10;
                hkwr hkwr2 = (hkwr)hftp0.N_build();
                if(hyjq.c()) {
                    epyf.b.d("New Gms Core network library", new Object[0]);
                    clcf clcf0 = clcg.c("https://android.clients.google.com/auth/exchange_bootstrap_credentials", ckvr.b);
                    hkws0 = (hkws)new epxz(((epyf)epxw0), ((epyf)epxw0).d, ((epyf)epxw0).e, ((epyf)epxw0).f, clcf0, hkwr2).c();
                }
                else {
                    hkws0 = (hkws)new epya(((epyf)epxw0), ((epyf)epxw0).d, ((epyf)epxw0).e, ((epyf)epxw0).f, hkwr2).c();
                }
                if(hkws0 != null && ((hkws0.b & 2) == 0 && (hkws0.b & 1) != 0)) {
                    arr_userCredential = erew0.q((hkws0.c == null ? gpou.a : hkws0.c).b, ((hkwv[])hkws0.g.toArray(new hkwv[0])));
                    s11 = hkws0.e;
                    throwable3 = hkws0.f;
                    status2 = new Status(0);
                }
                else {
                    status3 = new Status(10652);
                    goto label_228;
                }
                goto label_245;
            }
            catch(Throwable throwable1) {
                goto label_222;
            }
        }
        try {
            status2 = new Status(0);
            goto label_245;
        }
        catch(Throwable throwable4) {
            s12 = throwable3;
            throwable5 = throwable4;
            goto label_226;
        }
        try {
            status3 = new Status(10652);
            goto label_228;
        }
        catch(Throwable throwable1) {
        }
    label_222:
        throwable5 = throwable1;
        arr_userCredential = throwable2;
        s11 = arr_userCredential;
        s12 = s11;
    label_226:
        Status status4 = status1;
        goto label_240;
        try {
        label_228:
            erew0.e.a(status3.i);
            status2 = status3;
            throwable3 = throwable2;
            arr_userCredential = throwable3;
            s11 = arr_userCredential;
            goto label_245;
        }
        catch(Throwable throwable6) {
            throwable5 = throwable6;
            status4 = status3;
            arr_userCredential = throwable2;
            s11 = arr_userCredential;
            s12 = s11;
        }
        try {
        label_240:
            this.b.c(status4, arr_userCredential, s11, s12);
        }
        catch(RemoteException remoteException1) {
            erew.a.g("Error executing callback", remoteException1, new Object[0]);
        }
        throw throwable5;
        try {
        label_245:
            this.b.c(status2, arr_userCredential, s11, ((String)throwable3));
        }
        catch(RemoteException remoteException2) {
            erew.a.g("Error executing callback", remoteException2, new Object[0]);
        }
    }
}

