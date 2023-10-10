package Third;

public class Run {
    public static void main(String[] args) {
        Convertable celsius = new Convertable() {
            @Override
            public double convert(Temp temp, double value) {
                switch (temp)
                {
                    case Celsius -> {return value;}
                    case Kelvin -> {return value + 273.15;}
                    case Farengeit -> {return value * 9 / 5 + 32;}
                }
                return value;
            }
        };
        Convertable kelvin = new Convertable() {
            @Override
            public double convert(Temp temp, double value) {
                switch (temp)
                {
                    case Celsius -> {return value - 273.15;}
                    case Kelvin -> {return value;}
                    case Farengeit -> {return (value - 273.15) * 9 / 5 + 32;}
                }
                return value;
            }
        };
        Convertable farengeit = new Convertable() {
            @Override
            public double convert(Temp temp, double value) {
                switch (temp)
                {
                    case Celsius -> {return (value - 32) * 5 / 9;}
                    case Kelvin -> {return (value - 32) * 5 / 9 + 273.15;}
                    case Farengeit -> {return value;}
                }
                return value;
            }
        };

        double tempVal = 25;
        System.out.format("%f градусов по %s%n", celsius.convert(Temp.Celsius, tempVal), Temp.Celsius);
        System.out.println("это:");
        System.out.format("%f градусов по %s%n", celsius.convert(Temp.Kelvin, tempVal), Temp.Kelvin);
        System.out.format("%f градусов по %s%n", celsius.convert(Temp.Farengeit, tempVal), Temp.Farengeit);

        System.out.println();

        System.out.format("%f градусов по %s%n", kelvin.convert(Temp.Kelvin, tempVal), Temp.Kelvin);
        System.out.println("это:");
        System.out.format("%f градусов по %s%n", kelvin.convert(Temp.Celsius, tempVal), Temp.Celsius);
        System.out.format("%f градусов по %s%n", kelvin.convert(Temp.Farengeit, tempVal), Temp.Farengeit);

        System.out.println();

        System.out.format("%f градусов по %s%n", farengeit.convert(Temp.Farengeit, tempVal), Temp.Farengeit);
        System.out.println("это:");
        System.out.format("%f градусов по %s%n", farengeit.convert(Temp.Kelvin, tempVal), Temp.Kelvin);
        System.out.format("%f градусов по %s%n", farengeit.convert(Temp.Celsius, tempVal), Temp.Celsius);
    }
}
