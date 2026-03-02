import android.content.Context;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmke implements flwr {
    private final Context a;

    public fmke(Context context0) {
        this.a = context0;
    }

    @Override  // flwr
    public final fmfr a(AccountContext accountContext0, hnub hnub0) {
        fmlz fmlz0;
        int v1;
        String s = hnub0.i;
        if((hnsv.b(hnub0.n) == null ? hnsv.k : hnsv.b(hnub0.n)).equals(hnsv.j) && hnub0.e == 107) {
            Context context0 = this.a;
            fmfo fmfo0 = new fmfo();
            hnuo hnuo0 = (hnuo)hnub0.f;
            flsl flsl0 = flsl.a(context0);
            int v = hnuo0.d;
            switch(v) {
                case 0: {
                    v1 = 2;
                    break;
                }
                case 1: {
                    v1 = 3;
                    break;
                }
                case 2: {
                    v1 = 4;
                    break;
                }
                case 3: {
                    v1 = 5;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
            if(v1 == 0) {
                v1 = 1;
            }
            switch(v1 - 2) {
                case 1: {
                    fmlz0 = fmku.b(fmkl.b(accountContext0, context0, (hnuo0.b == 101 ? ((hnus)hnuo0.c) : hnus.a), s, flsl0));
                    break;
                }
                case 2: {
                    hnuu hnuu0 = hnuo0.b == 102 ? ((hnuu)hnuo0.c) : hnuu.a;
                    fmmc fmmc0 = new fmmc();
                    fmmc0.b(hnuu0.b);
                    fmmc0.a = fmkl.b(accountContext0, context0, (hnuu0.c == null ? hnus.a : hnuu0.c), s, flsl0);
                    fmlz0 = fmku.c(fmmc0.a());
                    break;
                }
                case 3: {
                    hnuj hnuj0 = hnuo0.b == 103 ? ((hnuj)hnuo0.c) : hnuj.a;
                    ggdy ggdy0 = new ggdy();
                    for(Object object0: hnuj0.d) {
                        ggdy0.i(fmkl.b(accountContext0, context0, ((hnus)object0), s, flsl0));
                    }
                    fmli fmli0 = new fmli();
                    fmli0.d(hnuj0.b);
                    fmli0.b(hnuj0.c);
                    fmli0.c(ggdy0.h());
                    fmlz0 = fmku.a(fmli0.a());
                    break;
                }
                default: {
                    throw new flwq("Got unknown rich card type: " + v, 0xDD);
                }
            }
            fmfo0.b(fmjs.b(fmlz0));
            fmfo0.c("rich_card");
            return fmcs.a(fmfo0.a());
        }
        flbj.c("RichCardMsgConv", "Attempted to convert non-rich card LighterMessage");
        return fmcs.d(ByteString.b);
    }

    @Override  // flwr
    public final gfsx b(JSONObject jSONObject0) {
        gfsx gfsx0;
        fmfo fmfo0 = new fmfo();
        try {
            fmfo0.c(jSONObject0.getString("TYPE"));
            JSONObject jSONObject1 = jSONObject0.getJSONObject("CONTENT");
            try {
                fmly fmly0 = fmly.a(jSONObject1.getInt("TYPE"));
                switch(fmly0.ordinal()) {
                    case 0: {
                        gfsx gfsx1 = fmmb.a(jSONObject1.getJSONObject("STACK_CARD"));
                        if(gfsx1.i()) {
                            gfsx0 = gfsx.m(fmku.b(((fmmb)gfsx1.d())));
                        }
                        else {
                            flbj.c(fmlz.a, "Failed to convert JSONObject to RichCard.");
                            gfsx0 = gfqx.a;
                        }
                        break;
                    }
                    case 1: {
                        gfsx gfsx2 = fmmd.a(jSONObject1.getString("STANDALONE_CARD"));
                        if(gfsx2.i()) {
                            gfsx0 = gfsx.m(fmku.c(((fmmd)gfsx2.d())));
                        }
                        else {
                            flbj.c(fmlz.a, "Failed to convert JSONObject to RichCard.");
                            gfsx0 = gfqx.a;
                        }
                        break;
                    }
                    case 2: {
                        gfsx gfsx3 = fmlj.a(jSONObject1.getString("CARD_CAROUSEL"));
                        if(gfsx3.i()) {
                            gfsx0 = gfsx.m(fmku.a(((fmlj)gfsx3.d())));
                        }
                        else {
                            flbj.c(fmlz.a, "Failed to convert JSONObject to RichCard.");
                            gfsx0 = gfqx.a;
                        }
                        break;
                    }
                    default: {
                        flbj.c(fmlz.a, "Failed to convert JSONObject to RichCard, unsupported type: " + fmly0.toString());
                        gfsx0 = gfqx.a;
                    }
                }
            }
            catch(JSONException jSONException1) {
                flbj.d(fmlz.a, "Failed to convert JSONObject to RichCard.", jSONException1);
                gfsx0 = gfqx.a;
            }
            if(!gfsx0.i()) {
                flbj.c("RichCardMsgConv", "Fail to convert json object to rich card");
                return gfqx.a;
            }
            fmfo0.b(fmjs.b(((fmlz)gfsx0.d())));
            return gfsx.m(fmfo0.a());
        }
        catch(JSONException jSONException0) {
            flbj.d("RichCardMsgConv", "Fail to convert json object to rich card due to ", jSONException0);
            return gfqx.a;
        }
    }

    @Override  // flwr
    public final gfsx c(fmfp fmfp0) {
        gfsx gfsx2;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("TYPE", fmfp0.a);
            gfsx gfsx0 = fmka.a(flbm.g(fmfp0.b));
            if(gfsx0.i()) {
                Object object0 = gfsx0.d();
                try {
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("TYPE", ((fmlz)object0).b().d);
                    switch(((fmlz)object0).b().ordinal()) {
                        case 0: {
                            gfsx gfsx1 = ((fmlz)object0).c().b();
                            if(gfsx1.i()) {
                                jSONObject1.put("STACK_CARD", gfsx1.d());
                                gfsx2 = gfsx.m(jSONObject1);
                                break;
                            }
                            else {
                                flbj.c("fmlz", "Failed to convert StackCard to JSONObject.");
                                gfsx2 = gfqx.a;
                            }
                            break;
                        }
                        case 1: {
                            gfsx gfsx3 = ((fmlz)object0).d().b();
                            if(gfsx3.i()) {
                                jSONObject1.put("STANDALONE_CARD", ((JSONObject)gfsx3.d()).toString());
                                gfsx2 = gfsx.m(jSONObject1);
                                break;
                            }
                            else {
                                flbj.c(fmlz.a, "Failed to convert StandaloneCard to JSONObject.");
                                gfsx2 = gfqx.a;
                            }
                            break;
                        }
                        case 2: {
                            gfsx gfsx4 = ((fmlz)object0).a().b();
                            if(gfsx4.i()) {
                                jSONObject1.put("CARD_CAROUSEL", ((JSONObject)gfsx4.d()).toString());
                                gfsx2 = gfsx.m(jSONObject1);
                            }
                            else {
                                flbj.c(fmlz.a, "Failed to convert CardCarousel to JSONObject.");
                                gfsx2 = gfqx.a;
                            }
                            break;
                        }
                        default: {
                            gfsx2 = gfsx.m(jSONObject1);
                            break;
                        }
                    }
                }
                catch(JSONException jSONException1) {
                    flbj.d("fmlz", "Failed to convert RichCard to JSONObject.", jSONException1);
                    gfsx2 = gfqx.a;
                }
                if(gfsx2.i()) {
                    jSONObject0.put("CONTENT", gfsx2.d());
                    return gfsx.m(jSONObject0);
                }
            }
        }
        catch(JSONException jSONException0) {
            flbj.d("RichCardMsgConv", "Fail to convert rich card to json object due to ", jSONException0);
        }
        return gfqx.a;
    }

    @Override  // flwr
    public final ProtoLiteBuilder d(fmga fmga0) {
        gfsx gfsx0 = fmjs.a(fmga0);
        if(!gfsx0.i()) {
            flbj.c("RichCardMsgConv", "Attempted to convert non-rich_card message");
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnub.a).v_newBuilder();
            hnsv hnsv0 = hnsv.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnub hnub0 = (hnub)hftp0.b_message;
            hnub0.n = hnsv0.a();
            return hftp0;
        }
        Object object0 = gfsx0.d();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnub.a).v_newBuilder();
        try {
            hnsv hnsv1 = hnsv.j;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hnub hnub1 = (hnub)hftp1.b_message;
            hnub1.n = hnsv1.a();
            if(((fmlz)object0).b().ordinal() != 0) {
                throw new IllegalArgumentException("Got unknown rich card model type");
            }
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnuo.a).v_newBuilder();
            fmmb fmmb0 = ((fmlz)object0).c();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hnus.a).v_newBuilder();
            fmkg fmkg0 = new fmkg();
            gged_interceptors gged0 = flbp.c(fmmb0.a, fmkg0);
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hnus hnus0 = (hnus)hftp3.b_message;
            hfuo hfuo0 = hnus0.b;
            if(!hfuo0.c()) {
                hnus0.b = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(gged0, hnus0.b);
            gfsx gfsx1 = fmmb0.b;
            if(gfsx1.i()) {
                int v = (int)(((Integer)gfsx1.d()));
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((hnus)hftp3.b_message).c = v;
            }
            hnus hnus1 = (hnus)hftp3.N_build();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            hnus1.getClass();
            ((hnuo)hftv0).c = hnus1;
            ((hnuo)hftv0).b = 101;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hnuo)hftp2.b_message).d = 1;
            hnuo hnuo0 = (hnuo)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hnub hnub2 = (hnub)hftp1.b_message;
            hnuo0.getClass();
            hnub2.f = hnuo0;
            hnub2.e = 107;
        }
        catch(Exception unused_ex) {
            flbj.c("RichCardMsgConv", "Failed to convert rich card model.");
            hnsv hnsv2 = hnsv.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hnub hnub3 = (hnub)hftp1.b_message;
            hnub3.n = hnsv2.a();
        }
        return hftp1;
    }
}

