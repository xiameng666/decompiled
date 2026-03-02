package com.google.android.gms.people.api.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import egig;
import egzd;
import hwxy;

public class ResetSuggestionEventStoreDebugOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(hwxy.a.b().h() && "com.google.android.gms.people.api.operations.RESET_SUGGESTION_EVENT_STORE".equals(intent0.getAction())) {
            try {
                egzd egzd0 = egzd.c(this);
                egig.e("ResetSuggestionEventOp", "Start to reset db");
                try {
                    LevelDb.destroy(egzd0.c);
                }
                catch(LevelDbException levelDbException1) {
                    egig.d("FSA2_SuggestionStorage", "Failed to destroy %s: %s", new Object[]{egzd0.c, levelDbException1});
                }
                egig.e("ResetSuggestionEventOp", "Db reset successfully.");
            }
            catch(LevelDbException levelDbException0) {
                egig.d("ResetSuggestionEventOp", "Exception in resetting db: %s", new Object[]{levelDbException0});
            }
        }
    }
}

