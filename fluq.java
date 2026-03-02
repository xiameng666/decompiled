import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import j..util.Objects;
import java.util.UUID;

public final class fluq implements glzn {
    public final flvd a;
    public final UUID b;
    public final int c;
    public final flzo d;
    public final boolean e;
    public final gmcd f;
    public final ContactId g;
    public final AccountContext h;
    public final fmbl i;

    public fluq(flvd flvd0, UUID uUID0, int v, flzo flzo0, boolean z, gmcd gmcd0, ContactId contactId0, AccountContext accountContext0, fmbl fmbl0) {
        this.a = flvd0;
        this.b = uUID0;
        this.c = v;
        this.d = flzo0;
        this.e = z;
        this.f = gmcd0;
        this.g = contactId0;
        this.h = accountContext0;
        this.i = fmbl0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Object object1;
        Void void0 = (Void)object0;
        flvd flvd0 = this.a;
        gmcd gmcd0 = this.e ? flvd0.a(this.f, this.g) : this.f;
        flzo flzo0 = this.d;
        int v = this.c;
        UUID uUID0 = this.b;
        if(v == 1) {
            Objects.requireNonNull(flzo0);
            object1 = new flui(flzo0).apply(((hnxl)flvr.a(flvd0.a, uUID0).N_build()));
            goto label_30;
        }
        AccountContext accountContext0 = this.h;
        if(v == 0 && accountContext0 != null) {
            Objects.requireNonNull(flzo0);
            object1 = flvd0.e(uUID0, new flui(flzo0), accountContext0);
            goto label_30;
        }
        if(v == 2 && accountContext0 != null) {
            fmbl fmbl0 = this.i;
            if(fmbl0 != null) {
                Objects.requireNonNull(flzo0);
                flui flui0 = new flui(flzo0);
                byte[] arr_b = glwl.e(fmbl0.b);
                ProtoLiteBuilder hftp0 = flvr.b(flvd0.a, arr_b, uUID0);
                hnxb hnxb0 = flwu.c(accountContext0.c().f());
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnxl hnxl0 = (hnxl)hftp0.b_message;
                hnxb0.getClass();
                hnxl0.h = hnxb0;
                hnxl0.b |= 2;
                object1 = flui0.apply(((hnxl)hftp0.N_build()));
            label_30:
                gmcu gmcu0 = new gmcu();
                gmcd gmcd1 = glzd.f(glzd.g(((gmcd)object1), new fluj(uUID0, gmcu0, flzo0, gmcd0), gmap.a), new fluk(uUID0, flzo0), gmap.a);
                return gmbu.b(new gmcd[]{gmcd1}).b(new flul(flvd0, gmcu0, gmcd1, flzo0, uUID0), gmap.a);
            }
        }
        return gmbu.h(new RuntimeException("Invalid RequestType: " + v));
    }
}

