package com.google.android.gms.auth.proximity.phonehub;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import aloz;
import alpa;
import alqd;
import alqe;
import alqf;
import aluw;
import android.content.Context;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import baun;
import cliz;
import clja;
import cljp;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import java.lang.ref.WeakReference;
import java.util.Timer;

public class PhoneGalleryGmsTaskBoundService extends GmsTaskBoundService implements alqe {
    private static final baun a;
    private final alqf b;

    static {
        PhoneGalleryGmsTaskBoundService.a = new baun("ProximityAuth", new String[]{"PhoneGalleryGmsTaskBoundService"});
    }

    public PhoneGalleryGmsTaskBoundService() {
        this.b = new alqf();
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        alqf alqf0 = this.b;
        if(alqf0.c) {
            if(alqf0.d.get() == null) {
                alqf0.d = new WeakReference(this);
            }
            PhoneGalleryGmsTaskBoundService.a.h("Too frequent! Update will be postponed.", new Object[0]);
            return 1;
        }
        alqf0.c = true;
        alqd alqd0 = new alqd(alqf0);
        new Timer().schedule(alqd0, alqf0.b);
        this.g();
        return 0;
    }

    @Override  // alqe
    public final void d() {
        this.g();
    }

    public static void e(Context context0) {
        cljp.a(context0).d("PhotoGalleryUpdate", PhoneGalleryGmsTaskBoundService.class.getName());
    }

    static void f(Context context0) {
        PhoneGalleryGmsTaskBoundService.a.d("Scheduling task for media update", new Object[0]);
        cljp cljp0 = cljp.a(context0);
        clja clja0 = new clja();
        clja0.t("PhotoGalleryUpdate");
        clja0.w(PhoneGalleryGmsTaskBoundService.class.getName());
        clja0.c(new cliz(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, 1));
        clja0.c(new cliz(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, 1));
        clja0.v(0);
        clja0.g(2);
        cljp0.f(clja0.a());
    }

    private final void g() {
        PhoneGalleryGmsTaskBoundService.a.h("Media content changed, notifying connected devices", new Object[0]);
        for(Object object0: alpa.b().d()) {
            aloz aloz0 = (aloz)object0;
            if(aloz0.e) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aluw.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((aluw)hftp0.b_message).f = true;
                aloz0.o(((aluw)hftp0.N_build()));
            }
            else {
                aloz.a.h("Camera Roll setting is disabled on connected device.", new Object[0]);
            }
        }
        PhoneGalleryGmsTaskBoundService.f(this.getApplicationContext());
    }
}

