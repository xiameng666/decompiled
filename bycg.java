import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

public final class bycg {
    public static final bych a(Context context0, ComponentName componentName0, boolean z) {
        XmlResourceParser xmlResourceParser0;
        ServiceInfo serviceInfo0;
        ibuq.f(context0, "context");
        ibuq.f(componentName0, "credentialManagerService");
        try {
            serviceInfo0 = context0.getPackageManager().getServiceInfo(componentName0, 0x80);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            throw new IllegalArgumentException("Invalid service - serviceInfo not found for the provider", packageManager$NameNotFoundException0);
        }
        if(serviceInfo0 == null) {
            throw new IllegalArgumentException("Invalid service - serviceInfo not found for the provider");
        }
        if(!bbqa.d()) {
            return new bych(componentName0, serviceInfo0, bych.a, componentName0, serviceInfo0, componentName0, z);
        }
        try {
            xmlResourceParser0 = serviceInfo0.loadXmlMetaData(context0.getPackageManager(), "android.credentials.provider");
        }
        catch(NullPointerException nullPointerException0) {
            throw new IllegalArgumentException("Invalid service - metadata not found for provider", nullPointerException0);
        }
        if(xmlResourceParser0 == null) {
            throw new IllegalArgumentException("Invalid service - metadata not found for provider");
        }
        String s = componentName0.getPackageName();
        ibuq.e(s, "getPackageName(...)");
        ibuq.f(s, "packageName");
        bycf bycf0 = bycg.b(xmlResourceParser0, s);
        ServiceInfo serviceInfo1 = null;
        List list0 = bycf0.a == null ? null : ibpo.ar(bycf0.a);
        ComponentName componentName1 = bycf0.b;
        ComponentName componentName2 = bycf0.c;
        if(list0 == null || list0.isEmpty()) {
            throw new IllegalArgumentException("Invalid service - no capabilities found for provider");
        }
        if(componentName1 != null) {
            try {
                serviceInfo1 = context0.getPackageManager().getServiceInfo(componentName1, 0x80);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
        }
        return new bych(componentName0, serviceInfo0, list0, componentName1, serviceInfo1, componentName2, z);
    }

    public static final bycf b(XmlResourceParser xmlResourceParser0, String s) {
        bycf bycf0 = new bycf(s);
        try {
            for(int v = 0; v != 1 && v != 2; v = xmlResourceParser0.next()) {
            }
            if(ibuq.m("credential-provider", xmlResourceParser0.getName())) {
                int v1 = xmlResourceParser0.getDepth();
                int v2 = 0;
            alab1:
                while(true) {
                label_8:
                    switch(v2) {
                        case 1: {
                            break alab1;
                        }
                        case 3: {
                            if(xmlResourceParser0.getDepth() <= v1) {
                                break alab1;
                            }
                        label_11:
                            v2 = xmlResourceParser0.next();
                            if(v2 == 3) {
                                break;
                            }
                            switch(v2) {
                                case 1: {
                                    break alab1;
                                }
                                case 2: {
                                    goto label_16;
                                }
                                case 4: {
                                    break label_8;
                                }
                            }
                            int v3 = v2;
                            goto label_33;
                        label_16:
                            if(ibuq.m(xmlResourceParser0.getName(), "capabilities")) {
                                ArrayList arrayList0 = new ArrayList();
                                int v4 = xmlResourceParser0.getDepth();
                                int v5 = 0;
                            alab2:
                                while(true) {
                                    switch(v5) {
                                        case 1: {
                                            break alab2;
                                        }
                                        case 3: {
                                            goto label_22;
                                        }
                                    }
                                    goto label_23;
                                label_22:
                                    if(xmlResourceParser0.getDepth() <= v4) {
                                        break;
                                    }
                                label_23:
                                    v5 = xmlResourceParser0.next();
                                    switch(v5) {
                                        case 1: {
                                            break alab2;
                                        }
                                        case 3: 
                                        case 4: {
                                            continue;
                                        }
                                    }
                                    if("capability".equals(xmlResourceParser0.getName())) {
                                        String s1 = xmlResourceParser0.getAttributeValue(null, "name");
                                        if(s1 != null) {
                                            arrayList0.add(s1);
                                        }
                                    }
                                }
                                bycf0.a = ibpo.ar(arrayList0);
                                break;
                            }
                            else {
                                v3 = 2;
                            }
                        label_33:
                            if(v3 != 2) {
                                if(v3 == 2) {
                                    goto label_38;
                                }
                                break;
                            }
                            else if(ibuq.m(xmlResourceParser0.getName(), "events-service")) {
                                bycf0.b = bycg.c(xmlResourceParser0, s);
                                break;
                            }
                        label_38:
                            if(!ibuq.m(xmlResourceParser0.getName(), "device-setup-service")) {
                                break;
                            }
                            bycf0.c = bycg.c(xmlResourceParser0, s);
                            break;
                        }
                        default: {
                            goto label_11;
                        }
                    }
                }
            }
        }
        catch(IOException | XmlPullParserException unused_ex) {
        }
        return bycf0;
    }

    private static final ComponentName c(XmlResourceParser xmlResourceParser0, String s) {
        return new ComponentName(s, s + "." + xmlResourceParser0.getAttributeValue(null, "class-name"));
    }
}

