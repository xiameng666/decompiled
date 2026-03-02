import java.util.HashMap;

public final class flnj implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        HashMap hashMap0 = (HashMap)object0;
        try {
            fmfv fmfv0 = fmfw.a();
            fmfv0.k(((Integer)hashMap0.get("time_to_live_sec")).intValue());
            fmfv0.j(((Integer)hashMap0.get("OVERLAY_STYLE")).intValue());
            if(hashMap0.containsKey("dismiss_action")) {
                gfsx gfsx0 = flbm.b(hashMap0.get("dismiss_action"));
                fmbi fmbi0 = null;
                if(gfsx0.i()) {
                    Object object1 = gfsx0.d();
                    if(fmba.a(((Integer)((HashMap)object1).get("ACTION_TYPE")).intValue()).equals(fmba.g)) {
                        fmbb fmbb0 = fmbi.c();
                        flnq.c(fmbb0, ((HashMap)object1));
                        fmbb0.r();
                        fmbi0 = fmbb0.a();
                    }
                    else {
                        flbj.c("ActionConv", "failed to convert Map to OverlayAction overlay action can only contain no op action");
                    }
                }
                else {
                    flbj.c("ActionConv", "failed to deserialize Map");
                }
                if(fmbi0 == null) {
                    return gfqx.a;
                }
                fmfv0.b(fmbi0);
            }
            if(hashMap0.containsKey("display_icon")) {
                fmfv0.d(((ByteString)hashMap0.get("display_icon")));
            }
            if(hashMap0.containsKey("display_text")) {
                fmfv0.e(((String)hashMap0.get("display_text")));
            }
            if(hashMap0.containsKey("overlay_expire_time")) {
                fmfv0.f(((Integer)hashMap0.get("overlay_expire_time")).intValue());
            }
            if(hashMap0.containsKey("overlay_lighter_icon")) {
                gfsx gfsx1 = floh.a(((HashMap)hashMap0.get("overlay_lighter_icon")));
                if(gfsx1.i()) {
                    fmfv0.i(((fmfh)gfsx1.d()));
                    goto label_33;
                }
                return gfqx.a;
            }
        label_33:
            if(hashMap0.containsKey("hide_snippet_in_conversation_list")) {
                fmfv0.h(((Boolean)hashMap0.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            if(hashMap0.containsKey("hide_dismiss_button")) {
                fmfv0.g(((Boolean)hashMap0.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            if(hashMap0.containsKey("dismissible_by_tapping_outside")) {
                fmfv0.c(((Boolean)hashMap0.get("hide_snippet_in_conversation_list")).booleanValue());
            }
            return gfsx.m(fmfv0.a());
        }
        catch(NullPointerException | IllegalStateException exception0) {
            flbj.d("ActionConv", "failed to convert Map to OverlayAction", exception0);
            return gfqx.a;
        }
    }
}

