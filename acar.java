import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;
import j..util.Objects;
import java.util.ArrayList;

public final class acar implements View.OnClickListener {
    final AppInviteChimeraActivity a;

    public acar(AppInviteChimeraActivity appInviteChimeraActivity0) {
        Objects.requireNonNull(appInviteChimeraActivity0);
        this.a = appInviteChimeraActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Intent intent0 = new Intent("com.google.android.gms.appinvite.ACTION_PREVIEW");
        AppInviteChimeraActivity appInviteChimeraActivity0 = this.a;
        intent0.setPackage(appInviteChimeraActivity0.j);
        intent0.putExtra("com.google.android.gms.appinvite.LAYOUT_RES_ID", avyq.a(appInviteChimeraActivity0, 0x7F0E00A7));  // layout:appinvite_preview_activity
        ArrayList arrayList0 = new ArrayList();
        intent0.putExtra("com.google.android.gms.appinvite.VIEWS", arrayList0);
        Bundle bundle0 = new Bundle();
        bundle0.putInt("View_id", avyq.a(appInviteChimeraActivity0, 0x7F0B22B8));  // id:title
        bundle0.putBoolean("TextView_isTitle", true);
        arrayList0.add(bundle0);
        Bundle bundle1 = new Bundle();
        bundle1.putInt("View_id", avyq.a(appInviteChimeraActivity0, 0x7F0B22C2));  // id:title_container
        bundle1.putInt("View_minHeight", appInviteChimeraActivity0.l.getHeight());
        arrayList0.add(bundle1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("View_id", avyq.a(appInviteChimeraActivity0, 0x7F0B22C1));  // id:title_close
        bundle2.putCharSequence("View_onClickListener", "close");
        arrayList0.add(bundle2);
        arrayList0.add(appInviteChimeraActivity0.a(0x7F0B11F9, appInviteChimeraActivity0.getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_SUBJECT")));  // id:email_subject
        arrayList0.add(appInviteChimeraActivity0.a(0x7F0B11F7, appInviteChimeraActivity0.n.getText()));  // id:email_message
        Bundle bundle3 = new Bundle();
        bundle3.putInt("View_id", avyq.a(appInviteChimeraActivity0, 0x7F0B11F6));  // id:email_content
        bundle3.putString("WebView_data", appInviteChimeraActivity0.getIntent().getStringExtra("com.google.android.gms.appinvite.EMAIL_CONTENT"));
        arrayList0.add(bundle3);
        if(intent0.resolveActivity(appInviteChimeraActivity0.getPackageManager()) != null) {
            appInviteChimeraActivity0.startActivityForResult(intent0, 0);
            appInviteChimeraActivity0.overridePendingTransition(0x7F010006, 0x7F010008);  // anim:abc_slide_in_bottom
        }
    }
}

