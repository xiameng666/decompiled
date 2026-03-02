import android.content.Context;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Task;

public final class ejtn extends ejtj {
    public ejtn(Context context0, DataHolder dataHolder0) {
        super(context0, dataHolder0);
    }

    @Override  // ejtj
    public final void b() {
        String s;
        DataHolder dataHolder0 = this.b;
        Task task0 = new ejut(dataHolder0).d(0);
        if(hxsx.k()) {
            s = "com.google.android.gms.apitest";
        }
        else {
            if(!ejxd.f(task0.K().intValue())) {
                task0.K();
                return;
            }
            switch(((int)task0.K())) {
                case 4: {
                    s = hxsu.a.b().a();
                    break;
                }
                case 7: 
                case 13: {
                    s = hxsx.a.h().D();
                    break;
                }
                case 12: 
                case 14: {
                    s = hxsx.a.h().y();
                    break;
                }
                case 3: 
                case 5: 
                case 16: {
                    s = hxsx.a.h().z();
                    break;
                }
                default: {
                    s = null;
                }
            }
        }
        this.a(s, new ejtm(this.a, dataHolder0, task0));
    }
}

