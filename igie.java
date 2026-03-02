import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import jeb.synthetic.FIN;

public final class igie implements igib {
    public final ClassLoader a;
    private final String b;
    private final Map c;
    private final Set d;

    public igie() {
        this(null);
    }

    public igie(byte[] arr_b) {
        this.b = "org/joda/time/tz/data/";
        this.a = this.getClass().getClassLoader();
        InputStream inputStream0 = this.c("ZoneInfoMap");
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
        int v = FIN.finallyOpen$NT();
        igie.e(dataInputStream0, concurrentHashMap0);
        try {
            FIN.finallyCodeBegin$NT(v);
        }
        catch(IOException unused_ex) {
        }
        concurrentHashMap0.put("UTC", new SoftReference(igcw.b));
        this.c = concurrentHashMap0;
        this.d = DesugarCollections.unmodifiableSortedSet(new TreeSet(concurrentHashMap0.keySet()));
    }

    @Override  // igib
    public final Set a() {
        return this.d;
    }

    @Override  // igib
    public final igcw b(String s) {
        if(s != null) {
            Object object0 = this.c.get(s);
            if(object0 != null) {
                if((object0 instanceof SoftReference)) {
                    igcw igcw0 = (igcw)((SoftReference)object0).get();
                    return igcw0 == null ? this.d(s) : igcw0;
                }
                return s.equals(object0) ? this.d(s) : this.b(((String)object0));
            }
        }
        return null;
    }

    private final InputStream c(String s) {
        String s1 = this.b + s;
        InputStream inputStream0 = (InputStream)AccessController.doPrivileged(new igid(this, s1));
        if(inputStream0 == null) {
            throw new IOException("Resource not found: \"" + s1 + "\" ClassLoader: " + (this.a == null ? "system" : this.a.toString()));
        }
        return inputStream0;
    }

    private final igcw d(String s) {
        igcw igcw0;
        InputStream inputStream1;
        InputStream inputStream0 = null;
        try {
            inputStream1 = null;
            inputStream1 = this.c(s);
            goto label_6;
        }
        catch(IOException iOException0) {
            goto label_11;
        }
        catch(Throwable throwable0) {
        }
        goto label_18;
        try {
            try {
            label_6:
                igcw0 = (inputStream1 instanceof DataInput) ? ighy.b(((DataInput)inputStream1), s) : ighy.b(new DataInputStream(inputStream1), s);
                SoftReference softReference0 = new SoftReference(igcw0);
                this.c.put(s, softReference0);
                goto label_21;
            }
            catch(IOException iOException0) {
            }
        label_11:
            iOException0.printStackTrace();
            this.c.remove(s);
            if(inputStream1 != null) {
                goto label_14;
            }
            return null;
        }
        catch(Throwable throwable0) {
            goto label_17;
        }
        try {
        label_14:
            inputStream1.close();
        }
        catch(IOException unused_ex) {
        }
        return null;
    label_17:
        inputStream0 = inputStream1;
    label_18:
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_21:
            inputStream1.close();
        }
        catch(IOException unused_ex) {
        }
        return igcw0;
    }

    private static void e(DataInputStream dataInputStream0, Map map0) {
        int v = dataInputStream0.readUnsignedShort();
        String[] arr_s = new String[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_s[v2] = dataInputStream0.readUTF().intern();
        }
        int v3 = dataInputStream0.readUnsignedShort();
        for(int v1 = 0; v1 < v3; ++v1) {
            try {
                map0.put(arr_s[dataInputStream0.readUnsignedShort()], arr_s[dataInputStream0.readUnsignedShort()]);
            }
            catch(ArrayIndexOutOfBoundsException unused_ex) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }
}

