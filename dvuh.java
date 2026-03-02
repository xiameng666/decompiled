import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

public final class dvuh implements Runnable {
    public final dvuz a;
    public final gumi b;

    public dvuh(dvuz dvuz0, gumi gumi0) {
        this.a = dvuz0;
        this.b = gumi0;
    }

    @Override
    public final void run() {
        gukv gukv0;
        Iterator iterator0;
        gumi gumi0 = this.b;
        dvuz dvuz0 = this.a;
        synchronized(dvuz0.p) {
            try {
                if((gumi0.b & 0x200) == 0) {
                    iterator0 = (gumi0.j == null ? gucv.a : gumi0.j).c.iterator();
                    goto label_14;
                }
                else {
                    gues gues0 = gumi0.l == null ? gues.a : gumi0.l;
                    guep guep0 = gues0.c == null ? guep.a : gues0.c;
                    guag guag0 = guep0.c == null ? guag.a : guep0.c;
                    gukv0 = guag0.c == null ? gukv.a : guag0.c;
                    if((gukv0.b & 1) == 0) {
                        iterator0 = (gumi0.j == null ? gucv.a : gumi0.j).c.iterator();
                    label_14:
                        while(iterator0.hasNext()) {
                            Object object1 = iterator0.next();
                            gucn gucn0 = (gucn)object1;
                            if(gucn0.b != 1) {
                                continue;
                            }
                            guag guag1 = ((gucl)gucn0.c).c;
                            if(guag1 == null) {
                                guag1 = guag.a;
                            }
                            gukv gukv1 = guag1.c == null ? gukv.a : guag1.c;
                            if((gukv1.b & 1) == 0) {
                                continue;
                            }
                            gukv0 = gukv1;
                            goto label_31;
                        }
                        gucl gucl0 = gumi0.e == null ? gucl.a : gumi0.e;
                        guag guag2 = gucl0.c == null ? guag.a : gucl0.c;
                        gukv0 = guag2.c == null ? gukv.a : guag2.c;
                        if((gukv0.b & 1) == 0) {
                            ((ggtj)dvuz.a.h()).x("No merchant logo found.");
                            gukv0 = gukv.a;
                        }
                    }
                }
            label_31:
                efmj efmj0 = new efmj(dvuz0.getResources(), efmo.c(new String[]{gukv0.d}));
                Bitmap bitmap0 = (Bitmap)((txx)((txx)((txx)dvuz0.L.b().h(gukv0.c).D(efmj0)).u(efmj0)).q()).m(60, 60).get();
            }
            catch(ExecutionException | InterruptedException exception0) {
                a.ae(dvuz.a.i(), "Failed to load cached shortcut bitmap.", exception0);
            }
        }
    }
}

