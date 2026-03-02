import android.os.PersistableBundle;

public final class fnct implements scz {
    public final boolean a;
    public final String b;
    public final gged_interceptors c;

    public fnct() {
        this(false, null, ggna.a);
    }

    public fnct(boolean z, String s, gged_interceptors gged0) {
        ibuq.f(gged0, "allowedDomains");
        super();
        this.a = z;
        this.b = s;
        this.c = gged0;
    }

    @Override  // scz
    public final PersistableBundle a() {
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putBoolean("suppress_account_provisioning", this.a);
        persistableBundle0.putString("flow_params", this.b);
        persistableBundle0.putStringArray("allowed_domains", ((String[])this.c.toArray(new String[0])));
        return persistableBundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fnct)) {
            return false;
        }
        if(this.a != ((fnct)object0).a) {
            return false;
        }
        return ibuq.m(this.b, ((fnct)object0).b) ? ibuq.m(this.c, ((fnct)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.b == null ? 0 : this.b.hashCode();
        return this.a ? (0x9511 + v) * 0x1F + this.c.hashCode() : (0x95CB + v) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "ManagedAccountFlowArguments(suppressDeviceManagement=" + this.a + ", managedAccountFlowParam=" + this.b + ", allowedDomains=" + this.c + ")";
    }
}

