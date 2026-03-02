package com.google.android.gms.app.settings;

import abuv;
import android.content.Intent;
import android.os.Bundle;
import bazr;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import xob;

@GmsCoreVeId(0x3F313)
public class RecoverPermissionChimeraActivity extends xob {
    private Set j;

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 0 && bazr.b.d(this.j).isEmpty()) {
            this.setResult(-1);
        }
        else {
            this.setResult(0);
        }
        this.finish();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ArrayList arrayList0 = this.getIntent().getStringArrayListExtra("requiredGroups");
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            this.j = new HashSet(arrayList0);
            Set set0 = bazr.b.d(this.j);
            if(!set0.isEmpty()) {
                abuv abuv0 = new abuv();
                Bundle bundle1 = new Bundle();
                bundle1.putStringArrayList("missingGroups", new ArrayList(set0));
                abuv0.setArguments(bundle1);
                abuv0.show(this.getSupportFragmentManager(), "PermissionsDialog");
                return;
            }
            this.setResult(-1);
            this.finish();
            return;
        }
        this.setResult(-1);
        this.finish();
    }
}

