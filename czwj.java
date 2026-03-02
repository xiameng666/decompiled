import java.io.IOException;

public final class czwj implements Runnable {
    public final czwk a;

    public czwj(czwk czwk0) {
        this.a = czwk0;
    }

    @Override
    public final void run() {
        czwk czwk0 = this.a;
        czwn czwn0 = czwk0.h;
        if(czwn0 != null) {
            while(true) {
                while(true) {
                    try {
                        czwh czwh0 = czwn0.b(new czwg((byte)0x80, 3, 0, 0, czwk0.l(czwn0.a()), czwn0.a()));
                        if(czwh0.d()) {
                            bbpb.b(czwk0);
                            return;
                        }
                        czwk0.k(czwh0.a);
                    }
                    catch(IOException iOException0) {
                        czkq.a.e().f(iOException0).p("NearFieldCommunicationSocket encountered an error when sending DATA command.", new Object[0]);
                        bbpb.b(czwk0);
                        return;
                    }
                    try {
                        if(czwk0.i.available() <= 0) {
                            goto label_14;
                        }
                        break;
                    }
                    catch(IOException unused_ex) {
                    }
                label_14:
                    if(czwh0.a.length > 0) {
                        break;
                    }
                    return;
                }
            }
        }
    }
}

