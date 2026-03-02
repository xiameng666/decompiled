import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

final class aryk {
    public static final ProtoLiteBuilder a(Intent intent0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdki.a).v_newBuilder();
        ComponentName componentName0 = intent0.getComponent();
        if(componentName0 != null) {
            String s = componentName0.getClassName();
            if(s != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gdki gdki0 = (gdki)hftp0.b_message;
                gdki0.b |= 1;
                gdki0.c = s;
            }
        }
        String s1 = intent0.getAction();
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdki gdki1 = (gdki)hftp0.b_message;
            gdki1.b |= 2;
            gdki1.d = s1;
        }
        int v = intent0.getFlags();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdki gdki2 = (gdki)hftp0.b_message;
        gdki2.b |= 8;
        gdki2.g = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gdki)hftp0.b_message).e = 1;
        ((gdki)hftp0.b_message).b |= 4;
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                String s2 = (String)object0;
                Object object1 = bundle0.get(s2);
                if(object1 != null) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gdkk.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gdkk gdkk0 = (gdkk)hftp1.b_message;
                    s2.getClass();
                    gdkk0.b |= 1;
                    gdkk0.c = s2;
                    String s3 = object1.toString();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gdkk gdkk1 = (gdkk)hftp1.b_message;
                    s3.getClass();
                    gdkk1.b |= 2;
                    gdkk1.d = s3;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gdki gdki3 = (gdki)hftp0.b_message;
                    gdkk gdkk2 = (gdkk)hftp1.N_build();
                    gdkk2.getClass();
                    gdki3.b();
                    gdki3.f.add(gdkk2);
                }
            }
        }
        return hftp0;
    }
}

