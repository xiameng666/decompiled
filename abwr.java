import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;

public final class abwr {
    public static igtl a(String s, UsageInfo usageInfo0) {
        igtn igtn0;
        DocumentContents documentContents0 = usageInfo0.e;
        if(documentContents0 == null) {
            igtn0 = null;
        }
        else {
            DocumentSection documentSection0 = null;
            batl.q(".private:action");
            DocumentSection[] arr_documentSection = documentContents0.a;
            if(arr_documentSection != null) {
                for(int v = 0; v < arr_documentSection.length; ++v) {
                    DocumentSection documentSection1 = arr_documentSection[v];
                    if(".private:action".equals(documentSection1.d.a)) {
                        documentSection0 = documentSection1;
                        break;
                    }
                }
            }
            if(documentSection0 == null) {
                igtn0 = null;
            }
            else {
                byte[] arr_b = documentSection0.f;
                if(arr_b == null) {
                    igtn0 = null;
                }
                else {
                    try {
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)igtn.a), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        igtn0 = (igtn)hftv0;
                    }
                    catch(hfur unused_ex) {
                        Log.e("SchemaOrgUtils", "Unabled to parse the provided action.");
                        igtn0 = null;
                    }
                }
            }
        }
        if(igtn0 != null) {
            for(Object object0: igtn0.d) {
                igtl igtl0 = (igtl)object0;
                if((igtl0.b & 1) != 0 && (igtl0.b & 2) != 0 && igtl0.c.equals(s)) {
                    return igtl0;
                }
            }
        }
        return null;
    }
}

