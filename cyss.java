import android.os.Bundle;
import com.google.android.gms.nearby.fastpair.service.TaskSchedulerChimeraService;
import java.util.concurrent.Callable;

public final class cyss implements Callable {
    public final TaskSchedulerChimeraService a;
    public final String b;
    public final Bundle c;

    public cyss(TaskSchedulerChimeraService taskSchedulerChimeraService0, String s, Bundle bundle0) {
        this.a = taskSchedulerChimeraService0;
        this.b = s;
        this.c = bundle0;
    }

    @Override
    public final Object call() {
        long v;
        String s;
        try {
            s = this.b;
            v = Long.parseLong(s.substring(35));
        }
        catch(NumberFormatException unused_ex) {
            ((ggtj)cyjh.a.g().ar(0x1FBD)).B("TSS onRunTriangleTask: can\'t parse loggingId %s", s);
            return (int)2;
        }
        cust cust0 = cyjh.a;
        ((ggtj)cust0.d().ar(0x1FBC)).A("TSS onRunTriangleTask: id %s", v);
        int v1 = this.c.getInt("KEY_TRIANGLE_MONITOR_TYPE", 0);
        if(!hvpp.as()) {
            ((ggtj)cust0.g().ar(0x1FCA)).x("TSS stopTriangleMonitor: not enable");
            return (int)0;
        }
        int v2 = cygh.b(v1);
        if(v2 != 0 && v2 != 1) {
            if(v == -1L) {
                ((ggtj)cust0.g().ar(0x1FC9)).x("TSS stopTriangleMonitor: unknown logging id");
                return (int)0;
            }
            cxzx cxzx0 = new cxzx(this.a, v2, v, null);
            TaskSchedulerChimeraService.i(this.a, cxzx0, false);
            return (int)0;
        }
        ((ggtj)cust0.g().ar(0x1FC8)).z("TSS stopTriangleMonitor: unknown monitor type value %s", v1);
        return (int)0;
    }
}

