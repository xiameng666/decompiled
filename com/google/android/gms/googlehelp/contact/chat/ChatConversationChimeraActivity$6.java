package com.google.android.gms.googlehelp.contact.chat;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

class ChatConversationChimeraActivity.6 extends TracingBroadcastReceiver {
    final ChatConversationChimeraActivity a;

    public ChatConversationChimeraActivity.6(ChatConversationChimeraActivity chatConversationChimeraActivity0) {
        Objects.requireNonNull(chatConversationChimeraActivity0);
        this.a = chatConversationChimeraActivity0;
        super("googlehelp");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(intent0.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.REQUEST_CHAT_TRANSCRIPT_EMAIL")) {
            ChatConversationChimeraActivity chatConversationChimeraActivity0 = this.a;
            chatConversationChimeraActivity0.C = false;
            if(intent0.getBooleanExtra("EXTRA_REQUEST_CHAT_TRANSCRIPT_EMAIL_SUCCESS", false)) {
                if(chatConversationChimeraActivity0.E) {
                    Account account0 = chatConversationChimeraActivity0.I.d;
                    if(account0 != null && !TextUtils.isEmpty(account0.name)) {
                        chatConversationChimeraActivity0.n(chatConversationChimeraActivity0.getString(0x7F1513E5, new Object[]{account0.name}));  // string:gh_chat_transcript_email_sent "Conversation sent to: %1$s"
                    }
                }
                chatConversationChimeraActivity0.E = false;
                chatConversationChimeraActivity0.D = true;
                chatConversationChimeraActivity0.s.N();
                return;
            }
            if(chatConversationChimeraActivity0.E) {
                chatConversationChimeraActivity0.m(0x7F1513E6);  // string:gh_chat_transcript_try_again "Couldn\'t send email. Try again"
            }
            chatConversationChimeraActivity0.E = true;
            chatConversationChimeraActivity0.s.N();
        }
    }
}

