package com.google.firebase.auth.api.gms.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import bauc;
import baun;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import com.google.firebase.auth.internal.FederatedSignInActivity;
import gozi;
import gozj;
import gozl;
import gozr;
import hsym;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import xob;

@GmsCoreVeId(0x3F3E1)
public class BrowserSignInResponseHandlerChimeraActivity extends xob {
    private static final baun j;

    static {
        BrowserSignInResponseHandlerChimeraActivity.j = new baun("FirebaseAuth", new String[]{"IdpResponseHandler"});
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        Status status0;
        String s;
        baun baun0;
        Uri uri0;
        super.onCreate(bundle0);
        Intent intent0 = null;
        try {
            uri0 = this.getIntent().getData();
            baun0 = BrowserSignInResponseHandlerChimeraActivity.j;
            baun0.j("SignInCompleteActivity", new Object[]{"uri:" + uri0});
            if(uri0 == null) {
                this.finish();
                return;
            }
            Set set0 = uri0.getQueryParameterNames();
            if(!set0.contains("cpn")) {
                this.finish();
                return;
            }
            s = uri0.getQueryParameter("cpn");
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            s = null;
            goto label_65;
        }
        try {
            baun0.j("SignInCompleteActivity", new Object[]{"package name (cpn): " + s});
            if(set0.contains("firebaseError")) {
                String s1 = uri0.getQueryParameter("firebaseError");
                Intent intent1 = new Intent(this, FederatedSignInActivity.class);
                intent1.setPackage(s);
                intent1.setClassName(s, FederatedSignInActivity.class.getName());
                intent1.setAction("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED");
                intent1.addFlags(0x24000000);
                try {
                    JSONObject jSONObject0 = new JSONObject(s1);
                    String s2 = jSONObject0.getString("code");
                    String s3 = jSONObject0.getString("message");
                    if(!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3)) {
                        Map map0 = gozr.a;
                        status0 = map0.containsKey(s2) ? gozl.a((((String)map0.get(s2)) + ":" + s3)) : gozl.a(("WEB_INTERNAL_ERROR:" + s1));
                    }
                    else {
                        status0 = gozl.a(("WEB_INTERNAL_ERROR:" + s1));
                    }
                }
                catch(JSONException jSONException0) {
                    status0 = gozl.a(("WEB_INTERNAL_ERROR:" + s1 + "[ " + jSONException0.getLocalizedMessage() + " ]"));
                }
                gozr.a(intent1, status0);
                intent0 = intent1;
            }
            else if(set0.contains("link")) {
                String s4 = uri0.getQueryParameter("link");
                baun0.j("SignInCompleteActivity", new Object[]{"idpResponseUrl (link): " + s4});
                String s5 = uri0.getQueryParameter("eventId");
                Intent intent2 = new Intent(this, FederatedSignInActivity.class);
                intent2.setPackage(s);
                intent2.setClassName(s, FederatedSignInActivity.class.getName());
                intent2.addFlags(0x24000000);
                if(s4 != null && s5 != null) {
                    gozi gozi0 = gozj.a.a(this, s, s5);
                    if(gozi0 == null) {
                        intent2.setAction("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED");
                    }
                    else {
                        bauc.l(new VerifyAssertionRequest(gozi0, s4), intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
                        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", gozi0.b);
                        String s6 = gozi0.d;
                        if(s6 != null) {
                            intent2.putExtra("com.google.firebase.auth.internal.EXTRA_TENANT_ID", s6);
                        }
                    }
                }
                else {
                    intent2.setAction("com.google.firebase.auth.internal.WEB_SIGN_IN_FAILED");
                }
                intent0 = intent2;
            }
            goto label_66;
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
        }
    label_65:
        BrowserSignInResponseHandlerChimeraActivity.j.f("Error parsing url: " + unsupportedOperationException0.getMessage(), new Object[0]);
    label_66:
        if(hsym.a.b().a()) {
            if(intent0 != null) {
                try {
                    this.startActivity(intent0);
                }
                catch(ActivityNotFoundException unused_ex) {
                    BrowserSignInResponseHandlerChimeraActivity.j.f("FederatedSignInActivity not found in package: " + s, new Object[0]);
                    this.finish();
                }
                return;
            }
            this.finish();
            return;
        }
        if(intent0 != null) {
            try {
                this.startActivity(intent0);
            }
            catch(ActivityNotFoundException unused_ex) {
                BrowserSignInResponseHandlerChimeraActivity.j.f("FederatedSignInActivity not found in package: " + s, new Object[0]);
            }
        }
        this.finish();
    }
}

