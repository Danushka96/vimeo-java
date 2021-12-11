package io.github.danushka96;

import io.github.danushka96.models.GetVideoResponse;
import io.github.danushka96.models.InitVideoResponse;
import io.github.danushka96.models.TestVideoStatResponse;
import io.github.danushka96.models.VideoMeta;
import org.springframework.http.codec.multipart.FilePart;
import reactor.core.publisher.Mono;

public class TestVideoService implements VideoService {
    @Override
    public Mono<TestVideoStatResponse> getStats() {
        return Mono.just(new TestVideoStatResponse());
    }

    @Override
    public Mono<String> getVideos() {
        return Mono.empty();
    }

    @Override
    public <T extends GetVideoResponse> Mono<T> getVideo(String videoId) {
        return Mono.empty();
    }

    @Override
    public <T extends InitVideoResponse> Mono<T> initVideoUploadMeta(VideoMeta videoMeta) {
        return Mono.empty();
    }

    @Override
    public Mono<String> uploadVideo(String uri, FilePart fileName) {
        return Mono.empty();
    }

    @Override
    public Mono<String> deleteVideo(String videoId) {
        return Mono.empty();
    }
}
