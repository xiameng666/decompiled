import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.core.settings.ControlPage;
import com.google.android.gms.core.settings.ControlPageRequest;
import com.google.android.gms.core.settings.ControlPageResponse;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public final class bcxt extends cjtm {
    private final bcxw a;
    private final bcxz b;
    private final ControlPageRequest c;

    public bcxt(bcxw bcxw0, bcxz bcxz0, ControlPageRequest controlPageRequest0, azug azug0) {
        super(329, "GetControlPages", azug0);
        this.a = bcxw0;
        this.b = bcxz0;
        this.c = controlPageRequest0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        Status status0 = Status.b;
        bcxw bcxw0 = this.a;
        if(bcxw0.b == null || bcxw0.b.isEmpty()) {
            Bundle bundle0 = new Bundle();
            cjah.b(bundle0, bcxv.c);
            bcxv.b = new CountDownLatch(1);
            Intent intent0 = new Intent("com.google.android.gms.GOOGLE_SETTINGS_OPERATION").setPackage("com.google.android.gms");
            bundle0.putString("className", "GmscoreSettingsApiService");
            intent0.putExtras(bundle0);
            bcxw0.a.d.startService(intent0);
            try {
                bcxv.b.await();
            }
            catch(InterruptedException interruptedException0) {
                Log.w("CoreSettingsGetter", interruptedException0);
            }
            List list0 = bcxv.c;
            ArrayList arrayList0 = new ArrayList(list0.size());
            synchronized(list0) {
                for(Object object0: list0) {
                    ((Parcel)object0).setDataPosition(0);
                    arrayList0.add(((GoogleSettingsItem)GoogleSettingsItem.CREATOR.createFromParcel(((Parcel)object0))));
                    ((Parcel)object0).recycle();
                }
            }
            bcxv.c.clear();
            bcxw0.b = arrayList0;
        }
        ArrayList arrayList1 = new ArrayList();
        bbdr bbdr0 = new bbdr(null);
        hgiq hgiq0 = hgiq.b(this.c.a);
        if(hgiq0 != null) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object1: bbdr0.a.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                hgim hgim0 = ((hgik)map$Entry0.getValue()).c;
                if(hgim0 == null) {
                    hgim0 = hgim.a;
                }
                if((hgiq.b(hgim0.b) == null ? hgiq.u : hgiq.b(hgim0.b)) == hgiq0) {
                    linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                }
            }
            Set set0 = linkedHashMap0.keySet();
            for(Object object2: bcxw0.b) {
                GoogleSettingsItem googleSettingsItem0 = (GoogleSettingsItem)object2;
                if(!set0.contains(bbdi.b(googleSettingsItem0.o))) {
                    continue;
                }
                bcxo bcxo0 = new bcxo();
                bcxo0.a(false);
                Intent intent1 = googleSettingsItem0.a;
                if(intent1 == null) {
                    throw new NullPointerException("Null intent");
                }
                bcxo0.d = intent1;
                bcxo0.e = googleSettingsItem0.h;
                bcxo0.f = googleSettingsItem0.p;
                bcxo0.a(googleSettingsItem0.e);
                bcxo0.h = googleSettingsItem0.i;
                bcxo0.i = (byte)(bcxo0.i | 2);
                awkv awkv0 = awkv.b(googleSettingsItem0.n);
                gftb.check(awkv0);
                bcxo0.a = awkv0;
                bbdi bbdi0 = bbdi.b(googleSettingsItem0.o);
                gftb.check(bbdi0);
                bcxo0.b = bbdi0;
                String s = googleSettingsItem0.c;
                if(s != null) {
                    bcxo0.c = s;
                }
                if(bcxo0.i == 3) {
                    awkv awkv1 = bcxo0.a;
                    if(awkv1 != null) {
                        bbdi bbdi1 = bcxo0.b;
                        if(bbdi1 != null) {
                            String s1 = bcxo0.c;
                            if(s1 != null) {
                                Intent intent2 = bcxo0.d;
                                if(intent2 != null) {
                                    String s2 = bcxo0.e;
                                    String s3 = bcxo0.f;
                                    boolean z = bcxo0.g;
                                    boolean z1 = bcxo0.h;
                                    int v1 = bbdi1.a();
                                    arrayList1.add(new ControlPage(awkv1.bz, v1, s1, intent2, s2, s3, z, z1));
                                    continue;
                                }
                            }
                        }
                    }
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                if(bcxo0.a == null) {
                    stringBuilder0.append(" controlPageId");
                }
                if(bcxo0.b == null) {
                    stringBuilder0.append(" facetId");
                }
                if(bcxo0.c == null) {
                    stringBuilder0.append(" title");
                }
                if(bcxo0.d == null) {
                    stringBuilder0.append(" intent");
                }
                if((bcxo0.i & 1) == 0) {
                    stringBuilder0.append(" requiresAnyGoogleAccount");
                }
                if((bcxo0.i & 2) == 0) {
                    stringBuilder0.append(" enabled");
                }
                throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
            }
        }
        bcxr bcxr0 = new bcxr();
        bcxr0.b(arrayList1);
        ControlPageResponse controlPageResponse0 = bcxr0.a();
        ApiMetadata apiMetadata0 = cckf.d(bbdp.aR);
        this.b.a(status0, controlPageResponse0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        bcxr bcxr0 = new bcxr();
        bcxr0.b(ggna.a);
        ControlPageResponse controlPageResponse0 = bcxr0.a();
        this.b.a(status0, controlPageResponse0, ApiMetadata.b);
    }
}

