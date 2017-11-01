package edu.ucsd.cs110.temperature;

    public abstract class Temperature {
        private final double value;

        public Temperature(float v)
        {
            value = v;
        }
        public final float getValue()
        {
            return (float) value;
        }
        public abstract Temperature toCelsius();
        public abstract Temperature toFahrenheit();
}

