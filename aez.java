import androidx.appsearch.safeparcel.GenericDocumentParcel;
import androidx.appsearch.safeparcel.PropertyParcel;
import j..util.Objects;

public final class aez {
    public final ajl a;
    public final aez b;

    public aez(afa afa0) {
        ajl ajl0 = new ajl(afa0.a);
        super();
        this.a = (ajl)Objects.requireNonNull(ajl0);
        this.b = this;
    }

    public aez(String s, String s1, String s2) {
        kay.i(s);
        kay.i(s1);
        kay.i(s2);
        this.b = this;
        this.a = new ajl(s, s1, s2);
    }

    public final aez a(String s, afa[] arr_afa) {
        kay.i(s);
        aez.l(s);
        GenericDocumentParcel[] arr_genericDocumentParcel = new GenericDocumentParcel[arr_afa.length];
        int v = 0;
        while(v < arr_afa.length) {
            afa afa0 = arr_afa[v];
            if(afa0 == null) {
                throw new IllegalArgumentException(a.f(v, "The document at ", " is null."));
            }
            arr_genericDocumentParcel[v] = afa0.a;
            ++v;
            continue;
        }
        aju aju0 = new aju(s);
        aju0.d(arr_genericDocumentParcel);
        PropertyParcel propertyParcel0 = aju0.a();
        this.a.b(s, propertyParcel0);
        return this.b;
    }

    public final aez b(String s, String[] arr_s) {
        kay.i(s);
        kay.i(arr_s);
        aez.l(s);
        int v = 0;
        while(v < arr_s.length) {
            if(arr_s[v] == null) {
                throw new IllegalArgumentException(a.f(v, "The String at ", " is null."));
            }
            ++v;
            continue;
        }
        aju aju0 = new aju(s);
        aju0.h(arr_s);
        PropertyParcel propertyParcel0 = aju0.a();
        this.a.b(s, propertyParcel0);
        return this.b;
    }

    public final aez c(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Document score cannot be negative.");
        }
        this.a.b = v;
        return this.b;
    }

    public final aez d(long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("Document ttlMillis cannot be negative.");
        }
        this.a.d(v);
        return this.b;
    }

    public final afa e() {
        return new afa(this.a.a());
    }

    public final void f(String s) {
        kay.i(s);
        Objects.requireNonNull(s);
        this.a.c.remove(s);
    }

    public final void g(long v) {
        this.a.a = v;
    }

    public final void h(String s, boolean[] arr_z) {
        kay.i(s);
        kay.i(arr_z);
        aez.l(s);
        aju aju0 = new aju(s);
        aju0.b(arr_z);
        PropertyParcel propertyParcel0 = aju0.a();
        this.a.b(s, propertyParcel0);
    }

    public final void i(String s, byte[][] arr2_b) {
        kay.i(s);
        kay.i(arr2_b);
        aez.l(s);
        int v = 0;
        while(v < arr2_b.length) {
            if(arr2_b[v] == null) {
                throw new IllegalArgumentException(a.f(v, "The byte[] at ", " is null."));
            }
            ++v;
            continue;
        }
        aju aju0 = new aju(s);
        aju0.c(arr2_b);
        PropertyParcel propertyParcel0 = aju0.a();
        this.a.b(s, propertyParcel0);
    }

    public final void j(String s, double[] arr_f) {
        kay.i(s);
        kay.i(arr_f);
        aez.l(s);
        aju aju0 = new aju(s);
        aju0.e(arr_f);
        PropertyParcel propertyParcel0 = aju0.a();
        this.a.b(s, propertyParcel0);
    }

    public final void k(String s, long[] arr_v) {
        kay.i(s);
        kay.i(arr_v);
        aez.l(s);
        aju aju0 = new aju(s);
        aju0.g(arr_v);
        PropertyParcel propertyParcel0 = aju0.a();
        this.a.b(s, propertyParcel0);
    }

    public static final void l(String s) {
        if(!s.isEmpty()) {
            return;
        }
        throw new IllegalArgumentException("Property name cannot be blank.");
    }
}

