import android.os.SystemProperties;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public final class ezwr {
    public static final baun a;
    private static final gfud b;

    static {
        ezwr.a = fabk.c("PackageMetadatas");
        ezwr.b = gfud.e('|').d();
    }

    public static hlnk a(fafu fafu0) {
        hlnj hlnj0 = (hlnj)((ProtoLiteMessage)hlnk.a).v_newBuilder();
        hlnj0.a(fafu0.b);
        hlnj0.k(fafu0.c);
        if(fafu0.d.size() != 0) {
            long v = fafu0.d.a(0);
            if(!hlnj0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlnj0).ensureMutable();
            }
            ((hlnk)hlnj0.b_message).d = v;
        }
        String s = fafu0.e;
        if(!hlnj0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlnj0).ensureMutable();
        }
        hlnk hlnk0 = (hlnk)hlnj0.b_message;
        s.getClass();
        hlnk0.f = s;
        return (hlnk)((ProtoLiteBuilder)hlnj0).N_build();
    }

    public static hlnn b(File file0) {
        FileInputStream fileInputStream0 = new FileInputStream(file0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlnn.a).v_newBuilder();
        hftp0.H(fileInputStream0, hftc.a());
        return (hlnn)hftp0.N_build();
    }

    public static hlnn c(String s) {
        if(hvyr.c()) {
            try {
                return ezwr.b((hrnt.i() ? new File(ccsb.a.d(s, "metadata.pb")) : new File(s, "metadata.pb")));
            }
            catch(IOException iOException0) {
                ezwr.a.g("Error parsing metadata.pb, falling back on metadata.", iOException0, new Object[0]);
            }
        }
        return hrnt.i() ? ezwr.e(new File(ccsb.a.d(s, "metadata"))) : ezwr.e(new File(s, "metadata"));
    }

    public static hlnn d(Map map0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlnn.a).v_newBuilder();
        int v = ezwr.j(gfta.b(((String)map0.get("ota-type"))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hlnn)hftp0.b_message).c = v - 2;
        boolean z = "yes".equals(map0.get("ota-downgrade"));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hlnn)hftp0.b_message).d = z;
        hlnk hlnk0 = ezwr.k("pre-", map0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlnn hlnn0 = (hlnn)hftp0.b_message;
        hlnk0.getClass();
        hlnn0.e = hlnk0;
        hlnn0.b |= 1;
        hlnk hlnk1 = ezwr.k("post-", map0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlnn hlnn1 = (hlnn)hftp0.b_message;
        hlnk1.getClass();
        hlnn1.f = hlnk1;
        hlnn1.b |= 2;
        return (hlnn)hftp0.N_build();
    }

    public static hlnn e(File file0) {
        return ezwr.d(ezwr.f(new FileReader(file0)));
    }

    public static Map f(Reader reader0) {
        BufferedReader bufferedReader0 = new BufferedReader(reader0);
        Map map0 = new HashMap();
        String s;
        while((s = bufferedReader0.readLine()) != null) {
            gfrx gfrx0 = gfrw.b;
            String s1 = gfrx0.q(s);
            if(!s1.isEmpty() && s1.charAt(0) != 35) {
                String[] arr_s = s1.split("=");
                if(arr_s.length == 2) {
                    ((HashMap)map0).put(gfrx0.q(arr_s[0]), gfrx0.q(arr_s[1]));
                }
                else {
                    ezwr.a.f("Mal-formatted line: %s.", new Object[]{s1});
                }
            }
        }
        return map0;
    }

    public static boolean g(hlnn hlnn0) {
        int v = hlnn0.c;
        if(v != 0) {
            switch(v) {
                case 1: {
                    return false;
                }
                case 2: {
                    return false;
                }
                case 3: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean h(hlnn hlnn0) {
        hlnk hlnk0 = hlnn0.f == null ? hlnk.a : hlnn0.f;
        if(hlnk0.c.isEmpty()) {
            if(!hwax.c()) {
                ezwr.a.f("It isn\'t supported to parse the partition states.", new Object[0]);
                return false;
            }
            if(hlnk0.g.isEmpty()) {
                ezwr.a.f("Ota metadata doesn\'t contain per-partition device states.", new Object[0]);
                return false;
            }
            for(Object object0: hlnk0.g) {
                hlno hlno0 = (hlno)object0;
                String s = hlno0.b;
                if(!s.equals("boot")) {
                    String s1 = SystemProperties.get(String.format("ro.%s.build.fingerprint", s), "");
                    if(gfta.c(s1)) {
                        ezwr.a.f("Unknown current build fingerprint for partition %s.", new Object[]{s});
                        return false;
                    }
                    String s2 = SystemProperties.get(String.format("ro.%s.build.date.utc", s), "");
                    if(gfta.c(s2)) {
                        ezwr.a.f("Invalid build timestamp for partition %s.", new Object[]{s});
                        return false;
                    }
                    if(!hlno0.c.contains(s1) || !hlno0.d.equals(s2)) {
                        ezwr.a.h("Fingerprint or version for %s doesn\'t match the value in metadata.", new Object[]{s});
                        return false;
                    }
                }
            }
            return true;
        }
        String s3 = SystemProperties.get("ro.build.fingerprint", "");
        if(gfta.c(s3)) {
            ezwr.a.f("Unknown current build fingerprint.", new Object[0]);
            return false;
        }
        Long long0 = glxd.k(SystemProperties.get("ro.build.date.utc", ""));
        if(long0 == null) {
            Object[] arr_object = {SystemProperties.get("ro.build.date.utc", "")};
            ezwr.a.f("Invalid current build timestamp %s.", arr_object);
            return false;
        }
        return hlnk0.c.contains(s3) && hlnk0.d == ((long)long0);
    }

    public static boolean i(hlnn hlnn0) {
        long v = (hlnn0.f == null ? hlnk.a : hlnn0.f).d;
        if(Long.compare(v, 0L) == 0) {
            baun baun0 = ezwr.a;
            baun0.h("Unknown build timestamp in package metadata, checking per-partition versions.", new Object[0]);
            hlnk hlnk0 = hlnn0.f == null ? hlnk.a : hlnn0.f;
            boolean z = hlnn0.d;
            if(!hwax.c()) {
                baun0.f("It isn\'t supported to parse the partition states.", new Object[0]);
                return true;
            }
            if(hlnk0.g.isEmpty()) {
                baun0.f("Ota metadata doesn\'t contain per-partition device states.", new Object[0]);
                return true;
            }
            for(Object object0: hlnk0.g) {
                hlno hlno0 = (hlno)object0;
                String s = hlno0.b;
                if(!s.equals("boot")) {
                    Long long0 = glxd.k(SystemProperties.get(String.format("ro.%s.build.date.utc", s), ""));
                    if(long0 == null) {
                        baun0.f("Invalid build timestamp for partition %s.", new Object[]{s});
                        return true;
                    }
                    Long long1 = glxd.k(hlno0.d);
                    if(long1 == null) {
                        baun0.f("Failed to get the timestamp in ota metadata for partition %s.", new Object[]{s});
                        return true;
                    }
                    if(((long)long0) > ((long)long1) && !z) {
                        baun0.f("Unintentional downgrade detected, partition timestamp: %d, package timestamp: %d.", new Object[]{long0, long1});
                        return true;
                    }
                }
            }
            return false;
        }
        Long long2 = glxd.k(SystemProperties.get("ro.build.date.utc", ""));
        if(long2 == null) {
            Object[] arr_object = {SystemProperties.get("ro.build.date.utc", "")};
            ezwr.a.f("Invalid current build timestamp %s.", arr_object);
            return true;
        }
        if(hlnn0.d) {
            ezwr.a.h("Intentionally downgrading package.", new Object[0]);
            return false;
        }
        if(((long)long2) <= v) {
            return false;
        }
        if(SystemProperties.getBoolean("ro.ota.allow_downgrade", false) && SystemProperties.getBoolean("ro.debuggable", false)) {
            ezwr.a.h("Downgrade allowed by %s.", new Object[]{"ro.ota.allow_downgrade"});
            return false;
        }
        return true;
    }

    public static int j(String s) {
        switch(gfqz.c(s)) {
            case "ab": {
                return 3;
            }
            case "block": {
                return 4;
            }
            case "brick": {
                return 5;
            }
            default: {
                ezwr.a.f("Unrecongized OTA type in metadata: " + s, new Object[0]);
                return 2;
            }
        }
    }

    private static hlnk k(String s, Map map0) {
        hlnj hlnj0 = (hlnj)((ProtoLiteMessage)hlnk.a).v_newBuilder();
        hlnj0.a(ezwr.b.l(gfta.b(((String)map0.get(s + "build")))));
        hlnj0.k(ezwr.b.l(gfta.b(((String)map0.get(s + "device")))));
        Long long0 = glxd.k(gfta.b(((String)map0.get(s + "timestamp"))));
        if(long0 != null) {
            long v = (long)long0;
            if(!hlnj0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlnj0).ensureMutable();
            }
            ((hlnk)hlnj0.b_message).d = v;
        }
        String s1 = gfta.b(((String)map0.get(s + "security-patch-level")));
        if(!s1.isEmpty()) {
            if(!hlnj0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlnj0).ensureMutable();
            }
            ((hlnk)hlnj0.b_message).f = s1;
        }
        return (hlnk)((ProtoLiteBuilder)hlnj0).N_build();
    }
}

