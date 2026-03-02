import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

public final class dfyl implements Runnable {
    public final dfym a;
    public final ShareTarget b;
    public final TransferMetadata c;

    public dfyl(dfym dfym0, ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        this.a = dfym0;
        this.b = shareTarget0;
        this.c = transferMetadata0;
    }

    @Override
    public final void run() {
        dfym dfym0 = this.a;
        TransferMetadata transferMetadata0 = this.c;
        synchronized(dfym0) {
            ShareTarget shareTarget0 = this.b;
            if(transferMetadata0.e) {
                if(shareTarget0.f) {
                    dfzz dfzz0 = dfym0.b;
                    if(dfzz0.f.containsKey(shareTarget0)) {
                        dfzi dfzi0 = dfzz0.ad(shareTarget0);
                        TransferMetadata transferMetadata1 = dfzi0.n;
                        if(transferMetadata1 == null) {
                            dfzi0.n = transferMetadata0;
                            goto label_24;
                        }
                        else {
                            transferMetadata0 = transferMetadata1;
                        }
                    }
                }
                else {
                    dfzj dfzj0 = dfym0.b.ae(shareTarget0);
                    if(dfzj0.g.get()) {
                        if(dfzj0.A == null) {
                            dfzj0.A = transferMetadata0;
                        }
                    label_24:
                        dcvz.a.b().h("Adjusted the final status %s before disconnection", TransferMetadata.c(transferMetadata0.a));
                        switch(transferMetadata0.a) {
                            case 1006: {
                                dcnn dcnn0 = transferMetadata0.a();
                                dcnn0.a = 1005;
                                dcnn0.e(100.0f);
                                transferMetadata0 = dcnn0.a();
                                break;
                            }
                            case 1009: 
                            case 0x3FA: {
                                transferMetadata0 = new dcnn(0x3FD).a();
                            }
                        }
                    }
                    else {
                        TransferMetadata transferMetadata2 = dfzj0.A;
                        if(transferMetadata2 != null) {
                            transferMetadata0 = transferMetadata2;
                        }
                    }
                }
            }
            dfym0.a(shareTarget0, transferMetadata0);
        }
    }
}

