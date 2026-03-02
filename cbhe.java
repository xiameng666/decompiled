import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Build;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import org.json.JSONObject;

final class cbhe implements icih {
    final cbhk a;

    public cbhe(cbhk cbhk0) {
        this.a = cbhk0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        cbjq cbjq2;
        cbjq cbjq1;
        cbjq cbjq0;
        if((((cbhy)object0) instanceof cbhw)) {
            ((ggtj)cbhk.ah.h()).x("Starting the Onboarding WebView");
            return ibom.a;
        }
        if((((cbhy)object0) instanceof cbhx)) {
            cbhk cbhk0 = this.a;
            if(cbhk0.aj != null) {
                Context context0 = cbhk0.requireContext();
                try {
                    cbjq0 = new cbjq("com.google.android.gms", ((long)bbms.b(context0, "com.google.android.gms")));
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    a.ae(cbjr.a.j(), "Failed to get Google Play Services version code.", packageManager$NameNotFoundException0);
                    cbjq0 = new cbjq("com.google.android.gms", 0L);
                }
                try {
                    ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = ModuleManager.get(context0).getCurrentModule();
                    String s = moduleManager$ModuleInfo0.moduleId;
                    ibuq.e(s, "moduleId");
                    cbjq1 = new cbjq(s, ((long)moduleManager$ModuleInfo0.moduleVersion));
                }
                catch(IllegalStateException illegalStateException0) {
                    a.ae(cbjr.a.j(), "Failed to get module info.", illegalStateException0);
                    cbjq1 = new cbjq("", 0L);
                }
                PackageInfo packageInfo0 = pyd.a(context0);
                if(packageInfo0 == null) {
                    ((ggtj)cbjr.a.j()).x("Failed to get WebView package.");
                    cbjq2 = new cbjq("", 0L);
                }
                else {
                    String s1 = packageInfo0.packageName;
                    ibuq.e(s1, "packageName");
                    cbjq2 = new cbjq(s1, packageInfo0.getLongVersionCode());
                }
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("model", Build.MODEL);
                jSONObject0.put("os", "Android");
                jSONObject0.put("osVersion", String.valueOf(Build.VERSION.SDK_INT));
                jSONObject0.put("googleServices", cbjq0.a);
                jSONObject0.put("googleServicesVersion", String.valueOf(cbjq0.b));
                jSONObject0.put("app", cbjq1.a);
                jSONObject0.put("appVersion", String.valueOf(cbjq1.b));
                jSONObject0.put("webview", cbjq2.a);
                jSONObject0.put("webviewVersion", String.valueOf(cbjq2.b));
                String s2 = jSONObject0.toString();
                ibuq.e(s2, "toString(...)");
                String s3 = new ibzd("\\(|\\)").b(s2, "_");
                cbhk0.ad().getSettings().setUserAgentString(cbhk0.aj + " " + ("KidsWebView (" + s3 + ")"));
            }
            cbhk0.H();
            return ibom.a;
        }
        if((((cbhy)object0) instanceof cbhv)) {
            ((ggtj)cbhk.ah.j()).x("Flow in progress.");
            return ibom.a;
        }
        if((((cbhy)object0) instanceof cbht)) {
            cbhk cbhk1 = this.a;
            cbhd cbhd0 = new cbhd(cbhk1);
            iw iw0 = cbhk1.ai;
            if(iw0 != null) {
                iw0.dismiss();
            }
            fyju fyju0 = new fyju(cbhk1.requireContext());
            fyju0.N(0x7F1508E3);  // string:common_something_went_wrong "Something went wrong"
            fyju0.C(0x7F151331);  // string:generic_error_description_non_retriable "Something went wrong. Try again 
                                  // later."
            fyju0.L(0x7F150783, new cbgx(cbhd0));  // string:close_button_label "Close"
            fyju0.x(false);
            iw iw1 = fyju0.create();
            iw1.show();
            cbhk1.ai = iw1;
            return ibom.a;
        }
        if(!(((cbhy)object0) instanceof cbhu)) {
            throw new ibnq();
        }
        cbhk.aA(this.a, ((cbhu)(((cbhy)object0))).a);
        return ibom.a;
    }
}

