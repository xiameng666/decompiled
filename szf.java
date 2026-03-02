import j..util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class szf extends LinkedHashMap implements Serializable, Iterable, Map {
    public final byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        for(Object object0: this) {
            ((szg)object0).c(byteArrayOutputStream0);
        }
        return byteArrayOutputStream0.toByteArray();
    }

    public final szg b(szi szi0) {
        return (szg)this.get(szi0);
    }

    public final szg c(szi szi0) {
        szg szg0 = this.b(szi0);
        if(szg0 != null) {
            return szg0;
        }
        for(Object object0: this.values()) {
            szg szg1 = (szg)object0;
            if(szg1.a.a()) {
                szg0 = szf.d(szg1, szi0);
            }
            if(szg0 != null) {
                break;
            }
        }
        return szg0;
    }

    public static szg d(szg szg0, szi szi0) {
        Iterator iterator0 = szg0.iterator();
        szg szg1 = null;
        while(iterator0.hasNext() && szg1 == null) {
            Object object0 = iterator0.next();
            szg szg2 = (szg)object0;
            szi szi1 = szg2.a;
            if(szi1.equals(szi0)) {
                szg1 = szg2;
            }
            else {
                if(!szi1.a()) {
                    continue;
                }
                szg1 = szf.d(szg2, szi0);
            }
        }
        return szg1;
    }

    public final void e(szg szg0) {
        if(szg0 == null) {
            throw new IllegalArgumentException("The provided TLV is null");
        }
        this.put(szg0.a, szg0);
    }

    @Override
    public final Iterator iterator() {
        return DesugarCollections.unmodifiableCollection(this.values()).iterator();
    }

    @Override
    public final String toString() {
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(this.a());
        StringWriter stringWriter0 = new StringWriter();
        try {
            while(byteArrayInputStream0.available() > 0) {
                szj.a(byteArrayInputStream0, stringWriter0, 0);
            }
            return stringWriter0.toString();
        }
        catch(IOException unused_ex) {
            return stringWriter0.toString();
        }
    }
}

