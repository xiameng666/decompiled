import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId.IdType;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import j..util.DesugarCollections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class flwi {
    public final flvd a;
    public final Context b;
    public final flsl c;
    public final flce d;
    public final flvw e;
    public final Map f;

    public flwi(flvd flvd0, Context context0, Map map0) {
        this.a = flvd0;
        this.b = context0;
        this.c = flsl.a(context0);
        this.d = flce.c();
        this.e = new flvw();
        this.f = map0;
    }

    public final gfsx a(AccountContext accountContext0, String s) {
        fmai fmai0 = fmaj.a();
        fmai0.g(10107);
        fmaj fmaj0 = fmai0.a();
        this.c.b(fmaj0);
        try {
            hntq hntq0 = flwi.e(s);
            flbj.a("TyMsgClient", "LighterConversationIntent: " + hntq0);
            hnry hnry0 = hntq0.c == null ? hnry.a : hntq0.c;
            boolean z = false;
            flbj.a("TyMsgClient", "lighterId type: " + hnta.c((hnta.b(hnry0.b) == 0 ? 1 : hnta.b(hnry0.b))));
            fmew fmew0 = new fmew();
            fmew0.b(accountContext0.c().f());
            int v = hnta.b(hnry0.b) == 0 ? 1 : hnta.b(hnry0.b);
            if(v - 2 != 1 && v - 2 != 2) {
                switch(v - 2) {
                    case 3: {
                        fmew0.d(flxa.a(hnry0));
                        break;
                    }
                    case 4: {
                        fmex fmex0 = new fmex();
                        fmex0.c(hnry0.c);
                        fmex0.b(hnry0.e);
                        fmew0.c(fmex0.a());
                        break;
                    }
                    default: {
                        flbj.c("TyMsgClient", "LighterId type is default.");
                        return gfqx.a;
                    }
                }
            }
            else {
                fmew0.d(flxa.a(hnry0));
                z = true;
            }
            fmeu fmeu0 = fmev.a();
            fmeu0.e(hntq0.k);
            fmeu0.g(fmew0.a());
            fmeu0.i(-1L);
            fmeu0.b(ggkm.n(DesugarCollections.unmodifiableMap(hntq0.d), new flwb()));
            fmeu0.c(z);
            return gfsx.m(fmeu0.a());
        }
        catch(IllegalArgumentException | hfur exception0) {
            fmai fmai1 = fmaj.a();
            fmai1.g(10108);
            fmaj fmaj1 = fmai1.a();
            this.c.b(fmaj1);
            flbj.d("TyMsgClient", "Unable to parse intent args", exception0);
            return gfqx.a;
        }
    }

    public final gmcd b(AccountContext accountContext0, ConversationId conversationId0, ByteString hfsf0, List list0, flqw flqw0) {
        return this.c(accountContext0, conversationId0, hfsf0, list0, flqw0, false);
    }

    public final gmcd c(AccountContext accountContext0, ConversationId conversationId0, ByteString hfsf0, List list0, flqw flqw0, boolean z) {
        if(list0.size() <= 0) {
            return gmbx.a;
        }
        hnry hnry0 = flwi.d(conversationId0);
        flyr flyr0 = new flyr(this.b, accountContext0, conversationId0, hfsf0, list0, hnry0, z);
        fmai fmai0 = fmaj.a();
        fmai0.g(18);
        fmai0.n(accountContext0.c().f());
        fmai0.o(accountContext0.d().toStringUtf8());
        fmai0.p(flyr0.a);
        fmai0.d(conversationId0);
        fmaj fmaj0 = fmai0.a();
        this.c.b(fmaj0);
        UUID uUID0 = UUID.randomUUID();
        gmcd gmcd0 = this.a.d.d();
        gmcd gmcd1 = this.a.b(uUID0, flyr0, gmcd0, accountContext0, flqw0, true);
        gmbu.t(gmcd1, new flwd(this, accountContext0, flyr0, conversationId0), gmap.a);
        return gmcd1;
    }

    public static hnry d(ConversationId conversationId0) {
        if(conversationId0.e() == ConversationId.IdType.a) {
            return flxa.b(conversationId0.c());
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnry.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnry)hftp0.b_message).b = 4;
        String s = conversationId0.d().b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnry)hftp0.b_message).c = s;
        String s1 = conversationId0.d().a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnry)hftp0.b_message).e = s1;
        return (hnry)hftp0.N_build();
    }

    public static hntq e(String s) {
        byte[] arr_b = Base64.decode(s, 8);
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hntq.a), arr_b, 0, arr_b.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        return (hntq)hftv0;
    }
}

