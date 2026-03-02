import j..util.DesugarCollections;
import java.util.ArrayList;

public final class aclb implements glzn {
    public final acln a;
    public final gmcd b;

    public aclb(acln acln0, gmcd gmcd0) {
        this.a = acln0;
        this.b = gmcd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        acmr acmr0 = (acmr)object0;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)acmr0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)acmr0));
        ArrayList arrayList0 = new ArrayList(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((acmr)hftp0.b_message).c)).keySet());
        return glzd.g(gmbt.h(this.b), new aclm(this.a, arrayList0, hftp0), this.a.b);
    }
}

