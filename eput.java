import android.content.Context;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import java.util.Arrays;
import java.util.List;

final class eput extends bxoi {
    private final String a;
    private final int b;
    private final String c;
    private final RecordConsentRequest d;
    private final epub f;

    public eput(String s, int v, String s1, RecordConsentRequest recordConsentRequest0, epub epub0) {
        super(44, "RecordConsent");
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = recordConsentRequest0;
        this.f = epub0;
    }

    @Override  // cjtm
    public final void f(Context context0) {
        List list0 = Arrays.asList(this.d.c);
        bxke bxke0 = bxke.b(this.d.b, list0);
        bxke0.i(this.a, this.b);
        bxke0.e(gqvm.d);
        bxke0.g(ajol.b);
        bxke0.p(this.c);
        TokenRequest tokenRequest0 = bxke0.a();
        Status status0 = new epvh(context0).a(tokenRequest0).b() ? Status.b : new Status(13);
        this.f.e(status0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.f.e(status0);
    }
}

