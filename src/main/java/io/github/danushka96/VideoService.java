package io.github.danushka96;

import io.github.danushka96.models.GetVideoResponse;
import io.github.danushka96.models.InitVideoResponse;
import io.github.danushka96.models.StatsResponse;
import io.github.danushka96.models.VideoMeta;
import org.springframework.http.codec.multipart.FilePart;
import reactor.core.publisher.Mono;

public interface VideoService {
    <T extends StatsResponse> Mono<T> getStats();

    Mono<String> getVideos();

    <T extends GetVideoResponse> Mono<T> getVideo(String videoId);

    <T extends InitVideoResponse> Mono<T> initVideoUploadMeta(VideoMeta videoMeta);

    Mono<String> uploadVideo(String uri, FilePart fileName);

    Mono<String> deleteVideo(String videoId);
}
