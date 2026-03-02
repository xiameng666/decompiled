import com.google.android.gms.update.ChimeraUpdateFromSdCardService;
import j..util.Objects;

public final class ezuc implements Runnable {
    final ChimeraUpdateFromSdCardService a;

    public ezuc(ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService0) {
        Objects.requireNonNull(chimeraUpdateFromSdCardService0);
        this.a = chimeraUpdateFromSdCardService0;
        super();
    }

    @Override
    public final void run() {
        ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService0 = this.a;
        int v = chimeraUpdateFromSdCardService0.b.b;
        int v1 = chimeraUpdateFromSdCardService0.c;
        if(chimeraUpdateFromSdCardService0.c == 4 || chimeraUpdateFromSdCardService0.c == 1040) {
            switch(v) {
                case 0: {
                    chimeraUpdateFromSdCardService0.c = 4;
                    break;
                }
                case 1: 
                case 2: {
                    chimeraUpdateFromSdCardService0.c = 1040;
                }
            }
        }
        if(v1 != chimeraUpdateFromSdCardService0.c) {
            chimeraUpdateFromSdCardService0.a();
        }
    }
}

