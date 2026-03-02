package com.google.android.gms.googlehelp.contact.chat;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import btkv;
import btkz;
import btla;
import btlo;
import btlt;
import btnt;
import btoa;
import btob;
import btue;
import btuq;
import btux;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import evuh;
import gfsx;
import ggtj;
import hfwq;
import htkq;
import htog;
import htqr;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

class ChatConversationChimeraActivity.5 extends TracingBroadcastReceiver {
    final ChatConversationChimeraActivity a;

    public ChatConversationChimeraActivity.5(ChatConversationChimeraActivity chatConversationChimeraActivity0) {
        Objects.requireNonNull(chatConversationChimeraActivity0);
        this.a = chatConversationChimeraActivity0;
        super("googlehelp");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(intent0.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_AGENT_TYPING_STATUS")) {
            ChatConversationChimeraActivity chatConversationChimeraActivity0 = this.a;
            btux btux0 = (btux)gfsx.l(btux.b(intent0.getIntExtra("EXTRA_NEW_TYPING_STATUS", 0))).f(btux.a);
            String s = intent0.getStringExtra("EXTRA_NEW_TYPING_STATUS_PARTICIPANT_ID");
            long v1 = intent0.getLongExtra("EXTRA_NEW_TYPING_STATUS_CLIENT_TIME", -1L);
            if(chatConversationChimeraActivity0.s.P(btux0, s, v1) && btux0 == btux.b) {
                chatConversationChimeraActivity0.m(0x7F1513EA);  // string:gh_chat_typing_indicator_active_announcement "Agent is typing."
            }
        }
        else {
            if(intent0.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT")) {
                this.a.F();
                return;
            }
            if(intent0.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.MESSAGE_NOT_SENT")) {
                ChatConversationChimeraActivity chatConversationChimeraActivity1 = this.a;
                btlo btlo0 = chatConversationChimeraActivity1.s;
                long v2 = intent0.getLongExtra("EXTRA_MESSAGE_CLIENT_TIME", -1L);
                int v3 = btlo0.G(v2);
                if(v3 < 0) {
                    ((ggtj)btlo.a.j()).A("No pending messages found for the given client time %d; this means the list is corrupted.", v2);
                }
                else {
                    List list0 = btlo0.g;
                    btuq btuq0 = (btuq)list0.get(v3);
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)btuq0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)btuq0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    btuq btuq1 = (btuq)hftp0.b_message;
                    btuq1.b |= 4;
                    btuq1.e = false;
                    list0.set(v3, ((btuq)hftp0.N_build()));
                    btlo0.r(btlo0.H(v3));
                }
                chatConversationChimeraActivity1.m(0x7F15140C);  // string:gh_message_failed_to_send_announcement "Message failed to send."
                return;
            }
            if(intent0.getAction().equals("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS")) {
                ChatConversationChimeraActivity chatConversationChimeraActivity2 = this.a;
                chatConversationChimeraActivity2.y = intent0.getLongExtra("EXTRA_DEVICE_SERVER_TIME_DIFFERENCE_ESTIMATE", 0L);
                chatConversationChimeraActivity2.x = true;
                if(intent0.getBooleanExtra("EXTRA_SHOULD_UPDATE_TIMESTAMPS", false) && !chatConversationChimeraActivity2.v) {
                    btlo btlo1 = chatConversationChimeraActivity2.s;
                    if(btlo1 != null) {
                        List list1 = btlt.j(chatConversationChimeraActivity2.L);
                        long v4 = chatConversationChimeraActivity2.y;
                        int v5 = list1 == null ? 0 : list1.size();
                        int v6 = btlo1.h.size();
                        ArrayList arrayList0 = new ArrayList(v6);
                        int v7 = 0;
                        for(int v = 0; v < v5; ++v) {
                            if(((btue)list1.get(v)).c == 3) {
                                hfwq hfwq0 = ((btue)list1.get(v)).f;
                                if(hfwq0 == null) {
                                    hfwq0 = hfwq.a;
                                }
                                arrayList0.add(btlo1.L(hfwq0.b, v4));
                                ++v7;
                            }
                        }
                        if(v7 == v6) {
                            btlo1.h = arrayList0;
                            btlo1.q();
                        }
                    }
                }
            }
            else {
                if(intent0.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_READY")) {
                    ChatConversationChimeraActivity chatConversationChimeraActivity3 = this.a;
                    chatConversationChimeraActivity3.r(chatConversationChimeraActivity3.K.a());
                    chatConversationChimeraActivity3.v = false;
                    chatConversationChimeraActivity3.u();
                    if(chatConversationChimeraActivity3.L()) {
                        chatConversationChimeraActivity3.l.setVisibility(8);
                    }
                    View view0 = chatConversationChimeraActivity3.o;
                    if(view0 == null) {
                        chatConversationChimeraActivity3.o = chatConversationChimeraActivity3.n.inflate();
                        chatConversationChimeraActivity3.o.findViewById(0x7F0B1568).setOnClickListener(new btkv(chatConversationChimeraActivity3));  // id:gh_chat_translation_banner_info
                        chatConversationChimeraActivity3.p = (EditText)chatConversationChimeraActivity3.o.findViewById(0x7F0B1557);  // id:gh_chat_message_input
                        chatConversationChimeraActivity3.p.addTextChangedListener(new btkz(chatConversationChimeraActivity3));
                        if(btnt.a(htog.c())) {
                            String s1 = chatConversationChimeraActivity3.t;
                            if(s1 != null) {
                                chatConversationChimeraActivity3.p.setText(s1);
                                chatConversationChimeraActivity3.p.requestFocus();
                            }
                        }
                        chatConversationChimeraActivity3.q = (ImageButton)chatConversationChimeraActivity3.o.findViewById(0x7F0B155E);  // id:gh_chat_send_message_button
                        if(btnt.b(htqr.a.b().a())) {
                            chatConversationChimeraActivity3.q.setImageResource(0x7F080C1B);
                        }
                        chatConversationChimeraActivity3.q.setOnClickListener(new btla(chatConversationChimeraActivity3));
                        chatConversationChimeraActivity3.r = (RecyclerView)chatConversationChimeraActivity3.o.findViewById(0x7F0B1563);  // id:gh_chat_transcript
                        chatConversationChimeraActivity3.E();
                    }
                    else if(view0.getVisibility() != 0) {
                        chatConversationChimeraActivity3.o.setVisibility(0);
                        chatConversationChimeraActivity3.E();
                        chatConversationChimeraActivity3.findViewById(0x7F0B155F).setVisibility(0);  // id:gh_chat_send_message_section
                    }
                    chatConversationChimeraActivity3.F();
                    return;
                }
                if(intent0.getAction().equals("com.google.android.gms.googlehelp.HelpChimeraActivity.CHAT_STATUS_UPDATE")) {
                    if(intent0.getBooleanExtra("EXTRA_IS_CHAT_SUPPORT_STATUS_UPDATE", false)) {
                        ChatConversationChimeraActivity chatConversationChimeraActivity4 = this.a;
                        int v8 = intent0.getIntExtra("EXTRA_CHAT_SUPPORT_QUEUE_POSITION", -1);
                        if(v8 > 0) {
                            chatConversationChimeraActivity4.v = true;
                            chatConversationChimeraActivity4.u();
                            if(chatConversationChimeraActivity4.K()) {
                                chatConversationChimeraActivity4.o.setVisibility(8);
                            }
                            View view1 = chatConversationChimeraActivity4.l;
                            if(view1 == null) {
                                chatConversationChimeraActivity4.l = chatConversationChimeraActivity4.k.inflate();
                                if(chatConversationChimeraActivity4.m == null) {
                                    chatConversationChimeraActivity4.m = (TextView)chatConversationChimeraActivity4.l.findViewById(0x7F0B1559);  // id:gh_chat_queue_position
                                }
                                btoa.q(((ImageView)chatConversationChimeraActivity4.l.findViewById(0x7F0B1558)), chatConversationChimeraActivity4, btob.a(chatConversationChimeraActivity4, 0x7F0405AE));  // id:gh_chat_queue_icon
                            }
                            else if(view1.getVisibility() != 0) {
                                chatConversationChimeraActivity4.l.setVisibility(0);
                            }
                            String s2 = chatConversationChimeraActivity4.getString(0x7F1513D8, new Object[]{v8});  // string:gh_chat_queue_position "You\'re number %1$d in line"
                            chatConversationChimeraActivity4.m.setText(s2);
                            chatConversationChimeraActivity4.n(s2);
                            chatConversationChimeraActivity4.m(0x7F1513D9);  // string:gh_chat_queue_subtext "You won\'t lose your place in line if you go back 
                                                                             // or go to another app."
                        }
                    }
                    else {
                        if(intent0.getBooleanExtra("EXTRA_IS_CHAT_SUPPORT_UNAVAILABLE", false)) {
                            ChatConversationChimeraActivity chatConversationChimeraActivity5 = this.a;
                            chatConversationChimeraActivity5.u();
                            chatConversationChimeraActivity5.p();
                            HelpConfig helpConfig0 = chatConversationChimeraActivity5.I;
                            chatConversationChimeraActivity5.startService(new Intent().setClassName(chatConversationChimeraActivity5, ChatRequestAndConversationChimeraService.b).putExtra("EXTRA_REQUEST_TYPE_CLEAR_SHOULD_NOTIFY_OF_CHAT_REQUEST_ERROR", true).putExtra("EXTRA_HELP_CONFIG", helpConfig0));
                            if(htkq.e()) {
                                chatConversationChimeraActivity5.O.m(2014, evuh.bH);
                            }
                            else {
                                chatConversationChimeraActivity5.O.k(2014);
                            }
                            chatConversationChimeraActivity5.D();
                            return;
                        }
                        if(intent0.getBooleanExtra("EXTRA_IS_CHAT_DATA_STALE", false)) {
                            this.a.p();
                            return;
                        }
                        if(intent0.getBooleanExtra("EXTRA_IS_CHAT_REQUEST_CANCELLED", false)) {
                            this.a.o();
                            this.a.q();
                            return;
                        }
                        if(intent0.getBooleanExtra("EXTRA_WAS_CHAT_SUPPORT_ENDED", false)) {
                            this.a.v();
                            return;
                        }
                        intent0.getBooleanExtra("EXTRA_NO_PENDING_CHAT_REQUEST", false);
                    }
                }
            }
        }
    }
}

