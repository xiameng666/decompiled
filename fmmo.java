import java.security.InvalidParameterException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmmo {
    public final fmml a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    private static final String g = "fmmo";

    static {
    }

    public fmmo() {
        throw null;
    }

    public fmmo(fmml fmml0, int v, int v1, int v2, int v3, boolean z) {
        this.a = fmml0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = z;
    }

    public static fmmk a() {
        fmmk fmmk0 = new fmmk();
        fmmk0.d(0);
        fmmk0.e(0);
        fmmk0.c(0);
        fmmk0.b(0);
        fmmk0.f(false);
        return fmmk0;
    }

    public final fmmn b() {
        return this.a.a();
    }

    public static gfsx c(JSONObject jSONObject0) {
        gfsx gfsx8;
        gfsx gfsx7;
        fmll fmll0;
        JSONObject jSONObject5;
        int v3;
        ggdy ggdy1;
        JSONObject jSONObject4;
        fmlo fmlo0;
        JSONObject jSONObject3;
        gfsx gfsx3;
        JSONObject jSONObject2;
        fmme fmme0;
        JSONObject jSONObject1;
        fmmk fmmk0;
        try {
            fmmk0 = fmmo.a();
            int v = jSONObject0.getInt("TYPE");
            fmmn fmmn0 = (fmmn)ggch.k(fmmn.values()).c(new fmmm(v)).g();
            if(fmmn0 == null) {
                throw new InvalidParameterException("Invalid ElementType.");
            }
            int v1 = fmmn0.ordinal();
            if(v1 == 0) {
                gfsx gfsx0 = fmhm.a(jSONObject0.getJSONObject("RICH_TEXT"));
                if(!gfsx0.i()) {
                    return gfqx.a;
                }
                fmmk0.m(((fmhm)gfsx0.d()));
                goto label_124;
            }
            switch(v1) {
                case 2: {
                    goto label_15;
                }
                case 3: {
                    goto label_30;
                }
                case 4: {
                    goto label_55;
                }
                case 5: {
                    goto label_69;
                }
                case 6: {
                    goto label_112;
                }
                case 7: {
                    goto label_117;
                }
                case 8: {
                    goto label_119;
                }
            }
            flbj.c(fmmo.g, a.ab(fmmn0, "Failed to convert JSONObject to UiElement, unimplemented type: "));
            return gfqx.a;
        label_15:
            jSONObject1 = jSONObject0.getJSONObject("STATUS_BADGE");
            fmme0 = new fmme();
        }
        catch(JSONException jSONException0) {
            flbj.d("fmmo", "Failed to convert JSONObject to UiElement.", jSONException0);
            return gfqx.a;
        }
        try {
            fmme0.c(jSONObject1.getString("TEXT"));
            fmme0.b(jSONObject1.getInt("BACKGROUND_COLOR"));
            fmme0.d(jSONObject1.getInt("TEXT_COLOR"));
            goto label_25;
        }
        catch(JSONException jSONException1) {
            try {
                flbj.d("STATUS_BADGE", "Failed to get StatusBadge from JSONObject.", jSONException1);
                gfsx gfsx1 = gfqx.a;
                goto label_26;
            label_25:
                gfsx1 = gfsx.m(fmme0.a());
            label_26:
                if(!gfsx1.i()) {
                    return gfqx.a;
                }
                fmmk0.n(((fmmf)gfsx1.d()));
                goto label_124;
            label_30:
                jSONObject2 = jSONObject0.getJSONObject("RICH_CARD_BUTTONS");
            }
            catch(JSONException jSONException0) {
                flbj.d("fmmo", "Failed to convert JSONObject to UiElement.", jSONException0);
                return gfqx.a;
            }
        }
        try {
            fmgr fmgr0 = new fmgr(null);
            JSONArray jSONArray0 = jSONObject2.getJSONArray("BUTTONS");
            ggdy ggdy0 = new ggdy();
            int v2 = 0;
            while(v2 < jSONArray0.length()) {
                gfsx gfsx2 = fmgt.b(jSONArray0.getJSONObject(v2));
                if(gfsx2.i()) {
                    ggdy0.i(gfsx2.d());
                    ++v2;
                    continue;
                }
                gfsx3 = gfqx.a;
                goto label_51;
            }
            fmgr0.b(ggdy0.h());
            fmgr0.d(jSONObject2.getInt("ORIENTATION"));
            if(jSONObject2.has("HORIZONTAL_ALIGNMENT")) {
                fmgr0.c(jSONObject2.getInt("HORIZONTAL_ALIGNMENT"));
            }
            gfsx3 = gfsx.m(fmgr0.a());
            goto label_51;
        }
        catch(JSONException unused_ex) {
            try {
                flbj.c("fmgu", "failed to convert JSONObject to RichCardButtons");
                gfsx3 = gfqx.a;
            label_51:
                if(!gfsx3.i()) {
                    return gfqx.a;
                }
                fmmk0.l(((fmgu)gfsx3.d()));
                goto label_124;
            label_55:
                jSONObject3 = jSONObject0.getJSONObject("HORIZONTAL_LINE");
                fmlo0 = new fmlo();
            }
            catch(JSONException jSONException0) {
                flbj.d("fmmo", "Failed to convert JSONObject to UiElement.", jSONException0);
                return gfqx.a;
            }
        }
        try {
            fmlo0.b(jSONObject3.getInt("LINE_COLOR"));
            fmlo0.c(((float)jSONObject3.getDouble("LINE_WIDTH")));
            goto label_64;
        }
        catch(JSONException jSONException2) {
            try {
                flbj.d("HORIZONTAL_LINE", "Failed to get Horizontal line from JSONObject.", jSONException2);
                gfsx gfsx4 = gfqx.a;
                goto label_65;
            label_64:
                gfsx4 = gfsx.m(fmlo0.a());
            label_65:
                if(!gfsx4.i()) {
                    return gfqx.a;
                }
                fmmk0.i(((fmlp)gfsx4.d()));
                goto label_124;
            label_69:
                jSONObject4 = jSONObject0.getJSONObject("HORIZONTAL_LAYOUT_BUTTONS");
                ggdy1 = new ggdy();
            }
            catch(JSONException jSONException0) {
                flbj.d("fmmo", "Failed to convert JSONObject to UiElement.", jSONException0);
                return gfqx.a;
            }
        }
        try {
            JSONArray jSONArray1 = jSONObject4.getJSONArray("VERTICAL_LAYOUT_BUTTONS");
            v3 = 0;
            while(true) {
            label_73:
                if(v3 >= jSONArray1.length()) {
                    goto label_105;
                }
                jSONObject5 = jSONArray1.getJSONObject(v3);
                fmll0 = new fmll();
                break;
            }
        }
        catch(JSONException unused_ex) {
            goto label_102;
        }
        try {
            fmll0.b(jSONObject5.getString("DISPLAY_TEXT"));
            gfsx gfsx5 = fmfh.c(jSONObject5.getJSONObject("LIGHTER_ICON"));
            if(gfsx5.i()) {
                fmll0.a = (fmfh)gfsx5.d();
                gfsx gfsx6 = fmbi.d(jSONObject5.getJSONObject("ACTION"));
                if(gfsx6.i()) {
                    fmll0.b = (fmbi)gfsx6.d();
                    fmll0.c(flbm.k(jSONObject5.getString("ICON")));
                    gfsx7 = gfsx.m(fmll0.a());
                }
                else {
                    flbj.c("HorizontalButton", "Failed to get action from JSONObject in horizontal layout button.");
                    gfsx7 = gfqx.a;
                }
                goto label_95;
            }
            goto label_89;
        }
        catch(JSONException jSONException3) {
            goto label_93;
        }
        try {
            gfsx7 = gfsx.m(fmll0.a());
            goto label_95;
        }
        catch(JSONException unused_ex) {
            goto label_102;
        }
        try {
        label_89:
            flbj.c("HorizontalButton", "Failed to get Lighter Icon from JSONObject in horizontal layout button.");
            gfsx7 = gfqx.a;
            goto label_95;
        }
        catch(JSONException jSONException3) {
            try {
            label_93:
                flbj.d("HorizontalButton", "Failed to get vertical layout button from JSONObject in horizontal layout button.", jSONException3);
                gfsx7 = gfqx.a;
            label_95:
                if(gfsx7.i()) {
                    ggdy1.i(gfsx7.d());
                    ++v3;
                    goto label_73;
                }
                flbj.c("HorizontalButton", "Failed to get Vertical layout button from JSONObject in Horizontal layout button.");
                gfsx8 = gfqx.a;
                goto label_108;
            }
            catch(JSONException unused_ex) {
            }
        }
        try {
        label_102:
            flbj.c("HorizontalButton", "Failed to get Horizontal layout button from JSONObject.");
            gfsx8 = gfqx.a;
            goto label_108;
        label_105:
            fmlk fmlk0 = new fmlk();
            fmlk0.b(ggdy1.h());
            gfsx8 = gfsx.m(fmlk0.a());
        label_108:
            if(!gfsx8.i()) {
                return gfqx.a;
            }
            fmmk0.h(((fmln)gfsx8.d()));
            goto label_124;
        label_112:
            gfsx gfsx9 = fmlr.b(jSONObject0.getJSONObject("IMAGE_ELEMENT"));
            if(!gfsx9.i()) {
                return gfqx.a;
            }
            fmmk0.j(((fmlr)gfsx9.d()));
            goto label_124;
        label_117:
            fmmk0.g();
            goto label_124;
        label_119:
            if(iaea.q()) {
                gfsx gfsx10 = fmlt.b(jSONObject0.getJSONObject("MEDIA_ELEMENT"));
                if(!gfsx10.i()) {
                    return gfqx.a;
                }
                fmmk0.k(((fmlt)gfsx10.d()));
            label_124:
                fmmk0.d(jSONObject0.getInt("PADDING_START"));
                fmmk0.e(jSONObject0.getInt("PADDING_TOP"));
                fmmk0.c(jSONObject0.getInt("PADDING_END"));
                fmmk0.b(jSONObject0.getInt("PADDING_BOTTOM"));
                fmmk0.f(jSONObject0.optBoolean("USE_INCOMING_OUTGOING_COLORS", false));
                return gfsx.m(fmmk0.a());
            }
            flbj.c("fmmo", "Cannot convert media element to JSONObject, please enable direct-download flag.");
        }
        catch(JSONException jSONException0) {
            flbj.d("fmmo", "Failed to convert JSONObject to UiElement.", jSONException0);
        }
        return gfqx.a;
    }

    public final gfsx d() {
        gfsx gfsx13;
        gfsx gfsx12;
        JSONObject jSONObject6;
        fmlm fmlm0;
        JSONArray jSONArray1;
        JSONObject jSONObject5;
        fmln fmln0;
        JSONObject jSONObject4;
        fmlp fmlp0;
        gfsx gfsx7;
        fmgt fmgt0;
        gfsx gfsx3;
        JSONArray jSONArray0;
        fmgu fmgu0;
        JSONObject jSONObject1;
        fmmf fmmf0;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("TYPE", this.b().j);
            int v = this.b().ordinal();
            if(v == 0) {
                gfsx gfsx0 = this.a.g().b();
                if(!gfsx0.i()) {
                    return gfqx.a;
                }
                jSONObject0.put("RICH_TEXT", gfsx0.d());
            }
            else {
                switch(v) {
                    case 2: {
                        fmmf0 = this.a.h();
                        jSONObject1 = new JSONObject();
                        goto label_15;
                    }
                    case 3: {
                        goto label_28;
                    }
                    case 4: {
                        goto label_81;
                    }
                    case 5: {
                        goto label_95;
                    }
                    case 6: {
                        goto label_138;
                    }
                    case 7: {
                        break;
                    }
                    case 8: {
                        goto label_143;
                    }
                    default: {
                        String s = String.valueOf(this.b());
                        flbj.c(fmmo.g, "Failed to convert UiElement to JSONObject, unimplemented type: " + s);
                        return gfqx.a;
                    }
                }
            }
            goto label_150;
        }
        catch(JSONException jSONException0) {
            flbj.d("fmmo", "Failed to convert UiElement to JSONObject.", jSONException0);
            return gfqx.a;
        }
        try {
        label_15:
            jSONObject1.put("TEXT", fmmf0.a);
            jSONObject1.put("BACKGROUND_COLOR", fmmf0.b);
            jSONObject1.put("TEXT_COLOR", fmmf0.c);
            goto label_23;
        }
        catch(JSONException jSONException1) {
            try {
                flbj.d("STATUS_BADGE", "Failed to convert StatusBadge to JSONObject", jSONException1);
                gfsx gfsx1 = gfqx.a;
                goto label_24;
            label_23:
                gfsx1 = gfsx.m(jSONObject1);
            label_24:
                if(!gfsx1.i()) {
                    return gfqx.a;
                }
                jSONObject0.put("STATUS_BADGE", gfsx1.d());
                goto label_150;
            label_28:
                fmgu0 = this.a.f();
            }
            catch(JSONException jSONException0) {
                flbj.d("fmmo", "Failed to convert UiElement to JSONObject.", jSONException0);
                return gfqx.a;
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONArray0 = new JSONArray();
            ggqk ggqk0 = fmgu0.b.E();
            while(true) {
            label_32:
                if(!ggqk0.hasNext()) {
                    jSONObject2.put("BUTTONS", jSONArray0);
                    jSONObject2.put("ORIENTATION", fmgu0.c);
                    gfsx gfsx2 = fmgu0.d;
                    if(gfsx2.i()) {
                        jSONObject2.put("HORIZONTAL_ALIGNMENT", gfsx2.d());
                    }
                    gfsx3 = gfsx.m(jSONObject2);
                    goto label_77;
                }
                Object object0 = ggqk0.next();
                fmgt0 = (fmgt)object0;
                break;
            }
        }
        catch(JSONException unused_ex) {
            goto label_74;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("TEXT", fmgt0.a);
            gfsx gfsx4 = fmgt0.b;
            if(gfsx4.i()) {
                jSONObject3.put("A11Y_TEXT", gfsx4.d());
            }
            gfsx gfsx5 = fmgt0.c;
            if(gfsx5.i()) {
                gfsx gfsx6 = ((fmfh)gfsx5.d()).d();
                if(gfsx6.i()) {
                    jSONObject3.put("LIGHTER_ICON", gfsx6.d());
                }
                else {
                    flbj.c("fmgu", "failed to convert LighterIcon to JSONObject");
                    gfsx7 = gfqx.a;
                    goto label_69;
                }
            }
            gfsx gfsx8 = fmgt0.d.e();
            if(gfsx8.i()) {
                jSONObject3.put("ACTION", gfsx8.d());
                jSONObject3.put("TEXT_COLOR", fmgt0.e);
                jSONObject3.put("BACKGROUND_COLOR", fmgt0.f);
                jSONObject3.put("BORDER_COLOR", fmgt0.g);
                jSONObject3.put("ENABLED", fmgt0.h);
                gfsx7 = gfsx.m(jSONObject3);
            }
            else {
                gfsx7 = gfqx.a;
            }
            goto label_69;
        }
        catch(JSONException unused_ex) {
            try {
                flbj.c("fmgu", "failed to convert RichCardButton to JSONObject");
                gfsx7 = gfqx.a;
            label_69:
                if(gfsx7.i()) {
                    jSONArray0.put(gfsx7.d());
                    goto label_32;
                }
                gfsx3 = gfqx.a;
                goto label_77;
            }
            catch(JSONException unused_ex) {
            }
        }
        try {
        label_74:
            flbj.c("fmgu", "failed to convert RichCardButtons to JSONObject");
            gfsx3 = gfqx.a;
        label_77:
            if(!gfsx3.i()) {
                return gfqx.a;
            }
            jSONObject0.put("RICH_CARD_BUTTONS", gfsx3.d());
            goto label_150;
        label_81:
            fmlp0 = this.a.c();
            jSONObject4 = new JSONObject();
        }
        catch(JSONException jSONException0) {
            flbj.d("fmmo", "Failed to convert UiElement to JSONObject.", jSONException0);
            return gfqx.a;
        }
        try {
            jSONObject4.put("LINE_COLOR", fmlp0.a);
            jSONObject4.put("LINE_WIDTH", ((double)fmlp0.b));
            goto label_90;
        }
        catch(JSONException jSONException2) {
            try {
                flbj.d("HORIZONTAL_LINE", "Failed to convert Horizontal line to JSONObject.", jSONException2);
                gfsx gfsx9 = gfqx.a;
                goto label_91;
            label_90:
                gfsx9 = gfsx.m(jSONObject4);
            label_91:
                if(!gfsx9.i()) {
                    return gfqx.a;
                }
                jSONObject0.put("HORIZONTAL_LINE", gfsx9.d());
                goto label_150;
            label_95:
                fmln0 = this.a.b();
                jSONObject5 = new JSONObject();
            }
            catch(JSONException jSONException0) {
                flbj.d("fmmo", "Failed to convert UiElement to JSONObject.", jSONException0);
                return gfqx.a;
            }
        }
        try {
            jSONArray1 = new JSONArray();
            ggqk ggqk1 = fmln0.a.E();
            while(true) {
            label_99:
                if(!ggqk1.hasNext()) {
                    goto label_128;
                }
                Object object1 = ggqk1.next();
                fmlm0 = (fmlm)object1;
                jSONObject6 = new JSONObject();
                break;
            }
        }
        catch(JSONException unused_ex) {
            goto label_130;
        }
        try {
            jSONObject6.put("DISPLAY_TEXT", fmlm0.c);
            gfsx gfsx10 = fmlm0.b.d();
            if(gfsx10.i()) {
                jSONObject6.put("LIGHTER_ICON", gfsx10.d());
                gfsx gfsx11 = fmlm0.d.e();
                if(gfsx11.i()) {
                    jSONObject6.put("ACTION", gfsx11.d());
                    jSONObject6.put("ICON", flbm.f(fmlm0.a));
                    gfsx12 = gfsx.m(jSONObject6);
                }
                else {
                    flbj.c("HorizontalButton", "Failed to convert action to JSONObject in horizontal layout button.");
                    gfsx12 = gfqx.a;
                }
                goto label_122;
            }
            goto label_116;
        }
        catch(JSONException jSONException3) {
            goto label_120;
        }
        try {
            gfsx12 = gfsx.m(jSONObject6);
            goto label_122;
        }
        catch(JSONException unused_ex) {
            goto label_130;
        }
        try {
        label_116:
            flbj.c("HorizontalButton", "Failed to convert Lighter Icon to JSONObject in horizontal layout button.");
            gfsx12 = gfqx.a;
            goto label_122;
        }
        catch(JSONException jSONException3) {
            try {
            label_120:
                flbj.d("HorizontalButton", "Failed to convert vertical layout button to JSONObject in horizontal layout button.", jSONException3);
                gfsx12 = gfqx.a;
            label_122:
                if(gfsx12.i()) {
                    jSONArray1.put(gfsx12.d());
                    goto label_99;
                }
                flbj.c("HorizontalButton", "Failed to get vertical layout button from JSONObject in horizontal layout Button");
                gfsx13 = gfqx.a;
                goto label_134;
            label_128:
                jSONObject5.put("VERTICAL_LAYOUT_BUTTONS", jSONArray1);
                goto label_133;
            }
            catch(JSONException unused_ex) {
            }
        }
        try {
        label_130:
            flbj.c("HorizontalButton", "Failed to convert Horizontal layout button to JSONObject.");
            gfsx13 = gfqx.a;
            goto label_134;
        label_133:
            gfsx13 = gfsx.m(jSONObject5);
        label_134:
            if(!gfsx13.i()) {
                return gfqx.a;
            }
            jSONObject0.put("HORIZONTAL_LAYOUT_BUTTONS", gfsx13.d());
            goto label_150;
        label_138:
            gfsx gfsx14 = this.a.d().c();
            if(!gfsx14.i()) {
                return gfqx.a;
            }
            jSONObject0.put("IMAGE_ELEMENT", gfsx14.d());
            goto label_150;
        label_143:
            if(!iaea.q()) {
                flbj.c(fmmo.g, "Cannot convert media element to JSONObject, please enable direct-download flag.");
                return gfqx.a;
            }
            gfsx gfsx15 = this.a.e().c();
            if(!gfsx15.i()) {
                return gfqx.a;
            }
            jSONObject0.put("MEDIA_ELEMENT", gfsx15.d());
        label_150:
            jSONObject0.put("PADDING_START", this.b);
            jSONObject0.put("PADDING_TOP", this.c);
            jSONObject0.put("PADDING_BOTTOM", this.e);
            jSONObject0.put("PADDING_END", this.d);
            jSONObject0.put("USE_INCOMING_OUTGOING_COLORS", this.f);
            return gfsx.m(jSONObject0);
        }
        catch(JSONException jSONException0) {
            flbj.d("fmmo", "Failed to convert UiElement to JSONObject.", jSONException0);
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmmo) && this.a.equals(((fmmo)object0).a) && this.b == ((fmmo)object0).b && this.c == ((fmmo)object0).c && this.d == ((fmmo)object0).d && this.e == ((fmmo)object0).e && this.f == ((fmmo)object0).f;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.f ? (this.e ^ (((v * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003) * 1000003 ^ 0x4CF : (this.e ^ (((v * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003) * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return "UiElement{element=" + this.a + ", paddingStart=" + this.b + ", paddingTop=" + this.c + ", paddingEnd=" + this.d + ", paddingBottom=" + this.e + ", useIncomingOutgoingColors=" + this.f + "}";
    }
}

