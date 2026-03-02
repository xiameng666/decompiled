import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class foei implements gful_cronetEngineProvider {
    public final foek a;

    public foei(foek foek0) {
        this.a = foek0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        foek foek0 = this.a;
        fobl fobl0 = new fobl(foek0.a, foek0.c);
        foej foej0 = new foej(foek0, fobl0);
        if(foek0.d.m(foek0.a) == 0) {
            foev foev0 = new foev(foek0.b, ((gful_cronetEngineProvider)foej0));
            if(foek0.f == null) {
                csnw csnw0 = new csnw(foek0.a);
                frcb frcb0 = new frcb(foek0.a);
                frcb0.c = csnw0;
                frbx frbx0 = new frbx(gged_interceptors.l(new frcc(frcb0)));
                frij frij0 = new frij();
                frij0.a = foek0.b;
                frij0.b = frbx0;
                frij0.b(frkf.a);
                frii frii0 = frij0.a();
                fkud fkud0 = new fkud();
                Context context0 = foek0.a;
                gftb.check(context0);
                fkud0.a = context0;
                ExecutorService executorService0 = foek0.b;
                gftb.check(executorService0);
                fkud0.b = executorService0;
                fkud0.d = frbx0;
                fkud0.c = frii0;
                fkud0.e = "OneGoogle";
                Context context1 = fkud0.a;
                gftb.z(context1, "An application context must be provided.");
                Executor executor0 = fkud0.b;
                gftb.z(executor0, "A I/O executor must be provided.");
                frii frii1 = fkud0.c;
                gftb.z(frii1, "A PDS factory must be provided.");
                frbx frbx1 = fkud0.d;
                gftb.z(frbx1, "A file storage must be provided.");
                String s = fkud0.e;
                gftb.z(s, "An instance id must be provided.");
                fkyu fkyu0 = new fkyu(context1, fkyw.a);
                fkuc fkuc0 = new fkuc(fkud0);
                fgvy fgvy0 = new fgvy();
                HandlerThread handlerThread0 = new HandlerThread("ProtoDataStore-Message-Handler");
                handlerThread0.start();
                Handler handler0 = new Handler(handlerThread0.getLooper());
                frhf frhf0 = new frhf();
                frhf0.b(context1);
                frhf0.a();
                frhf0.b = new fkub();
                frhf0.d = handler0;
                foek0.f = new fkvs(context1, executor0, s, frbx1, frii1, fkyu0, fkuc0, fgvy0, new frhi(frhf0), new azts(context1, null));
            }
            return new fogi(new fogy(new fofl(foek0.a, foek0.f, new fodz(foek0.a, foek0.b), gfsx.m(fobl0)), 1, fobl0, "com.google.android.gms"), foev0);
        }
        Log.i("OneGoogle", "MDI is not available. Forcing Menagerie");
        return ((gful_cronetEngineProvider)foej0).mr();
    }
}

