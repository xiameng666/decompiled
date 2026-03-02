import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import java.util.ArrayList;

public final class ahiw implements aerh {
    public final Context a;
    public final agpp b;
    public final String c;
    public final Credential d;
    public final String e;
    public final agqf f;
    public static final int g;
    private final bxod h;
    private final agsh i;

    static {
        aggi.a("SaveOperation");
    }

    public ahiw(Context context0, String s, Credential credential0, String s1, bxod bxod0) {
        this.a = context0;
        this.i = agsh.a();
        this.f = agpq.b(context0);
        this.b = agpq.a(context0);
        this.c = s;
        this.d = credential0;
        this.e = s1;
        this.h = bxod0;
    }

    public static gfsx a(Credential credential0) {
        return gggq.c(aeny.b(), new ahif(credential0));
    }

    @Override  // aerh
    public final bxnj b() {
        return bxnj.r;
    }

    @Override  // aerh
    public final gmcd c(aerq aerq0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)givq.a).v_newBuilder();
        Credential credential0 = this.d;
        String s = credential0.f;
        if(TextUtils.isEmpty(s)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((givq)hftp0.b_message).c = 1;
            ((givq)hftp0.b_message).b |= 1;
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((givq)hftp0.b_message).c = 2;
            ((givq)hftp0.b_message).b |= 1;
            int v = "https://accounts.google.com".equals(s) ? 2 : 3;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((givq)hftp0.b_message).d = v - 1;
            ((givq)hftp0.b_message).b |= 2;
        }
        bxod bxod0 = this.h;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        String s1 = this.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s1.getClass();
        ((gixr)hftv0).b |= 2;
        ((gixr)hftv0).e = s1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gixr)hftp1.b_message).d = 20;
        ((gixr)hftp1.b_message).b |= 1;
        givq givq0 = (givq)hftp0.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp1.b_message;
        givq0.getClass();
        gixr0.v = givq0;
        gixr0.b |= 0x80000;
        bxod0.a(((gixr)hftp1.N_build()));
        if(!((Boolean)aeru.a.b()).booleanValue() || hyyy.a.b().a().contains("auth_api_credentials")) {
            throw bxma.e(0x6F10);
        }
        if("https://accounts.google.com".equals(s) && !ahiw.a(credential0).i()) {
            throw bxma.e(0x6F19);
        }
        gmcd gmcd0 = new agzj(this.a).c(aerq0);
        return glzd.g(glzd.g(gmcd0, new ahig(this, aerq0), gmap.a), new ahih(this, aerq0, gmcd0), gmap.a);
    }

    public final gmcd d(aerq aerq0, Iterable iterable0) {
        String s = this.c;
        this.i.b(s, true);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            gftb.check(((InternalCredentialWrapper)object0).b);
            bxie bxie0 = aeny.a(((InternalCredentialWrapper)object0).b);
            gmcd gmcd0 = this.b.c(bxie0, s, ((InternalCredentialWrapper)object0).a);
            aerq0.b(bxnj.ag, gmcd0);
            arrayList0.add(gmcd0);
        }
        return gmbu.c(arrayList0).a(new glzq(), gmap.a);
    }
}

