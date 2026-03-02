import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class bwtz {
    final ApplicationInfo a;
    final Context b;
    final XmlPullParser c;
    private final TypedValue d;

    public bwtz(ApplicationInfo applicationInfo0, Context context0, XmlPullParser xmlPullParser0) {
        this.a = applicationInfo0;
        this.b = context0;
        this.c = xmlPullParser0;
        this.d = new TypedValue();
    }

    public final bwtw a(String s) {
        GlobalSearchCorpusConfig globalSearchCorpusConfig0;
        boolean z8;
        boolean z7;
        String s25;
        abwh abwh1;
        String s24;
        Feature feature0;
        boolean z6;
        int v7;
        bwtx bwtx2;
        GlobalSearchApplicationInfo globalSearchApplicationInfo0;
        boolean z;
        XmlPullParser xmlPullParser0;
        try {
        alab1:
            while(true) {
                xmlPullParser0 = this.c;
                z = true;
                switch(xmlPullParser0.next()) {
                    case 1: {
                        throw this.f("No start tag found!");
                    }
                    case 2: {
                        break alab1;
                    }
                }
            }
            if(!xmlPullParser0.getName().equals("AppDataSearch")) {
                throw this.f("Invalid root tag " + xmlPullParser0.getName() + "; expected AppDataSearch");
            }
            bwtx bwtx0 = new bwtx(xmlPullParser0);
            ArrayList arrayList0 = new ArrayList();
            while(true) {
                globalSearchApplicationInfo0 = null;
            label_10:
                if(!bwtx0.b()) {
                    return new bwtw(arrayList0, globalSearchApplicationInfo0);
                }
                String s1 = bwtx0.a();
                if("Corpus".equals(s1)) {
                    break;
                }
                if(!"GlobalSearch".equals(s1)) {
                    throw this.f(a.a(s1, "Invalid tag ", " inside AppDataSearch; expected Corpus or GlobalSearch"));
                }
                if(globalSearchApplicationInfo0 != null) {
                    throw this.f("Duplicate element GlobalSearch");
                }
                AttributeSet attributeSet0 = Xml.asAttributeSet(xmlPullParser0);
                if(attributeSet0 == null) {
                    throw this.f("No attributes specified");
                }
                int v = this.a.icon;
                boolean z1 = true;
                int v2 = 0;
                int v3 = 0;
                String s2 = null;
                String s3 = null;
                String s4 = null;
                for(int v1 = 0; v1 < attributeSet0.getAttributeCount(); ++v1) {
                    String s5 = attributeSet0.getAttributeName(v1);
                    if("searchEnabled".equals(s5)) {
                        z1 = attributeSet0.getAttributeBooleanValue(v1, z1);
                    }
                    else if("searchLabel".equals(s5)) {
                        v2 = this.e(attributeSet0, v1);
                    }
                    else if("settingsDescription".equals(s5)) {
                        v3 = this.e(attributeSet0, v1);
                    }
                    else if("defaultIntentAction".equals(s5)) {
                        s2 = this.h(attributeSet0, v1);
                    }
                    else if("defaultIntentData".equals(s5)) {
                        s3 = this.h(attributeSet0, v1);
                    }
                    else if("defaultIntentActivity".equals(s5)) {
                        s4 = this.h(attributeSet0, v1);
                    }
                    else {
                        if(!"globalSearchIcon".equals(s5)) {
                            throw this.f("Invalid attribute name " + s5);
                        }
                        v = this.d(attributeSet0, v1);
                    }
                }
                if(v2 == 0) {
                    throw this.f("No label specified");
                }
                if(z1) {
                    arrayList0 = arrayList0;
                    bwtx0 = bwtx0;
                    globalSearchApplicationInfo0 = new GlobalSearchApplicationInfo(s, null, v2, v3, v, s2, s3, s4);
                    goto label_10;
                }
                arrayList0 = arrayList0;
                bwtx0 = bwtx0;
            }
            AttributeSet attributeSet1 = Xml.asAttributeSet(xmlPullParser0);
            if(attributeSet1 == null) {
                throw this.f("No attributes specified");
            }
            String s6 = "0";
            String s7 = "searchEnabled";
            boolean z2 = false;
            Uri uri0 = null;
            boolean z3 = false;
            String s8 = null;
            int v4 = 0;
            String s9 = null;
            for(int v5 = 0; v5 < attributeSet1.getAttributeCount(); ++v5) {
                String s10 = attributeSet1.getAttributeName(v5);
                if("corpusId".equals(s10)) {
                    s8 = this.h(attributeSet1, v5);
                }
                else if("corpusVersion".equals(s10)) {
                    s6 = this.h(attributeSet1, v5);
                }
                else if("contentProviderUri".equals(s10)) {
                    String s11 = this.h(attributeSet1, v5);
                    uri0 = s11 == null ? null : Uri.parse(s11);
                }
                else if("trimmable".equals(s10)) {
                    z = attributeSet1.getAttributeBooleanValue(v5, z);
                }
                else if("schemaOrgType".equals(s10)) {
                    s9 = this.h(attributeSet1, v5);
                }
                else if("semanticallySearchable".equals(s10)) {
                    z2 = attributeSet1.getAttributeBooleanValue(v5, z2);
                }
                else if("documentMaxAgeSecs".equals(s10)) {
                    v4 = attributeSet1.getAttributeIntValue(v5, v4);
                }
                else {
                    if(!"perAccountTemplate".equals(s10)) {
                        throw this.f("Invalid attribute name " + s10);
                    }
                    z3 = attributeSet1.getAttributeBooleanValue(v5, z3);
                }
            }
            if(s8 == null) {
                throw this.f("No corpus ID specified.");
            }
            if(uri0 == null) {
                throw this.f("No content provider URI specified.");
            }
            abwh abwh0 = new abwh(s8);
            abwh0.b = uri0;
            abwh0.e = z;
            abwh0.h = s9;
            abwh0.i = z2;
            abwh0.j = v4;
            if(s6 != null) {
                abwh0.a = s6;
            }
            bwtx bwtx1 = new bwtx(xmlPullParser0);
            int v6 = 0;
            while(true) {
                if(!bwtx1.b()) {
                    arrayList0.add(new bwtv(abwh0.a(), z3));
                    arrayList0 = arrayList0;
                    z = true;
                    bwtx0 = bwtx0;
                    globalSearchApplicationInfo0 = globalSearchApplicationInfo0;
                    goto label_10;
                }
                String s12 = bwtx1.a();
                if("Section".equals(s12)) {
                    AttributeSet attributeSet2 = Xml.asAttributeSet(xmlPullParser0);
                    if(attributeSet2 == null) {
                        throw this.f("No attributes specified");
                    }
                    bwtx2 = bwtx1;
                    v7 = v6;
                    String s13 = "plain";
                    String s14 = null;
                    String s15 = null;
                    boolean z4 = false;
                    int v8 = 1;
                    int v9 = 0;
                    String s16 = null;
                    boolean z5 = false;
                    while(true) {
                        z6 = z3;
                        String s17 = "url";
                        if(v9 >= attributeSet2.getAttributeCount()) {
                            if(s16 == null) {
                                throw this.f("No section ID specified.");
                            }
                            abwj abwj0 = new abwj(s16);
                            abwj0.a = s13;
                            abwj0.b = z5;
                            abwj0.c = v8;
                            abwj0.d = z4;
                            abwj0.e = s14;
                            abwj0.f = s15;
                            HashSet hashSet0 = new HashSet();
                            bwtx bwtx3 = new bwtx(xmlPullParser0);
                            while(bwtx3.b()) {
                                String s18 = bwtx3.a();
                                if(!"SectionFeature".equals(s18)) {
                                    throw this.f(a.a(s18, "Invalid tag ", " inside Section; expected SectionFeature"));
                                }
                                AttributeSet attributeSet3 = Xml.asAttributeSet(xmlPullParser0);
                                if(attributeSet3 == null) {
                                    throw this.f("No attributes specified");
                                }
                                String s19 = "";
                                int v11 = -1;
                                for(int v10 = 0; v10 < attributeSet3.getAttributeCount(); ++v10) {
                                    s19 = attributeSet3.getAttributeName(v10);
                                    if(!"featureType".equals(s19)) {
                                        throw this.f("Invalid attribute name " + s19);
                                    }
                                    v11 = attributeSet3.getAttributeIntValue(v10, v11);
                                }
                                bwtx bwtx4 = new bwtx(xmlPullParser0);
                                Bundle bundle0 = new Bundle();
                                while(bwtx4.b()) {
                                    String s20 = bwtx4.a();
                                    if(!"FeatureParam".equals(s20)) {
                                        throw this.f(a.a(s20, "Invalid tag ", " inside SectionFeature; expected FeatureParam"));
                                    }
                                    AttributeSet attributeSet4 = Xml.asAttributeSet(xmlPullParser0);
                                    if(attributeSet4 == null) {
                                        throw this.f("No attributes specified");
                                    }
                                    int v12 = 0;
                                    String s21 = null;
                                    String s22 = null;
                                    while(v12 < attributeSet4.getAttributeCount()) {
                                        String s23 = attributeSet4.getAttributeName(v12);
                                        if("paramName".equals(s23)) {
                                            s22 = attributeSet4.getAttributeValue(v12);
                                        }
                                        else {
                                            if(!"paramValue".equals(s23)) {
                                                throw this.f("Invalid attribute name " + s23);
                                            }
                                            s21 = this.h(attributeSet4, v12);
                                        }
                                        ++v12;
                                        s19 = s19;
                                    }
                                    if(s22 == null || s21 == null) {
                                        throw this.f("Both name and value must be specified");
                                    }
                                    bundle0.putString(s22, s21);
                                    bwtx3 = bwtx3;
                                    bwtx4 = bwtx4;
                                    s19 = s19;
                                }
                                switch(v11) {
                                    case -1: {
                                        throw this.f("No type specified.");
                                    }
                                    case 1: {
                                        if(!bundle0.isEmpty()) {
                                            throw this.f("Section feature match_global_nicknames does not take set");
                                        }
                                        feature0 = new Feature(1);
                                        s24 = s17;
                                        goto label_242;
                                    }
                                    case 2: {
                                        double f = this.c("demote_common_words", bundle0);
                                        Feature feature1 = new Feature(2);
                                        feature1.d("factor", String.valueOf(f));
                                        feature0 = feature1;
                                        s24 = s17;
                                        goto label_242;
                                    }
                                    case 3: {
                                        if("rfc822".equals(s13)) {
                                            double f1 = this.c("demote_rfc822_hostnames", bundle0);
                                            Feature feature2 = new Feature(3);
                                            feature2.d("factor", String.valueOf(f1));
                                            feature0 = feature2;
                                            s24 = s17;
                                            goto label_242;
                                        }
                                        else {
                                            v11 = 3;
                                        }
                                    }
                                }
                                if(v11 == 4) {
                                    s24 = s17;
                                    if(s24.equals(s13)) {
                                        feature0 = new Feature(4);
                                        goto label_242;
                                    }
                                    else {
                                        v11 = 4;
                                        goto label_235;
                                    }
                                    goto label_234;
                                }
                                else {
                                label_234:
                                    s24 = s17;
                                }
                            label_235:
                                switch(v11) {
                                    case 5: {
                                        feature0 = new Feature(5);
                                        break;
                                    }
                                    case 6: {
                                        feature0 = abwy.c(new String[]{"AddressAnnotator", "DateAnnotator", "PhoneAnnotator", "UrlAnnotator"});
                                        break;
                                    }
                                    default: {
                                        throw this.f(a.l(s13, s19, "Invalid section feature of type ", " inside section with format "));
                                    }
                                }
                            label_242:
                                Integer integer0 = (int)feature0.a;
                                if(hashSet0.contains(integer0)) {
                                    throw this.f("Duplicate feature defined for section");
                                }
                                abwj0.b(feature0);
                                hashSet0.add(integer0);
                                s17 = s24;
                                bwtx3 = bwtx3;
                            }
                            abwh1 = abwh0;
                            abwh1.c(abwj0.a());
                            s25 = s7;
                            goto label_305;
                        }
                        String s26 = attributeSet2.getAttributeName(v9);
                        if("sectionId".equals(s26)) {
                            s16 = this.h(attributeSet2, v9);
                        }
                        else if("sectionFormat".equals(s26)) {
                            switch(attributeSet2.getAttributeIntValue(v9, 0)) {
                                case 0: {
                                    s13 = "plain";
                                    break;
                                }
                                case 1: {
                                    s13 = "html";
                                    break;
                                }
                                case 2: {
                                    s13 = "rfc822";
                                    break;
                                }
                                case 3: {
                                    s13 = "url";
                                    break;
                                }
                                case 4: {
                                    s13 = "date";
                                    break;
                                }
                                default: {
                                    throw this.f("Invalid section format");
                                }
                            }
                        }
                        else if("noIndex".equals(s26)) {
                            z5 = attributeSet2.getAttributeBooleanValue(v9, z5);
                        }
                        else if("sectionWeight".equals(s26)) {
                            v8 = attributeSet2.getAttributeIntValue(v9, v8);
                        }
                        else if("indexPrefixes".equals(s26)) {
                            z4 = attributeSet2.getAttributeBooleanValue(v9, z4);
                        }
                        else if("subsectionSeparator".equals(s26)) {
                            s14 = this.h(attributeSet2, v9);
                        }
                        else {
                            if(!"schemaOrgProperty".equals(s26)) {
                                throw this.f("Invalid attribute name " + s26);
                            }
                            s15 = this.h(attributeSet2, v9);
                        }
                        ++v9;
                        z3 = z6;
                        abwh0 = abwh0;
                    }
                }
                else {
                    bwtx2 = bwtx1;
                    v7 = v6;
                    z6 = z3;
                    abwh1 = abwh0;
                    if("GlobalSearchCorpus".equals(s12)) {
                        if(v7 != 0) {
                            throw this.f("Duplicate element GlobalSearchCorpus");
                        }
                        AttributeSet attributeSet5 = Xml.asAttributeSet(xmlPullParser0);
                        if(attributeSet5 == null) {
                            z7 = false;
                            z8 = true;
                        }
                        else {
                            int v13 = 0;
                            z7 = false;
                            z8 = true;
                            while(v13 < attributeSet5.getAttributeCount()) {
                                String s28 = attributeSet5.getAttributeName(v13);
                                if(s7.equals(s28)) {
                                    z8 = attributeSet5.getAttributeBooleanValue(v13, z8);
                                }
                                else {
                                    if(!"allowShortcuts".equals(s28)) {
                                        throw this.f("Invalid attribute name " + s28);
                                    }
                                    z7 = attributeSet5.getAttributeBooleanValue(v13, z7);
                                }
                                ++v13;
                                s7 = s7;
                            }
                        }
                        int[] arr_v = new int[10];
                        bwtx bwtx6 = new bwtx(xmlPullParser0);
                        while(bwtx6.b()) {
                            String s29 = bwtx6.a();
                            if(!"GlobalSearchSection".equals(s29)) {
                                throw this.f(a.a(s29, "Invalid tag ", " inside GlobalSearchCorpus; expected GlobalSearchSection"));
                            }
                            AttributeSet attributeSet6 = Xml.asAttributeSet(bwtx6.a);
                            if(attributeSet6 == null) {
                                throw this.f("No attributes specified");
                            }
                            int v14 = -1;
                            int v16 = 0;
                            for(int v15 = 0; v15 < attributeSet6.getAttributeCount(); ++v15) {
                                String s30 = attributeSet6.getAttributeName(v15);
                                if("sectionType".equals(s30)) {
                                    v14 = attributeSet6.getAttributeIntValue(v15, v14);
                                }
                                else {
                                    if(!"sectionContent".equals(s30)) {
                                        throw this.f("Invalid attribute name " + s30);
                                    }
                                    v16 = this.e(attributeSet6, v15);
                                }
                            }
                            if(v14 == -1) {
                                throw this.f("No sectionType specified");
                            }
                            if(v14 < 0 || v14 > 10) {
                                throw this.f("Section ID out of range; badly formed XML?");
                            }
                            arr_v[v14] = v16;
                        }
                        if(z8) {
                            ArrayList arrayList1 = new ArrayList();
                            if(z7) {
                                arrayList1.add(new Feature(1));
                            }
                            globalSearchCorpusConfig0 = new GlobalSearchCorpusConfig(arr_v, ((Feature[])arrayList1.toArray(new Feature[arrayList1.size()])));
                        }
                        else {
                            globalSearchCorpusConfig0 = null;
                        }
                        abwh1.d = globalSearchCorpusConfig0;
                        abwh0 = abwh1;
                        s7 = s7;
                        v6 = 1;
                        bwtx1 = bwtx2;
                    }
                    else {
                        s25 = s7;
                        if(!"IMECorpus".equals(s12)) {
                            throw this.f(a.a(s12, "Invalid tag ", " inside Corpus; expected Section or GlobalSearchCorpus"));
                        }
                        bwtx bwtx5 = new bwtx(xmlPullParser0);
                        while(bwtx5.b()) {
                            String s27 = bwtx5.a();
                            if("IMESection".equals(s27)) {
                                continue;
                            }
                            throw this.f(a.a(s27, "Invalid tag ", " inside IMECorpus; expected IMESection"));
                        }
                    label_305:
                        abwh0 = abwh1;
                        s7 = s25;
                        bwtx1 = bwtx2;
                        v6 = v7;
                    }
                }
                z3 = z6;
            }
        }
        catch(XmlPullParserException | IOException exception0) {
            bwne.j(exception0, "Failed to read search metadata from package %s", new Object[]{this.a.packageName});
            throw this.f("Failed to read search metadata from package " + this.a.packageName);
        }
    }

    final String b(String s, int v, boolean z) {
        if(v == 0) {
            return null;
        }
        try {
            Resources resources0 = this.b.getResources();
            TypedValue typedValue0 = this.d;
            resources0.getValue(v, typedValue0, true);
            if(!z && typedValue0.changingConfigurations != 0) {
                throw this.f(s + " must not change between configurations");
            }
            switch(typedValue0.type) {
                case 0: {
                    return null;
                }
                case 3: {
                    if(typedValue0.string != null) {
                        return typedValue0.string.toString();
                    }
                    throw this.f(s + " refer to a null string resource");
                }
                default: {
                    throw this.f(s + " does not refer to a string resource");
                }
            }
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            throw this.g(s + " resource not found", resources$NotFoundException0);
        }
        catch(NullPointerException nullPointerException0) {
            throw this.g(s + " getStringResource threw a NPE", nullPointerException0);
        }
    }

    private final double c(String s, Bundle bundle0) {
        double f;
        String s1 = bundle0.getString("factor");
        if(s1 == null) {
            throw this.f(a.a(s, "Section feature ", " needs parameter factor"));
        }
        try {
            f = Double.parseDouble(s1);
        }
        catch(NumberFormatException unused_ex) {
            throw this.f(a.a(s1, "Parameter factor=", " must be a number > 0 and <= 1"));
        }
        if(f > 0.0 && f <= 1.0) {
            return f;
        }
        throw this.f("Factor not in range: Must be > 0 and <= 1 " + s1);
    }

    private final int d(AttributeSet attributeSet0, int v) {
        int v1 = attributeSet0.getAttributeResourceValue(v, -1);
        if(v1 != -1) {
            return v1;
        }
        throw this.f(attributeSet0.getAttributeName(v) + " must be a resource reference.");
    }

    private final int e(AttributeSet attributeSet0, int v) {
        int v1 = this.d(attributeSet0, v);
        this.b(attributeSet0.getAttributeName(v), v1, true);
        return v1;
    }

    private final bwty f(String s) {
        throw new bwty("com.google.android.gms", this.c, s);
    }

    private final bwty g(String s, Throwable throwable0) {
        throw new bwty("com.google.android.gms", this.c, s, throwable0);
    }

    private final String h(AttributeSet attributeSet0, int v) {
        int v1 = attributeSet0.getAttributeResourceValue(v, -1);
        return v1 == -1 ? attributeSet0.getAttributeValue(v) : this.b(attributeSet0.getAttributeName(v), v1, false);
    }
}

