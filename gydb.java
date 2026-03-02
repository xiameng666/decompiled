import android.bluetooth.BluetoothManager;
import j..util.Objects;
import java.io.IOException;
import java.util.Set;

final class gydb implements gyjk {
    final gydd a;

    public gydb(gydd gydd0) {
        Objects.requireNonNull(gydd0);
        this.a = gydd0;
        super();
    }

    @Override  // gyjk
    public final void a() {
        this.a.a();
    }

    @Override
    public final void run() {
        gycz gycz0 = new gycz(this);
        gemb gemb0 = new gemb(gyey.b, gyey.e, gyey.f, gycz0);
        gydd gydd0 = this.a;
        gydd0.b = gemb0;
        BluetoothManager bluetoothManager0 = (BluetoothManager)gydd0.a.getSystemService("bluetooth");
        gemb gemb1 = gydd0.b;
        batl.s(gemb1);
        batl.s(bluetoothManager0);
        gemb gemb2 = gydd0.b;
        batl.s(gemb2);
        gemb1.k(fgve.a(bluetoothManager0.openGattServer(gydd0.a, gemb2.c)), new gyda(this));
        try {
            while(!gydd0.f.get()) {
                gydc gydc0 = (gydc)gydd0.g.take();
                if(gydc0.b != null) {
                    throw gydc0.b;
                }
                gydk gydk0 = gydc0.a;
                Set set0 = gydd0.c;
                synchronized(set0) {
                    set0.add(gydk0);
                    gydd0.d.d(gydk0);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gygi.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyhn.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gyhn)hftp1.b_message).c = 3;
                    ((gyhn)hftp1.b_message).b |= 1;
                    gyhr gyhr0 = gydk0.b();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gyhn gyhn0 = (gyhn)hftp1.b_message;
                    gyhr0.getClass();
                    gyhn0.d = gyhr0;
                    gyhn0.b |= 2;
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyho.a).v_newBuilder();
                    ByteString hfsf0 = ByteString.copyFrom(gyin.b(gydk0.a));
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gyho gyho0 = (gyho)hftp2.b_message;
                    gyho0.b |= 1;
                    gyho0.c = hfsf0;
                    gyho gyho1 = (gyho)hftp2.N_build();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gyhn gyhn1 = (gyhn)hftp1.b_message;
                    gyho1.getClass();
                    gyhn1.f = gyho1;
                    gyhn1.b |= 16;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gygi gygi0 = (gygi)hftp0.b_message;
                    gyhn gyhn2 = (gyhn)hftp1.N_build();
                    gyhn2.getClass();
                    gygi0.d = gyhn2;
                    gygi0.b |= 2;
                    gyim gyim0 = gydd0.e;
                    if(gyim0 != null) {
                        gyim0.a(((MessageLite)(((gygi)hftp0.N_build()))));
                    }
                }
            }
        }
        catch(IOException | InterruptedException unused_ex) {
        }
    }
}

