import com.google.android.gms.cast.CredentialsData;
import j..util.Objects;

public final class audj implements ausb {
    public String a;
    public String b;
    public String[] c;
    public CredentialsData d;
    final audm e;

    public audj(audm audm0) {
        Objects.requireNonNull(audm0);
        this.e = audm0;
        super();
    }

    @Override  // ausb
    public final void a(String s, long v, int v1, Object object0, long v2, long v3) {
        if(v1 != 0) {
            String s1 = this.a;
            aucd aucd0 = this.e.m;
            if(v1 == 0x9AA) {
                aubq aubq0 = new aubq(aucd0);
                aucd0.l.post(aubq0);
                v1 = 0x9AA;
            }
            aucd0.M(v1, s1, null);
        }
    }

    @Override  // ausb
    public final void b(String s, long v, long v1, long v2) {
    }
}

