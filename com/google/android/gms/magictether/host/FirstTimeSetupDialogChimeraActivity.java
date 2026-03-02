package com.google.android.gms.magictether.host;

import android.os.Bundle;
import android.os.ResultReceiver;
import bbdg;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import cpcs;
import cpev;
import cphs;
import hvbn;

@GmsCoreVeId(0x3EDA7)
public class FirstTimeSetupDialogChimeraActivity extends cphs {
    @Override  // cphs
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(((cpcs)this.getSupportFragmentManager().h("dialog_fragment")) == null) {
            String s = this.j;
            String s1 = this.k;
            ResultReceiver resultReceiver0 = (ResultReceiver)this.getIntent().getExtras().getParcelable("result_receiver");
            cpcs cpcs0 = new cpcs();
            Bundle bundle1 = new Bundle();
            bundle1.putString("dialog_title", s);
            bundle1.putString("dialog_message", s1);
            bundle1.putParcelable("dialog_result_receiver", resultReceiver0);
            cpcs0.setArguments(bundle1);
            cpcs0.show(this.getSupportFragmentManager(), "dialog_fragment");
        }
        cpev cpev0 = new cpev();
        if(!hvbn.e()) {
            return;
        }
        cpev0.c.a(bbdg.fC);
        cpev0.b("magictether_setup_notification_tapped_count");
    }
}

