package io.github.danushka96.models;

/**
 * @author danushka
 * 11/4/2020
 */
public class Logos {
    private Custom custom;
    private boolean vimeo;

    public Logos() {
    }

    public Logos(Custom custom, boolean vimeo) {
        this.custom = custom;
        this.vimeo = vimeo;
    }

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    public boolean isVimeo() {
        return vimeo;
    }

    public void setVimeo(boolean vimeo) {
        this.vimeo = vimeo;
    }

    public static class Builder{
        private Custom custom;
        private boolean vimeo;

        public Builder() {
            this.custom = new Custom();
            this.vimeo = true;
        }

        public Builder withCustom(Custom custom){
            this.custom = custom;
            return this;
        }

        /**
         * Whether to show the Vimeo logo on the embeddable player.
         * @param value
         * @return
         */
        public Builder withVimeo(boolean value){
            this.vimeo = value;
            return this;
        }

        public Logos build(){
            return new Logos(custom, vimeo);
        }
    }
}

