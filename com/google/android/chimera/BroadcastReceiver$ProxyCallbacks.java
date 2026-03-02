package com.google.android.chimera;

import android.content.BroadcastReceiver.PendingResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

public interface BroadcastReceiver.ProxyCallbacks {
    BroadcastReceiver getContainerReceiver();

    void superAbortBroadcast();

    boolean superBeginAsync();

    void superClearAbortBroadcast();

    void superFinishAsync();

    boolean superGetAbortBroadcast();

    boolean superGetDebugUnregister();

    int superGetResultCode();

    String superGetResultData();

    Bundle superGetResultExtras(boolean arg1);

    String superGetSentFromPackage();

    int superGetSentFromUid();

    BroadcastReceiver.PendingResult superGoAsync();

    boolean superIsInitialStickyBroadcast();

    boolean superIsOrderedBroadcast();

    IBinder superPeekService(Context arg1, Intent arg2);

    void superSetDebugUnregister(boolean arg1);

    void superSetOrderedHint(boolean arg1);

    void superSetResult(int arg1, String arg2, Bundle arg3);

    void superSetResultCode(int arg1);

    void superSetResultData(String arg1);

    void superSetResultExtras(Bundle arg1);
}

