package io.github.danushka96.models;

import io.github.danushka96.enums.EmbedOptions;

/**
 * @author danushka
 * 11/4/2020
 */
public class Title {
    private String name;
    private String owner;
    private String portrait;

    public Title() {
    }

    public Title(String name, String owner, String portrait) {
        this.name = name;
        this.owner = owner;
        this.portrait = portrait;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public static class Builder{
        private String name;
        private String owner;
        private String portrait;

        public Builder() {
        }

        /**
         * How to handle the video title in the title bar of the embeddable player.Option descriptions:
         * hide - Hide the video title.
         * show - Show the video title.
         * user - Enable the user to decide.
         * @param name EmbedOptions
         * @return Builder
         */
        public Builder withName(EmbedOptions name){
            this.name = name.getValue();
            return this;
        }

        /**
         * How to handle the owner information in the title bar of the embeddable player.Option descriptions:
         * hide - Hide the video title.
         * show - Show the video title.
         * user - Enable the user to decide.
         * @param owner EmbedOptions
         * @return Builder
         */
        public Builder withOwner(EmbedOptions owner){
            this.owner = owner.getValue();
            return this;
        }

        /**
         * How to handle the owner portrait in the title bar of the embeddable player.Option descriptions:
         * hide - Hide the video title.
         * show - Show the video title.
         * user - Enable the user to decide.
         * @param portrait EmbedOptions
         * @return Builder
         */
        public Builder withPortrait(EmbedOptions portrait){
            this.portrait = portrait.getValue();
            return this;
        }

        public Title build(){
            return new Title(name, owner, portrait);
        }
    }
}
