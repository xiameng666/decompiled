import android.graphics.Bitmap;

public final class byon {
    public final Bitmap a;
    public final String b;
    public final String c;
    public final String d;
    public final byap e;
    public final CharSequence f;

    public byon(Bitmap bitmap0, String s, String s1, String s2, byap byap0, CharSequence charSequence0) {
        ibuq.f(bitmap0, "providerIcon");
        ibuq.f(s, "providerName");
        ibuq.f(s1, "displayTitleText");
        super();
        this.a = bitmap0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = byap0;
        this.f = charSequence0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof byon)) {
            return false;
        }
        if(!ibuq.m(this.a, ((byon)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((byon)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((byon)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((byon)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((byon)object0).e) ? ibuq.m(this.f, ((byon)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + (this.d == null ? 0 : this.d.hashCode())) * 0x1F + this.e.hashCode()) * 0x1F;
        CharSequence charSequence0 = this.f;
        if(charSequence0 != null) {
            v = charSequence0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "BiometricDisplayInfo(providerIcon=" + this.a + ", providerName=" + this.b + ", displayTitleText=" + this.c + ", descriptionForCredential=" + this.d + ", biometricRequestInfo=" + this.e + ", displaySubtitleText=" + this.f + ")";
    }
}

