import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import java.util.ArrayList;

public class abuu extends avyp {
    @Override  // avyp
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        String s = intent0.hasExtra("title") ? intent0.getStringExtra("title") : null;
        if(s != null) {
            this.setTitle(s);
        }
    }

    @Override  // avyp
    public final void q(bbsh bbsh0) {
        Intent intent0 = this.getIntent();
        ArrayList arrayList0 = intent0.hasExtra("items") ? bauc.g(intent0, "items", GoogleSettingsItem.CREATOR) : null;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                GoogleSettingsItem googleSettingsItem0 = (GoogleSettingsItem)arrayList0.get(v1);
                bbsj bbsj0 = new bbsj(this);
                bbsj0.s(googleSettingsItem0.c);
                bbsj0.m(googleSettingsItem0.a);
                bbsj0.q(googleSettingsItem0.h);
                bbsj0.i(googleSettingsItem0.i);
                int v2 = googleSettingsItem0.d;
                if(v2 > 0) {
                    bbsj0.o(v2);
                }
                bbsh0.a.k(bbsj0);
            }
        }
    }

    @Override  // avyp
    public final void r() {
        this.getIntent().getIntExtra("id", 0);
    }
}

