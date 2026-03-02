import j..util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class syc extends LinkedHashMap implements Serializable, Iterable, Map {
    public final byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        for(Object object0: this) {
            ((syd)object0).b(byteArrayOutputStream0);
        }
        return byteArrayOutputStream0.toByteArray();
    }

    public final syd b(syf syf0) {
        return (syd)this.get(syf0);
    }

    public final syd c(syf syf0) {
        syd syd0 = this.b(syf0);
        if(syd0 != null) {
            return syd0;
        }
        for(Object object0: this.values()) {
            syd syd1 = (syd)object0;
            if(syd1.a.a()) {
                syd0 = syc.d(syd1, syf0);
            }
            if(syd0 != null) {
                break;
            }
        }
        return syd0;
    }

    public static syd d(syd syd0, syf syf0) {
        Iterator iterator0 = syd0.iterator();
        syd syd1 = null;
        while(iterator0.hasNext() && syd1 == null) {
            Object object0 = iterator0.next();
            syd syd2 = (syd)object0;
            syf syf1 = syd2.a;
            if(syf1.equals(syf0)) {
                syd1 = syd2;
            }
            else {
                if(!syf1.a()) {
                    continue;
                }
                syd1 = syc.d(syd2, syf0);
            }
        }
        return syd1;
    }

    public final void e(syd syd0) {
        if(syd0 == null) {
            throw new IllegalArgumentException("The provided TLV is null");
        }
        this.put(syd0.a, syd0);
    }

    @Override
    public final Iterator iterator() {
        return DesugarCollections.unmodifiableCollection(this.values()).iterator();
    }

    @Override
    public final String toString() {
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(this.a());
        StringWriter stringWriter0 = new StringWriter();
        while(true) {
            try {
                if(byteArrayInputStream0.available() <= 0) {
                    break;
                }
                syg.a(byteArrayInputStream0, stringWriter0, 0);
            }
            catch(IOException iOException0) {
                syg.a.m(iOException0);
                break;
            }
        }
        return stringWriter0.toString();
    }
}

