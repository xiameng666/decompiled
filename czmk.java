import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiScanner.ChannelSpec;
import android.net.wifi.WifiScanner.ScanSettings;
import android.net.wifi.WifiScanner;
import android.net.wifi.aware.WifiAwareManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j..util.Collection.-EL;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class czmk {
    public static final byte[] a;
    private static final byte[] b;

    static {
        czmk.b = "0123456789abcdef".getBytes(StandardCharsets.US_ASCII);
        czmk.a = new byte[]{0, 0, 0, 0, 0, 0};
    }

    public static void A(czlg czlg0, String s, String s1) {
        if(czlg0 == null) {
            return;
        }
        try {
            czlg0.close();
        }
        catch(IOException iOException0) {
            czkq.a.e().f(iOException0).i("Failed to close %sSocket %s", s, s1);
            return;
        }
        czkq.a.d().i("Closed %sSocket %s", s, s1);
    }

    public static void B(ServerSocket serverSocket0, String s, String s1) {
        try {
            serverSocket0.close();
        }
        catch(IOException iOException0) {
            czkq.a.e().f(iOException0).i("Failed to close %sSocket %s", s, s1);
            return;
        }
        czkq.a.d().i("Closed %sSocket %s", s, s1);
    }

    public static void C(Socket socket0, String s, String s1) {
        if(socket0 == null) {
            return;
        }
        try {
            socket0.close();
        }
        catch(IOException iOException0) {
            czkq.a.e().f(iOException0).i("Failed to close %sSocket %s", s, s1);
            return;
        }
        czkq.a.d().i("Closed %sSocket %s", s, s1);
    }

    public static void D(Socket socket0) {
        try {
            int v = (int)hvog.a.bk().cN();
            socket0.setReceiveBufferSize(v);
            czkq.a.b().i("Socket receive buffer size: Requested %d and returned %d", Integer.valueOf(v), Integer.valueOf(socket0.getReceiveBufferSize()));
        }
        catch(Exception exception0) {
            if((exception0 instanceof RuntimeException)) {
                throw (RuntimeException)exception0;
            }
            czkq.a.c().f(exception0).p("Exception when initializing socket receive buffer", new Object[0]);
        }
    }

    public static void E(Socket socket0) {
        try {
            int v = (int)hvog.a.bk().cO();
            socket0.setSendBufferSize(v);
            czkq.a.b().i("Socket send buffer size: Requested %d and returned %d", Integer.valueOf(v), Integer.valueOf(socket0.getSendBufferSize()));
        }
        catch(Exception exception0) {
            if((exception0 instanceof RuntimeException)) {
                throw (RuntimeException)exception0;
            }
            czkq.a.c().f(exception0).p("Exception when initializing socket send buffer", new Object[0]);
        }
    }

    public static void F(Socket socket0) {
        if(hvol.a.r().aK()) {
            try {
                int v = (int)hvog.a.bk().eq();
                socket0.setSoTimeout(v);
                czkq.a.d().i("Set SO_TIMEOUT(%d) for %s", Integer.valueOf(v), socket0);
            }
            catch(SocketException socketException0) {
                czkq.a.e().f(socketException0).h("Failed to setSoTimeout for %s", socket0);
            }
        }
    }

    public static void G() {
        bbfj.b(0x2600);
    }

    public static boolean H(int v, List list0) {
        if(!hvol.a.r().P()) {
            return true;
        }
        return list0 == null || list0.isEmpty() ? false : list0.contains(Integer.valueOf(v));
    }

    public static boolean I(int v) {
        return v >= 0x96C && v <= 0x9B4;
    }

    public static boolean J(int v) {
        return v >= 5160 && v <= 0x16FD;
    }

    public static boolean K(int v) {
        return czmk.J(v) || czmk.L(v);
    }

    public static boolean L(int v) {
        return v >= 5955 && v <= 7115;
    }

    public static boolean M(Context context0) {
        switch(czmk.b(((WifiManager)context0.getApplicationContext().getSystemService("wifi")))) {
            case 12: 
            case 13: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean N(WifiManager wifiManager0) {
        switch(czmk.b(wifiManager0)) {
            case 12: 
            case 13: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static boolean O(Context context0) {
        WifiAwareManager wifiAwareManager0 = (WifiAwareManager)context0.getSystemService("wifiaware");
        return wifiAwareManager0 != null && wifiAwareManager0.isDeviceAttached();
    }

    public static boolean P(int v) {
        return v >= 5260 && v <= 5720;
    }

    public static boolean Q(WifiManager wifiManager0) {
        try {
            if(bbqa.d()) {
                return wifiManager0.isDualBandSimultaneousSupported();
            }
        }
        catch(NoSuchMethodError noSuchMethodError0) {
            czkq.a.e().f(noSuchMethodError0).p("WifiManager: failed to call isDualBandSimultaneousSupported!", new Object[0]);
        }
        try {
            Object object0 = new cuni(wifiManager0).a("isDualBandSupported", new Class[0]).a(new Object[0]);
            if(object0 != null && ((Boolean)object0).booleanValue()) {
                return true;
            }
        }
        catch(cunj unused_ex) {
        }
        return false;
    }

    public static boolean R(String s) {
        return s.length() >= 2 ? s.charAt(0) == 34 && s.charAt(s.length() - 1) == 34 : false;
    }

    public static boolean S(byte[] arr_b) {
        Class class0 = czmk.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(arr_b == null) {
            FIN.finallyCodeBegin$NT(v);
            return true;
        }
        try {
            InetAddress inetAddress0 = InetAddress.getByAddress(arr_b);
            long v1 = SystemClock.elapsedRealtime();
            long v2 = hvog.a.bk().ak();
            if(inetAddress0.isReachable(((int)v2))) {
                czkq.a.b().i("IP(%s) is reachable, took %dms", inetAddress0, Long.valueOf(SystemClock.elapsedRealtime() - v1));
                FIN.finallyExec$NT(v);
                return true;
            }
            long v3 = SystemClock.elapsedRealtime() - v1;
            if(v3 >= v2) {
                czkq.a.b().i("Ping IP(%s) timeout, took %dms", inetAddress0, Long.valueOf(v3));
                FIN.finallyExec$NT(v);
                return true;
            }
            czkq.a.b().i("IP(%s) is not reachable, took %dms", inetAddress0, Long.valueOf(v3));
            FIN.finallyExec$NT(v);
        }
        catch(IOException unused_ex) {
            czkq.a.b().p("IP address is illegal or not reachable.", new Object[0]);
            FIN.finallyExec$NT(v);
        }
        return false;
    }

    public static boolean T(String s) {
        return s.contains("_RECONNECT");
    }

    public static boolean U(String s) {
        return s.contains("_UPGRADE");
    }

    public static boolean V(String s) {
        if(!s.equals("0.0.0.0") && !s.equals("127.0.0.1")) {
            try {
                glvt.b(s);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                czkq.a.b().f(illegalArgumentException0).h("Gateway address %s is invalid.", s);
                return false;
            }
            try {
                if(!(InetAddress.getByName(s) instanceof Inet4Address)) {
                    goto label_11;
                }
                return true;
            }
            catch(UnknownHostException unknownHostException0) {
                czkq.a.b().f(unknownHostException0).p("Unable to configure static ip.", new Object[0]);
                return false;
            }
        label_11:
            czkq.a.b().h("Gateway address %s is not ipv4.", s);
            return false;
        }
        czkq.a.b().h("Gateway address %s is invalid.", s);
        return false;
    }

    public static boolean W(int v) {
        return czmk.I(v) || czmk.J(v);
    }

    public static byte[] X(int v) {
        byte[] arr_b = new byte[v];
        new SecureRandom().nextBytes(arr_b);
        return arr_b;
    }

    public static byte[] Y(byte[] arr_b, int v) {
        byte[] arr_b1 = bbmq.ab(arr_b, "SHA-256");
        if(arr_b1 != null) {
            return Arrays.copyOf(arr_b1, v);
        }
        throw new NullPointerException("Array.copyOf got a null input");
    }

    public static byte[] Z(String s) {
        byte[] arr_b = null;
        if(s != null && !s.isEmpty()) {
            List list0 = gfud.e(':').n(s);
            if(list0.size() == 6) {
                if(list0.isEmpty()) {
                    return null;
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                for(Object object0: list0) {
                    stringBuilder0.append(((String)object0));
                }
                String s1 = stringBuilder0.toString();
                int v = s1.length();
                if(v != 0) {
                    if(v % 2 != 0) {
                        return null;
                    }
                    arr_b = new byte[v / 2];
                    for(int v1 = 0; v1 < v; v1 += 2) {
                        arr_b[v1 / 2] = (byte)((Character.digit(s1.charAt(v1), 16) << 4) + Character.digit(s1.charAt(v1 + 1), 16));
                    }
                }
            }
        }
        return arr_b;
    }

    public static int a(String s) {
        return ((int)((((long)glwy.c(czmk.Y(s.getBytes(), 0x20))) & 0xFFFFFFFFL) % 0x3FFFL)) + 0xC000;
    }

    public static void aa(BluetoothServerSocket bluetoothServerSocket0, String s) {
        if(bluetoothServerSocket0 == null) {
            return;
        }
        try {
            bluetoothServerSocket0.close();
        }
        catch(IOException iOException0) {
            czkq.a.e().f(iOException0).i("Failed to close %sSocket %s", "BluetoothClassic", s);
            return;
        }
        czkq.a.d().i("Closed %sSocket %s", "BluetoothClassic", s);
    }

    public static String ab() {
        return czmk.h(8);
    }

    public static gywn ac(int v) {
        switch(v - 1) {
            case 1: {
                return gywn.b;
            }
            case 2: {
                return gywn.c;
            }
            case 3: {
                return gywn.d;
            }
            default: {
                return gywn.a;
            }
        }
    }

    public static int ad(int v) {
        if(czmk.L(v)) {
            return 4;
        }
        if(czmk.J(v)) {
            return 3;
        }
        return czmk.I(v) ? 2 : 1;
    }

    public static int ae(gyat gyat0) {
        int v = gyat0.g;
        if(v == -2) {
            return 2;
        }
        switch(v) {
            case -4: {
                return 4;
            }
            case -3: {
                return 3;
            }
            default: {
                return czmk.ad(v);
            }
        }
    }

    public static ScanResult af(dadn dadn0, String s, int v, int v1, WorkSource workSource0) {
        long v3;
        WifiScanner wifiScanner0 = (WifiScanner)dadn0.a.getSystemService(WifiScanner.class);
        WifiScanner.ScanSettings wifiScanner$ScanSettings0 = new WifiScanner.ScanSettings();
        int v2 = 0;
        if(v1 == -1) {
            switch(v) {
                case 1: {
                    wifiScanner$ScanSettings0.band = 3;
                    v3 = TimeUnit.SECONDS.toMillis(hvog.a.bk().dZ());
                    break;
                }
                case 3: {
                    wifiScanner$ScanSettings0.band = 2;
                    v3 = TimeUnit.SECONDS.toMillis(hvog.a.bk().ea());
                    break;
                }
                case 4: {
                    wifiScanner$ScanSettings0.band = 8;
                    v3 = TimeUnit.SECONDS.toMillis(hvog.a.bk().ea());
                    break;
                }
                default: {
                    wifiScanner$ScanSettings0.band = 1;
                    v3 = TimeUnit.SECONDS.toMillis(hvog.a.bk().ea());
                }
            }
        }
        else {
            wifiScanner$ScanSettings0.band = 0;
            wifiScanner$ScanSettings0.channels = new WifiScanner.ChannelSpec[]{new WifiScanner.ChannelSpec(v1)};
            v3 = hvog.a.bk().eb();
        }
        if(hvol.be() && bbqa.c() && wifiScanner0 != null && wifiScanner0.isScanning()) {
            v3 += hvog.a.bk().cP();
        }
        cunf cunf0 = czkq.a;
        cunf cunf1 = cunf0.b();
        String s1 = gywy.a(v);
        if(v == 0) {
            throw null;
        }
        cunf1.j("[WifiRadio] scanForChannels band: %s, frequency: %d, timeoutMillis: %d", s1, Integer.valueOf(v1), Long.valueOf(v3));
        gged_interceptors gged0 = dadn0.a(wifiScanner0, wifiScanner$ScanSettings0, v3, workSource0);
        int v4 = gged0.size();
        while(v2 < v4) {
            ScanResult scanResult0 = (ScanResult)gged0.get(v2);
            ++v2;
            if(scanResult0.SSID.equals(s)) {
                cunf0.d().h("Successfully get SSID of network %s", s);
                return scanResult0;
            }
        }
        return null;
    }

    private static List ag(gged_interceptors gged0, int v) {
        List list0 = new ArrayList();
        if(!gged0.isEmpty()) {
            int v1 = 0;
            int v2 = 0;
            int v3 = 0;
            while(v1 < gged0.size()) {
                if(v2 != v3 && ((int)(((Integer)gged0.get(v1)))) - ((int)(((Integer)gged0.get(v1 - 1)))) != v) {
                    if(v3 == v2 - 1) {
                        list0.add(((Integer)gged0.get(v3)).toString());
                    }
                    else {
                        list0.add(gged0.get(v3) + ".." + gged0.get(v2 - 1));
                    }
                    v2 = v1;
                    v3 = v2;
                    --v1;
                }
                else {
                    ++v2;
                }
                ++v1;
            }
            if(v1 == gged0.size()) {
                if(v3 == v2 - 1) {
                    list0.add(((Integer)gged0.get(v3)).toString());
                    return list0;
                }
                list0.add(gged0.get(v3) + ".." + gged0.get(v2 - 1));
            }
        }
        return list0;
    }

    public static int b(WifiManager wifiManager0) {
        return wifiManager0 == null ? 0 : wifiManager0.getWifiApState();
    }

    public static gybo c(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gybo.a).v_newBuilder();
        if(!TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gybo gybo0 = (gybo)hftp0.b_message;
            s.getClass();
            gybo0.b |= 1;
            gybo0.c = s;
            if(s.startsWith("+")) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gybo)hftp0.b_message).d = 1;
                ((gybo)hftp0.b_message).b |= 2;
                return (gybo)hftp0.N_build();
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gybo)hftp0.b_message).d = 2;
            ((gybo)hftp0.b_message).b |= 2;
        }
        return (gybo)hftp0.N_build();
    }

    public static gywn d(int v) {
        if(czmk.L(v)) {
            return gywn.d;
        }
        if(czmk.J(v)) {
            return gywn.c;
        }
        return czmk.I(v) ? gywn.b : gywn.a;
    }

    public static String e(byte[] arr_b, String s) {
        return String.format("%s%s", gfta.b(s), new String(arr_b, StandardCharsets.UTF_8));
    }

    public static String f(Iterable iterable0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: iterable0) {
            stringBuilder0.append(czmk.g(((byte[])object0)));
        }
        return stringBuilder0.toString();
    }

    public static String g(byte[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        byte[] arr_b1 = new byte[arr_b.length * 5];
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            arr_b1[v * 5] = 0x30;
            arr_b1[v * 5 + 1] = 120;
            arr_b1[v * 5 + 2] = czmk.b[(v1 & 0xFF) >>> 4];
            arr_b1[v * 5 + 3] = czmk.b[v1 & 15];
            arr_b1[v * 5 + 4] = 0x20;
        }
        return "[ " + new String(arr_b1, StandardCharsets.UTF_8) + "]";
    }

    public static String h(int v) {
        if(hvol.X()) {
            String s = czmk.i(Math.max(v, 8));
            czkq.a.b().h("WFD Generated random string: %s", s);
            return s;
        }
        return czmk.i(Math.max(v, 8));
    }

    public static String i(int v) {
        byte[] arr_b = czmk.X(v);
        if(hvol.X()) {
            String s = bboy.e(arr_b).substring(0, v);
            czkq.a.b().h("Hotspot Generated random string: %s", s);
            return s;
        }
        return bboy.e(arr_b).substring(0, v);
    }

    public static String j(int v, String s) {
        return String.format("%s%s", gfta.b(s), czmk.i(Math.max(v, 4)));
    }

    public static String k(int v) {
        return czmk.j(v, "DIRECT-");
    }

    public static String l(Context context0) {
        WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
        String s = null;
        if(hvol.a.r().aE() && bbqa.c() && wifiManager0 != null) {
            try {
                s = wifiManager0.getCountryCode();
            }
            catch(SecurityException securityException0) {
                if(gxyh.d(context0)) {
                    czkq.a.c().f(securityException0).p("Unable to get WiFi\'s country code", new Object[0]);
                }
                else {
                    czkq.a.b().p("Unable to get WiFi\'s country code, it may because location is off.", new Object[0]);
                }
            }
        }
        if(s != null) {
            return s;
        }
        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
        if(telephonyManager0 != null) {
            String s1 = telephonyManager0.getNetworkCountryIso();
            return TextUtils.isEmpty(s1) ? "" : gfqz.d(s1);
        }
        return "";
    }

    public static String m(Context context0) {
        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
        return telephonyManager0 == null ? "" : telephonyManager0.getNetworkOperator();
    }

    public static String n(int v) {
        switch(v) {
            case 1: {
                return "BYTES";
            }
            case 2: {
                return "FILE";
            }
            case 3: {
                return "STREAM";
            }
            default: {
                return a.f(v, "UNKNOWN[", "]");
            }
        }
    }

    public static String o(int v) {
        switch(v) {
            case -1: {
                return "ULTRA_LOW";
            }
            case 1: {
                return "LOW";
            }
            case 2: {
                return "BALANCED";
            }
            case 3: {
                return "HIGH";
            }
            default: {
                return "UNSPECIFIED";
            }
        }
    }

    public static String p(int v) {
        switch(v) {
            case 1: {
                return "STA";
            }
            case 2: {
                return "WIFI_DIRECT_GROUP_CLIENT";
            }
            case 3: {
                return "WIFI_DIRECT_GROUP_OWNER";
            }
            default: {
                return "WIFI_AWARE";
            }
        }
    }

    public static String q(String s) {
        return czmk.R(s) ? s : a.a(s, "\"", "\"");
    }

    public static String r(String s, String s1) {
        if(s1 == null) {
            return s;
        }
        if(!s.startsWith(s1)) {
            return null;
        }
        List list0 = gfud.g(s1).n(s);
        return list0.size() != 2 || ((String)list0.get(1)).length() != 4 ? null : ((String)list0.get(1));
    }

    public static String s(String s) {
        return czmk.R(s) ? s.substring(1, s.length() - 1) : s;
    }

    public static String t(String s) {
        return s.contains("_RECONNECT") ? s.substring(0, s.indexOf("_RECONNECT")) : s;
    }

    public static String u(String s) {
        return s.contains("_UPGRADE") ? s.substring(0, s.indexOf("_UPGRADE")) : s;
    }

    public static String v(String s) {
        return s + "_RECONNECT";
    }

    public static String w(String s) {
        return s + "_UPGRADE";
    }

    public static InetAddress x(int v) {
        return InetAddress.getByAddress(new byte[]{((byte)(v & 0xFF)), ((byte)(v >> 8 & 0xFF)), ((byte)(v >> 16 & 0xFF)), ((byte)(v >> 24 & 0xFF))});
    }

    public static List y(List list0) {
        List list1 = new ArrayList();
        list1.addAll(czmk.ag(((gged_interceptors)Collection.-EL.stream(list0).filter(new czma()).sorted().collect(ggaf.a)), 5));
        list1.addAll(czmk.ag(((gged_interceptors)Collection.-EL.stream(list0).filter(new czmb()).sorted().collect(ggaf.a)), 20));
        list1.addAll(czmk.ag(((gged_interceptors)Collection.-EL.stream(list0).filter(new czmc()).sorted().collect(ggaf.a)), 20));
        return list1;
    }

    public static void z(BluetoothSocket bluetoothSocket0, String s, String s1) {
        if(bluetoothSocket0 == null) {
            return;
        }
        try {
            bluetoothSocket0.close();
        }
        catch(IOException iOException0) {
            czkq.a.e().f(iOException0).i("Failed to close %sSocket %s", s, s1);
            return;
        }
        czkq.a.d().i("Closed %sSocket %s", s, s1);
    }
}

