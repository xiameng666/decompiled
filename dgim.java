import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.nearby.sharing.AppInfo;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ShareTargetAction;

public final class dgim implements dgja {
    private final Context a;
    private final Attachment b;
    private final byte[] c;

    public dgim(Context context0, Attachment attachment0, byte[] arr_b) {
        ibuq.f(context0, "context");
        ibuq.f(attachment0, "attachment");
        super();
        this.a = context0;
        this.b = attachment0;
        this.c = arr_b;
    }

    @Override  // dgja
    public final Object a() {
        Intent intent0 = null;
        ibqm ibqm0 = new ibqm(null);
        if(!hvod.c()) {
            ibuq.f(this.a, "context");
            Intent intent1 = new Intent();
            intent1.setClassName(this.a, "EMPTY_CLASS_NAME");
            intent1.addFlags(0x8000);
            ibqm0.add(new ShareTargetAction("@com.google.android.gms:string/close_button_label", null, fqaw.c(this.a, intent1.hashCode(), intent1, 0xC000000), null, false));
        }
        Attachment attachment0 = this.b;
        AppInfo appInfo0 = dggb.a(attachment0);
        if(appInfo0 != null) {
            String s = appInfo0.a;
            if(s != null) {
                int v = appInfo0.d;
                if(v == 2) {
                label_31:
                    Context context0 = this.a;
                    if(dgiz.e(context0, s)) {
                        dcvz.a.b().p("Package is installed on receiver device.", new Object[0]);
                        intent0 = context0.getPackageManager().getLaunchIntentForPackage(s);
                    }
                    if(intent0 == null) {
                        dcvz.a.b().p("Package is missing on receiver device.", new Object[0]);
                        intent0 = new Intent("android.intent.action.VIEW");
                        intent0.addFlags(0x10008000);
                        intent0.setPackage("com.android.vending");
                        intent0.setData(Uri.parse(djaj.g(s)));
                    }
                    ibqm0.add(dgiz.b(context0, intent0, false));
                }
                else {
                    int v1 = appInfo0.e;
                    if(v1 == 2) {
                        goto label_31;
                    }
                    else {
                        switch(v1) {
                            case 0: {
                                if(!attachment0.h()) {
                                    ibqm0.add(dgiz.c(this.a, true));
                                    return ibpo.a(ibqm0);
                                }
                                break;
                            }
                            case 1: {
                                if(v == 0) {
                                    long v2 = attachment0.b();
                                    ibuq.f(this.a, "context");
                                    Intent intent2 = new Intent("com.google.android.gms.nearby.sharing.INSTALL_APP");
                                    intent2.putExtra("attachment_id", v2);
                                    intent2.putExtra("share_target_bytes", this.c);
                                    intent2.setPackage("com.google.android.gms");
                                    ibqm0.add(new ShareTargetAction("Install", null, dgiz.d(this.a, intent2), "com.google.android.gms.nearby.sharing.INSTALL_APP", true));
                                    return ibpo.a(ibqm0);
                                }
                                break;
                            }
                            default: {
                                return ibpo.a(ibqm0);
                            }
                        }
                    }
                }
            }
        }
        return ibpo.a(ibqm0);
    }
}

