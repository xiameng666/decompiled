import android.net.Network;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;

public final class gpsl implements Runnable {
    public final gpsm a;

    public gpsl(gpsm gpsm0) {
        this.a = gpsm0;
    }

    @Override
    public final void run() {
        gprf gprf0;
        gpsm gpsm0 = this.a;
        gpsi gpsi0 = gpsm0.m;
        DatagramPacket datagramPacket0 = new DatagramPacket(gpsm0.c, 0x800);
        while(!gpsm0.k) {
            try {
                Object object0 = gpsm0.e;
                synchronized(object0) {
                    if(gpsi0 != null && gpsi0 == gpsm0.m) {
                        gpsi0.d.receive(datagramPacket0);
                    }
                }
                if(gpsm0.k) {
                    continue;
                }
                String s = gpsi0 == gpsm0.m ? "multicast" : "unicast";
                int v1 = -1;
                InetAddress inetAddress0 = datagramPacket0.getAddress();
                gpqz gpqz0 = gpsm0.r;
                boolean z = gpqz0.b;
                Network network0 = null;
                gpsy gpsy0 = !z || inetAddress0 == null ? null : gpsm0.s.a(inetAddress0);
                if(gpsi0 != null) {
                    if(!z) {
                        v1 = gpsi0.a();
                    }
                    else if(gpsy0 != null) {
                        v1 = gpsy0.b;
                    }
                }
                if(gpsy0 != null) {
                    network0 = gpsy0.a;
                }
                int v2 = gpsm0.o + 1;
                gpsm0.o = v2;
                try {
                    gprf0 = gpro.a(datagramPacket0.getData(), datagramPacket0.getLength(), gpqz0);
                }
                catch(gpre gpre0) {
                    int v3 = gpre0.a;
                    gpqn.e(gpsm0.q, String.format("Error while decoding %s packet (%d): %d", s, v2, v3));
                    gpsn gpsn0 = gpsm0.l;
                    if(gpsn0 == null) {
                        continue;
                    }
                    gpqv gpqv0 = new gpqv(((gpqy)gpsn0), v2, v3);
                    ((gpqy)gpsn0).e.a(gpqv0);
                    continue;
                }
                gpsn gpsn1 = gpsm0.l;
                if(gpsn1 == null) {
                    continue;
                }
                gpqt gpqt0 = new gpqt(((gpqy)gpsn1), gprf0, new gpsy(network0, v1));
                ((gpqy)gpsn1).e.a(gpqt0);
            }
            catch(IOException iOException0) {
                if(gpsm0.k) {
                    continue;
                }
                gpqn.b(gpsm0.q, "Failed to receive mDNS packets.", iOException0);
            }
        }
        gpqn.d(gpsm0.q, "Receive thread stopped.");
    }
}

