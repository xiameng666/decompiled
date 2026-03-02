package com.google.android.gms.icing.shim.schemas;

import aef;
import aei;
import aeq;
import aes;
import aeu;
import aew;
import aez;
import afa;
import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ..__AppSearch__MusicRecording implements aeu {
    @Override  // aeu
    public final aes a() {
        aef aef0 = new aef("MusicRecording");
        aeq aeq0 = new aeq("name");
        aeq0.b(2);
        aeq0.e(1);
        aeq0.c(2);
        aeq0.d(0);
        aef0.c(aeq0.a());
        aeq aeq1 = new aeq("keywords");
        aeq1.b(1);
        aeq1.e(2);
        aeq1.c(1);
        aeq1.d(0);
        aef0.c(aeq1.a());
        aeq aeq2 = new aeq("alternateName");
        aeq2.b(1);
        aeq2.e(1);
        aeq2.c(2);
        aeq2.d(0);
        aef0.c(aeq2.a());
        aei aei0 = new aei("g3attrinfo", "G3AttributionInfo");
        aei0.c(2);
        aei0.a = true;
        aef0.c(aei0.a());
        aei aei1 = new aei("inAlbum", "MusicAlbum");
        aei1.c(2);
        aei1.a = false;
        aei1.d(new String[]{"name"});
        aef0.c(aei1.a());
        aei aei2 = new aei("byArtist", "MusicGroup");
        aei2.c(2);
        aei2.a = false;
        aei2.d(new String[]{"name"});
        aef0.c(aei2.a());
        aei aei3 = new aei("inPlaylist", "MusicPlaylist");
        aei3.c(2);
        aei3.a = false;
        aei3.d(new String[]{"name"});
        aef0.c(aei3.a());
        aeq aeq3 = new aeq("albumId");
        aeq3.b(2);
        aeq3.e(0);
        aeq3.c(0);
        aeq3.d(0);
        aef0.c(aeq3.a());
        aeq aeq4 = new aeq("artistId");
        aeq4.b(2);
        aeq4.e(0);
        aeq4.c(0);
        aeq4.d(0);
        aef0.c(aeq4.a());
        return aef0.a();
    }

    @Override  // aeu
    public final afa b(Object object0) {
        aez aez0 = new aez(((MusicRecording)object0).q, ((MusicRecording)object0).p, "MusicRecording");
        aez0.b("name", new String[]{((MusicRecording)object0).r});
        List list0 = ((MusicRecording)object0).b();
        if(list0 != null) {
            aez0.b("keywords", ((String[])list0.toArray(new String[0])));
        }
        List list1 = ((MusicRecording)object0).a();
        if(list1 != null) {
            aez0.b("alternateName", ((String[])list1.toArray(new String[0])));
        }
        aez0.a("g3attrinfo", new afa[]{afa.f(((MusicRecording)object0).s)});
        MusicAlbum musicAlbum0 = ((MusicRecording)object0).a;
        if(musicAlbum0 != null) {
            aez0.a("inAlbum", new afa[]{afa.f(musicAlbum0)});
        }
        MusicGroup musicGroup0 = ((MusicRecording)object0).b;
        if(musicGroup0 != null) {
            aez0.a("byArtist", new afa[]{afa.f(musicGroup0)});
        }
        MusicPlaylist musicPlaylist0 = ((MusicRecording)object0).c;
        if(musicPlaylist0 != null) {
            aez0.a("inPlaylist", new afa[]{afa.f(musicPlaylist0)});
        }
        aez0.b("albumId", new String[]{((MusicRecording)object0).d});
        aez0.b("artistId", new String[]{((MusicRecording)object0).e});
        return aez0.e();
    }

    @Override  // aeu
    public final Object c(afa afa0, aew aew0) {
        String s = afa0.k();
        String s1 = afa0.l();
        String[] arr_s = afa0.u("name");
        String s2 = null;
        String s3 = arr_s == null || arr_s.length == 0 ? null : arr_s[0];
        String[] arr_s1 = afa0.u("keywords");
        List list0 = arr_s1 == null ? null : Arrays.asList(arr_s1);
        String[] arr_s2 = afa0.u("alternateName");
        List list1 = arr_s2 == null ? null : Arrays.asList(arr_s2);
        afa afa1 = afa0.g("g3attrinfo");
        G3AttributionInfo g3AttributionInfo0 = afa1 == null ? null : ((G3AttributionInfo)afa1.j(G3AttributionInfo.class, aew0));
        afa afa2 = afa0.g("inAlbum");
        MusicAlbum musicAlbum0 = afa2 == null ? null : ((MusicAlbum)afa2.j(MusicAlbum.class, aew0));
        afa afa3 = afa0.g("byArtist");
        MusicGroup musicGroup0 = afa3 == null ? null : ((MusicGroup)afa3.j(MusicGroup.class, aew0));
        afa afa4 = afa0.g("inPlaylist");
        MusicPlaylist musicPlaylist0 = afa4 == null ? null : ((MusicPlaylist)afa4.j(MusicPlaylist.class, aew0));
        String[] arr_s3 = afa0.u("albumId");
        String s4 = arr_s3 == null || arr_s3.length == 0 ? null : arr_s3[0];
        String[] arr_s4 = afa0.u("artistId");
        if(arr_s4 != null && arr_s4.length != 0) {
            s2 = arr_s4[0];
        }
        return new MusicRecording(s1, s, s3, list0, list1, musicAlbum0, musicGroup0, musicPlaylist0, s4, s2, g3AttributionInfo0);
    }

    @Override  // aeu
    public final String d() {
        return "MusicRecording";
    }

    @Override  // aeu
    public final List e() {
        List list0 = new ArrayList();
        list0.add(G3AttributionInfo.class);
        list0.add(MusicAlbum.class);
        list0.add(MusicGroup.class);
        list0.add(MusicPlaylist.class);
        return list0;
    }
}

