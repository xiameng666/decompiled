package com.google.android.gms.quickstart.xos;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import baun;
import bjop;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.quickstart.XosLaunchParameters;
import ejlj;
import ejmz;
import ejna;
import gggq;
import gjjk;
import gjkv;
import hxrq;

public class SourceXosIntentOperation extends IntentOperation {
    private static final baun a;
    private ejna b;

    static {
        SourceXosIntentOperation.a = new baun("QuickStart", new String[]{"SourceXosIntentOperation"});
    }

    public SourceXosIntentOperation() {
    }

    SourceXosIntentOperation(bjop bjop0) {
        this.b = new ejna(this, bjop0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = new ejna(this);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        Intent intent2;
        XosLaunchParameters xosLaunchParameters0;
        if(hxrq.a.b().d()) {
            Uri uri0 = (Uri)intent0.getParcelableExtra("deeplink-uri");
            String s = ejna.a(intent0);
            baun baun0 = SourceXosIntentOperation.a;
            baun0.h("onHandleIntent(), URI = %s, referrer = %s", new Object[]{uri0, s});
            if(uri0 == null) {
                goto label_64;
            }
            try {
                xosLaunchParameters0 = XosLaunchParameters.a(uri0);
                baun0.d("Parsed parameters: %s", new Object[]{xosLaunchParameters0});
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                SourceXosIntentOperation.a.g("Failed to parse parameters", illegalArgumentException0, new Object[0]);
                return;
            }
            if(hxrq.d()) {
                int v = 3;
                gjkv gjkv0 = ejmz.c(3, xosLaunchParameters0);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gjkv0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)gjkv0));
                switch(s) {
                    case "agsa": {
                        v = 2;
                        break;
                    }
                    case "settings": {
                        break;
                    }
                    default: {
                        v = 1;
                    }
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjkv)hftp0.b_message).g = v - 1;
                ((gjkv)hftp0.b_message).b |= 16;
                ejmz.a(((gjkv)hftp0.N_build()));
            }
            int v1 = xosLaunchParameters0.b;
            if(this.b.c(v1)) {
                this.b.b(xosLaunchParameters0, s);
                return;
            }
            baun0.m("Flow type %d is not supported on this device", new Object[]{v1});
            if(v1 != 0) {
                ejna ejna0 = this.b;
                Intent intent1 = new Intent("android.intent.action.VIEW", Uri.parse("https://*"));
                intent1.addCategory("android.intent.category.BROWSABLE");
                ResolveInfo resolveInfo0 = (ResolveInfo)gggq.o(ejna0.b.getPackageManager().queryIntentActivities(intent1, 0x10000), null);
                if(resolveInfo0 == null) {
                    ejna.a.m("Failed to resolve a web browser", new Object[0]);
                    intent2 = null;
                }
                else {
                    intent2 = new Intent("android.intent.action.VIEW", ejlj.a(v1, xosLaunchParameters0.a, xosLaunchParameters0.c, xosLaunchParameters0.d));
                    intent2.setFlags(0x10008000);
                    intent2.setComponent(new ComponentName(resolveInfo0.activityInfo.packageName, resolveInfo0.activityInfo.name));
                }
                if(intent2 != null) {
                    this.startActivity(intent2);
                }
            }
            if(hxrq.d()) {
                gjkv gjkv1 = ejmz.c(2, xosLaunchParameters0);
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gjkv1).jf(5, null);
                hftp1.X(((ProtoLiteMessage)gjkv1));
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjjk.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gjjk gjjk0 = (gjjk)hftp2.b_message;
                gjjk0.b |= 1;
                gjjk0.c = 56003;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjkv gjkv2 = (gjkv)hftp1.b_message;
                gjjk gjjk1 = (gjjk)hftp2.N_build();
                gjjk1.getClass();
                gjkv2.h = gjjk1;
                gjkv2.b |= 0x20;
                ejmz.a(((gjkv)hftp1.N_build()));
                return;
            label_64:
                baun0.m("URI is missing from the intent", new Object[0]);
            }
        }
    }
}

