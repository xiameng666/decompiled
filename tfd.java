import j..util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class tfd extends LinkedHashMap implements Serializable, Iterable, Map {
    public final byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        for(Object object0: this) {
            ((tfe)object0).b(byteArrayOutputStream0);
        }
        return byteArrayOutputStream0.toByteArray();
    }

    public final tfe b(tfg tfg0) {
        return (tfe)this.get(tfg0);
    }

    public final tfe c(tfg tfg0) {
        tfe tfe0 = this.b(tfg0);
        if(tfe0 != null) {
            return tfe0;
        }
        for(Object object0: this.values()) {
            tfe tfe1 = (tfe)object0;
            if(tfe1.a.a()) {
                tfe0 = tfd.d(tfe1, tfg0);
            }
            if(tfe0 != null) {
                break;
            }
        }
        return tfe0;
    }

    public static tfe d(tfe tfe0, tfg tfg0) {
        Iterator iterator0 = tfe0.iterator();
        tfe tfe1 = null;
        while(iterator0.hasNext() && tfe1 == null) {
            Object object0 = iterator0.next();
            tfe tfe2 = (tfe)object0;
            tfg tfg1 = tfe2.a;
            if(tfg1.equals(tfg0)) {
                tfe1 = tfe2;
            }
            else {
                if(!tfg1.a()) {
                    continue;
                }
                tfe1 = tfd.d(tfe2, tfg0);
            }
        }
        return tfe1;
    }

    public final void e(tfe tfe0) {
        if(tfe0 == null) {
            throw new IllegalArgumentException("The provided TLV is null");
        }
        this.put(tfe0.a, tfe0);
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
                tfh.a(byteArrayInputStream0, stringWriter0, 0);
            }
            catch(IOException iOException0) {
                tjk.e("Error: ", iOException0);
                break;
            }
        }
        return stringWriter0.toString();
    }
}

