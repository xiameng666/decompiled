import android.text.TextUtils;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.List;

public final class flzw implements fmoz {
    public final flzz a;
    public final AccountContext b;
    public final String c;

    public flzw(flzz flzz0, AccountContext accountContext0, String s) {
        this.a = flzz0;
        this.b = accountContext0;
        this.c = s;
    }

    @Override  // fmoz
    public final void a(Object object0) {
        gfsx gfsx0;
        if(((gfsx)object0).i()) {
            fmga fmga0 = (fmga)((gfsx)object0).d();
            if(!iaea.m()) {
                flbj.a("LighterLinkPreviewController", "Link preview flag not enabled");
                return;
            }
            if(flzv.c(fmga0)) {
                flbj.a("LighterLinkPreviewController", "Calling maybeDisplayLinkPreview on message with existing link preview");
                if(!iaea.n()) {
                    flbj.a("LighterLinkPreviewController", "Link preview TTL flag not enabled");
                    return;
                }
            }
            if(fmga0.f.a() != 2 && !flzv.c(fmga0)) {
                flbj.a("LighterLinkPreviewController", "Attempted to detect url on message that does not have text or link preview");
                gfsx0 = gfqx.a;
            }
            else {
                List list0 = flzz.a(flzv.b(fmga0));
                gfsx0 = list0.size() == 1 ? gfsx.m(((String)list0.get(0))) : gfqx.a;
            }
            if(gfsx0.i() && !TextUtils.isEmpty(((CharSequence)gfsx0.d()))) {
                gmbu.t(gmbu.n(new flzx(this.a, this.b, fmga0, gfsx0), this.a.a), new flzy(this.a, this.b, fmga0), gmap.a);
            }
            return;
        }
        flbj.c("LighterLinkPreviewController", String.format("Unable to retrieve message for id: %s", this.c));
    }
}

