import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.firebase.appindexing.internal.ActionImpl.MetadataImpl;
import com.google.firebase.appindexing.internal.ActionImpl;
import java.io.UnsupportedEncodingException;
import java.util.zip.CRC32;

public final class bwti {
    public static UsageInfo a(ActionImpl actionImpl0, long v, String s) {
        String s1 = actionImpl0.c;
        Uri uri0 = Uri.parse(s1);
        String s2 = uri0.getHost();
        if(s2 == null) {
            s2 = "";
        }
        if(!s2.isEmpty()) {
            Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
            ActionImpl.MetadataImpl actionImpl$MetadataImpl0 = actionImpl0.e;
            int v1 = actionImpl$MetadataImpl0.f ? 4 : 5;
            String s3 = actionImpl0.d;
            Uri uri1 = s3 == null ? null : Uri.parse(s3);
            String s4 = actionImpl0.b;
            abvj abvj0 = new abvj();
            abvj0.a(UsageInfo.b(s4));
            if(uri1 != null) {
                abvj0.a(UsageInfo.c(uri1));
            }
            String s5 = intent0.getAction();
            if(s5 != null) {
                abvj0.a(UsageInfo.a("intent_action", s5));
            }
            String s6 = intent0.getDataString();
            if(s6 != null) {
                abvj0.a(UsageInfo.a("intent_data", s6));
            }
            ComponentName componentName0 = intent0.getComponent();
            if(componentName0 != null) {
                abvj0.a(UsageInfo.a("intent_activity", componentName0.getClassName()));
            }
            Bundle bundle0 = intent0.getExtras();
            if(bundle0 != null) {
                String s7 = bundle0.getString("intent_extra_data_key");
                if(s7 != null) {
                    abvj0.a(UsageInfo.a("intent_extra_data", s7));
                }
            }
            byte[] arr_b = actionImpl$MetadataImpl0.e;
            if(arr_b != null && arr_b.length > 0) {
                abvj0.a(new DocumentSection(arr_b, DocumentSection.b));
            }
            String s8 = actionImpl$MetadataImpl0.d;
            if(s8 != null && !s8.isEmpty()) {
                abvj0.b = new Account(s8, "com.google");
            }
            acao acao0 = new acao();
            batl.s(s4);
            acao0.a("name", s4);
            Uri uri2 = Uri.parse(s1);
            batl.s(uri2);
            acao0.a("url", uri2.toString());
            if(s3 != null) {
                acao0.a("id", s3);
            }
            String s9 = actionImpl0.a;
            acao acao1 = new acao();
            acao1.a("type", "http://schema.org/" + s9);
            Bundle bundle1 = acao1.a;
            bundle1.putParcelable("object", acao0.a);
            String s10 = actionImpl0.f;
            if(s10 != null) {
                acao1.a("actionStatus", s10);
            }
            String s11 = actionImpl$MetadataImpl0.c;
            if(s11 != null) {
                acao1.a("completionToken", s11);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putAll(actionImpl0.g);
            batl.t(bundle1.get("object"), "setObject is required before calling build().");
            batl.t(bundle1.get("type"), "setType is required before calling build().");
            Bundle bundle3 = (Bundle)bundle1.getParcelable("object");
            if(bundle3 != null) {
                batl.t(bundle3.get("name"), "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
                batl.t(bundle3.get("url"), "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))");
            }
            bundle2.putAll(bundle1);
            abvj0.a(abxv.b(abxv.a(bundle2)));
            DocumentContents documentContents0 = new DocumentContents(abvj0.b, (abvj0.a == null ? null : ((DocumentSection[])abvj0.a.toArray(new DocumentSection[abvj0.a.size()]))));
            String s12 = intent0.toUri(1);
            CRC32 cRC320 = new CRC32();
            try {
                cRC320.update(s12.getBytes("UTF-8"));
                return new UsageInfo(new DocumentId(s, "", Long.toHexString(cRC320.getValue())), v, v1, null, documentContents0, ((boolean)(actionImpl$MetadataImpl0.b ^ 1)), -1, actionImpl$MetadataImpl0.a, s9);
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                throw new IllegalStateException(unsupportedEncodingException0);
            }
        }
        throw new IllegalArgumentException("AppIndex: The web URL must have a host (follow the format http(s)://<host>/<path>). Provided URI: " + uri0);
    }
}

