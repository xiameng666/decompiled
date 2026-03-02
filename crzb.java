import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.util.logging.Level;

public final class crzb implements Runnable {
    public final crzc a;
    public final cseh b;

    public crzb(crzc crzc0, cseh cseh0) {
        this.a = crzc0;
        this.b = cseh0;
    }

    @Override
    public final void run() {
        csan csan0;
        bboh bboh0 = crzc.a;
        ggtj ggtj0 = bboh0.g(cslm.h());
        crzc crzc0 = this.a;
        long v = crzc0.d;
        Boolean boolean0 = Boolean.valueOf(hvko.G());
        String s = crzc0.e;
        ggtj0.X("Exec GcoreEsimRegister. req: <%s, %s> gcm:%b", Long.valueOf(v), s, boolean0);
        if(hvlq.m()) {
            Context context0 = crzc0.b;
            String s1 = crxd.a().c(context0);
            ((ggtj)bboh0.h()).B("eSIM started with GCM token: %s", s1);
            if(TextUtils.isEmpty(s1)) {
                ((ggtj)bboh0.j()).x("Unable to get a GCM token for eSIM.");
                new IllegalStateException("Unable to get a GCM token.");
                csan0 = new csan();
            }
            else {
                String s2 = hvko.u();
                int v1 = (int)hvko.f();
                cryd cryd0 = new cryd(context0, s2, crzc0.c, v1);
                try {
                    gsof gsof0 = hvlb.f() ? cryd0.e(s1, v, s, ckjj.b) : cryd0.e(s1, v, s, null);
                    if(gsof0 == null) {
                        ((ggtj)bboh0.j()).x("Got null response when attempting GcoreEsimRegister");
                        new IllegalStateException("Got null response.");
                        csan0 = new csan();
                    }
                    else {
                        csan0 = new csao(gsof0);
                    }
                }
                catch(acse acse0) {
                    Level level0 = cslm.h();
                    ((ggtj)crzc.a.g(level0).s(acse0)).B("GCoreEsimRegister attempt got auth exception %s.", new gpnd(gpnc.a, acse0.getMessage()));
                    csan0 = new csan(27009L);
                }
                catch(iapl iapl0) {
                    Level level1 = cslm.h();
                    ggtj ggtj1 = (ggtj)crzc.a.g(level1).s(iapl0);
                    String s3 = crxw.a(iapl0).j;
                    ggtj1.B("GCoreEsimRegister attempt got StatusException: %s", new gpnd(gpnc.a, s3));
                    csan0 = new csan(((long)crxw.a(iapl0).i));
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    Level level2 = cslm.h();
                    ((ggtj)crzc.a.g(level2).s(illegalArgumentException0)).B("GCoreEsimRegister attempt with invalid parameter(s): %s", new gpnd(gpnc.a, illegalArgumentException0.getMessage()));
                    csan0 = new csan(27000L);
                }
                catch(IllegalStateException illegalStateException0) {
                    Level level3 = cslm.h();
                    ((ggtj)crzc.a.g(level3).s(illegalStateException0)).B("GCoreEsimRegister attempt got IllegalStateException: %s", new gpnd(gpnc.a, illegalStateException0.getMessage()));
                    csan0 = new csan(27013L);
                }
                Level level4 = cslm.h();
                crzc.a.g(level4).B("Register new eCPID on gcm token:{%s}", s1);
            }
        }
        else {
            ((ggtj)bboh0.j()).x("eSIM is not enabled on device.");
            new IllegalStateException("eSIM is not enabled on device.");
            csan0 = new csan();
        }
        new clht(Looper.getMainLooper()).post(new crza(this.b, csan0));
    }
}

