import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public final class fmkd {
    static gfsx a(HashMap hashMap0) {
        gfsx gfsx3;
        gfsx gfsx2;
        gfsx gfsx1;
        gfsx gfsx0;
        try {
            fmmk fmmk0 = fmmo.a();
            fmmk0.d(((Integer)hashMap0.get("PADDING_START")).intValue());
            fmmk0.e(((Integer)hashMap0.get("PADDING_TOP")).intValue());
            fmmk0.c(((Integer)hashMap0.get("PADDING_END")).intValue());
            fmmk0.b(((Integer)hashMap0.get("PADDING_BOTTOM")).intValue());
            if(hashMap0.containsKey("USE_INCOMING_OUTGOING_COLORS")) {
                fmmk0.f(((Boolean)hashMap0.get("USE_INCOMING_OUTGOING_COLORS")).booleanValue());
            }
            switch(((fmmn)hashMap0.get("TYPE")).ordinal()) {
                case 0: {
                    fmmk0.m(((fmhm)flpn.c(((HashMap)hashMap0.get("RICH_TEXT"))).d()));
                    return gfsx.m(fmmk0.a());
                }
                case 2: {
                    HashMap hashMap1 = (HashMap)hashMap0.get("STATUS_BADGE");
                    try {
                        fmme fmme0 = new fmme();
                        fmme0.c(((String)hashMap1.get("TEXT")));
                        fmme0.b(((Integer)hashMap1.get("BACKGROUND_COLOR")).intValue());
                        fmme0.d(((Integer)hashMap1.get("TEXT_COLOR")).intValue());
                        gfsx0 = gfsx.m(fmme0.a());
                    }
                    catch(Exception exception1) {
                        flbj.d("StatusBadgeConverters", "failed to convert HashMap to StatusBadge", exception1);
                        gfsx0 = gfqx.a;
                    }
                    fmmk0.n(((fmmf)gfsx0.d()));
                    return gfsx.m(fmmk0.a());
                }
                case 3: {
                    HashMap hashMap2 = (HashMap)hashMap0.get("RICH_CARD_BUTTONS");
                    try {
                        fmgr fmgr0 = new fmgr(null);
                        if(((int)(((Integer)hashMap2.get("ORIENTATION")))) == 2) {
                            fmgr0.c((hashMap2.containsKey("HORIZONTAL_ALIGNMENT") ? ((int)(((Integer)hashMap2.get("HORIZONTAL_ALIGNMENT")))) : 0));
                        }
                        fmgr0.b(flbp.b(((ArrayList)hashMap2.get("BUTTONS")), new flpb()));
                        fmgr0.d(((Integer)hashMap2.get("ORIENTATION")).intValue());
                        gfsx1 = gfsx.m(fmgr0.a());
                    }
                    catch(NullPointerException | IllegalStateException exception2) {
                        flbj.d("RCButtonsConverters", "failed to convert Map to RichCardButtons", exception2);
                        gfsx1 = gfqx.a;
                    }
                    fmmk0.l(((fmgu)gfsx1.d()));
                    return gfsx.m(fmmk0.a());
                }
                case 4: {
                    HashMap hashMap3 = (HashMap)hashMap0.get("HORIZONTAL_LINE");
                    try {
                        fmlo fmlo0 = new fmlo();
                        fmlo0.b(((Integer)hashMap3.get("LINE_COLOR")).intValue());
                        fmlo0.c(((Float)hashMap3.get("LINE_WIDTH")).floatValue());
                        gfsx2 = gfsx.m(fmlo0.a());
                    }
                    catch(Exception exception3) {
                        flbj.d("HrzntlLineConverters", "failed to convert HashMap to HorizontalLine", exception3);
                        gfsx2 = gfqx.a;
                    }
                    fmmk0.i(((fmlp)gfsx2.d()));
                    return gfsx.m(fmmk0.a());
                }
                case 5: {
                    HashMap hashMap4 = (HashMap)hashMap0.get("HORIZONTAL_LAYOUT_BUTTONS");
                    try {
                        fmlk fmlk0 = new fmlk();
                        fmlk0.b(flbp.b(((ArrayList)hashMap4.get("VERTICAL_LAYOUT_BUTTON")), new fmjv()));
                        gfsx3 = gfsx.m(fmlk0.a());
                    }
                    catch(NullPointerException | IllegalStateException exception4) {
                        flbj.d("HrzntlytBtnConverter", "failed to convert Map to RichCardButtons", exception4);
                        gfsx3 = gfqx.a;
                    }
                    fmmk0.h(((fmln)gfsx3.d()));
                    return gfsx.m(fmmk0.a());
                }
                case 6: {
                    gfsx gfsx4 = fmlr.b(new JSONObject(((String)hashMap0.get("IMAGE_ELEMENT"))));
                    if(gfsx4.i()) {
                        fmmk0.j(((fmlr)gfsx4.d()));
                        return gfsx.m(fmmk0.a());
                    }
                    flbj.c("UiElementConverters", "failed to convert HashMap to UiElement");
                    return gfqx.a;
                }
                case 8: {
                    if(iaea.q()) {
                        gfsx gfsx5 = fmlt.b(new JSONObject(((String)hashMap0.get("MEDIA_ELEMENT"))));
                        if(gfsx5.i()) {
                            fmmk0.k(((fmlt)gfsx5.d()));
                            return gfsx.m(fmmk0.a());
                        }
                        flbj.c("UiElementConverters", "failed to convert HashMap to UiElement");
                        return gfqx.a;
                    }
                    flbj.c("UiElementConverters", "Cannot convert HashMap to UiElement; Please enable direct-download flag.");
                    return gfqx.a;
                }
                default: {
                    flbj.c("UiElementConverters", "Unsupported UiElement type: " + hashMap0.get("TYPE"));
                    return gfqx.a;
                }
            }
        }
        catch(Exception exception0) {
            flbj.d("UiElementConverters", "failed to convert HashMap to UiElement", exception0);
            return gfqx.a;
        }
    }

    static HashMap b(fmmo fmmo0) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("PADDING_START", Integer.valueOf(fmmo0.b));
        hashMap0.put("PADDING_TOP", Integer.valueOf(fmmo0.c));
        hashMap0.put("PADDING_END", Integer.valueOf(fmmo0.d));
        hashMap0.put("PADDING_BOTTOM", Integer.valueOf(fmmo0.e));
        hashMap0.put("USE_INCOMING_OUTGOING_COLORS", Boolean.valueOf(fmmo0.f));
        hashMap0.put("TYPE", fmmo0.b());
        switch(fmmo0.b().ordinal()) {
            case 0: {
                hashMap0.put("RICH_TEXT", flpn.d(fmmo0.a.g()));
                return hashMap0;
            }
            case 2: {
                fmmf fmmf0 = fmmo0.a.h();
                HashMap hashMap1 = new HashMap();
                hashMap1.put("TEXT", fmmf0.a);
                hashMap1.put("BACKGROUND_COLOR", Integer.valueOf(fmmf0.b));
                hashMap1.put("TEXT_COLOR", Integer.valueOf(fmmf0.c));
                hashMap0.put("STATUS_BADGE", hashMap1);
                return hashMap0;
            }
            case 3: {
                fmgu fmgu0 = fmmo0.a.f();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ORIENTATION", Integer.valueOf(fmgu0.c));
                floy floy0 = new floy();
                hashMap2.put("BUTTONS", flbp.d(fmgu0.b, floy0));
                if(fmgu0.c == 2) {
                    hashMap2.put("HORIZONTAL_ALIGNMENT", Integer.valueOf((fmgu0.d.i() ? ((int)(((Integer)fmgu0.d.d()))) : 0)));
                }
                hashMap0.put("RICH_CARD_BUTTONS", hashMap2);
                return hashMap0;
            }
            case 4: {
                fmlp fmlp0 = fmmo0.a.c();
                HashMap hashMap3 = new HashMap();
                hashMap3.put("LINE_COLOR", Integer.valueOf(fmlp0.a));
                hashMap3.put("LINE_WIDTH", Float.valueOf(fmlp0.b));
                hashMap0.put("HORIZONTAL_LINE", hashMap3);
                return hashMap0;
            }
            case 5: {
                fmln fmln0 = fmmo0.a.b();
                HashMap hashMap4 = new HashMap();
                fmju fmju0 = new fmju();
                hashMap4.put("VERTICAL_LAYOUT_BUTTON", flbp.d(fmln0.a, fmju0));
                hashMap0.put("HORIZONTAL_LAYOUT_BUTTONS", hashMap4);
                return hashMap0;
            }
            case 6: {
                gfsx gfsx0 = fmmo0.a.d().c();
                if(!gfsx0.i()) {
                    throw new IllegalArgumentException("Unable to convert image element to JSON.");
                }
                hashMap0.put("IMAGE_ELEMENT", ((JSONObject)gfsx0.d()).toString());
                return hashMap0;
            }
            case 8: {
                if(iaea.q()) {
                    gfsx gfsx1 = fmmo0.a.e().c();
                    if(!gfsx1.i()) {
                        throw new IllegalArgumentException("Unable to convert media element to HashMap.");
                    }
                    hashMap0.put("MEDIA_ELEMENT", ((JSONObject)gfsx1.d()).toString());
                    return hashMap0;
                }
                flbj.c("UiElementConverters", "Cannot convert media element to HashMap, please enable direct-download flag.");
                return hashMap0;
            }
            default: {
                throw new IllegalArgumentException("Unsupported UiElement type: " + fmmo0.b().j);
            }
        }
    }
}

