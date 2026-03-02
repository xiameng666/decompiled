import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.model.RestoreOptionsEntity;
import com.google.android.gms.romanesco.model.RestoreResultEntity;
import com.google.android.gms.romanesco.model.RestoreSourceEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class ekhk extends cjtm {
    static final Set a;
    public int b;
    private final ekfh c;
    private final String d;
    private final String e;
    private final Boolean f;
    private final Map g;
    private ekhf h;
    private int i;

    static {
        bboh.b("CBR_RestoreGmsBackup", bbcu.bN);
        ekhk.a = new HashSet();
    }

    public ekhk(ekfh ekfh0, String s, String s1, RestoreOptionsEntity restoreOptionsEntity0, RestoreSourceEntity[] arr_restoreSourceEntity, azug azug0) {
        super(0x87, "RestoreGmsBackup", azug0);
        this.c = ekfh0;
        this.d = s;
        this.e = s1;
        this.g = new HashMap();
        this.f = Boolean.valueOf(restoreOptionsEntity0.a);
        this.i = 0;
        this.b = 0;
        for(int v = 0; v < arr_restoreSourceEntity.length; ++v) {
            RestoreSourceEntity restoreSourceEntity0 = arr_restoreSourceEntity[v];
            this.g.put(restoreSourceEntity0.a, restoreSourceEntity0);
        }
    }

    private static void b(Context context0, int v) {
        ejze.a().q(v, bayo.a(context0.getApplicationContext()).f(), 4);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        int v3;
        boolean z1;
        Context context1;
        boolean z;
        ekgz ekgz0 = ekgz.a(context0);
        HashSet hashSet0 = new HashSet();
        Set set0 = ekhk.a;
        synchronized(set0) {
            for(Object object0: this.g.values()) {
                String s = ((RestoreSourceEntity)object0).a;
                if(!set0.contains(s)) {
                    hashSet0.add(s);
                }
            }
            if(hashSet0.isEmpty()) {
                ekhk.b(context0, 6);
                this.c.g(Status.f, ApiMetadata.b);
                return;
            }
            set0.addAll(hashSet0);
        }
        ekhf ekhf0 = ekhg.b().a(context0);
        this.h = ekhf0;
        ekhf0.e();
        HashMap hashMap0 = new HashMap();
        Iterator iterator1 = hashSet0.iterator();
        while(true) {
            z = false;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object1 = iterator1.next();
            String s1 = (String)object1;
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(((RestoreSourceEntity)this.g.get(s1)).c);
            if(!arrayList0.contains("com.google")) {
                arrayList0.add("com.google");
            }
            String[] arr_s = (String[])arrayList0.toArray(new String[0]);
            gfsx gfsx0 = ekgy.a.a(this.e, s1, arr_s);
            if(gfsx0.i()) {
                hashMap0.put(s1, gfsx0.d());
            }
        }
        if(hashMap0.isEmpty()) {
            context1 = context0;
            ekhh.e(7, ekgz0);
            z1 = false;
        }
        else {
            int v1 = 0;
            for(Object object2: hashMap0.entrySet()) {
                String s2 = (String)((Map.Entry)object2).getKey();
                gsug gsug0 = ekhh.a(((gsug)((Map.Entry)object2).getValue()));
                this.i += gsug0.c.size();
                int v2 = ekhh.c(this.h, context0, gsug0, this.f.booleanValue(), this.d, this.e, s2);
                v1 += v2;
                this.b += (v2 == 0 ? 0 : gsug0.c.size());
                context0 = context0;
            }
            context1 = context0;
            z1 = true;
            boolean z2 = v1 == hashSet0.size();
            if(v1 <= 0 || z2) {
                z1 = false;
            }
            z = z2;
        }
        this.h.d(z, z1);
        if(z) {
            v3 = 3;
        }
        else {
            v3 = z1 ? 8 : 4;
        }
        ekhk.b(context1, v3);
        Status status0 = z || z1 ? Status.b : Status.d;
        RestoreResultEntity restoreResultEntity0 = new RestoreResultEntity(this.i, this.b, status0);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.ez);
        this.c.d(status0, restoreResultEntity0, apiMetadata0);
        if(this.b != 0) {
            new clht(Looper.getMainLooper()).post(new ekhj(this, context1));
        }
        synchronized(ekhk.a) {
            ekhk.a.removeAll(hashSet0);
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        RestoreResultEntity restoreResultEntity0 = new RestoreResultEntity(this.i, this.b, status0);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.ez);
        this.c.d(status0, restoreResultEntity0, apiMetadata0);
    }
}

