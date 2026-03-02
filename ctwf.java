import android.app.Notification.Action;
import android.app.Notification.MessagingStyle.Message;
import android.app.Notification;
import android.app.Person;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class ctwf {
    private final ctwd a;

    public ctwf(ctwd ctwd0) {
        this.a = ctwd0;
    }

    public final Object a(StatusBarNotification statusBarNotification0, Context context0) {
        ibuq.f(statusBarNotification0, "statusBarNotification");
        ibuq.f(context0, "context");
        Notification notification0 = statusBarNotification0.getNotification();
        ibuq.e(notification0, "getNotification(...)");
        if(ctwe.c(notification0) == null) {
            return ibnx.a(new IllegalArgumentException("Notification has an empty {title} field."));
        }
        Notification notification1 = statusBarNotification0.getNotification();
        ibuq.e(notification1, "getNotification(...)");
        if(ctwe.b(notification1) == null) {
            return ibnx.a(new IllegalArgumentException("Notification has an empty {textContent} field."));
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cuao.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        int v = statusBarNotification0.getId();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cuao cuao0 = (cuao)hftp0.b_message;
        cuao0.b |= 1;
        cuao0.e = v;
        String s = statusBarNotification0.getPackageName();
        ibuq.e(s, "getPackageName(...)");
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cuao cuao1 = (cuao)hftp0.b_message;
        s.getClass();
        cuao1.b |= 2;
        cuao1.f = s;
        String s1 = statusBarNotification0.getKey();
        ibuq.e(s1, "getKey(...)");
        ibuq.f(s1, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cuao cuao2 = (cuao)hftp0.b_message;
        s1.getClass();
        cuao2.b |= 0x200;
        cuao2.o = s1;
        long v1 = statusBarNotification0.getNotification().when;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cuao cuao3 = (cuao)hftp0.b_message;
        cuao3.b |= 8;
        cuao3.h = v1;
        String s2 = statusBarNotification0.getNotification().getChannelId();
        ibuq.e(s2, "getChannelId(...)");
        ibuq.f(s2, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cuao cuao4 = (cuao)hftp0.b_message;
        s2.getClass();
        cuao4.b |= 4;
        cuao4.g = s2;
        if(ibuq.m(statusBarNotification0.getNotification().category, "msg")) {
            cuad.a(cuah.b, hftp0);
        }
        else {
            cuad.a(cuah.a, hftp0);
        }
        Notification notification2 = statusBarNotification0.getNotification();
        ibuq.e(notification2, "getNotification(...)");
        int v2 = ctwe.d(notification2);
        if(v2 != 0) {
            switch(v2 - 1) {
                case 0: {
                    Notification notification3 = statusBarNotification0.getNotification();
                    ibuq.e(notification3, "getNotification(...)");
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cuaf.a).v_newBuilder();
                    ibuq.f(hftp1, "builder");
                    if(Build.VERSION.SDK_INT >= 33) {
                        ibuq.f(notification3, "<this>");
                        Icon icon0 = notification3.extras.containsKey("android.largeIcon.big") ? ((Icon)notification3.extras.getParcelable("android.largeIcon.big", Icon.class)) : null;
                        if(icon0 != null) {
                            ByteString hfsf0 = this.a.a(icon0, context0);
                            ibuq.f(hfsf0, "value");
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            cuaf cuaf0 = (cuaf)hftp1.b_message;
                            hfsf0.getClass();
                            cuaf0.b |= 1;
                            cuaf0.c = hfsf0;
                        }
                    }
                    if(Build.VERSION.SDK_INT >= 33) {
                        ibuq.f(notification3, "<this>");
                        Bitmap bitmap0 = notification3.extras.containsKey("android.picture") ? ((Bitmap)notification3.extras.getParcelable("android.picture", Bitmap.class)) : null;
                        if(bitmap0 != null) {
                            Icon icon1 = Icon.createWithBitmap(bitmap0);
                            ibuq.e(icon1, "createWithBitmap(...)");
                            ByteString hfsf1 = this.a.a(icon1, context0);
                            ibuq.f(hfsf1, "value");
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            cuaf cuaf1 = (cuaf)hftp1.b_message;
                            hfsf1.getClass();
                            cuaf1.b |= 2;
                            cuaf1.d = hfsf1;
                        }
                    }
                    ibuq.f(notification3, "<this>");
                    String s3 = notification3.extras.containsKey("android.pictureContentDescription") ? notification3.extras.getString("android.pictureContentDescription") : null;
                    if(s3 != null) {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        cuaf cuaf2 = (cuaf)hftp1.b_message;
                        cuaf2.b |= 4;
                        cuaf2.e = s3;
                    }
                    String s4 = ctwe.a(notification3);
                    if(s4 != null) {
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        cuaf cuaf3 = (cuaf)hftp1.b_message;
                        cuaf3.b |= 8;
                        cuaf3.f = s4;
                    }
                    ibuq.f(notification3, "<this>");
                    Boolean boolean0 = notification3.extras.containsKey("android.showBigPictureWhenCollapsed") ? Boolean.valueOf(notification3.extras.getBoolean("android.showBigPictureWhenCollapsed")) : null;
                    if(boolean0 != null) {
                        boolean z = boolean0.booleanValue();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        cuaf cuaf4 = (cuaf)hftp1.b_message;
                        cuaf4.b |= 16;
                        cuaf4.g = z;
                    }
                    ProtoLiteMessage hftv0 = hftp1.N_build();
                    ibuq.e(hftv0, "build(...)");
                    ibuq.f(((cuaf)hftv0), "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    cuao cuao5 = (cuao)hftp0.b_message;
                    ((cuaf)hftv0).getClass();
                    cuao5.d = (cuaf)hftv0;
                    cuao5.c = 11;
                    break;
                }
                case 1: {
                    Notification notification4 = statusBarNotification0.getNotification();
                    ibuq.e(notification4, "getNotification(...)");
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)cuag.a).v_newBuilder();
                    ibuq.f(hftp2, "builder");
                    ibuq.f(notification4, "<this>");
                    String s5 = notification4.extras.containsKey("android.bigText") ? notification4.extras.getString("android.bigText") : null;
                    if(s5 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        cuag cuag0 = (cuag)hftp2.b_message;
                        cuag0.b |= 1;
                        cuag0.c = s5;
                    }
                    ibuq.f(notification4, "<this>");
                    String s6 = notification4.extras.containsKey("android.title.big") ? notification4.extras.getString("android.title.big") : null;
                    if(s6 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        cuag cuag1 = (cuag)hftp2.b_message;
                        cuag1.b |= 2;
                        cuag1.d = s6;
                    }
                    String s7 = ctwe.a(notification4);
                    if(s7 != null) {
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        cuag cuag2 = (cuag)hftp2.b_message;
                        cuag2.b |= 4;
                        cuag2.e = s7;
                    }
                    ProtoLiteMessage hftv1 = hftp2.N_build();
                    ibuq.e(hftv1, "build(...)");
                    ibuq.f(((cuag)hftv1), "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    cuao cuao6 = (cuao)hftp0.b_message;
                    ((cuag)hftv1).getClass();
                    cuao6.d = (cuag)hftv1;
                    cuao6.c = 10;
                    break;
                }
                case 2: {
                    Notification notification5 = statusBarNotification0.getNotification();
                    ibuq.e(notification5, "getNotification(...)");
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)cuam.a).v_newBuilder();
                    ibuq.f(hftp3, "builder");
                    ibuq.f(notification5, "<this>");
                    String s8 = notification5.extras.containsKey("android.conversationTitle") ? notification5.extras.getString("android.conversationTitle") : null;
                    if(s8 != null) {
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        cuam cuam0 = (cuam)hftp3.b_message;
                        cuam0.b |= 1;
                        cuam0.c = s8;
                    }
                    if(Build.VERSION.SDK_INT >= 33) {
                        ibuq.f(notification5, "<this>");
                        Person person0 = notification5.extras.containsKey("android.messagingUser") ? ((Person)notification5.extras.getParcelable("android.messagingUser", Person.class)) : null;
                        if(person0 != null) {
                            cuat cuat0 = this.c(person0, context0);
                            ibuq.f(cuat0, "value");
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            cuam cuam1 = (cuam)hftp3.b_message;
                            cuat0.getClass();
                            cuam1.d = cuat0;
                            cuam1.b |= 2;
                        }
                    }
                    ibuq.f(notification5, "<this>");
                    Boolean boolean1 = notification5.extras.containsKey("android.isGroupConversation") ? Boolean.valueOf(notification5.extras.getBoolean("android.isGroupConversation")) : null;
                    if(boolean1 != null) {
                        boolean z1 = boolean1.booleanValue();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        cuam cuam2 = (cuam)hftp3.b_message;
                        cuam2.b |= 4;
                        cuam2.e = z1;
                    }
                    if(Build.VERSION.SDK_INT >= 33) {
                        ibuq.f(notification5, "<this>");
                        List list0 = notification5.extras.containsKey("android.messages.historic") ? Notification.MessagingStyle.Message.getMessagesFromBundleArray(((Parcelable[])notification5.extras.getParcelableArray("android.messages.historic", Parcelable.class))) : null;
                        if(list0 != null) {
                            List list1 = DesugarCollections.unmodifiableList(((cuam)hftp3.b_message).f);
                            ibuq.e(list1, "getHistoricMessagesList(...)");
                            new hfxu(list1);
                            ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                            for(Object object0: list0) {
                                arrayList0.add(this.b(((Notification.MessagingStyle.Message)object0), context0));
                            }
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            cuam cuam3 = (cuam)hftp3.b_message;
                            hfuo hfuo0 = cuam3.f;
                            if(!hfuo0.c()) {
                                cuam3.f = ProtoLiteMessage.E(hfuo0);
                            }
                            hfrj.E(arrayList0, cuam3.f);
                        }
                    }
                    if(Build.VERSION.SDK_INT >= 33) {
                        ibuq.f(notification5, "<this>");
                        List list2 = notification5.extras.containsKey("android.messages") ? Notification.MessagingStyle.Message.getMessagesFromBundleArray(((Parcelable[])notification5.extras.getParcelableArray("android.messages", Parcelable.class))) : null;
                        if(list2 != null) {
                            List list3 = DesugarCollections.unmodifiableList(((cuam)hftp3.b_message).g);
                            ibuq.e(list3, "getMessagesList(...)");
                            new hfxu(list3);
                            ArrayList arrayList1 = new ArrayList(ibpo.q(list2, 10));
                            for(Object object1: list2) {
                                arrayList1.add(this.b(((Notification.MessagingStyle.Message)object1), context0));
                            }
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            cuam cuam4 = (cuam)hftp3.b_message;
                            hfuo hfuo1 = cuam4.g;
                            if(!hfuo1.c()) {
                                cuam4.g = ProtoLiteMessage.E(hfuo1);
                            }
                            hfrj.E(arrayList1, cuam4.g);
                        }
                    }
                    ProtoLiteMessage hftv2 = hftp3.N_build();
                    ibuq.e(hftv2, "build(...)");
                    ibuq.f(((cuam)hftv2), "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    cuao cuao7 = (cuao)hftp0.b_message;
                    ((cuam)hftv2).getClass();
                    cuao7.d = (cuam)hftv2;
                    cuao7.c = 5;
                }
            }
        }
        if(hvns.d()) {
            Notification.Action[] arr_notification$Action = statusBarNotification0.getNotification().actions;
            if(arr_notification$Action != null) {
                int v3 = 0;
                int v4 = 0;
                while(v3 < arr_notification$Action.length) {
                    Notification.Action notification$Action0 = arr_notification$Action[v3];
                    List list4 = DesugarCollections.unmodifiableList(((cuao)hftp0.b_message).k);
                    ibuq.e(list4, "getActionsList(...)");
                    new hfxu(list4);
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)cuae.a).v_newBuilder();
                    ibuq.f(hftp4, "builder");
                    String s9 = notification$Action0.title.toString();
                    ibuq.f(s9, "value");
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp4.b_message;
                    s9.getClass();
                    ((cuae)hftv3).b |= 1;
                    ((cuae)hftv3).c = s9;
                    if(!hftv3.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    cuae cuae0 = (cuae)hftp4.b_message;
                    cuae0.b |= 2;
                    cuae0.d = v4;
                    Icon icon2 = notification$Action0.getIcon();
                    if(icon2 != null) {
                        ByteString hfsf2 = this.a.a(icon2, context0);
                        ibuq.f(hfsf2, "value");
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        cuae cuae1 = (cuae)hftp4.b_message;
                        hfsf2.getClass();
                        cuae1.b |= 4;
                        cuae1.e = hfsf2;
                    }
                    ProtoLiteMessage hftv4 = hftp4.N_build();
                    ibuq.e(hftv4, "build(...)");
                    ibuq.f(((cuae)hftv4), "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    cuao cuao8 = (cuao)hftp0.b_message;
                    ((cuae)hftv4).getClass();
                    hfuo hfuo2 = cuao8.k;
                    if(!hfuo2.c()) {
                        cuao8.k = ProtoLiteMessage.E(hfuo2);
                    }
                    cuao8.k.add(((cuae)hftv4));
                    ++v3;
                    ++v4;
                    arr_notification$Action = arr_notification$Action;
                }
            }
        }
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)cuak.a).v_newBuilder();
        ibuq.f(hftp5, "builder");
        Notification notification6 = statusBarNotification0.getNotification();
        ibuq.e(notification6, "getNotification(...)");
        ibuq.f(notification6, "<this>");
        String s10 = notification6.extras.containsKey("android.intent.extra.CHANNEL_GROUP_ID") ? notification6.extras.getString("android.intent.extra.CHANNEL_GROUP_ID") : null;
        if(s10 != null) {
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            cuak cuak0 = (cuak)hftp5.b_message;
            cuak0.b |= 1;
            cuak0.c = s10;
        }
        Notification notification7 = statusBarNotification0.getNotification();
        ibuq.e(notification7, "getNotification(...)");
        ibuq.f(notification7, "<this>");
        String s11 = notification7.extras.containsKey("android.infoText") ? notification7.extras.getString("android.infoText") : null;
        if(s11 != null) {
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            cuak cuak1 = (cuak)hftp5.b_message;
            cuak1.b |= 2;
            cuak1.d = s11;
        }
        String s12 = statusBarNotification0.getTag();
        if(s12 != null) {
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            cuak cuak2 = (cuak)hftp5.b_message;
            cuak2.b |= 4;
            cuak2.e = s12;
        }
        Notification notification8 = statusBarNotification0.getNotification();
        ibuq.e(notification8, "getNotification(...)");
        ibuq.f(notification8, "<this>");
        Boolean boolean2 = notification8.extras.containsKey("android.showChronometer") ? Boolean.valueOf(notification8.extras.getBoolean("android.showChronometer")) : null;
        if(boolean2 != null) {
            boolean z2 = boolean2.booleanValue();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            cuak cuak3 = (cuak)hftp5.b_message;
            cuak3.b |= 8;
            cuak3.f = z2;
        }
        Notification notification9 = statusBarNotification0.getNotification();
        ibuq.e(notification9, "getNotification(...)");
        ibuq.f(notification9, "<this>");
        Boolean boolean3 = notification9.extras.containsKey("android.chronometerCountDown") ? Boolean.valueOf(notification9.extras.getBoolean("android.chronometerCountDown")) : null;
        if(boolean3 != null) {
            boolean z3 = boolean3.booleanValue();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            cuak cuak4 = (cuak)hftp5.b_message;
            cuak4.b |= 16;
            cuak4.g = z3;
        }
        Notification notification10 = statusBarNotification0.getNotification();
        ibuq.e(notification10, "getNotification(...)");
        ibuq.f(notification10, "<this>");
        Boolean boolean4 = notification10.extras.containsKey("android.showWhen") ? Boolean.valueOf(notification10.extras.getBoolean("android.showWhen")) : null;
        if(boolean4 != null) {
            boolean z4 = boolean4.booleanValue();
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            cuak cuak5 = (cuak)hftp5.b_message;
            cuak5.b |= 0x20;
            cuak5.h = z4;
        }
        Notification notification11 = statusBarNotification0.getNotification();
        ibuq.e(notification11, "getNotification(...)");
        ibuq.f(notification11, "<this>");
        String s13 = notification11.extras.containsKey("android.subText") ? notification11.extras.getString("android.subText") : null;
        if(s13 != null) {
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            cuak cuak6 = (cuak)hftp5.b_message;
            cuak6.b |= 0x40;
            cuak6.i = s13;
        }
        Notification notification12 = statusBarNotification0.getNotification();
        ibuq.e(notification12, "getNotification(...)");
        String s14 = ctwe.c(notification12);
        if(s14 != null) {
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            cuak cuak7 = (cuak)hftp5.b_message;
            cuak7.b |= 0x100;
            cuak7.k = s14;
        }
        Notification notification13 = statusBarNotification0.getNotification();
        ibuq.e(notification13, "getNotification(...)");
        String s15 = ctwe.b(notification13);
        if(s15 != null) {
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            cuak cuak8 = (cuak)hftp5.b_message;
            cuak8.b |= 0x80;
            cuak8.j = s15;
        }
        ProtoLiteMessage hftv5 = hftp5.N_build();
        ibuq.e(hftv5, "build(...)");
        ibuq.f(((cuak)hftv5), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cuao cuao9 = (cuao)hftp0.b_message;
        ((cuak)hftv5).getClass();
        cuao9.i = (cuak)hftv5;
        cuao9.b |= 16;
        Icon icon3 = statusBarNotification0.getNotification().getSmallIcon();
        if(icon3 != null) {
            ByteString hfsf3 = this.a.a(icon3, context0);
            ibuq.f(hfsf3, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cuao cuao10 = (cuao)hftp0.b_message;
            hfsf3.getClass();
            cuao10.b |= 0x40;
            cuao10.l = hfsf3;
        }
        Icon icon4 = statusBarNotification0.getNotification().getLargeIcon();
        if(icon4 != null) {
            ByteString hfsf4 = this.a.a(icon4, context0);
            ibuq.f(hfsf4, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cuao cuao11 = (cuao)hftp0.b_message;
            hfsf4.getClass();
            cuao11.b |= 0x80;
            cuao11.m = hfsf4;
        }
        String s16 = statusBarNotification0.getPackageName();
        ibuq.e(s16, "getPackageName(...)");
        PackageManager packageManager0 = context0.getPackageManager();
        ibuq.e(packageManager0, "getPackageManager(...)");
        ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo(s16, 0);
        ibuq.e(applicationInfo0, "getApplicationInfo(...)");
        String s17 = packageManager0.getApplicationLabel(applicationInfo0).toString();
        ibuq.f(s17, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cuao cuao12 = (cuao)hftp0.b_message;
        s17.getClass();
        cuao12.b |= 0x100;
        cuao12.n = s17;
        ProtoLiteMessage hftv6 = hftp0.N_build();
        ibuq.e(hftv6, "build(...)");
        return (cuao)hftv6;
    }

    private final cual b(Notification.MessagingStyle.Message notification$MessagingStyle$Message0, Context context0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cual.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        String s = notification$MessagingStyle$Message0.getText().toString();
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cual cual0 = (cual)hftp0.b_message;
        s.getClass();
        cual0.b |= 2;
        cual0.d = s;
        long v = notification$MessagingStyle$Message0.getTimestamp();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cual cual1 = (cual)hftp0.b_message;
        cual1.b |= 4;
        cual1.e = v;
        Person person0 = notification$MessagingStyle$Message0.getSenderPerson();
        if(person0 != null) {
            cuat cuat0 = this.c(person0, context0);
            ibuq.f(cuat0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cual cual2 = (cual)hftp0.b_message;
            cuat0.getClass();
            cual2.c = cuat0;
            cual2.b |= 1;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (cual)hftv0;
    }

    private final cuat c(Person person0, Context context0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)cuat.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        String s = String.valueOf(person0.getName());
        ibuq.f(s, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cuat cuat0 = (cuat)hftp0.b_message;
        s.getClass();
        cuat0.b |= 1;
        cuat0.c = s;
        boolean z = person0.isBot();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cuat cuat1 = (cuat)hftp0.b_message;
        cuat1.b |= 2;
        cuat1.d = z;
        boolean z1 = person0.isImportant();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cuat cuat2 = (cuat)hftp0.b_message;
        cuat2.b |= 4;
        cuat2.e = z1;
        Icon icon0 = person0.getIcon();
        if(icon0 != null) {
            ByteString hfsf0 = this.a.a(icon0, context0);
            ibuq.f(hfsf0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cuat cuat3 = (cuat)hftp0.b_message;
            hfsf0.getClass();
            cuat3.b |= 8;
            cuat3.f = hfsf0;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (cuat)hftv0;
    }
}

