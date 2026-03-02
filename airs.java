import com.google.android.gms.auth.blockstore.logging.service.BufferedLogUploadTaskService;
import java.util.Iterator;
import java.util.List;

public final class airs implements glzn {
    public final BufferedLogUploadTaskService a;

    public airs(BufferedLogUploadTaskService bufferedLogUploadTaskService0) {
        this.a = bufferedLogUploadTaskService0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Integer integer0 = (int)0;
        if(((List)object0) == null) {
            ((ggtj)BufferedLogUploadTaskService.a.j()).x("bufferedEvents is null. Skip the task.");
            return gmbu.i(integer0);
        }
        ((ggtj)BufferedLogUploadTaskService.a.h()).z("Flushed out %s events. Try logging them to Clearcut now.", ((List)object0).size());
        Iterator iterator0 = ((List)object0).iterator();
        while(iterator0.hasNext()) {
            BufferedLogUploadTaskService bufferedLogUploadTaskService0 = this.a;
            Object object1 = iterator0.next();
            ajaq ajaq0 = (ajaq)object1;
            if(bufferedLogUploadTaskService0.b == null) {
                String s = aiqz.c(bufferedLogUploadTaskService0.getApplicationContext());
                bufferedLogUploadTaskService0.b = aiqz.a(bufferedLogUploadTaskService0.getApplicationContext(), s);
            }
            aiqy aiqy0 = bufferedLogUploadTaskService0.b;
            int v = ajaq0.c;
            if(v == 2) {
                aiqy0.l(((wvr)ajaq0.d), ajaq0.f);
            }
            else {
                switch(v) {
                    case 3: {
                        aiqy0.a(((wty)ajaq0.d), ajaq0.f);
                        break;
                    }
                    case 4: {
                        aiqy0.e(((wum)ajaq0.d), ajaq0.f);
                    }
                }
            }
        }
        return gmbu.i(integer0);
    }
}

