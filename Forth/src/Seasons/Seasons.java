package Seasons;

public enum Seasons {
    WINTER(0),
    SPRING(10),
    SUMMER(20) {
        @Override
        public String getDescription()
        {
            return "Тёплое время года";
        }
    },
    AUTUMN(10);
    private final double avgTemp;

    private Seasons(double avgTemp) {
        this.avgTemp = avgTemp;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    public String getDescription()
    {
        return "Холодное время года";
    }
}
