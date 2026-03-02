import android.app.Application;
import com.google.android.gms.chimera.modules.health.connect.backups.AppContextProvider;
import com.google.android.gms.healthconnect.backups.api.HealthConnectBackupsApiService;
import java.util.Set;

public abstract class bwgd extends cjtg implements eixj, ejbp {
    private volatile eizh a;
    private final Object b;
    private boolean c;

    bwgd(int v, String s, Set set0, int v1, int v2) {
        super(v, s, set0, v1, v2);
        this.b = new Object();
        this.c = false;
    }

    public bwgd(int v, String s, Set set0, int v1, int v2, ggfp ggfp0) {
        super(v, s, set0, v1, v2, ggfp0);
        this.b = new Object();
        this.c = false;
    }

    bwgd(int[] arr_v, String[] arr_s, Set set0, int v, int v1) {
        super(arr_v, arr_s, set0, v, v1);
        this.b = new Object();
        this.c = false;
    }

    bwgd(int[] arr_v, String[] arr_s, Set set0, int v, int v1, int v2, ggeo ggeo0) {
        super(arr_v, arr_s, set0, v, v1, v2, ggeo0);
        this.b = new Object();
        this.c = false;
    }

    bwgd(int[] arr_v, String[] arr_s, Set set0, int v, int v1, int v2, ggeo ggeo0, ggfp ggfp0) {
        super(arr_v, arr_s, set0, v, v1, v2, ggeo0, ggfp0);
        this.b = new Object();
        this.c = false;
    }

    bwgd(int[] arr_v, String[] arr_s, Set set0, int v, gmcg gmcg0, ggeo ggeo0) {
        super(arr_v, arr_s, set0, v, gmcg0, ggeo0);
        this.b = new Object();
        this.c = false;
    }

    public final eizh c() {
        if(this.a == null) {
            Object object0 = this.b;
            synchronized(object0) {
                if(this.a == null) {
                    this.a = new eizh(this);
                }
            }
            return this.a;
        }
        return this.a;
    }

    @Override  // ejbp
    public final ejbo g() {
        return this.c();
    }

    @Override  // ejbo
    public final Object h() {
        return this.c().h();
    }

    @Override  // eixj
    public final Application iP() {
        if(hrui.c()) {
            return eixi.a(this.getBaseContext().getApplicationContext());
        }
        return AppContextProvider.c == null ? null : AppContextProvider.c.b;
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        if(!this.c) {
            this.c = true;
            bwgc bwgc0 = (bwgc)this.h();
            HealthConnectBackupsApiService healthConnectBackupsApiService0 = (HealthConnectBackupsApiService)this;
            bwgc0.a();
        }
    }
}

