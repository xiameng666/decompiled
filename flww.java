import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;

public final class flww {
    public static gfsx a(hnqr hnqr0, AccountContext accountContext0, Context context0, Map map0, flsl flsl0) {
        gfsx gfsx0 = flxc.c(gfsx.m((hnqr0.c == null ? hnub.a : hnqr0.c)), accountContext0, context0, map0, flsl0);
        if(gfsx0.i()) {
            fmga fmga0 = ((flub)gfsx0.d()).g();
            fmfm fmfm0 = new fmfm(fmga0);
            if(!fmga0.k.a().equals(fmfz.c)) {
                boolean z = true;
                fmfr fmfr0 = fmga0.f;
                if(fmfr0.a() != 5) {
                    if(fmga0.j != -1 && fmfr0.a() == 1) {
                        fmfm0.b = fmcs.d(ByteString.copyFrom(Base64.encode(hnqr0.toBytesArray(), 8)));
                    }
                    ggdy ggdy0 = new ggdy();
                    for(Object object0: hnqr0.d) {
                        gfsx gfsx1 = flwv.a(((hnqn)object0));
                        if(gfsx1.i()) {
                            ggdy0.i(gfsx1.d());
                            Object object1 = gfsx1.d();
                            fmft fmft0 = fmfm0.a().g;
                            int v = fmga0.r;
                            ConversationId conversationId0 = fmga0.c;
                            fmei fmei0 = (fmei)object1;
                        alab1:
                            switch(fmei0.a) {
                                case 3: {
                                    switch(v) {
                                        case 0: {
                                            throw null;
                                        }
                                        case 1: {
                                            ContactId contactId0 = conversationId0.a();
                                            if(!((fmcg)fmei0.b).a.a.contains(contactId0)) {
                                                continue;
                                            }
                                            fmfm0.k(fmft.d);
                                            break alab1;
                                        }
                                        default: {
                                            fmfm0.k(fmft.j);
                                            break alab1;
                                        }
                                    }
                                }
                                case 4: {
                                    switch(v) {
                                        case 0: {
                                            throw null;
                                        }
                                        case 1: {
                                            fmft fmft1 = fmft.b;
                                            if(!fmft0.equals(fmft1)) {
                                                continue;
                                            }
                                            ContactId contactId1 = conversationId0.a();
                                            if(!((fmcg)fmei0.b).a.a.contains(contactId1)) {
                                                continue;
                                            }
                                            fmfm0.k(fmft1);
                                            break alab1;
                                        }
                                        default: {
                                            if(fmft0.equals(fmft.j) || fmft0.equals(fmft.k)) {
                                                continue;
                                            }
                                            fmfm0.k(fmft.i);
                                            break alab1;
                                        }
                                    }
                                }
                                case 5: {
                                    switch(v) {
                                        case 0: {
                                            throw null;
                                        }
                                        case 2: {
                                            if(!fmft.m.contains(fmft0)) {
                                                continue;
                                            }
                                            fmfm0.k(fmft.h);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    gged_interceptors gged0 = ggdy0.h();
                    fmga fmga1 = fmfm0.a();
                    if(gged0 == null) {
                        throw new NullPointerException("Null annotations");
                    }
                    ConversationId conversationId1 = fmga0.c;
                alab2:
                    switch(fmga1.r) {
                        case 0: {
                            throw null;
                        }
                        case 2: {
                            break;
                        }
                        default: {
                            int v1 = ((ggna)gged0).c;
                            for(int v2 = 0; v2 < v1; ++v2) {
                                fmei fmei1 = (fmei)gged0.get(v2);
                                if(fmei1.a == 4) {
                                    ContactId contactId2 = conversationId1.a();
                                    if(!((fmcg)fmei1.b).a.a.contains(contactId2)) {
                                        continue;
                                    }
                                    break alab2;
                                }
                            }
                            goto label_67;
                        }
                    }
                    z = false;
                label_67:
                    gfsx gfsx2 = gfsx.l(((flub)gfsx0.d()).a);
                    return gfsx.m(new fmel(fmga1, gged0, gfsx.m(Boolean.valueOf(z)), gfsx2));
                }
            }
        }
        return gfqx.a;
    }
}

