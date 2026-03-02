import android.net.IpConfiguration.IpAssignment;
import android.net.LinkAddress;
import android.net.StaticIpConfiguration.Builder;
import android.net.StaticIpConfiguration;
import android.net.wifi.WifiConfiguration;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;

public final class dagr {
    public static LinkAddress a(String s) {
        InetAddress inetAddress0;
        String s1 = String.format("%s.%s", s.substring(0, s.lastIndexOf(".")), ((int)(new SecureRandom().nextInt(0xFD) + 2)));
        try {
            inetAddress0 = InetAddress.getByName(s1);
        }
        catch(UnknownHostException unknownHostException0) {
            czkq.a.b().f(unknownHostException0).p("Unable to configure static ip.", new Object[0]);
            return null;
        }
        byte[] arr_b = inetAddress0.getAddress();
        int v = arr_b[arr_b.length - 1];
        if(v != 0 && (v != -1 && v != 1)) {
            return new LinkAddress(s1 + "/24");
        }
        czkq.a.b().h("Generate static IP address %s failed.", s1);
        return null;
    }

    public static InetAddress b(String s) {
        if(s != null && !s.equals("0.0.0.0") && !s.equals("127.0.0.1")) {
            try {
                glvt.b(s);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                czkq.a.b().f(illegalArgumentException0).h("Address %s is invalid.", s);
                return null;
            }
            try {
                return InetAddress.getByName(s);
            }
            catch(UnknownHostException unknownHostException0) {
                czkq.a.b().f(unknownHostException0).h("Address %s is invalid.", s);
                return null;
            }
        }
        czkq.a.b().h("Address %s is invalid.", s);
        return null;
    }

    public static boolean c(WifiConfiguration wifiConfiguration0, String s, LinkAddress linkAddress0) {
        IpConfiguration.IpAssignment ipConfiguration$IpAssignment0;
        StaticIpConfiguration staticIpConfiguration0;
        czkq.a.d().p("Configuring static ip for lollipop and higher.", new Object[0]);
        Class class0 = StaticIpConfiguration.class;
        try {
            staticIpConfiguration0 = new StaticIpConfiguration.Builder().setIpAddress(linkAddress0).setGateway(InetAddress.getByName(s)).build();
        }
        catch(UnknownHostException unknownHostException0) {
            czkq.a.b().f(unknownHostException0).h("Unable to configure static ip with gateway %s.", s);
            return false;
        }
        try {
            new cuni(wifiConfiguration0).a("setStaticIpConfiguration", new Class[]{class0}).a(new Object[]{staticIpConfiguration0});
            ipConfiguration$IpAssignment0 = IpConfiguration.IpAssignment.STATIC;
        }
        catch(cunj cunj0) {
            czkq.a.b().f(cunj0).p("Unable to configure static ip.", new Object[0]);
            return false;
        }
        try {
            new cuni(wifiConfiguration0).a("setIpAssignment", new Class[]{ipConfiguration$IpAssignment0.getClass()}).a(new Object[]{ipConfiguration$IpAssignment0});
        }
        catch(cunj cunj1) {
            czkq.a.b().f(cunj1).p("Unable to configure static ip.", new Object[0]);
            return false;
        }
        czkq.a.b().p("Successfully configured static ip for lollipop and higher.", new Object[0]);
        return true;
    }

    public static WifiConfiguration d(String s, String s1) {
        WifiConfiguration wifiConfiguration0 = new WifiConfiguration();
        wifiConfiguration0.SSID = s;
        wifiConfiguration0.preSharedKey = s1;
        wifiConfiguration0.allowedAuthAlgorithms.set(0);
        wifiConfiguration0.allowedKeyManagement.set(1);
        return wifiConfiguration0;
    }
}

