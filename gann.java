import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class gann extends du {
    private static clht a;
    public final bzt ag;
    public boolean ah;
    public int ai;
    private gamy aj;
    private int b;
    public static final WeakHashMap c;
    public final ArrayList d;

    static {
        gann.c = new WeakHashMap();
    }

    public gann() {
        this.d = new ArrayList();
        this.ag = new bzt(2);
        this.b = 0;
        this.ah = false;
    }

    public static clht A() {
        if(gann.a == null) {
            gann.a = new clht(Looper.getMainLooper());
        }
        return gann.a;
    }

    public static gann B(xob xob0) {
        gann gann0 = (gann)xob0.getSupportFragmentManager().h("ActionExecutorFragment");
        return gann0 == null ? ((gann)gann.c.get(xob0)) : gann0;
    }

    public final void C() {
        gavs.c(this.ah, "BE_AEFT_04", null, "Fragment must be resumed!");
    }

    final void D() {
        if(this.ah) {
            bzt bzt0 = this.ag;
            int v = bzt0.c();
            ArrayList arrayList0 = null;
            for(int v2 = 0; v2 < v; ++v2) {
                ganm ganm0 = (ganm)bzt0.e(v2);
                int v3 = ganm0.d;
                if(v3 != 1) {
                    switch(v3) {
                        case 2: {
                            ganl ganl0 = ganm0.f;
                            if(ganl0.d) {
                                ganm0.b = ganl0.b;
                                ganm0.d = 4;
                                arrayList0 = gann.G(ganm0, arrayList0);
                            }
                            break;
                        }
                        case 3: {
                            if(this.b != ganm0.a) {
                                ganm0.d = 4;
                                arrayList0 = gann.G(ganm0, arrayList0);
                            }
                        }
                    }
                }
                else if(ganm0.e != null) {
                    if(!this.E(ganm0.c)) {
                        ganl ganl1 = new ganl();
                        ganl1.c = ganm0.c;
                        ganl1.e = (long)ganm0.c.a();
                        ganl1.f = this.aj;
                        ganl1.a = this;
                        ganm0.f = ganl1;
                        ganm0.d = 2;
                        this.y(ganl1);
                    }
                    else if(this.b == 0) {
                        this.b = ganm0.a;
                        ganm0.d = 3;
                        this.F();
                    }
                }
            }
            if(arrayList0 != null) {
                int v4 = arrayList0.size();
                for(int v1 = 0; v1 < v4; ++v1) {
                    ((gany)arrayList0.get(v1)).a();
                }
            }
        }
    }

    protected boolean E(gano gano0) {
        throw null;
    }

    protected void F() {
        throw null;
    }

    private static ArrayList G(ganm ganm0, ArrayList arrayList0) {
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
        }
        gany gany0 = ganm0.e;
        if(gany0 != null) {
            arrayList0.add(gany0);
        }
        return arrayList0;
    }

    private final void H() {
        this.ah = false;
        bzt bzt0 = this.ag;
        int v1 = bzt0.c();
        for(int v = 0; v < v1; ++v) {
            ganl ganl0 = ((ganm)bzt0.e(v)).f;
            if(ganl0 != null) {
                ganl0.a = null;
            }
        }
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1000) {
            ganp ganp0 = garc.f(v1, intent0);
            gavs.c(this.b != 0, "BE_AEFT_02", null, "No pending execution to deliver results to");
            ganm ganm0 = (ganm)bzu.a(this.ag, this.b);
            gavr.b(ganm0, "BE_AEFT_03", null, gavs.a, "Cannot return result without valid execution.");
            this.b = 0;
            ganm0.b = ganp0;
            this.D();
        }
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        gann.c.remove(context0);
    }

    @Override  // du
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bundle0 == null) {
            this.ai = 1;
        }
        else {
            this.ai = bundle0.getInt("nextExecutionId", -1);
            ArrayList arrayList0 = gcur.d(bundle0);
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ganm ganm0 = new ganm(((Bundle)arrayList0.get(v1)));
                this.ag.h(ganm0.a, ganm0);
            }
            this.b = bundle0.getInt("executionIdWaitingForExternalExecutionResult");
        }
        this.setRetainInstance(true);
        this.aj = this.z(this.requireContext().getApplicationContext());
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        this.H();
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        this.ah = true;
        bzt bzt0 = this.ag;
        int v = bzt0.c();
        for(int v2 = 0; v2 < v; ++v2) {
            ganl ganl0 = ((ganm)bzt0.e(v2)).f;
            if(ganl0 != null) {
                ganl0.a = this;
            }
        }
        ArrayList arrayList0 = this.d;
        int v3 = arrayList0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((Runnable)arrayList0.get(v1)).run();
        }
        arrayList0.clear();
        this.D();
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        this.H();
        bundle0.putInt("nextExecutionId", this.ai);
        ArrayList arrayList0 = new ArrayList();
        bzt bzt0 = this.ag;
        int v = bzt0.c();
        for(int v1 = 0; v1 < v; ++v1) {
            ganm ganm0 = (ganm)bzt0.e(v1);
            Bundle bundle1 = new Bundle();
            bundle1.putInt("executionId", ganm0.a);
            gano gano0 = ganm0.c;
            if(gano0 != null) {
                bundle1.putParcelable("request", gano0.a);
            }
            switch(ganm0.d) {
                case 3: {
                    bundle1.putInt("state", 3);
                    break;
                }
                case 4: {
                    ganp ganp0 = ganm0.b;
                    if(ganp0 != null) {
                        bundle1.putParcelable("response", ganp0.a);
                    }
                    bundle1.putInt("state", ganm0.d);
                    break;
                }
                default: {
                    bundle1.putInt("state", 1);
                }
            }
            arrayList0.add(bundle1);
        }
        bundle0.putInt("executionIdWaitingForExternalExecutionResult", this.b);
        bundle0.putParcelableArrayList("executions", arrayList0);
    }

    protected abstract void y(AsyncTask arg1);

    protected abstract gamy z(Context arg1);
}

