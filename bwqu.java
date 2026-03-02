public final class bwqu {
    private static final ggeo a;

    static {
        ggek ggek0 = new ggek();
        ggek0.i("Action", glts.S);
        ggek0.i("AggregateRating", glts.E);
        ggek0.i("AlarmInstance", glts.F);
        ggek0.i("Alarm", glts.c);
        ggek0.i("Attendee", glts.G);
        ggek0.i("Audiobook", glts.N);
        ggek0.i("Book", glts.M);
        ggek0.i("ContactPoint", glts.Y);
        ggek0.i("Contact", glts.J);
        ggek0.i("ContextualEvent", glts.K);
        ggek0.i("Conversation", glts.d);
        ggek0.i("Date", glts.U);
        ggek0.i("DateTime", glts.V);
        ggek0.i("DigitalDocumentPermission", glts.f);
        ggek0.i("DigitalDocument", glts.e);
        ggek0.i("EmailMessage", glts.g);
        ggek0.i("Event", glts.h);
        ggek0.i("ExtractedEntity", glts.T);
        ggek0.i("Flight", glts.W);
        ggek0.i("GeoShape", glts.i);
        ggek0.i("GmmVoiceModel", glts.R);
        ggek0.i("LocalBusiness", glts.j);
        ggek0.i("Message", glts.k);
        ggek0.i("MobileApplication", glts.L);
        ggek0.i("Movie", glts.O);
        ggek0.i("MusicAlbum", glts.l);
        ggek0.i("MusicGroup", glts.m);
        ggek0.i("MusicPlaylist", glts.n);
        ggek0.i("MusicRecording", glts.o);
        ggek0.i("NoteDigitalDocument", glts.p);
        ggek0.i("Person", glts.q);
        ggek0.i("Photograph", glts.r);
        ggek0.i("Place", glts.s);
        ggek0.i("PostalAddress", glts.I);
        ggek0.i("PresentationDigitalDocument", glts.t);
        ggek0.i("Reservation", glts.u);
        ggek0.i("Restaurant", glts.v);
        ggek0.i("SpreadsheetDigitalDocument", glts.w);
        ggek0.i("StashRecord", glts.Z);
        ggek0.i("StickerPack", glts.y);
        ggek0.i("Sticker", glts.x);
        ggek0.i("StopwatchLap", glts.H);
        ggek0.i("Stopwatch", glts.z);
        ggek0.i("TextDigitalDocument", glts.A);
        ggek0.i("Thing", glts.B);
        ggek0.i("Timer", glts.C);
        ggek0.i("TVSeries", glts.P);
        ggek0.i("VideoObject", glts.D);
        ggek0.i("WebPage", glts.Q);
        ggek0.i("GPayTransaction", glts.aa);
        ggek0.i("GPayProductsOrServices", glts.ab);
        ggek0.i("GPayMoney", glts.ac);
        bwqu.a = ggek0.b();
    }

    public static glts a(String s, bwtc bwtc0) {
        if(s == null) {
            return glts.a;
        }
        glts glts0 = (glts)bwqu.a.get(s);
        if(glts0 != null) {
            return glts0;
        }
        return bwtc0.i(s) || bwtc0.b.contains(s) ? glts.b : glts.a;
    }
}

