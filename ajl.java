import androidx.appsearch.safeparcel.GenericDocumentParcel;
import androidx.appsearch.safeparcel.PropertyParcel;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ajl {
    public long a;
    public int b;
    public Map c;
    private String d;
    private String e;
    private String f;
    private long g;
    private List h;

    public ajl(GenericDocumentParcel genericDocumentParcel0) {
        Objects.requireNonNull(genericDocumentParcel0);
        this.d = genericDocumentParcel0.a;
        this.e = genericDocumentParcel0.b;
        this.f = genericDocumentParcel0.c;
        this.a = genericDocumentParcel0.d;
        this.g = genericDocumentParcel0.e;
        this.b = genericDocumentParcel0.f;
        this.c = new bxd(genericDocumentParcel0.i.size());
        for(Object object0: genericDocumentParcel0.i.values()) {
            this.c.put(((PropertyParcel)object0).a, ((PropertyParcel)object0));
        }
        this.h = genericDocumentParcel0.h;
    }

    public ajl(String s, String s1, String s2) {
        this.d = (String)Objects.requireNonNull(s);
        this.e = (String)Objects.requireNonNull(s1);
        this.f = (String)Objects.requireNonNull(s2);
        this.a = -1L;
        this.g = 0L;
        this.b = 0;
        this.c = new bxd();
    }

    public final GenericDocumentParcel a() {
        long v = this.a;
        if(v == -1L) {
            v = System.currentTimeMillis();
            this.a = v;
        }
        return new GenericDocumentParcel(this.d, this.e, this.f, v, this.g, this.b, new ArrayList(this.c.values()), this.h);
    }

    public final void b(String s, PropertyParcel propertyParcel0) {
        Objects.requireNonNull(propertyParcel0);
        this.c.put(s, propertyParcel0);
    }

    public final void c(List list0) {
        if(list0 == null) {
            this.h = null;
            return;
        }
        this.h = new ArrayList(list0);
    }

    public final void d(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("Document ttlMillis cannot be negative.");
        }
        this.g = v;
    }
}

