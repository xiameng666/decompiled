package com.google.android.gms.googlehelp.contact.chat;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import btlg;
import btnt;
import bttg;
import bttu;
import btvk;
import btvl;
import com.google.android.gms.googlehelp.common.HelpConfig;
import hjex;
import htnc;
import j..util.Objects;

public class ChatConversationTranscriptLayoutAdapter.1.1 extends URLSpan {
    final btlg a;

    public ChatConversationTranscriptLayoutAdapter.1.1(btlg btlg0, String s) {
        Objects.requireNonNull(btlg0);
        this.a = btlg0;
        super(s);
    }

    @Override  // android.text.style.URLSpan
    public void onClick(View view0) {
        boolean z = btnt.b(htnc.d());
        ChatConversationChimeraActivity chatConversationChimeraActivity0 = this.a.d.o;
        if(z) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)btvk.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((btvk)hftv0).c = 19;
            ((btvk)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((btvk)hftp0.b_message).j = 1;
            ((btvk)hftp0.b_message).b |= 0x100;
            btvk btvk0 = (btvk)hftp0.N_build();
            HelpConfig helpConfig0 = chatConversationChimeraActivity0.ia();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)btvl.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            btvl btvl0 = (btvl)hftp1.b_message;
            btvk0.getClass();
            btvl0.d = btvk0;
            btvl0.c = 3;
            bttg.J(chatConversationChimeraActivity0, helpConfig0, hftp1);
        }
        bttu.k(chatConversationChimeraActivity0, 75, hjex.b);
        super.onClick(view0);
    }

    @Override  // android.text.style.ClickableSpan
    public final void updateDrawState(TextPaint textPaint0) {
    }
}

