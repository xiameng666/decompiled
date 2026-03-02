import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public final class auba {
    public final gful_cronetEngineProvider a;
    public final avjh b;
    public int c;
    public final boolean d;
    private final gful_cronetEngineProvider e;
    private final String f;
    private final aulm g;
    private final auiz h;
    private boolean i;
    private final atxp j;
    private final long k;
    private final boolean l;
    private final String m;
    private final atyb n;
    private final String o;

    public auba(String s, aulm aulm0, String s1, atxp atxp0, long v, boolean z, String s2, atyb atyb0, String s3) {
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new auay()));
        this.a = gful0;
        this.e = gfus.a(((gful_cronetEngineProvider)new auaz()));
        this.i = false;
        this.c = 0;
        this.b = new avjh("WakeOnLanProxy", s1);
        this.f = s;
        this.g = aulm0;
        this.h = aulm0.a;
        this.c = ((Long)gful0.mr()).intValue() + 1;
        this.d = z;
        this.j = atxp0;
        this.k = v;
        this.l = z;
        this.m = s2;
        this.n = atyb0;
        this.o = s3;
    }

    public final aunj a(String s) {
        aujd aujd0 = this.h.c(this.f);
        if(aujd0 == null) {
            this.b.n("Cast device not found for: %s", s);
            return null;
        }
        aunj aunj0 = aujd0.d;
        if(aunj0 == null) {
            this.b.n("WakeOnLanDevice not set for: %s", s);
            return null;
        }
        return aunj0;
    }

    public final String b() {
        aujd aujd0 = this.h.c(this.f);
        return aujd0 == null ? null : aurf.g(aujd0.c.d);
    }

    public final void c(CastDevice castDevice0) {
        long v2;
        if(avij.e().r() && !this.i && this.c <= 0) {
            if(!this.d) {
                this.b.f("Wake retries exhausted but no failure tracked on non-error tracking proxy", new Object[0]);
                return;
            }
            avjh avjh0 = this.b;
            avjh0.m("Wake-on-lan retries exhausted with connection failure");
            aunj aunj0 = this.a("failed attempts");
            if(aunj0 != null) {
                this.i = true;
                int v = aunj0.d + 1;
                aunj0.d = v;
                long v1 = ((Number)aunj0.f.mr()).longValue();
                auiz auiz0 = this.h;
                String s = this.f;
                aujd aujd0 = auiz0.c(s);
                if(aujd0 == null) {
                    avjh0.m("Cast device not found for: log success");
                    v2 = v1;
                }
                else {
                    v2 = v1;
                    this.j.ag(aujd0.c, this.k, this.l, this.m, this.n, 2, this.o);
                }
                avjh0.n("User failed wake-on-lan attempts: %d", Integer.valueOf(aunj0.d));
                if(((long)v) >= v2) {
                    new auma(this.g.a, this.g.b, castDevice0).b();
                    aujd aujd1 = auiz0.c(s);
                    if(aujd1 == null) {
                        avjh0.m("Cast device not found for: log success");
                        return;
                    }
                    this.j.ag(aujd1.c, this.k, this.l, this.m, this.n, 3, this.o);
                }
            }
        }
    }

    public final void d() {
        aunj aunj0 = this.a("waking device");
        if(aunj0 == null) {
            return;
        }
        --this.c;
        String s = this.b();
        avjh avjh0 = this.b;
        avjh0.p("Attempting to wake device %s with %d retries left", s, Integer.valueOf(this.c));
        try(DatagramSocket datagramSocket0 = new DatagramSocket()) {
            byte[] arr_b = new byte[102];
            InetAddress inetAddress0 = InetAddress.getByName("255.255.255.255");
            byte[] arr_b1 = new byte[6];
            String[] arr_s = TextUtils.split(aunj0.b, "[:\\-]");
            if(arr_s.length != 6) {
                throw new IllegalArgumentException("Invalid MAC address format. Expecting 6 hex groups delimited by : or -");
            }
            for(int v1 = 0; true; ++v1) {
                if(v1 >= 6) {
                    break;
                }
                arr_b1[v1] = (byte)Integer.parseInt(arr_s[v1], 16);
            }
            for(int v2 = 0; true; ++v2) {
                if(v2 >= 6) {
                    break;
                }
                arr_b[v2] = -1;
            }
            for(int v3 = 1; true; ++v3) {
                if(v3 > 16) {
                    break;
                }
                System.arraycopy(arr_b1, 0, arr_b, v3 * 6, 6);
            }
            DatagramPacket datagramPacket0 = new DatagramPacket(arr_b, 102, inetAddress0, ((Long)this.e.mr()).intValue());
            for(int v = 0; true; ++v) {
                if(v >= 5) {
                    break;
                }
                datagramSocket0.send(datagramPacket0);
            }
        }
        catch(UnknownHostException unknownHostException0) {
            this.b.d("Error creating magic packet for device: %s", new Object[]{s, unknownHostException0});
            return;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            this.b.d("Error parsing mac address for device: %s", new Object[]{s, illegalArgumentException0});
            return;
        }
        catch(IOException iOException0) {
            this.b.d("Error creating or sending datagram socket: %s", new Object[]{s, iOException0});
            return;
        }
        avjh0.n("Magic packet broadcast for device: %s", s);
    }

    public final boolean e() {
        if(this.c <= 0) {
            this.b.m("Wake-on-lan retries exhausted");
            return false;
        }
        return this.h.v(this.f);
    }
}

