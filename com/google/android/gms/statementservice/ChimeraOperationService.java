package com.google.android.gms.statementservice;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import avyj;
import avyk;
import avym;
import bbmq;
import clhl;
import clhr;
import hykz;
import java.util.concurrent.ExecutorService;

public class ChimeraOperationService extends avyk {
    private static final avym a;

    static {
        ChimeraOperationService.a = new avym();
    }

    public ChimeraOperationService() {
        long v = hykz.a.d().f();
        ExecutorService executorService0 = clhl.b.d(clhr.b);
        super("StatementServiceOpSvc", ChimeraOperationService.a, v, executorService0);
    }

    public static void c(Context context0, avyj avyj0) {
        ChimeraOperationService.a.add(avyj0);
        context0.startService(bbmq.i("com.google.android.gms.statementservice.EXECUTE"));
    }

    @Override  // avyk
    public final boolean handleMessage(Message message0) {
        super.handleMessage(message0);
        return true;
    }

    @Override  // avyk
    public final IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // avyk
    public final int onStartCommand(Intent intent0, int v, int v1) {
        super.onStartCommand(intent0, v, v1);
        return 2;
    }
}

