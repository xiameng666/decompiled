import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.smartdevice.d2d.AdvertisementOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.PostTransferAction;
import j..util.Objects;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

final class eqep implements Runnable {
    final eqeq a;

    public eqep(eqeq eqeq0) {
        Objects.requireNonNull(eqeq0);
        this.a = eqeq0;
        super();
    }

    @Override
    public final void run() {
        evql evql0;
        eqmz eqmz0;
        eqeq eqeq0 = this.a;
        eqeq0.c.a.E(2);
        eqmb.a(eqeq0.c.a, 11);
        eqeh eqeh0 = eqeq0.c.b;
        Context context0 = eqeh0.c;
        eqdb eqdb0 = new eqdb(eqeq0.b);
        eqiw eqiw0 = eqeq0.d;
        if(eqeh0.i) {
            eqeh.f(eqiw0, new Status(10551));
            return;
        }
        BootstrapOptions bootstrapOptions0 = eqeq0.a;
        PostTransferAction postTransferAction0 = bootstrapOptions0.u;
        if(postTransferAction0 == null) {
            postTransferAction0 = new PostTransferAction();
            bootstrapOptions0.aj(postTransferAction0);
        }
        if(bootstrapOptions0.p().b(9)) {
            postTransferAction0.p(gajl.c(context0, 0x7F15284E));  // string:restore_app_uri ""
            postTransferAction0.r(gajl.c(context0, 0x7F15284D));  // string:restore_app_package ""
        }
        if(bootstrapOptions0.p().b(8)) {
            postTransferAction0.q(hykc.c());
        }
        if(eqeh0.g == null) {
            eqeh0.g = new eqed(eqeh0.b);
        }
        eqea eqea0 = eqeh0.g;
        if(!erqb.b(bootstrapOptions0.l)) {
            bootstrapOptions0.al(erqb.a());
        }
        bootstrapOptions0.x(eqeh0.f);
        eqme eqme0 = eqeh0.d;
        eqme0.w(bootstrapOptions0.l);
        eqme0.x(bootstrapOptions0.i);
        if(hyim.l()) {
            eqme0.F(4);
        }
        else {
            eqme0.F(2);
        }
        bootstrapOptions0.av();
        bootstrapOptions0.ao(true);
        bootstrapOptions0.w((hyim.l() ? epwh.b() : epwh.a()));
        erql erql0 = eqeh0.e;
        if(!erql0.a(true, false).e()) {
            eqeh.a.d("Failed to enable bluetooth", new Object[0]);
            eqeh.f(eqiw0, new Status(10550));
            return;
        }
        eqeh0.h = eqdb0;
        eqeh0.k = true;
        erqj erqj0 = erql0.d;
        if(erqj0 == null) {
            throw new RuntimeException("Resources have not been initialized");
        }
        eqky.a = Math.abs(erqj0.b().hashCode());
        String s = erql0.b();
        erql.a.d("deviceDisplayName: %s, model: %s", new Object[]{s, Build.MODEL});
        String s1 = hyig.a.c().h() ? erql0.b() : Build.MODEL;
        batl.q(s1);
        Locale locale0 = Locale.US;
        Locale locale1 = Locale.US;
        Integer integer0 = eqky.a;
        if(integer0 == null) {
            throw new RuntimeException("You must call setDisambiguationNumber before callinggetDisambiguationNumber or getDeviceName");
        }
        String s2 = String.format(locale1, "%03d", integer0);
        String s3 = String.format(locale0, " (%s)", s2.substring(s2.length() - 3));
        int v = s3.length();
        if(s1.getBytes().length > 18 - v) {
            String s4;
            for(s4 = s1.substring(0, 15 - v); s4.getBytes().length + 3 > 18 - v; s4 = s4.substring(0, s4.length() - 1)) {
            }
            s1 = s4 + "...";
        }
        eqeh0.j = String.format(Locale.US, "%s%s", s1, s3);
        epzg epzg0 = ((eqei)eqeh0).b;
        epza epza0 = new epza(epzg0.a);
        bbll bbll0 = new bbll(1, 10);
        ((eqei)eqeh0).l = new eqdn(epzg0, ((epwt)eqeh0), bootstrapOptions0, epwj.a, epza0, bbll0);
        eqmv eqmv0 = new eqmv(epzg0.d, eqdb0, ((eqei)eqeh0).l);
        int v1 = erqj0.b().hashCode();
        String s5 = eqeh0.j;
        batl.s(s5);
        if(((eqed)eqea0).j == null) {
            if(v1 != -1) {
                ((eqed)eqea0).m = new byte[]{((byte)(v1 >> 8)), ((byte)v1)};
            }
            eqtn eqtn0 = ((eqed)eqea0).e;
            if(eqtn0 != null) {
                boolean z = eqtn0.b(((eqed)eqea0).m, eqtn.d());
                byte[] arr_b = eqtn.d();
                if(!hyhm.a.b().d() || arr_b != null && Arrays.equals(eqtn.c("d4f700"), arr_b)) {
                    BluetoothManager bluetoothManager0 = eqtn0.g;
                    if(bluetoothManager0 != null) {
                        baun baun0 = eqtn.e;
                        baun0.d("Open Gatt server.", new Object[0]);
                        eqtn0.i = bluetoothManager0.openGattServer(eqtn0.h, eqtn0.k);
                        BluetoothGattServer bluetoothGattServer0 = eqtn0.i;
                        if(bluetoothGattServer0 == null) {
                            baun0.m("Unable to start GATT server.", new Object[0]);
                        }
                        else {
                            BluetoothGattService bluetoothGattService0 = new BluetoothGattService(eqtn.a, 0);
                            BluetoothGattCharacteristic bluetoothGattCharacteristic0 = new BluetoothGattCharacteristic(eqtn.b, 2, 1);
                            bluetoothGattCharacteristic0.addDescriptor(new BluetoothGattDescriptor(eqtn.c, 17));
                            bluetoothGattService0.addCharacteristic(bluetoothGattCharacteristic0);
                            baun0.d("Add service result: " + bluetoothGattServer0.addService(bluetoothGattService0), new Object[0]);
                        }
                    }
                }
                if(z) {
                    ProtoLiteBuilder hftp0 = ((eqed)eqea0).c.e.b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gjpj gjpj0 = (gjpj)hftp0.b_message;
                    gjpj0.b |= 0x80;
                    gjpj0.i = true;
                }
            }
            baun baun1 = eqed.a;
            baun1.j("Starting advertising through Nearby Connections.", new Object[0]);
            ((eqed)eqea0).j = eqmv0;
            AdvertisingOptions advertisingOptions0 = new AdvertisingOptions();
            advertisingOptions0.a = Strategy.c;
            cuut.a(advertisingOptions0);
            cuut.d(advertisingOptions0);
            String s6 = bootstrapOptions0.A;
            if(s6 == null) {
                long v2 = new SecureRandom().nextLong();
                String s7 = Long.toString((v2 == 0x8000000000000000L ? 0L : Math.abs(v2)));
                ((eqed)eqea0).l = s7.substring(0, Math.min(4, s7.length()));
            }
            else {
                ((eqed)eqea0).l = s6;
            }
            if(hyip.a.b().a()) {
                ((eqed)eqea0).n = epwf.c();
            }
            Context context1 = ((eqed)eqea0).b;
            String s8 = ((eqed)eqea0).l;
            byte[] arr_b1 = ((eqed)eqea0).m;
            if((bootstrapOptions0.x == null || !hygb.e()) && !bootstrapOptions0.p().b(3)) {
                eqmz0 = new eqnb(s5);
            }
            else if(((int)hyim.b()) == 1) {
                AdvertisementOptions advertisementOptions0 = bootstrapOptions0.x;
                gjpi gjpi0 = advertisementOptions0 == null || !hygb.e() ? eqmy.b(context1) : gjpi.b(advertisementOptions0.b);
                eqmx eqmx0 = new eqmx();
                eqnc.c(eqsh.h(context1), eqmx0);
                eqnc.d(gjpi0, eqmx0);
                if(s8 != null) {
                    eqnc.b(s8, eqmx0);
                }
                if(arr_b1 != null) {
                    eqmx0.b[7] = arr_b1[0];
                    eqmx0.b[8] = arr_b1[1];
                }
                if(bootstrapOptions0.z) {
                    baun1.j("Target used refactored flow.", new Object[0]);
                    eqmx0.b[9] = 1;
                }
                try {
                    eqmz0 = eqnc.a(s5, eqmx0);
                }
                catch(eqne eqne0) {
                    eqed.a.n("Failed building advertisement-v1, reverting to v0", eqne0, new Object[0]);
                    eqmz0 = new eqnb(s5);
                }
            }
            else {
                eqmz0 = new eqnb(s5);
            }
            String s9 = eqmz0.b();
            String s10 = hyim.f();
            eqmo eqmo0 = new eqmo(((eqed)eqea0).p, ((eqed)eqea0).q);
            evql evql1 = ((eqed)eqea0).d.m(s9, s10, eqmo0, advertisingOptions0);
            try {
                evrg.n(evql1);
                eqmg eqmg0 = ((eqed)eqea0).c.e;
                ProtoLiteBuilder hftp1 = eqmg0.b;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjpj gjpj1 = (gjpj)hftp1.b_message;
                gjpj1.b |= 1;
                gjpj1.c = true;
                eqmg0.a = SystemClock.elapsedRealtime();
                gjpi gjpi1 = eqmz0.a().d();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gjpj)hftp1.b_message).h = gjpi1.h;
                ((gjpj)hftp1.b_message).b |= 0x20;
                ((eqed)eqea0).g = eqmz0;
            }
            catch(ExecutionException | InterruptedException exception0) {
                Exception exception1 = evql1.i();
                eqed.a.n("Failed to advertise", exception0, new Object[0]);
                if(exception1 != null) {
                    evql0 = evrg.c(exception1);
                    evql0.b(new eqef(eqeh0, eqiw0));
                    evql0.A(new eqeg(eqeh0, eqiw0));
                    return;
                }
            }
        }
        else {
            eqed.a.d("Already advertising!", new Object[0]);
        }
        evql0 = evrg.d(null);
        evql0.b(new eqef(eqeh0, eqiw0));
        evql0.A(new eqeg(eqeh0, eqiw0));
    }
}

