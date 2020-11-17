package io.github.danushka96.models;

/**
 * @author danushka
 * 11/4/2020
 */
public class Embed {
    private Buttons buttons;
    private String color;
    private Logos logos;
    private boolean playbar;
    private Title title;
    private boolean volume;

    public Embed() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public Buttons getButtons() {
        return buttons;
    }

    public void setButtons(Buttons buttons) {
        this.buttons = buttons;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Logos getLogos() {
        return logos;
    }

    public void setLogos(Logos logos) {
        this.logos = logos;
    }

    public boolean isPlaybar() {
        return playbar;
    }

    public void setPlaybar(boolean playbar) {
        this.playbar = playbar;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public boolean isVolume() {
        return volume;
    }

    public void setVolume(boolean volume) {
        this.volume = volume;
    }

    public static class Builder {
        private Buttons buttons;
        private String color;
        private Logos logos;
        private boolean playbar;
        private Title title;
        private boolean volume;

        public Builder() {
            this.buttons = new Buttons();
            this.color = "";
            this.logos = new Logos();
        }

        public Builder withButton(Buttons buttons) {
            this.buttons = buttons;
            return this;
        }

        /**
         * The main color of the embeddable player.
         *
         * @param color
         * @return Builder
         */
        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Builder withLogos(Logos logos) {
            this.logos = logos;
            return this;
        }

        /**
         * Whether to show the playbar on the embeddable player.
         *
         * @param playBar
         * @return
         */
        public Builder withPlaybar(boolean playBar) {
            this.playbar = playBar;
            return this;
        }

        public Builder withTitle(Title title) {
            this.title = title;
            return this;
        }

        /**
         * Whether to show the volume selector on the embeddable player.
         *
         * @param volume
         * @return
         */
        public Builder volume(boolean volume) {
            this.volume = volume;
            return this;
        }

    }
}

