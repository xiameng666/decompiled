import android.app.Application;
import com.google.android.gms.chimera.modules.play.integrity.api.AppContextProvider;
import com.google.android.gms.play.integrity.api.service.IntegrityApiDisplayListenerApiService;
import java.util.Set;

public abstract class eixc extends cjtg implements eixj, ejbp {
    private volatile eizh a;
    private final Object b;
    private boolean c;

    eixc(int v, String s, Set set0, int v1, int v2) {
        super(v, s, set0, v1, v2);
        this.b = new Object();
        this.c = false;
    }

    public eixc(int v, String s, Set set0, int v1, int v2, ggfp ggfp0) {
        super(v, s, set0, v1, v2, ggfp0);
        this.b = new Object();
        this.c = false;
    }

    eixc(int[] arr_v, String[] arr_s, Set set0, int v, int v1) {
        super(arr_v, arr_s, set0, v, v1);
        this.b = new Object();
        this.c = false;
    }

    eixc(int[] arr_v, String[] arr_s, Set set0, int v, int v1, int v2, ggeo ggeo0) {
        super(arr_v, arr_s, set0, v, v1, v2, ggeo0);
        this.b = new Object();
        this.c = false;
    }

    eixc(int[] arr_v, String[] arr_s, Set set0, int v, int v1, int v2, ggeo ggeo0, ggfp ggfp0) {
        super(arr_v, arr_s, set0, v, v1, v2, ggeo0, ggfp0);
        this.b = new Object();
        this.c = false;
    }

    eixc(int[] arr_v, String[] arr_s, Set set0, int v, gmcg gmcg0, ggeo ggeo0) {
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

    public final void d() {
        if(!this.c) {
            this.c = true;
            ((eiwx)this.h()).a(((IntegrityApiDisplayListenerApiService)this));
        }
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
        return hrui.c() ? eixi.a(this.getBaseContext().getApplicationContext()) : AppContextProvider.a();
    }

    @Override  // com.google.android.chimera.BoundService
    public void onCreate() {
        this.d();
    }
}

