import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ekcw {
    public static final gged_interceptors a;

    static {
        bboh.b("DCU_ContactsXml", bbcu.bN);
        ekcw.a = gged_interceptors.m("android.provider.ALTERNATE_CONTACTS_STRUCTURE", "android.provider.CONTACTS_STRUCTURE");
    }

    static gitk a(Context context0, XmlPullParser xmlPullParser0, ggdy ggdy0) {
        TypedArray typedArray0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gitk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gitk gitk0 = (gitk)hftp0.b_message;
        int v = 4;
        gitk0.c = gite.a(4);
        gitk0.b |= 1;
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlPullParser0);
        try {
        alab1:
            while(true) {
                switch(xmlPullParser0.next()) {
                    case 1: 
                    case 2: {
                        break alab1;
                    }
                }
            }
            String s = xmlPullParser0.getName();
            int v1 = 0;
            if(!"ContactsAccountType".equals(s) && !"ContactsSource".equals(s)) {
                return (gitk)hftp0.N_build();
            }
            int v2 = 0;
            while(true) {
                int v3 = 3;
                if(v2 >= xmlPullParser0.getAttributeCount()) {
                    int v4 = xmlPullParser0.getDepth();
                    while(true) {
                        int v5 = xmlPullParser0.next();
                        if(v5 == 3) {
                            if(xmlPullParser0.getDepth() <= v4) {
                                goto label_24;
                            }
                            v5 = 3;
                        }
                        switch(v5) {
                            case 1: {
                            label_24:
                                if(1 != v1) {
                                    v = 3;
                                }
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                gitk gitk1 = (gitk)hftp0.b_message;
                                gitk1.e = gite.a(v);
                                gitk1.b |= 2;
                                gged_interceptors gged0 = ggdy0.h();
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                gitk gitk2 = (gitk)hftp0.b_message;
                                hfuo hfuo0 = gitk2.d;
                                if(!hfuo0.c()) {
                                    gitk2.d = ProtoLiteMessage.E(hfuo0);
                                }
                                hfrj.E(gged0, gitk2.d);
                                return (gitk)hftp0.N_build();
                            }
                            case 2: {
                                if(xmlPullParser0.getDepth() != v4 + 1) {
                                    continue;
                                }
                                String s1 = xmlPullParser0.getName();
                                if("EditSchema".equals(s1)) {
                                    v1 = 1;
                                    continue;
                                }
                                if(!"ContactsDataKind".equals(s1)) {
                                    continue;
                                }
                                typedArray0 = context0.obtainStyledAttributes(attributeSet0, ekec.a);
                                String s2 = typedArray0.getString(1);
                                if(s2 != null) {
                                    ggdy0.i(s2);
                                }
                                break;
                            }
                            default: {
                                continue;
                            }
                        }
                        typedArray0.recycle();
                    }
                }
                switch(xmlPullParser0.getAttributeName(v2)) {
                    case "dataSet": {
                        String s4 = xmlPullParser0.getAttributeValue(v2);
                        if(s4 == null) {
                            v3 = 1;
                        }
                        else if(!s4.isEmpty()) {
                            v3 = 4;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gitk gitk4 = (gitk)hftp0.b_message;
                        gitk4.g = gite.a(v3);
                        gitk4.b |= 8;
                        break;
                    }
                    case "readOnly": {
                        String s3 = xmlPullParser0.getAttributeValue(v2);
                        if(s3 == null) {
                            v3 = 1;
                        }
                        else if(gfqz.e(s3, "TRUE")) {
                            v3 = 4;
                        }
                        else if(!gfqz.e(s3, "FALSE")) {
                            v3 = 1;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gitk gitk3 = (gitk)hftp0.b_message;
                        gitk3.f = gite.a(v3);
                        gitk3.b |= 4;
                    }
                }
                ++v2;
            }
        }
        catch(XmlPullParserException | IOException unused_ex) {
            return (gitk)hftp0.N_build();
        }
    }
}

