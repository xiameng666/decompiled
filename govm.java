import android.text.TextUtils;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.ProviderUserInfoList;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class govm implements goxl {
    final goyp a;
    final GetAccountInfoUser b;
    final goxa c;
    final GetTokenResponse d;
    final goxk e;

    public govm(gowy gowy0, goyp goyp0, GetAccountInfoUser getAccountInfoUser0, goxa goxa0, GetTokenResponse getTokenResponse0, goxk goxk0) {
        this.a = goyp0;
        this.b = getAccountInfoUser0;
        this.c = goxa0;
        this.d = getTokenResponse0;
        this.e = goxk0;
        Objects.requireNonNull(gowy0);
        super();
    }

    @Override  // goxk
    public final void a(String s) {
        this.e.a(s);
    }

    @Override  // goxl
    public final void b(Object object0) {
        goyp goyp0 = this.a;
        List list0 = null;
        if(goyp0.b("EMAIL")) {
            this.b.b = null;
        }
        else {
            String s = goyp0.a;
            if(s != null) {
                this.b.b = s;
            }
        }
        if(goyp0.b("DISPLAY_NAME")) {
            this.b.d = null;
        }
        else {
            String s1 = goyp0.c;
            if(s1 != null) {
                this.b.d = s1;
            }
        }
        if(goyp0.b("PHOTO_URL")) {
            this.b.e = null;
        }
        else {
            String s2 = goyp0.d;
            if(s2 != null) {
                this.b.e = s2;
            }
        }
        if(!TextUtils.isEmpty(goyp0.b)) {
            String s3 = bbmu.a("redacted".getBytes());
            batl.q(s3);
            this.b.g = s3;
        }
        ProviderUserInfoList providerUserInfoList0 = ((goyq)object0).b;
        if(providerUserInfoList0 != null) {
            list0 = providerUserInfoList0.a;
        }
        if(list0 == null) {
            list0 = new ArrayList();
        }
        GetAccountInfoUser getAccountInfoUser0 = this.b;
        getAccountInfoUser0.f = new ProviderUserInfoList();
        getAccountInfoUser0.f.a.addAll(list0);
        goxa goxa0 = this.c;
        GetTokenResponse getTokenResponse0 = this.d;
        batl.s(getTokenResponse0);
        batl.s(((goyq)object0));
        String s4 = ((goyq)object0).c;
        String s5 = ((goyq)object0).d;
        if(!TextUtils.isEmpty(s4) && !TextUtils.isEmpty(s5)) {
            getTokenResponse0 = new GetTokenResponse(s5, s4, ((long)((goyq)object0).e), getTokenResponse0.d);
        }
        goxa0.d(getTokenResponse0, getAccountInfoUser0);
    }
}

