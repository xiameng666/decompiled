import java.util.ArrayList;
import java.util.HashMap;

public final class floj implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx2;
        gfsx gfsx0;
        if(!((HashMap)object0).containsKey("DECORATION_ID")) {
            flbj.c("MsgDecorCvtr", "Missing decoration id from Message Decoration.");
            return gfqx.a;
        }
        if(!((HashMap)object0).containsKey("RENDER_CRITERIA")) {
            flbj.c("MsgDecorCvtr", "Missing render criteria from Message Decoration.");
            return gfqx.a;
        }
        if(!((HashMap)object0).containsKey("CONTENT")) {
            flbj.c("MsgDecorCvtr", "Missing decoration content from Message Decoration.");
            return gfqx.a;
        }
        HashMap hashMap0 = (HashMap)((HashMap)object0).get("CONTENT");
        if(!hashMap0.containsKey("TYPE")) {
            flbj.c("MsgDecorCvtr", "Missing type from decoration content map.");
            gfsx0 = gfqx.a;
        }
        else if(hashMap0.containsKey("DECORATION_CONTENT")) {
            gfsx gfsx1 = fmgc.a(((Integer)hashMap0.get("TYPE")).intValue());
            if(gfsx1.i() && gfsx1.d() == fmgc.a) {
                HashMap hashMap1 = (HashMap)hashMap0.get("DECORATION_CONTENT");
                Object object1 = hashMap1.get("PROMPT_TEXT");
                if(object1 == null) {
                    flbj.c("MsgDecorCvtr", "Prompt text missing from button prompt.");
                    gfsx2 = gfqx.a;
                }
                else {
                    gfsx gfsx3 = flpn.c(((HashMap)object1));
                    if(gfsx3.i()) {
                        fmef fmef0 = fmeg.a();
                        fmef0.a = (fmhm)gfsx3.d();
                        Object object2 = hashMap1.get("BUTTONS");
                        if(object2 == null) {
                            flbj.c("MsgDecorCvtr", "Error with button serialization.");
                            gfsx2 = gfqx.a;
                        }
                        else {
                            fmef0.b(flbp.b(((ArrayList)object2), new flop()));
                            gfsx2 = gfsx.m(fmef0.a());
                        }
                    }
                    else {
                        flbj.c("MsgDecorCvtr", "Unable to deserialize prompt text.");
                        gfsx2 = gfqx.a;
                    }
                }
                if(gfsx2.i()) {
                    gfsx0 = gfsx.m(fmcl.a(((fmeg)gfsx2.d())));
                }
                else {
                    flbj.c("MsgDecorCvtr", "Error with button prompt from decoration content map.");
                    gfsx0 = gfqx.a;
                }
            }
            else {
                flbj.c("MsgDecorCvtr", "Invalid type from decoration content map.");
                gfsx0 = gfqx.a;
            }
        }
        else {
            flbj.c("MsgDecorCvtr", "Missing content from decoration content map.");
            gfsx0 = gfqx.a;
        }
        if(!gfsx0.i()) {
            flbj.c("MsgDecorCvtr", "Error converting message content in Message Decoration.");
            return gfqx.a;
        }
        gfsx gfsx4 = fmgf.a(((Integer)((HashMap)object0).get("RENDER_CRITERIA")).intValue());
        if(!gfsx4.i()) {
            flbj.c("MsgDecorCvtr", "Error converting render criteria in Message Decoration.");
        }
        String s = (String)((HashMap)object0).get("DECORATION_ID");
        fmgb fmgb0 = new fmgb();
        fmgb0.b = (fmgd)gfsx0.d();
        fmgb0.b(s);
        fmgb0.a = (fmgf)gfsx4.d();
        return gfsx.m(fmgb0.a());
    }
}

