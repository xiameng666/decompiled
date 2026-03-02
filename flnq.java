import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class flnq {
    public static gfsx a(HashMap hashMap0) {
        try {
            fmbb fmbb0 = fmbi.c();
            flnq.c(fmbb0, hashMap0);
            fmba fmba0 = fmba.a(((Integer)hashMap0.get("ACTION_TYPE")).intValue());
            switch(fmba0.ordinal()) {
                case 1: {
                    gfsx gfsx0 = flbl.a(flbm.b(hashMap0.get("ACTION_PAYLOAD")), new flnk());
                    if(gfsx0.i()) {
                        fmbb0.k(((fmbh)gfsx0.d()));
                    }
                    break;
                }
                case 2: {
                    gfsx gfsx1 = flbl.a(flbm.b(hashMap0.get("ACTION_PAYLOAD")), new flnk());
                    if(gfsx1.i()) {
                        fmbb0.j(((fmbh)gfsx1.d()));
                    }
                    break;
                }
                case 3: {
                    fmbb0.d(((String)hashMap0.get("ACTION_PAYLOAD")));
                    break;
                }
                case 4: {
                    fmbb0.o(((String)hashMap0.get("ACTION_PAYLOAD")));
                    break;
                }
                case 5: {
                    gfsx gfsx2 = flbl.a(flbm.b(hashMap0.get("ACTION_PAYLOAD")), new flnj());
                    if(!gfsx2.i()) {
                        return gfqx.a;
                    }
                    fmbe fmbe0 = new fmbe(null);
                    fmbe0.b(((fmfw)gfsx2.d()));
                    fmbb0.p(fmbe0.a());
                    break;
                }
                case 6: {
                    fmbb0.r();
                    break;
                }
                case 7: {
                    fmbb0.c(((String)hashMap0.get("ACTION_PAYLOAD")));
                    break;
                }
                case 8: {
                    fmbb0.l(((String)hashMap0.get("ACTION_PAYLOAD")));
                    break;
                }
                case 9: {
                    gfsx gfsx3 = flbl.a(flbm.b(hashMap0.get("ACTION_PAYLOAD")), new flnl());
                    if(!gfsx3.i()) {
                        return gfqx.a;
                    }
                    fmbb0.p(((fmbf)gfsx3.d()));
                    break;
                }
                case 10: {
                    gfsx gfsx4 = flbl.a(flbm.b(hashMap0.get("ACTION_PAYLOAD")), new flnm());
                    if(!gfsx4.i()) {
                        flbj.c("ActionConv", "Fail to convert map to url action");
                        return gfqx.a;
                    }
                    fmbb0.n(((fmhv)gfsx4.d()));
                    break;
                }
                case 11: {
                    gfsx gfsx5 = flbl.a(flbm.b(hashMap0.get("ACTION_PAYLOAD")), new flnn());
                    if(gfsx5.i()) {
                        fmbb0.e(((fmfe)gfsx5.d()));
                    }
                    else {
                        flbj.c("ActionConv", "Failed to convert map to decoration transition action.");
                    }
                    break;
                }
                default: {
                    flbj.c("ActionConv", "encountered unknown action type: " + fmba0);
                    return gfqx.a;
                }
            }
            if(hashMap0.containsKey("EVENT_CALLBACK_FAILURE_ACTION_TYPE") && fmba.a(((Integer)hashMap0.get("EVENT_CALLBACK_FAILURE_ACTION_TYPE")).intValue()).ordinal() == 8) {
                fmbb0.g(((String)hashMap0.get("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD")));
            }
            return gfsx.m(fmbb0.a());
        }
        catch(NullPointerException | IllegalStateException exception0) {
            flbj.d("ActionConv", "failed to convert Map to Action", exception0);
            return gfqx.a;
        }
    }

    public static HashMap b(fmbi fmbi0) {
        HashMap hashMap0 = new HashMap();
        flnq.g(fmbi0, hashMap0);
        switch(fmbi0.a().ordinal()) {
            case 1: {
                hashMap0.put("ACTION_PAYLOAD", flnq.e(fmbi0.f.d()));
                break;
            }
            case 2: {
                hashMap0.put("ACTION_PAYLOAD", flnq.e(fmbi0.f.c()));
                break;
            }
            case 3: {
                hashMap0.put("ACTION_PAYLOAD", fmbi0.f.i());
                break;
            }
            case 4: {
                hashMap0.put("ACTION_PAYLOAD", fmbi0.f.k());
                break;
            }
            case 5: {
                hashMap0.put("ACTION_TYPE", Integer.valueOf(fmba.j.m));
                fmbe fmbe0 = new fmbe(null);
                fmbe0.b(fmbi0.f.f());
                hashMap0.put("ACTION_PAYLOAD", flnq.f(fmbe0.a()));
                break;
            }
            case 7: {
                hashMap0.put("ACTION_PAYLOAD", fmbi0.f.h());
                break;
            }
            case 8: {
                hashMap0.put("ACTION_PAYLOAD", fmbi0.f.j());
                break;
            }
            case 9: {
                hashMap0.put("ACTION_PAYLOAD", flnq.f(fmbi0.f.b()));
                break;
            }
            case 10: {
                fmhv fmhv0 = fmbi0.f.g();
                HashMap hashMap1 = new HashMap();
                hashMap1.put("URL", fmhv0.a);
                flni flni0 = new flni();
                hashMap1.put("REPLACEMENTS", flbp.d(fmhv0.b, flni0));
                hashMap0.put("ACTION_PAYLOAD", hashMap1);
                break;
            }
            case 11: {
                fmfe fmfe0 = fmbi0.f.e();
                ArrayList arrayList0 = new ArrayList(fmfe0.b);
                ArrayList arrayList1 = new ArrayList(fmfe0.c);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("DECORATION_IDS_TO_ADD", arrayList0);
                hashMap2.put("DECORATION_IDS_TO_REMOVE", arrayList1);
                hashMap0.put("ACTION_PAYLOAD", hashMap2);
            }
        }
        if(fmbi0.b().ordinal() != 8) {
            return hashMap0;
        }
        hashMap0.put("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD", fmbi0.g.j());
        return hashMap0;
    }

    public static void c(fmbb fmbb0, HashMap hashMap0) {
        if(!hashMap0.containsKey("ACTION_TRIGGERED_LOG_ID")) {
            flbj.c("ActionConv", "Missing action triggered log id setting it to 0");
            fmbb0.b(0L);
        }
        fmbb0.b(((Long)hashMap0.get("ACTION_TRIGGERED_LOG_ID")).longValue());
        if(hashMap0.containsKey("EVENT_CALLBACK_PAYLOAD")) {
            fmbb0.h(((String)hashMap0.get("EVENT_CALLBACK_PAYLOAD")));
        }
        if(hashMap0.containsKey("TRACE_ID")) {
            fmbb0.m(((String)hashMap0.get("TRACE_ID")));
        }
        if(hashMap0.containsKey("MESSAGE_ID")) {
            fmbb0.i(((String)hashMap0.get("MESSAGE_ID")));
        }
        if(hashMap0.containsKey("EVENT_CALLBACK_DESTINATION")) {
            gfsx gfsx0 = flbl.a(flbm.b(hashMap0.get("EVENT_CALLBACK_DESTINATION")), new flno());
            if(gfsx0.i()) {
                fmbb0.f(((fmbc)gfsx0.d()));
            }
        }
    }

    private static HashMap d(fmfw fmfw0) {
        HashMap hashMap0 = new HashMap();
        gfsx gfsx0 = fmfw0.a;
        if(gfsx0.i()) {
            if(((fmbi)gfsx0.d()).a().equals(fmba.g)) {
                HashMap hashMap1 = new HashMap();
                flnq.g(((fmbi)gfsx0.d()), hashMap1);
                hashMap0.put("dismiss_action", hashMap1);
                goto label_10;
            }
            flbj.c("ActionConv", " Dismiss action can only be NoOp. Fail to convert overlay header to map.");
            return hashMap0;
        }
    label_10:
        hashMap0.put("time_to_live_sec", Integer.valueOf(fmfw0.e));
        hashMap0.put("OVERLAY_STYLE", Integer.valueOf(fmfw0.j));
        gfsx gfsx1 = fmfw0.b;
        if(gfsx1.i()) {
            hashMap0.put("display_icon", gfsx1.d());
        }
        gfsx gfsx2 = fmfw0.d;
        if(gfsx2.i()) {
            hashMap0.put("display_text", gfsx2.d());
        }
        gfsx gfsx3 = fmfw0.c;
        if(gfsx3.i()) {
            hashMap0.put("overlay_lighter_icon", floh.b(((fmfh)gfsx3.d())));
        }
        gfsx gfsx4 = fmfw0.i;
        if(gfsx4.i()) {
            hashMap0.put("overlay_expire_time", gfsx4.d());
        }
        hashMap0.put("hide_dismiss_button", Boolean.valueOf(fmfw0.g));
        hashMap0.put("hide_snippet_in_conversation_list", Boolean.valueOf(fmfw0.f));
        hashMap0.put("dismissible_by_tapping_outside", Boolean.valueOf(fmfw0.h));
        return hashMap0;
    }

    private static HashMap e(fmbh fmbh0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("TEXT", fmbh0.a);
        hashMap0.put("MESSAGE_CALLBACK_PAYLOAD", fmbh0.b);
        return hashMap0;
    }

    private static Map f(fmbf fmbf0) {
        Map map0 = new HashMap();
        gfsx gfsx0 = fmbf0.a;
        if(gfsx0.i()) {
            ((HashMap)map0).put("REACTION_OVERLAY_HEADER", flnq.d(((fmfw)gfsx0.d())));
        }
        gfsx gfsx1 = fmbf0.b;
        if(gfsx1.i()) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("URL", ((fmfc)gfsx1.d()).b);
            hashMap0.put("WEB_VIEW_HEADER", flnq.d(((fmfc)gfsx1.d()).a));
            ((HashMap)map0).put("STACKED_REACTION_WEB_VIEW", hashMap0);
        }
        return map0;
    }

    private static void g(fmbi fmbi0, HashMap hashMap0) {
        hashMap0.put("ACTION_TYPE", Integer.valueOf(fmbi0.a().m));
        hashMap0.put("EVENT_CALLBACK_FAILURE_ACTION_TYPE", Integer.valueOf(fmbi0.b().m));
        hashMap0.put("ACTION_TRIGGERED_LOG_ID", Long.valueOf(fmbi0.e));
        gfsx gfsx0 = fmbi0.c;
        if(gfsx0.i()) {
            hashMap0.put("EVENT_CALLBACK_PAYLOAD", gfsx0.d());
        }
        gfsx gfsx1 = fmbi0.d;
        if(gfsx1.i()) {
            Object object0 = gfsx1.d();
            HashMap hashMap1 = new HashMap();
            switch(((fmbc)object0).d() - 1) {
                case 1: {
                    hashMap1.put("EVENT_CALLBACK_DESTINATION_TYPE", Integer.valueOf(((fmbc)object0).d() - 1));
                    hashMap1.put("EVENT_CALLBACK_DESTINATION", flob.b(((fmbc)object0).a()));
                    break;
                }
                case 2: {
                    hashMap1.put("EVENT_CALLBACK_DESTINATION_TYPE", Integer.valueOf(((fmbc)object0).d() - 1));
                    hashMap1.put("EVENT_CALLBACK_DESTINATION", flog.b(((fmbc)object0).b()));
                }
            }
            hashMap0.put("EVENT_CALLBACK_DESTINATION", hashMap1);
        }
        gfsx gfsx2 = fmbi0.a;
        if(gfsx2.i()) {
            hashMap0.put("TRACE_ID", gfsx2.d());
        }
        gfsx gfsx3 = fmbi0.b;
        if(gfsx3.i()) {
            hashMap0.put("MESSAGE_ID", gfsx3.d());
        }
    }
}

