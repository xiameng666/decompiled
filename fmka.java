import java.util.ArrayList;
import java.util.HashMap;

public final class fmka {
    public static gfsx a(HashMap hashMap0) {
        gfsx gfsx1;
        try {
            fmly fmly0 = fmly.a((hashMap0.containsKey("TYPE") ? ((int)(((Integer)hashMap0.get("TYPE")))) : fmly.a.d));
            switch(fmly0.ordinal()) {
                case 0: {
                    goto label_3;
                }
                case 1: {
                    goto label_18;
                }
                case 2: {
                    goto label_23;
                }
            }
            flbj.c("RichCardConverters", a.ab(fmly0, "failed to convert HashMap to RichCard, unsupported type: "));
            return gfqx.a;
        label_3:
            gfsx gfsx0 = flbm.b(hashMap0.get("STACK_CARD"));
            if(!gfsx0.i()) {
                flbj.c("RichCardConverters", "failed to convert HashMap to RichCard");
                flbj.c("RichCardConverters", a.ab(fmly0, "failed to convert HashMap to RichCard, unsupported type: "));
                return gfqx.a;
            }
            Object object0 = gfsx0.d();
            try {
                fmma fmma0 = new fmma(null);
                fmma0.b(flbp.c(((ArrayList)((HashMap)object0).get("COMPONENTS")), new fmjw()));
                if(((HashMap)object0).containsKey("PREFERRED_MAX_WIDTH")) {
                    fmma0.c(((Integer)((HashMap)object0).get("PREFERRED_MAX_WIDTH")).intValue());
                }
                gfsx1 = gfsx.m(fmma0.a());
            }
            catch(Exception exception1) {
                flbj.d("RichCardConverters", "failed to convert HashMap to StackCard", exception1);
                gfsx1 = gfqx.a;
            }
            return gfsx.m(fmku.b(((fmmb)gfsx1.d())));
        label_18:
            gfsx gfsx2 = fmmd.a(((String)hashMap0.get("STANDALONE_CARD")));
            if(!gfsx2.i()) {
                flbj.c("RichCardConverters", "failed to convert HashMap to RichCard");
                flbj.c("RichCardConverters", a.ab(fmly0, "failed to convert HashMap to RichCard, unsupported type: "));
                return gfqx.a;
            }
            return gfsx.m(fmku.c(((fmmd)gfsx2.d())));
        label_23:
            gfsx gfsx3 = fmlj.a(((String)hashMap0.get("CARD_CAROUSEL")));
            if(!gfsx3.i()) {
                flbj.c("RichCardConverters", "failed to convert HashMap to RichCard");
                flbj.c("RichCardConverters", a.ab(fmly0, "failed to convert HashMap to RichCard, unsupported type: "));
                return gfqx.a;
            }
            return gfsx.m(fmku.a(((fmlj)gfsx3.d())));
        }
        catch(Exception exception0) {
            flbj.d("RichCardConverters", "failed to convert HashMap to RichCard", exception0);
            return gfqx.a;
        }
    }
}

