package io.github.danushka96.models;

import io.github.danushka96.enums.LiveStatus;

/**
 * @author danushka
 * 11/4/2020
 */
public class Live {
    private SimulcastDestinations[] simulcast_destinations;
    private boolean simulcast_only;
    private String status;

    public Live() {
    }

    public Live(SimulcastDestinations[] simulcast_destinations, boolean simulcast_only, String status) {
        this.simulcast_destinations = simulcast_destinations;
        this.simulcast_only = simulcast_only;
        this.status = status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public SimulcastDestinations[] getSimulcast_destinations() {
        return simulcast_destinations;
    }

    public void setSimulcast_destinations(SimulcastDestinations[] simulcast_destinations) {
        this.simulcast_destinations = simulcast_destinations;
    }

    public boolean isSimulcast_only() {
        return simulcast_only;
    }

    public void setSimulcast_only(boolean simulcast_only) {
        this.simulcast_only = simulcast_only;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Builder {
        private SimulcastDestinations[] simulcast_destinations;
        private boolean simulcast_only;
        private String status;

        public Builder withSimulcastDestination(SimulcastDestinations[] simulcastDestinations) {
            this.simulcast_destinations = simulcastDestinations;
            return this;
        }

        /**
         * Whether to hide the video from its owner during streaming.
         *
         * @param value
         * @return
         */
        public Builder withSimulcastOnly(Boolean value) {
            this.simulcast_only = value;
            return this;
        }

        /**
         * The status of the live stream.Option descriptions:
         * done - Finish a live stream.
         * ready - Start a live-stream-initialized video into streaming mode.
         * done
         * ready
         *
         * @param liveStatus
         * @return
         */
        public Builder withStatus(LiveStatus liveStatus) {
            this.status = liveStatus.getVal();
            return this;
        }

        public Live build() {
            return new Live(simulcast_destinations, simulcast_only, status);
        }
    }
}
