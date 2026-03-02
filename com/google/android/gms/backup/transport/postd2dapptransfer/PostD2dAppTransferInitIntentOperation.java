package com.google.android.gms.backup.transport.postd2dapptransfer;

import android.content.Intent;
import aqql;
import atll;
import atmb;
import atmc;
import avzf;
import baun;
import hqlt;
import wpm;

public class PostD2dAppTransferInitIntentOperation extends avzf {
    private static final baun a;

    static {
        PostD2dAppTransferInitIntentOperation.a = aqql.a("PostD2dAppTransferInitIntentOperation");
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        if(hqlt.a.o().X() && (v != 4 && v != 8 || hqlt.a.o().V())) {
            String s = "Init PostD2dAppTransfer feature on action " + intent0.getAction();
            PostD2dAppTransferInitIntentOperation.a.j(s, new Object[0]);
            wpm wpm0 = new wpm(this, atll.c);
            atmb atmb0 = new atmb(this);
            atll.e(atmc.a(this), wpm0, atmb0);
        }
    }
}

