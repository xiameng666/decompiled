import java.util.List;

public final class jfl {
    public final String a;
    public final String b;
    private final List c;
    private final int d;

    public jfl() {
        this.a = "com.google.android.gms.fonts";
        this.b = "com.google.android.gms";
        this.c = null;
        this.d = 0x7F03001D;  // array:com_google_android_gms_fonts_certs
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jfl)) {
            return false;
        }
        if(!ibuq.m(this.a, ((jfl)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((jfl)object0).b) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 961 + 0x7F03001D;  // array:com_google_android_gms_fonts_certs
    }
}

