import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.LongSparseArray;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;
import j..util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class arot {
    private String A;
    private final Queue B;
    private boolean C;
    public static final aqql a;
    public final cuvm b;
    public final gmcg c;
    public final arem d;
    public final LongSparseArray e;
    public final gful_cronetEngineProvider f;
    public final gful_cronetEngineProvider g;
    public final gful_cronetEngineProvider h;
    public final gful_cronetEngineProvider i;
    public final gful_cronetEngineProvider j;
    public final gful_cronetEngineProvider k;
    public final gful_cronetEngineProvider l;
    public final gful_cronetEngineProvider m;
    public final gful_cronetEngineProvider n;
    public byte[] o;
    public final azts p;
    private final arnv q;
    private final Context r;
    private final arnb s;
    private final LongSparseArray t;
    private final gful_cronetEngineProvider u;
    private final gful_cronetEngineProvider v;
    private final gful_cronetEngineProvider w;
    private final gful_cronetEngineProvider x;
    private final gful_cronetEngineProvider y;
    private boolean z;

    static {
        arot.a = new aqql(new String[]{"WifiSourceSocket"});
    }

    public arot(arnv arnv0, Context context0, cuvm cuvm0, azts azts0, gmcg gmcg0, arnb arnb0, arem arem0) {
        this.e = new LongSparseArray();
        this.t = new LongSparseArray();
        this.f = gfus.a(((gful_cronetEngineProvider)new arnn()));
        this.u = gfus.a(((gful_cronetEngineProvider)new arns()));
        this.v = gfus.a(((gful_cronetEngineProvider)new arnt()));
        this.w = gfus.a(((gful_cronetEngineProvider)new arne()));
        this.x = gfus.a(((gful_cronetEngineProvider)new arnf()));
        this.g = gfus.a(((gful_cronetEngineProvider)new arng()));
        this.h = gfus.a(((gful_cronetEngineProvider)new arnh()));
        this.i = gfus.a(((gful_cronetEngineProvider)new arni()));
        this.j = gfus.a(((gful_cronetEngineProvider)new arnj()));
        this.k = gfus.a(((gful_cronetEngineProvider)new arnk()));
        this.l = gfus.a(((gful_cronetEngineProvider)new arno()));
        this.m = gfus.a(((gful_cronetEngineProvider)new arnp()));
        this.y = gfus.a(((gful_cronetEngineProvider)new arnq()));
        this.n = gfus.a(((gful_cronetEngineProvider)new arnr()));
        this.B = new ArrayDeque();
        this.q = arnv0;
        this.r = context0;
        this.b = cuvm0;
        this.p = azts0;
        this.c = gmcg0;
        this.s = arnb0;
        this.d = arem0;
    }

    final int a(Long long0) {
        int v5;
        boolean z2;
        String s1;
        boolean z1;
        arnc arnc0;
        synchronized(this) {
            aqql aqql0 = arot.a;
            aqql0.d("connect", new Object[0]);
            if(this.z) {
                aqql0.m("Ignore as socket is shutdown already.", new Object[0]);
                return 2;
            }
            WifiManager wifiManager0 = this.c();
            boolean z = wifiManager0.isTdlsSupported();
            int v1 = arot.b(wifiManager0);
            WifiInfo wifiInfo0 = wifiManager0.getConnectionInfo();
            if(wifiInfo0 == null) {
                aqql0.m("No connection info so channel width unknown.", new Object[0]);
            }
            else {
                List list0 = wifiManager0.getScanResults();
                if(list0 != null) {
                    for(Object object0: list0) {
                        ScanResult scanResult0 = (ScanResult)object0;
                        if(!scanResult0.BSSID.equals(wifiInfo0.getBSSID())) {
                            continue;
                        }
                        arnc0 = (arnc)arnc.h.get(Integer.valueOf(scanResult0.channelWidth));
                        if(arnc0 == null) {
                            arnc0 = arnc.a;
                        }
                        goto label_32;
                    }
                }
                aqql0.m("Sta connection channel width unknown - AP missing in the latest scan.", new Object[0]);
            }
            arnc0 = arnc.b;
        label_32:
            this.d.o(v1, z, arnc0);
            gmcu gmcu0 = new gmcu();
            try {
                arnb.a.j("getConnectionHint", new Object[0]);
                Objects.requireNonNull(this.s.b);
                armv armv0 = new armv(this.s.b);
                String s = ((ConnectionHint)this.s.a(((gful_cronetEngineProvider)armv0))).b;
                aqql0.d("connectionHint=%s", new Object[]{s});
                Object object1 = this.w.mr();
                gful_cronetEngineProvider gful0 = this.v;
                Object object2 = gful0.mr();
                gful_cronetEngineProvider gful1 = this.x;
                aqql0.h("LAN configs - allowLanOnlyViaTdls=%b, allowLanOnlyVia5GHz=%b, minimum5GhzLanScanResultChannelWidth=%d.", new Object[]{object1, object2, gful1.mr()});
                Integer integer0 = v1;
                aqql0.h("LAN configs - currentStaFrequency=%d, staScanResultChannelWidth=%s, isTdlsSupported=%b.", new Object[]{integer0, arnc0, Boolean.valueOf(z)});
                if(((Boolean)this.w.mr()).booleanValue() && !z) {
                    aqql0.h("LAN configs - LAN disallowed as TDLS is not supported.", new Object[0]);
                label_63:
                    z1 = false;
                }
                else if(!((Boolean)gful0.mr()).booleanValue()) {
                    aqql0.h("LAN configs - LAN allowed.", new Object[0]);
                    z1 = true;
                }
                else if(v1 < 5160 || v1 > 0x16FD) {
                    aqql0.h("LAN configs - LAN disallowed as current STA freq is not a 5GHz freq.", new Object[0]);
                    goto label_63;
                }
                else {
                    int v3 = ((Long)gful1.mr()).intValue();
                    if(arnc0.i >= v3) {
                        aqql0.h("LAN configs - LAN allowed.", new Object[0]);
                        z1 = true;
                    }
                    else {
                        aqql0.h("LAN configs - LAN disallowed as channel width is less than the minimum.", new Object[0]);
                        goto label_63;
                    }
                }
                aqql0.h("Direct configs - allowDirect=%b, allowDirectOnlyIfDisconnectedFromAp=%b.", new Object[]{Boolean.valueOf(true), this.u.mr()});
                aqql0.h("Direct configs - currentStaFrequency=%d.", new Object[]{integer0});
                if(((Boolean)this.u.mr()).booleanValue() && v1 > 0) {
                    aqql0.h("Direct configs - Direct disallowed as the device is connected to an AP.", new Object[0]);
                    s1 = s;
                    z2 = false;
                }
                else {
                    aqql0.h("Direct configs - Direct allowed.", new Object[0]);
                    s1 = s;
                    z2 = true;
                }
                cuvm cuvm0 = this.b;
                aroh aroh0 = new aroh(this, gmcu0, s1, z1, z2);
                aqql0.h("DiscoveryOptions - Mediums discoverable(Aware=%b, LAN=%b).", new Object[]{this.f.mr(), Boolean.valueOf(z1)});
                cuwm cuwm0 = new cuwm();
                cuwm0.j(Strategy.c);
                cuwm0.a.g = z1;
                cuwm0.a.i = ((Boolean)this.f.mr()).booleanValue();
                if(((Boolean)this.y.mr()).booleanValue()) {
                    long v4 = Long.parseLong(s1);
                    Long long1 = v4;
                    aqql0.h("Setting flow Id as part of discovery: %d", new Object[]{long1});
                    long1.getClass();
                    cuwm0.h(v4);
                }
                evql evql0 = cuvm0.o(s1, aroh0, cuwm0.a());
                evql0.b(new arnm(this));
                evql0.A(new aros(this));
                arod arod0 = (arod)gmcu0.v(long0.longValue(), TimeUnit.MILLISECONDS);
                switch(arod0.b.a.i) {
                    case 0: {
                        this.A = arod0.a;
                        return 0;
                    }
                    case 15: {
                        break;
                    }
                    default: {
                        return 4;
                    }
                }
            }
            catch(TimeoutException unused_ex) {
                arot.a.d("Timed out when trying to connect.", new Object[0]);
                gmcu0.cancel(true);
                return 1;
            }
            catch(InterruptedException | ExecutionException unused_ex) {
                return 4;
            }
            catch(arna unused_ex) {
                return 3;
            }
            finally {
                this.b.u();
                arot.a.h("Discovery stopped", new Object[0]);
            }
            v5 = 1;
        }
        return v5;
    }

    public static int b(WifiManager wifiManager0) {
        WifiInfo wifiInfo0 = wifiManager0.getConnectionInfo();
        return wifiInfo0 == null ? -1 : wifiInfo0.getFrequency();
    }

    public final WifiManager c() {
        return (WifiManager)this.r.getApplicationContext().getSystemService("wifi");
    }

    public final void d(cuwu cuwu0) {
        synchronized(this) {
            if(this.A == null) {
                arot.a.m("Unable to send payload as devices are disconnected. Transport will shutdown soon.", new Object[0]);
                return;
            }
            this.B.offer(cuwu0);
            this.n();
        }
    }

    public final void e() {
        LongSparseArray longSparseArray0;
        synchronized(this) {
            arot.a.d("onDisconnected", new Object[0]);
            this.A = null;
            this.o = null;
            this.C = false;
            this.B.clear();
            for(int v1 = 0; true; ++v1) {
                longSparseArray0 = this.e;
                if(v1 >= longSparseArray0.size()) {
                    break;
                }
                ((arli)longSparseArray0.valueAt(v1)).a(2);
            }
            longSparseArray0.clear();
            this.t.clear();
            if(!this.z) {
                this.q.e();
            }
        }
    }

    protected final void f(cuwu cuwu0) {
        asci asci0;
        synchronized(this) {
            aqql aqql0 = arot.a;
            long v1 = cuwu0.i;
            Long long0 = v1;
            aqql0.d("callbackThread: onPayloadReceived (id=%s)", new Object[]{long0});
            if(!this.z) {
                int v2 = cuwu0.j;
                switch(v2) {
                    case 1: {
                        arnv arnv0 = this.q;
                        byte[] arr_b = cuwu0.k;
                        aqql aqql1 = arpn.d;
                        aqql1.h("onBytesReceived", new Object[0]);
                        try {
                            if(hqhn.f()) {
                                hftc hftc0 = hftc.a();
                                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)asci.a), arr_b, 0, arr_b.length, hftc0);
                                ProtoLiteMessage.P_makeImmutable(hftv0);
                                asci0 = (asci)hftv0;
                            }
                            else {
                                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)asci.a), arr_b, 0, arr_b.length, hftc.a);
                                ProtoLiteMessage.P_makeImmutable(hftv1);
                                asci0 = (asci)hftv1;
                            }
                            if((asci0.b & 1) == 0 || ((asch.b(asci0.c) == null ? asch.a : asch.b(asci0.c)) != asch.m || (asci0.b & 8) == 0) || ((asci0.f == null ? ascj.a : asci0.f).b & 1) == 0 || (asci0.f == null ? ascj.a : asci0.f).c != 1) {
                                ((arpn)arnv0).a.r(asci0, hkyj.c);
                                return;
                            }
                            aqql1.m("Stream error received!", new Object[0]);
                            ((arpn)arnv0).a.a(hkyj.c).a(3);
                        }
                        catch(hfur hfur0) {
                            arpn.d.g("Invalid packet received.", hfur0, new Object[0]);
                            ((arpn)arnv0).a.t();
                            return;
                        }
                        return;
                    }
                    case 3: {
                        arpn.d.h("onStreamReceived", new Object[0]);
                        arkq arkq0 = ((arpn)this.q).a.a(hkyj.c);
                        this.e.put(v1, arkq0);
                        arnu arnu0 = new arnu(cuwu0.m.b(), arkq0.b());
                        this.t.put(v1, arnu0);
                        return;
                    }
                    default: {
                        aqql0.f("Invalid payload type: %s", new Object[]{v2});
                        return;
                    }
                }
            }
            aqql0.h("Already shutdown. Ignoring received payload %d", new Object[]{long0});
        }
    }

    protected final void g(PayloadTransferUpdate payloadTransferUpdate0) {
        synchronized(this) {
            aqql aqql0 = arot.a;
            aqql0.d("callbackThread: onPayloadTransferUpdate (id=%s)", new Object[]{((long)payloadTransferUpdate0.a)});
            if(this.z) {
                aqql0.h("Already shutdown. Ignoring update for payload %d", new Object[]{((long)payloadTransferUpdate0.a)});
                return;
            }
            if(this.C && payloadTransferUpdate0.a == ((cuwu)this.B.element()).i) {
                this.m(payloadTransferUpdate0);
                return;
            }
            this.l(payloadTransferUpdate0);
        }
    }

    final void h(byte[] arr_b, arli arli0) {
        arot.a.d("sendBytesWithListener", new Object[0]);
        cuwu cuwu0 = cuwu.b(arr_b);
        this.e.put(cuwu0.i, arli0);
        this.d(cuwu0);
    }

    final void i(InputStream inputStream0, arli arli0) {
        arot.a.d("sendStream", new Object[0]);
        cuwu cuwu0 = cuwu.h(inputStream0);
        this.e.put(cuwu0.i, arli0);
        this.d(cuwu0);
    }

    final void j(InputStream inputStream0, long v, arli arli0) {
        arot.a.d("sendStreamWithPayloadId, payloadId=%d", new Object[]{v});
        cuwu cuwu0 = new cuwu(v, 3, null, null, new cuwt(null, inputStream0));
        this.e.put(cuwu0.i, arli0);
        this.d(cuwu0);
    }

    final void k() {
        synchronized(this) {
            aqql aqql0 = arot.a;
            aqql0.d("shutdown", new Object[0]);
            if(this.z) {
                aqql0.d("Already shutdown. Nothing to do.", new Object[0]);
                return;
            }
            this.z = true;
            this.b.t();
            aqql0.h("Stopped all endpoints", new Object[0]);
        }
    }

    private final void l(PayloadTransferUpdate payloadTransferUpdate0) {
        synchronized(this) {
            aqql aqql0 = arot.a;
            aqql0.d("callbackThread: onPayloadReceivingUpdate(status=%d, id=%d)", new Object[]{((int)payloadTransferUpdate0.b), ((long)payloadTransferUpdate0.a)});
            LongSparseArray longSparseArray0 = this.t;
            long v1 = payloadTransferUpdate0.a;
            arnu arnu0 = (arnu)longSparseArray0.get(v1);
            if(arnu0 != null) {
                LongSparseArray longSparseArray1 = this.e;
                arli arli0 = (arli)longSparseArray1.get(v1);
                int v2 = payloadTransferUpdate0.b;
                switch(v2) {
                    case 1: {
                        aqql0.j("Successfully received payload (id=%d).", new Object[]{v1});
                        longSparseArray0.remove(v1);
                        longSparseArray1.remove(v1);
                        if(arli0 != null) {
                            arli0.a(1);
                        }
                        if(hqnd.e()) {
                            arot.o(arnu0, v1, payloadTransferUpdate0.b);
                            return;
                        }
                        break;
                    }
                    case 2: {
                        aqql0.f("Failed to send payload (id=%d)! Transport will shut down soon.", new Object[]{v1});
                        if(hqnd.e()) {
                            arot.o(arnu0, v1, payloadTransferUpdate0.b);
                            return;
                        }
                        break;
                    }
                    case 3: {
                        try {
                            long v3 = payloadTransferUpdate0.d - arnu0.c;
                            Long long0 = v3;
                            aqql0.j("Received %d bytes from stream payload (id=%d)", new Object[]{long0, v1});
                            byte[] arr_b = new byte[((int)v3)];
                            int v4 = arnu0.a.read(arr_b);
                            if(((long)v4) != v3) {
                                aqql0.f("Expected %d bytes from incoming stream but got %d bytes!", new Object[]{long0, v4});
                            }
                            arnu0.b.write(arr_b, 0, v4);
                            arnu0.c += v3;
                            return;
                        }
                        catch(IOException iOException0) {
                            arot.a.g("Failed to copy received bytes from stream payload (id=%d).", iOException0, new Object[]{v1});
                            if(arli0 != null) {
                                arli0.a(3);
                                return;
                            }
                            break;
                        }
                    }
                    case 4: {
                        aqql0.f("Payload cancelled. Should not happen!", new Object[0]);
                        if(hqnd.e()) {
                            arot.o(arnu0, v1, payloadTransferUpdate0.b);
                            return;
                        }
                        break;
                    }
                    default: {
                        aqql0.f("Invalid PayloadTransferUpdate status: %d. Ignoring.", new Object[]{v2});
                    }
                }
            }
        }
    }

    private final void m(PayloadTransferUpdate payloadTransferUpdate0) {
        synchronized(this) {
            aqql aqql0 = arot.a;
            aqql0.d("callbackThread: onPayloadSendingUpdate(status=%d, id=%d)", new Object[]{((int)payloadTransferUpdate0.b), ((long)payloadTransferUpdate0.a)});
            int v1 = payloadTransferUpdate0.b;
            if(v1 != 3) {
                long v2 = payloadTransferUpdate0.a;
                switch(v1) {
                    case 1: {
                        aqql0.j("Successfully send payload (id=%d).", new Object[]{v2});
                        LongSparseArray longSparseArray0 = this.e;
                        arli arli0 = (arli)longSparseArray0.get(v2);
                        if(arli0 != null) {
                            arli0.a(1);
                            longSparseArray0.delete(v2);
                        }
                        this.C = false;
                        this.B.remove();
                        this.n();
                        return;
                    }
                    case 2: {
                        aqql0.f("Failed to send payload (id=%d)! Transport will shut down soon.", new Object[]{v2});
                        return;
                    }
                    case 4: {
                        aqql0.f("Payload cancelled. Should not happen!", new Object[0]);
                        return;
                    }
                    default: {
                        aqql0.f("Unexpected PayloadTransferUpdate status: %d. Ignoring.", new Object[]{v1});
                    }
                }
            }
        }
    }

    private final void n() {
        synchronized(this) {
            if(!this.z && !this.C) {
                Queue queue0 = this.B;
                if(!queue0.isEmpty()) {
                    String s = this.A;
                    if(s != null) {
                        this.C = true;
                        cuwu cuwu0 = (cuwu)queue0.element();
                        evql evql0 = this.b.k(s, cuwu0);
                        evql0.b(new arnd());
                        evql0.A(new arnl());
                    }
                }
            }
        }
    }

    private static final void o(arnu arnu0, long v, int v1) {
        arot.a.d("Closing streams for payload %d due to: %s", new Object[]{v, v1});
        try {
            InputStream inputStream0 = arnu0.a;
            if(inputStream0 != null) {
                inputStream0.close();
            }
        }
        catch(IOException iOException0) {
            arot.a.m("Error closing input stream for payload %d: %s", new Object[]{v, iOException0});
        }
        try {
            arnu0.b.close();
        }
        catch(IOException iOException1) {
            arot.a.m("Error closing output stream for payload %d: %s", new Object[]{v, iOException1});
        }
    }
}

