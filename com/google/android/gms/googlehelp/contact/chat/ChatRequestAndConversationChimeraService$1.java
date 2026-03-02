package com.google.android.gms.googlehelp.contact.chat;

import android.content.Context;
import android.content.Intent;
import btmh;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

class ChatRequestAndConversationChimeraService.1 extends TracingBroadcastReceiver {
    final ChatRequestAndConversationChimeraService a;

    public ChatRequestAndConversationChimeraService.1(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService0) {
        Objects.requireNonNull(chatRequestAndConversationChimeraService0);
        this.a = chatRequestAndConversationChimeraService0;
        super("googlehelp");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if("android.intent.action.TIME_SET".equals(intent0.getAction())) {
            long v = this.a.r;
            long v1 = ChatRequestAndConversationChimeraService.e();
            this.a.r = v1;
            btmh btmh0 = new btmh(this.a, v1 - v);
            this.a.t(btmh0);
            this.a.w();
            return;
        }
        if("android.intent.action.TIMEZONE_CHANGED".equals(intent0.getAction())) {
            this.a.w();
        }
    }
}

