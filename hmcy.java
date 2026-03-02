import java.util.LinkedHashMap;

public final class hmcy {
    public hmgz a;
    public hmgz b;
    public hmgz c;

    public hmcy(LinkedHashMap linkedHashMap0, boolean z) {
        hmgz hmgz0 = null;
        super();
        LinkedHashMap linkedHashMap1 = ((hmcx)linkedHashMap0.get(Integer.valueOf(0x101))).c;
        if(linkedHashMap1 != null) {
            if(z) {
                this.a = linkedHashMap1.get(new hmgz("9F62")) == null ? null : ((hmdk)linkedHashMap1.get(new hmgz("9F62"))).c;
                this.b = linkedHashMap1.get(new hmgz("9F63")) == null ? null : ((hmdk)linkedHashMap1.get(new hmgz("9F63"))).c;
                if(linkedHashMap1.get(new hmgz("9F64")) != null) {
                    hmgz0 = ((hmdk)linkedHashMap1.get(new hmgz("9F64"))).c;
                }
                this.c = hmgz0;
                return;
            }
            this.a = linkedHashMap1.get(new hmgz("9F65")) == null ? null : ((hmdk)linkedHashMap1.get(new hmgz("9F65"))).c;
            this.b = linkedHashMap1.get(new hmgz("9F66")) == null ? null : ((hmdk)linkedHashMap1.get(new hmgz("9F66"))).c;
            if(linkedHashMap1.get(new hmgz("9F67")) != null) {
                hmgz0 = ((hmdk)linkedHashMap1.get(new hmgz("9F67"))).c;
            }
            this.c = hmgz0;
        }
    }

    @Override
    public final String toString() {
        hmbb hmbb0 = hmhe.a();
        this.a.i();
        this.b.i();
        this.c.i();
        hmbb0.e();
        return "MChipTrackConstructionData";
    }
}

