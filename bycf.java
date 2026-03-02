import android.content.ComponentName;
import java.util.List;

public final class bycf {
    public List a;
    public ComponentName b;
    public ComponentName c;
    private final String d;

    public bycf(String s) {
        ibuq.f(s, "packageName");
        super();
        this.d = s;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bycf)) {
            return false;
        }
        if(!ibuq.m(this.d, ((bycf)object0).d)) {
            return false;
        }
        if(!ibuq.m(this.a, ((bycf)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((bycf)object0).b) ? ibuq.m(this.c, ((bycf)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.d.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.a == null ? 0 : this.a.hashCode();
        int v3 = this.b == null ? 0 : this.b.hashCode();
        ComponentName componentName0 = this.c;
        if(componentName0 != null) {
            v1 = componentName0.hashCode();
        }
        return ((v + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "CredentialProviderManifestMetadata(packageName=" + this.d + ", capabilities=" + this.a + ", credentialManagerEventsService=" + this.b + ", deviceSetupService=" + this.c + ")";
    }
}

