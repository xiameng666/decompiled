import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmhm {
    public final gged_interceptors a;
    public volatile transient boolean b;
    public volatile transient boolean c;

    public fmhm() {
    }

    public fmhm(gged_interceptors gged0) {
        this.a = gged0;
    }

    public static gfsx a(JSONObject jSONObject0) {
        gfsx gfsx4;
        gfsx gfsx3;
        gfsx gfsx2;
        gfsx gfsx1;
        gfsx gfsx0;
        ggdy ggdy0 = new ggdy();
        try {
            JSONArray jSONArray0 = jSONObject0.getJSONArray("FORMATTED_LINES");
            int v = 0;
            while(v < jSONArray0.length()) {
                JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
                fmgw fmgw0 = new fmgw(null);
                try {
                    fmgw0.e(jSONObject1.getString("RAW_TEXT"));
                    if(jSONObject1.has("SKIP_LEADING_NEWLINE")) {
                        fmgw0.f(jSONObject1.getBoolean("SKIP_LEADING_NEWLINE"));
                    }
                    if(jSONObject1.has("PREDEFINED_STYLE")) {
                        fmgw0.d(fmhg.a(jSONObject1.getInt("PREDEFINED_STYLE")));
                    }
                    if(jSONObject1.has("LINE_STYLE")) {
                        ggdy ggdy1 = new ggdy();
                        JSONArray jSONArray1 = jSONObject1.getJSONArray("LINE_STYLE");
                        int v1 = 0;
                        while(true) {
                            if(v1 >= jSONArray1.length()) {
                                fmgw0.c(ggdy1.h());
                                goto label_37;
                            }
                            JSONObject jSONObject2 = jSONArray1.getJSONObject(v1);
                            try {
                                int v2 = fmhe.a(jSONObject2.getInt("TYPE")).ordinal();
                                if(v2 == 0) {
                                    gfsx0 = gfsx.m(fmdc.a);
                                }
                                else {
                                    switch(v2) {
                                        case 1: {
                                            gfsx0 = gfsx.m(new fmdb(jSONObject2.getInt("INDENTATION")));
                                            break;
                                        }
                                        case 2: {
                                            gfsx0 = gfsx.m(fmda.a);
                                            break;
                                        }
                                        default: {
                                            throw new RuntimeException(null, null);
                                        }
                                    }
                                }
                            }
                            catch(JSONException jSONException1) {
                                flbj.d("RICH_TEXT", "Failed to get LineStyle from JSONObject.", jSONException1);
                                gfsx0 = gfqx.a;
                            }
                            if(gfsx0.i()) {
                                ggdy1.i(gfsx0.d());
                            }
                            ++v1;
                        }
                    }
                    else {
                    label_37:
                        if(jSONObject1.has("FORMATTED_TEXT_SPANS")) {
                            ggdy ggdy2 = new ggdy();
                            JSONArray jSONArray2 = jSONObject1.getJSONArray("FORMATTED_TEXT_SPANS");
                            int v3 = 0;
                            while(v3 < jSONArray2.length()) {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(v3);
                                fmgy fmgy0 = new fmgy();
                                try {
                                    fmgy0.c(jSONObject3.getInt("START_INDEX"));
                                    fmgy0.b(jSONObject3.getInt("END_INDEX"));
                                    ggdy ggdy3 = new ggdy();
                                    JSONArray jSONArray3 = jSONObject3.getJSONArray("TEXT_STYLE_LIST");
                                    int v4 = 0;
                                    while(v4 < jSONArray3.length()) {
                                        JSONObject jSONObject4 = jSONArray3.getJSONObject(v4);
                                        try {
                                            switch(fmhj.a(jSONObject4.getInt("TYPE")).ordinal()) {
                                                case 0: {
                                                    gfsx1 = gfsx.m(new fmdq());
                                                    goto label_100;
                                                }
                                                case 1: {
                                                    gfsx1 = gfsx.m(new fmdf());
                                                    goto label_100;
                                                }
                                                case 2: {
                                                    gfsx1 = gfsx.m(new fmdj());
                                                    goto label_100;
                                                }
                                                case 3: {
                                                    gfsx1 = gfsx.m(new fmdp());
                                                    goto label_100;
                                                }
                                                case 4: {
                                                    gfsx1 = gfsx.m(new fmdl());
                                                    goto label_100;
                                                }
                                                case 5: {
                                                    gfsx1 = gfsx.m(new fmdn());
                                                    goto label_100;
                                                }
                                                case 6: {
                                                    gfsx1 = gfsx.m(new fmdm());
                                                    goto label_100;
                                                }
                                                case 7: {
                                                    gfsx1 = gfsx.m(new fmdg(jSONObject4.getInt("STYLE")));
                                                    goto label_100;
                                                }
                                                case 8: {
                                                    gfsx1 = gfsx.m(new fmde(jSONObject4.getInt("STYLE")));
                                                    goto label_100;
                                                }
                                                case 9: {
                                                    gfsx1 = gfsx.m(new fmdk(jSONObject4.getInt("STYLE")));
                                                    goto label_100;
                                                }
                                                case 10: {
                                                    ggdy ggdy4 = new ggdy();
                                                    JSONArray jSONArray4 = jSONObject4.getJSONArray("STYLE");
                                                    for(int v5 = 0; v5 < jSONArray4.length(); ++v5) {
                                                        ggdy4.i(fmhl.a(jSONArray4.getInt(v5)));
                                                    }
                                                    gfsx1 = gfsx.m(fmds.b(ggdy4.h()));
                                                    goto label_100;
                                                }
                                                case 11: {
                                                    gfsx1 = gfsx.m(new fmdh(jSONObject4.getInt("STYLE")));
                                                    goto label_100;
                                                }
                                                case 12: {
                                                    JSONObject jSONObject5 = jSONObject4.getJSONObject("STYLE");
                                                    fmha fmha0 = new fmha();
                                                    try {
                                                        fmha0.b(jSONObject5.getString("URL"));
                                                    }
                                                    catch(JSONException jSONException3) {
                                                        flbj.c("RICH_TEXT", "Failed to get LighterHyperLink from JSONObject. " + jSONException3.toString());
                                                        gfsx2 = gfqx.a;
                                                        gfsx1 = gfsx2.i() ? gfsx.m(fmds.a(((fmhb)gfsx2.d()))) : gfqx.a;
                                                        goto label_100;
                                                    }
                                                    gfsx2 = gfsx.m(fmha0.a());
                                                    gfsx1 = gfsx2.i() ? gfsx.m(fmds.a(((fmhb)gfsx2.d()))) : gfqx.a;
                                                    goto label_100;
                                                }
                                            }
                                        }
                                        catch(JSONException unused_ex) {
                                            flbj.c("RICH_TEXT", "Failed to get TextStyle from JSONObject");
                                        }
                                        gfsx1 = gfqx.a;
                                    label_100:
                                        if(gfsx1.i()) {
                                            ggdy3.i(gfsx1.d());
                                            ++v4;
                                            continue;
                                        }
                                        else {
                                            gfsx3 = gfqx.a;
                                            goto label_113;
                                        }
                                        break;
                                    }
                                    fmgy0.d(ggdy3.h());
                                }
                                catch(JSONException jSONException2) {
                                    flbj.c("FormattedTextSpan", "Failed to get FormattedTextSpan from JSONObject. " + jSONException2.toString());
                                    gfsx3 = gfqx.a;
                                    goto label_113;
                                }
                                gfsx3 = gfsx.m(fmgy0.a());
                            label_113:
                                if(gfsx3.i()) {
                                    ggdy2.i(gfsx3.d());
                                }
                                ++v3;
                            }
                            fmgw0.b(ggdy2.h());
                        }
                    }
                }
                catch(JSONException jSONException0) {
                    flbj.d("RICH_TEXT", "Failed to get Formatted Line from JSONObject.", jSONException0);
                    gfsx4 = gfqx.a;
                    goto label_124;
                }
                gfsx4 = gfsx.m(fmgw0.a());
            label_124:
                if(!gfsx4.i()) {
                    return gfqx.a;
                }
                ggdy0.i(gfsx4.d());
                ++v;
            }
        }
        catch(JSONException unused_ex) {
            flbj.c("RICH_TEXT", "Failed to get RichText from JSONObject. ");
            return gfqx.a;
        }
        fmgv fmgv0 = new fmgv();
        fmgv0.b(ggdy0.h());
        return gfsx.m(fmgv0.a());
    }

    public final gfsx b() {
        gfsx gfsx4;
        JSONObject jSONObject5;
        fmhb fmhb0;
        JSONObject jSONObject4;
        fmhh fmhh0;
        JSONArray jSONArray3;
        JSONObject jSONObject3;
        fmgz fmgz0;
        JSONArray jSONArray2;
        int v2;
        gged_interceptors gged1;
        gfsx gfsx1;
        JSONObject jSONObject2;
        fmhc fmhc0;
        JSONArray jSONArray1;
        JSONObject jSONObject0 = new JSONObject();
        JSONArray jSONArray0 = new JSONArray();
        gged_interceptors gged0 = this.c();
        int v = ((ggna)gged0).c;
        int v1 = 0;
        while(v1 < v) {
            fmgx fmgx0 = (fmgx)gged0.get(v1);
            JSONObject jSONObject1 = new JSONObject();
            try {
                jSONObject1.put("RAW_TEXT", fmgx0.e());
                if(fmgx0.d().i()) {
                    jSONObject1.put("SKIP_LEADING_NEWLINE", fmgx0.d().d());
                }
                if(fmgx0.c().i()) {
                    jSONObject1.put("PREDEFINED_STYLE", ((fmhg)fmgx0.c().d()).g);
                }
                if(fmgx0.b().i()) {
                    jSONArray1 = new JSONArray();
                    ggqk ggqk0 = ((gged_interceptors)fmgx0.b().d()).E();
                    while(true) {
                    label_16:
                        if(!ggqk0.hasNext()) {
                            jSONObject1.put("LINE_STYLE", jSONArray1);
                            break;
                        }
                        Object object0 = ggqk0.next();
                        fmhc0 = (fmhc)object0;
                        jSONObject2 = new JSONObject();
                        goto label_22;
                    }
                }
                goto label_38;
            }
            catch(JSONException jSONException0) {
                gged1 = gged0;
                v2 = v;
                flbj.d("RICH_TEXT", "Failed to convert FormattedLine to JSONObject.", jSONException0);
                gfsx1 = gfqx.a;
                goto label_143;
            }
            try {
            label_22:
                jSONObject2.put("TYPE", fmhc0.a().d);
                if(fmhc0.a().ordinal() == 1) {
                    jSONObject2.put("INDENTATION", fmhc0.b());
                }
                goto label_30;
            }
            catch(JSONException jSONException1) {
                try {
                    flbj.d("RICH_TEXT", "Failed to convert LineStyle to JSONObject", jSONException1);
                    gfsx gfsx0 = gfqx.a;
                    goto label_31;
                label_30:
                    gfsx0 = gfsx.m(jSONObject2);
                label_31:
                    if(gfsx0.i()) {
                        jSONArray1.put(gfsx0.d());
                        goto label_16;
                    }
                    gfsx1 = gfqx.a;
                    gged1 = gged0;
                    v2 = v;
                    goto label_143;
                label_38:
                    if(fmgx0.a().i()) {
                        jSONArray2 = new JSONArray();
                        ggqk ggqk1 = ((gged_interceptors)fmgx0.a().d()).E();
                        while(true) {
                        label_41:
                            if(!ggqk1.hasNext()) {
                                goto label_132;
                            }
                            Object object1 = ggqk1.next();
                            fmgz0 = (fmgz)object1;
                            jSONObject3 = new JSONObject();
                            goto label_50;
                        }
                    }
                    else {
                        goto label_140;
                    }
                    goto label_142;
                }
                catch(JSONException jSONException0) {
                }
            }
            gged1 = gged0;
            v2 = v;
            flbj.d("RICH_TEXT", "Failed to convert FormattedLine to JSONObject.", jSONException0);
            gfsx1 = gfqx.a;
            goto label_143;
            try {
            label_50:
                jSONObject3.put("START_INDEX", fmgz0.b());
                jSONObject3.put("END_INDEX", fmgz0.a());
                jSONArray3 = new JSONArray();
                ggqk ggqk2 = fmgz0.c().E();
                while(true) {
                label_54:
                    if(!ggqk2.hasNext()) {
                        goto label_116;
                    }
                    Object object2 = ggqk2.next();
                    fmhh0 = (fmhh)object2;
                    jSONObject4 = new JSONObject();
                    break;
                }
            }
            catch(JSONException jSONException2) {
                try {
                    gged1 = gged0;
                    v2 = v;
                    goto label_121;
                }
                catch(JSONException jSONException0) {
                    flbj.d("RICH_TEXT", "Failed to convert FormattedLine to JSONObject.", jSONException0);
                    gfsx1 = gfqx.a;
                    goto label_143;
                }
            }
            try {
                jSONObject4.put("TYPE", fmhh0.b().n);
                gged1 = gged0;
                switch(fmhh0.b().ordinal()) {
                    case 7: {
                        goto label_68;
                    }
                    case 8: {
                        goto label_71;
                    }
                    case 9: {
                        goto label_74;
                    }
                    case 10: {
                        goto label_77;
                    }
                    case 11: {
                        goto label_86;
                    }
                    case 12: {
                        goto label_89;
                    }
                }
            }
            catch(JSONException unused_ex) {
                v2 = v;
                goto label_105;
            }
            v2 = v;
            goto label_108;
            try {
            label_68:
                v2 = v;
                jSONObject4.put("STYLE", fmhh0.d());
                goto label_108;
            label_71:
                v2 = v;
                jSONObject4.put("STYLE", fmhh0.a());
                goto label_108;
            label_74:
                v2 = v;
                jSONObject4.put("STYLE", fmhh0.h());
                goto label_108;
            label_77:
                v2 = v;
                JSONArray jSONArray4 = new JSONArray();
                ggqk ggqk3 = fmhh0.l().E();
                while(ggqk3.hasNext()) {
                    Object object3 = ggqk3.next();
                    jSONArray4.put(((fmhl)object3).j);
                }
                jSONObject4.put("STYLE", jSONArray4);
                goto label_108;
            label_86:
                v2 = v;
                jSONObject4.put("STYLE", fmhh0.e());
                goto label_108;
            }
            catch(JSONException unused_ex) {
                goto label_105;
            }
            try {
            label_89:
                fmhb0 = fmhh0.f();
                jSONObject5 = new JSONObject();
                v2 = v;
            }
            catch(JSONException unused_ex) {
                try {
                    v2 = v;
                    goto label_105;
                }
                catch(JSONException jSONException2) {
                    goto label_121;
                }
            }
            try {
                jSONObject5.put("URL", fmhb0.a);
                goto label_101;
            }
            catch(JSONException jSONException3) {
                try {
                    flbj.c("RICH_TEXT", "Failed to convert LighterHyperLink to JSONObject. " + jSONException3.toString());
                    gfsx gfsx2 = gfqx.a;
                    goto label_102;
                label_101:
                    gfsx2 = gfsx.m(jSONObject5);
                label_102:
                    if(gfsx2.i()) {
                        jSONObject4.put("STYLE", gfsx2.d());
                    }
                    goto label_108;
                }
                catch(JSONException unused_ex) {
                }
            }
            try {
            label_105:
                flbj.c("RICH_TEXT", "Failed to convert text style to JSONObject");
                gfsx gfsx3 = gfqx.a;
                goto label_109;
            label_108:
                gfsx3 = gfsx.m(jSONObject4);
            label_109:
                if(gfsx3.i()) {
                    jSONArray3.put(gfsx3.d());
                    gged0 = gged1;
                    v = v2;
                    goto label_54;
                label_116:
                    gged1 = gged0;
                    v2 = v;
                    jSONObject3.put("TEXT_STYLE_LIST", jSONArray3);
                }
                else {
                    gfsx4 = gfqx.a;
                    goto label_125;
                }
                goto label_124;
            }
            catch(JSONException jSONException2) {
                try {
                label_121:
                    flbj.c("FormattedTextSpan", "Failed to convert FormattedTextSpan to JSONObject. " + jSONException2.toString());
                    gfsx4 = gfqx.a;
                    goto label_125;
                label_124:
                    gfsx4 = gfsx.m(jSONObject3);
                label_125:
                    if(gfsx4.i()) {
                        jSONArray2.put(gfsx4.d());
                        gged0 = gged1;
                        v = v2;
                        goto label_41;
                    label_132:
                        gged1 = gged0;
                        v2 = v;
                        jSONObject1.put("FORMATTED_TEXT_SPANS", jSONArray2);
                        goto label_142;
                    }
                    else {
                        gfsx1 = gfqx.a;
                        goto label_143;
                    }
                    goto label_140;
                }
                catch(JSONException jSONException0) {
                }
            }
            flbj.d("RICH_TEXT", "Failed to convert FormattedLine to JSONObject.", jSONException0);
            gfsx1 = gfqx.a;
            goto label_143;
        label_140:
            gged1 = gged0;
            v2 = v;
        label_142:
            gfsx1 = gfsx.m(jSONObject1);
        label_143:
            if(!gfsx1.i()) {
                return gfqx.a;
            }
            jSONArray0.put(gfsx1.d());
            ++v1;
            gged0 = gged1;
            v = v2;
        }
        try {
            jSONObject0.put("FORMATTED_LINES", jSONArray0);
            return gfsx.m(jSONObject0);
        }
        catch(JSONException unused_ex) {
            flbj.c("RICH_TEXT", "Failed to convert RichText to JSONObject. ");
            return gfqx.a;
        }
    }

    public final gged_interceptors c() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fmhm) ? ggia.i(this.a, ((fmhm)object0).c()) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "RichText{lines=" + this.a.toString() + "}";
    }
}

