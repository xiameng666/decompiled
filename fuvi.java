public final class fuvi {
    public final hecp a;
    public final fvuc b;

    public fuvi(hecp hecp0, fvuc fvuc0) {
        this.a = hecp0;
        this.b = fvuc0;
    }

    @Override
    public final String toString() {
        return this.b == null ? "ClassificationSignals [wifiScan=" + this.a.toString() + ", networkLocation=" + null + "]" : "ClassificationSignals [wifiScan=" + this.a.toString() + ", networkLocation=" + this.b.toString().replaceAll("\n", "_") + "]";
    }
}

