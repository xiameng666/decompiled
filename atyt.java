import com.google.android.gms.cast.CastDevice;
import java.util.List;

public final class atyt {
    private final avjh a;
    private final avij b;
    private final atyc c;

    public atyt(atyc atyc0) {
        this.a = new avjh("RouteControllerRecorder");
        this.c = atyc0;
        this.b = avij.e();
    }

    public final void a(atze atze0) {
        synchronized(this) {
            this.a.n("logRouteControllerReleased with summary: %s", atze0);
            glai glai0 = this.c(atze0);
            this.c.n(glai0, gkey.bD);
        }
    }

    public final void b(atze atze0) {
        synchronized(this) {
            this.a.n("logRouteControllerSelected with summary: %s", atze0);
            glai glai0 = this.c(atze0);
            this.c.n(glai0, gkey.bC);
        }
    }

    private final glai c(atze atze0) {
        glai glai2;
        int v7;
        int v6;
        synchronized(this) {
            glah glah0 = this.c.d(atze0.b, null, null, null, 0);
            atze0.b();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glal.a).v_newBuilder();
            if(atze0.l != null) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glap.a).v_newBuilder();
                String s = atze0.l;
                batl.s(s);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                glap glap0 = (glap)hftp1.b_message;
                glap0.b |= 1;
                glap0.c = s;
                glap glap1 = (glap)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glal glal0 = (glal)hftp0.b_message;
                glap1.getClass();
                glal0.c = glap1;
                glal0.b |= 1;
            }
            List list0 = atze0.f;
            if(!list0.isEmpty()) {
                for(Object object0: list0) {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)glak.a).v_newBuilder();
                    int v1 = ((auou)object0).e;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp2.b_message;
                    ((glak)hftv0).c = v1 - 1;
                    ((glak)hftv0).b |= 1;
                    long v2 = ((auou)object0).b - ((auou)object0).d;
                    if(!hftv0.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp2.b_message;
                    ((glak)hftv1).b |= 16;
                    ((glak)hftv1).f = (long)(((int)v2));
                    if(!hftv1.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    glak glak0 = (glak)hftp2.b_message;
                    glak0.b |= 2;
                    glak0.d = (int)v2;
                    Integer integer0 = ((auou)object0).a;
                    if(integer0 != null) {
                        int v3 = (int)integer0;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        glak glak1 = (glak)hftp2.b_message;
                        glak1.b |= 4;
                        glak1.e = v3;
                    }
                    glak glak2 = (glak)hftp2.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    glal glal1 = (glal)hftp0.b_message;
                    glak2.getClass();
                    hfuo hfuo0 = glal1.d;
                    if(!hfuo0.c()) {
                        glal1.d = ProtoLiteMessage.E(hfuo0);
                    }
                    glal1.d.add(glak2);
                }
            }
            glal glal2 = (glal)hftp0.N_build();
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai0 = (glai)glah0.b_message;
            glal2.getClass();
            glai0.K = glal2;
            glai0.c |= 4;
            atze0.b();
            glcg glcg0 = (glcg)((ProtoLiteMessage)glch.a).v_newBuilder();
            int v4 = atze0.m;
            if(!glcg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glcg0).ensureMutable();
            }
            ((glch)glcg0.b_message).c = v4 - 1;
            ((glch)glcg0.b_message).b |= 1;
            boolean z = atze0.k;
            if(!glcg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glcg0).ensureMutable();
            }
            glch glch0 = (glch)glcg0.b_message;
            glch0.b |= 2;
            glch0.d = z;
            if(atze0.a.A()) {
                boolean z1 = atze0.j;
                if(!glcg0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glcg0).ensureMutable();
                }
                glch glch1 = (glch)glcg0.b_message;
                glch1.b |= 4;
                glch1.g = z1;
            }
            List list1 = atze0.i;
            if(!list1.isEmpty()) {
                glcg0.a(((atzg)list1.get(0)).a());
                if(list1.size() > 1) {
                    glcg0.a(((atzg)gggq.p(list1)).a());
                }
            }
            List list2 = atze0.g;
            if(!list2.isEmpty()) {
                for(Object object1: list2) {
                    atzj atzj0 = (atzj)object1;
                    glce glce0 = (glce)((ProtoLiteMessage)glcf.a).v_newBuilder();
                    long v5 = atzj0.c - atzj0.d;
                    if(!glce0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glce0).ensureMutable();
                    }
                    glcf glcf0 = (glcf)glce0.b_message;
                    glcf0.b |= 2;
                    glcf0.d = (long)(((int)v5));
                    switch(atzj0.a) {
                        case 1: {
                            v6 = 2;
                            break;
                        }
                        case 2: {
                            v6 = 3;
                            break;
                        }
                        default: {
                            v6 = 4;
                        }
                    }
                    if(!glce0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glce0).ensureMutable();
                    }
                    ((glcf)glce0.b_message).c = v6 - 1;
                    ((glcf)glce0.b_message).b |= 1;
                    List list3 = atzj0.b;
                    if(!list3.isEmpty()) {
                        for(Object object2: list3) {
                            glcb glcb0 = atyc.h(((CastDevice)object2));
                            if(glcb0 != null) {
                                if(!glce0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)glce0).ensureMutable();
                                }
                                glcf glcf1 = (glcf)glce0.b_message;
                                hfuo hfuo1 = glcf1.e;
                                if(!hfuo1.c()) {
                                    glcf1.e = ProtoLiteMessage.E(hfuo1);
                                }
                                glcf1.e.add(glcb0);
                            }
                        }
                    }
                    List list4 = atzj0.e;
                    if(!list4.isEmpty()) {
                        for(Object object3: list4) {
                            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)glaj.a).v_newBuilder();
                            switch(((auos)object3).a) {
                                case "activeTracks": {
                                    v7 = 11;
                                    break;
                                }
                                case "launch": {
                                    v7 = 22;
                                    break;
                                }
                                case "load": {
                                    v7 = 2;
                                    break;
                                }
                                case "mute": {
                                    v7 = 8;
                                    break;
                                }
                                case "pause": {
                                    v7 = 4;
                                    break;
                                }
                                case "play": {
                                    v7 = 3;
                                    break;
                                }
                                case "queueFetchItemIds": {
                                    v7 = 17;
                                    break;
                                }
                                case "queueFetchItemRange": {
                                    v7 = 18;
                                    break;
                                }
                                case "queueFetchItems": {
                                    v7 = 19;
                                    break;
                                }
                                case "queueInsert": {
                                    v7 = 13;
                                    break;
                                }
                                case "queueRemove": {
                                    v7 = 15;
                                    break;
                                }
                                case "queueReorder": {
                                    v7 = 16;
                                    break;
                                }
                                case "queueUpdate": {
                                    v7 = 14;
                                    break;
                                }
                                case "seek": {
                                    v7 = 6;
                                    break;
                                }
                                case "setPlaybackDevices": {
                                    v7 = 23;
                                    break;
                                }
                                case "setPlaybackRate": {
                                    v7 = 20;
                                    break;
                                }
                                case "skipAd": {
                                    v7 = 21;
                                    break;
                                }
                                case "status": {
                                    v7 = 10;
                                    break;
                                }
                                case "stop": {
                                    v7 = 5;
                                    break;
                                }
                                case "trackStyle": {
                                    v7 = 12;
                                    break;
                                }
                                case "volume": {
                                    v7 = 7;
                                    break;
                                }
                                case "volume-mute": {
                                    v7 = 9;
                                    break;
                                }
                                default: {
                                    v7 = 1;
                                }
                            }
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv2 = hftp3.b_message;
                            ((glaj)hftv2).c = v7 - 1;
                            ((glaj)hftv2).b |= 1;
                            int v8 = (int)((auos)object3).b;
                            if(!hftv2.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv3 = hftp3.b_message;
                            ((glaj)hftv3).b |= 2;
                            ((glaj)hftv3).d = v8;
                            int v9 = ((auos)object3).c;
                            if(!hftv3.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv4 = hftp3.b_message;
                            ((glaj)hftv4).b |= 4;
                            ((glaj)hftv4).e = v9;
                            long v10 = ((auos)object3).d - ((auos)object3).f;
                            if(!hftv4.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            ProtoLiteMessage hftv5 = hftp3.b_message;
                            ((glaj)hftv5).b |= 8;
                            ((glaj)hftv5).f = (int)v10;
                            long v11 = ((auos)object3).e - ((auos)object3).f;
                            if(!hftv5.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            glaj glaj0 = (glaj)hftp3.b_message;
                            glaj0.b |= 16;
                            glaj0.g = (int)v11;
                            glaj glaj1 = (glaj)hftp3.N_build();
                            if(!glce0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)glce0).ensureMutable();
                            }
                            glcf glcf2 = (glcf)glce0.b_message;
                            glaj1.getClass();
                            hfuo hfuo2 = glcf2.f;
                            if(!hfuo2.c()) {
                                glcf2.f = ProtoLiteMessage.E(hfuo2);
                            }
                            glcf2.f.add(glaj1);
                            atzj0 = atzj0;
                            glce0 = glce0;
                        }
                    }
                    List list5 = atzj0.f;
                    if(!list5.isEmpty()) {
                        glce0.a(((atzg)list5.get(0)).a());
                        if(list5.size() > 1) {
                            glce0.a(((atzg)gggq.p(list5)).a());
                        }
                    }
                    glcf glcf3 = (glcf)((ProtoLiteBuilder)glce0).N_build();
                    if(!glcg0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)glcg0).ensureMutable();
                    }
                    glch glch2 = (glch)glcg0.b_message;
                    glcf3.getClass();
                    hfuo hfuo3 = glch2.f;
                    if(!hfuo3.c()) {
                        glch2.f = ProtoLiteMessage.E(hfuo3);
                    }
                    glch2.f.add(glcf3);
                }
            }
            glch glch3 = (glch)((ProtoLiteBuilder)glcg0).N_build();
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai1 = (glai)glah0.b_message;
            glch3.getClass();
            glai1.ac = glch3;
            glai1.c |= 0x8000000;
            if(this.b.z()) {
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)glac.a).v_newBuilder();
                String s1 = atze0.c.a();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                glac glac0 = (glac)hftp4.b_message;
                s1.getClass();
                glac0.b |= 1;
                glac0.c = s1;
                glah0.k(((glac)hftp4.N_build()));
            }
            glcb glcb1 = atyc.h(atze0.d);
            if(glcb1 != null) {
                if(!glah0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)glah0).ensureMutable();
                }
                ((glai)glah0.b_message).aa = glcb1;
                ((glai)glah0.b_message).c |= 0x2000000;
            }
            glai2 = (glai)((ProtoLiteBuilder)glah0).N_build();
        }
        return glai2;
    }
}

