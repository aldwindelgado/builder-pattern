package io.github.aldwindelgado;

/**
 * @author Aldwin Delgado on Apr 09, 2020
 */
public class BuilderPattern {

    /*  Values of the ff. can only be set during the building phase of the variable itself
     */

    private final String bread;

    private final String condiments;

    private final String dressing;

    private final String meat;

    private BuilderPattern(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public static class Builder {

        private String bread;

        private String condiments;

        private String dressing;

        private String meat;

        public Builder() {
            // this will be always empty; just to be used when instantiating the 'Builder' static class itself
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder setDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder setMeat(String meat) {
            this.meat = meat;
            return this;
        }
    }
}
